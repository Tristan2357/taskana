import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GenericHttpService {

  constructor(private http: HttpClient) { }

  getTyped<T>(url: string): Observable<T>{
    return this.http.get<T>(url);
  }

  getNonJson(url: string): Observable<string>{
    return this.http.get(url, { responseType: 'text' });
  }
}
