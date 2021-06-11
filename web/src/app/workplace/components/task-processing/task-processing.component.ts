import { Component, ElementRef, OnDestroy, OnInit, ViewChild } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomAttribute, Task } from 'app/workplace/models/task';
import { Workbasket } from 'app/shared/models/workbasket';
import { DomSanitizer, SafeHtml, SafeResourceUrl } from '@angular/platform-browser';
import { TaskService } from 'app/workplace/services/task.service';
import { WorkbasketService } from 'app/shared/services/workbasket/workbasket.service';
import { Subscription } from 'rxjs';
import { ClassificationsService } from 'app/shared/services/classifications/classifications.service';
import { take } from 'rxjs/operators';
import { RequestInProgressService } from '../../../shared/services/request-in-progress/request-in-progress.service';
import { GenericHttpService } from '../../../shared/services/generic-http/generic-http.service';
import { variable } from '@angular/compiler/src/output/output_ast';

@Component({
  selector: 'taskana-task-processing',
  templateUrl: './task-processing.component.html',
  styleUrls: ['./task-processing.component.scss']
})
export class TaskProcessingComponent implements OnInit, OnDestroy {
  routeSubscription: Subscription;

  regex = /\${(.*?)}/g;
  address = 'https://bing.com/';
  link: SafeResourceUrl;

  task: Task = null;
  workbaskets: Workbasket[];

  @ViewChild('formParent') formParent: ElementRef;
  formHtml: SafeHtml;
  private formFieldAttributeMap: Map<HTMLElement, string>;

  constructor(
    private taskService: TaskService,
    private workbasketService: WorkbasketService,
    private classificationService: ClassificationsService,
    private requestInProgressService: RequestInProgressService,
    private route: ActivatedRoute,
    private router: Router,
    private sanitizer: DomSanitizer,
    private httpService: GenericHttpService
  ) {}

  ngOnInit() {
    this.routeSubscription = this.route.params.subscribe((params) => {
      const { id } = params;
      this.getTask(id).then((task) => this.populateForm(task));

      this.requestInProgressService.setRequestInProgress(true);
      this.taskService
        .claimTask(id)
        .pipe(take(1))
        .subscribe((task) => {
          this.task = task;
          this.taskService.publishUpdatedTask(task);
          this.requestInProgressService.setRequestInProgress(false);
        });
    });
  }

  async getTask(id: string): Promise<Task> {
    this.requestInProgressService.setRequestInProgress(true);
    this.task = await this.taskService.getTask(id).toPromise();
    this.taskService.selectTask(this.task);
    const formUrl = this.getFormUrl();
    if (formUrl) {
      this.loadForm(formUrl);
    }
    const classification = await this.classificationService
      .getClassification(this.task.classificationSummary.classificationId)
      .toPromise();
    if (!formUrl) {
      this.address = this.extractUrl(classification.applicationEntryPoint) || `${this.address}/?q=${this.task.name}`;
      this.link = this.sanitizer.bypassSecurityTrustResourceUrl(this.address);
    }
    this.getWorkbaskets();
    this.requestInProgressService.setRequestInProgress(false);
    return this.task;
  }

  getWorkbaskets() {
    this.requestInProgressService.setRequestInProgress(true);
    this.workbasketService.getAllWorkBaskets().subscribe((workbaskets) => {
      this.requestInProgressService.setRequestInProgress(false);
      this.workbaskets = workbaskets.workbaskets;

      const index = this.workbaskets.findIndex((workbasket) => workbasket.name === this.task.workbasketSummary.name);
      if (index !== -1) {
        this.workbaskets.splice(index, 1);
      }
    });
  }

  transferTask(workbasket: Workbasket) {
    this.requestInProgressService.setRequestInProgress(true);
    this.taskService.transferTask(this.task.taskId, workbasket.workbasketId).subscribe((task) => {
      this.requestInProgressService.setRequestInProgress(false);
      this.task = task;
    });
    this.navigateBack();
  }

  completeTask() {
    this.requestInProgressService.setRequestInProgress(true);
    // TODO check if externalTask and then get FormData
    // this.getFormData();
    this.taskService.completeTask(this.task.taskId).subscribe((task) => {
      this.requestInProgressService.setRequestInProgress(false);
      this.task = task;
      this.taskService.publishUpdatedTask(task);
      this.navigateBack();
    });
  }

  cancelClaimTask() {
    this.requestInProgressService.setRequestInProgress(true);
    this.taskService
      .cancelClaimTask(this.task.taskId)
      .pipe(take(1))
      .subscribe((task) => {
        this.task = task;
        this.taskService.publishUpdatedTask(task);
        this.requestInProgressService.setRequestInProgress(false);
      });
    this.navigateBack();
  }

  navigateBack() {
    this.router.navigate([{ outlets: { detail: `taskdetail/${this.task.taskId}` } }], {
      relativeTo: this.route.parent,
      queryParamsHandling: 'merge'
    });
  }

  ngOnDestroy(): void {
    if (this.routeSubscription) {
      this.routeSubscription.unsubscribe();
    }
  }

  private extractUrl(url: string): string {
    const me = this;
    const extractedExpressions = url.match(this.regex);
    if (!extractedExpressions) {
      return url;
    }
    let extractedUrl = url;
    extractedExpressions.forEach((expression) => {
      const parameter = expression.substring(2, expression.length - 1);
      let objectValue: any = me;
      parameter.split('.').forEach((property) => {
        objectValue = objectValue[property];
      });
      extractedUrl = extractedUrl.replace(expression, objectValue);
    });
    return extractedUrl;
  }

  private getFormUrl(): string {
    const callbackInfo = this.task.callbackInfo;
    let formUrl = '';
    callbackInfo.forEach((callback: CustomAttribute) => {
      if (callback.key === 'system_url') {
        formUrl = callback.value + formUrl;
      }
      if (callback.key === 'form_identifier') {
        formUrl = formUrl + callback.value;
      }
    });
    return formUrl;
  }

  private loadForm(formUrl: string) {
    this.httpService
      .getNonJson(formUrl)
      .pipe(take(1))
      .subscribe((formHtml) => {
        this.formHtml = this.sanitizer.bypassSecurityTrustHtml(formHtml);
        console.log(formHtml);
      });
  }

  private populateForm(task: Task) {
    let formFieldAttributeMap = this.getAllChildrenWithNameAttribute(this.formParent.nativeElement as HTMLElement);
    const formVariables = this.task.callbackInfo.filter((cbInfo) => cbInfo.key === 'form_variables')[0];
    let variablesObject = JSON.parse(formVariables.value);
    console.log(variablesObject);
    formFieldAttributeMap.forEach((attributeName, formElement) => {
      const name = formElement.getAttribute(attributeName);
      (formElement as HTMLInputElement).value = variablesObject[name];
    });
    this.formFieldAttributeMap = formFieldAttributeMap;

    this.getFormData();
  }

  private getAllChildrenWithNameAttribute(parent: HTMLElement): Map<HTMLElement, string> {
    const childArray = this.getFlatChildArray(parent);
    const elementMap = new Map<HTMLElement, string>();
    if (childArray.length) {
      childArray.filter((child) => {
        return !!child.getAttributeNames().filter((attributeName) => {
          if (!!attributeName.match('name')) {
            elementMap.set(child, attributeName);
            return true;
          }
          return false;
        });
      });
    }
    console.log(elementMap);
    return elementMap;
  }

  private getFlatChildArray(parent: HTMLElement): HTMLElement[] {
    if (parent.children?.length) {
      let childElements = [];
      Array.from(parent.children).map((child: HTMLElement) => {
        childElements.push(...this.getFlatChildArray(child));
      });
      return childElements;
    } else {
      return [parent];
    }
  }

  private getFormData() {
    let variables = {};
    this.formFieldAttributeMap.forEach((attributeName, formElement) => {
      variables[formElement.getAttribute(attributeName)] = (formElement as HTMLInputElement).value;
    });
  }
}
