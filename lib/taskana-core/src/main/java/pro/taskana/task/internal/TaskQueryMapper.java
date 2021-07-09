package pro.taskana.task.internal;

import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.SelectProvider;

import pro.taskana.task.api.models.ObjectReference;
import pro.taskana.task.internal.models.TaskSummaryImpl;

/** This class provides a mapper for all task queries. */
@SuppressWarnings({"checkstyle:LineLength", "checkstyle:Indentation"})
public interface TaskQueryMapper {

  @SelectProvider(type = TaskQuerySqlProvider.class, method = "queryTaskSummaries")
  @Result(property = "id", column = "ID")
  @Result(property = "externalId", column = "EXTERNAL_ID")
  @Result(property = "created", column = "CREATED")
  @Result(property = "claimed", column = "CLAIMED")
  @Result(property = "completed", column = "COMPLETED")
  @Result(property = "modified", column = "MODIFIED")
  @Result(property = "planned", column = "PLANNED")
  @Result(property = "due", column = "DUE")
  @Result(property = "name", column = "NAME")
  @Result(property = "creator", column = "CREATOR")
  @Result(property = "note", column = "NOTE")
  @Result(property = "description", column = "DESCRIPTION")
  @Result(property = "priority", column = "PRIORITY")
  @Result(property = "state", column = "STATE")
  @Result(property = "workbasketSummaryImpl.domain", column = "DOMAIN")
  @Result(property = "workbasketSummaryImpl.key", column = "WORKBASKET_KEY")
  @Result(property = "workbasketSummaryImpl.id", column = "WORKBASKET_ID")
  @Result(property = "classificationSummaryImpl.key", column = "CLASSIFICATION_KEY")
  @Result(property = "classificationSummaryImpl.id", column = "CLASSIFICATION_ID")
  @Result(property = "classificationSummaryImpl.domain", column = "DOMAIN")
  @Result(property = "classificationSummaryImpl.category", column = "CLASSIFICATION_CATEGORY")
  @Result(property = "businessProcessId", column = "BUSINESS_PROCESS_ID")
  @Result(property = "parentBusinessProcessId", column = "PARENT_BUSINESS_PROCESS_ID")
  @Result(property = "owner", column = "OWNER")
  @Result(property = "primaryObjRef.company", column = "POR_COMPANY")
  @Result(property = "primaryObjRef.system", column = "POR_SYSTEM")
  @Result(property = "primaryObjRef.systemInstance", column = "POR_INSTANCE")
  @Result(property = "primaryObjRef.type", column = "POR_TYPE")
  @Result(property = "primaryObjRef.value", column = "POR_VALUE")
  @Result(property = "isRead", column = "IS_READ")
  @Result(property = "isTransferred", column = "IS_TRANSFERRED")
  @Result(property = "custom1", column = "CUSTOM_1")
  @Result(property = "custom2", column = "CUSTOM_2")
  @Result(property = "custom3", column = "CUSTOM_3")
  @Result(property = "custom4", column = "CUSTOM_4")
  @Result(property = "custom5", column = "CUSTOM_5")
  @Result(property = "custom6", column = "CUSTOM_6")
  @Result(property = "custom7", column = "CUSTOM_7")
  @Result(property = "custom8", column = "CUSTOM_8")
  @Result(property = "custom9", column = "CUSTOM_9")
  @Result(property = "custom10", column = "CUSTOM_10")
  @Result(property = "custom11", column = "CUSTOM_11")
  @Result(property = "custom12", column = "CUSTOM_12")
  @Result(property = "custom13", column = "CUSTOM_13")
  @Result(property = "custom14", column = "CUSTOM_14")
  @Result(property = "custom15", column = "CUSTOM_15")
  @Result(property = "custom16", column = "CUSTOM_16")
  List<TaskSummaryImpl> queryTaskSummaries(TaskQueryImpl taskQuery);

  @SelectProvider(type = TaskQuerySqlProvider.class, method = "queryTaskSummariesDb2")
  @Result(property = "id", column = "ID")
  @Result(property = "externalId", column = "EXTERNAL_ID")
  @Result(property = "created", column = "CREATED")
  @Result(property = "claimed", column = "CLAIMED")
  @Result(property = "completed", column = "COMPLETED")
  @Result(property = "modified", column = "MODIFIED")
  @Result(property = "planned", column = "PLANNED")
  @Result(property = "due", column = "DUE")
  @Result(property = "name", column = "NAME")
  @Result(property = "creator", column = "CREATOR")
  @Result(property = "note", column = "NOTE")
  @Result(property = "description", column = "DESCRIPTION")
  @Result(property = "priority", column = "PRIORITY")
  @Result(property = "state", column = "STATE")
  @Result(property = "workbasketSummaryImpl.domain", column = "DOMAIN")
  @Result(property = "workbasketSummaryImpl.key", column = "WORKBASKET_KEY")
  @Result(property = "workbasketSummaryImpl.id", column = "WORKBASKET_ID")
  @Result(property = "classificationSummaryImpl.key", column = "CLASSIFICATION_KEY")
  @Result(property = "classificationSummaryImpl.id", column = "CLASSIFICATION_ID")
  @Result(property = "classificationSummaryImpl.domain", column = "DOMAIN")
  @Result(property = "classificationSummaryImpl.category", column = "CLASSIFICATION_CATEGORY")
  @Result(property = "businessProcessId", column = "BUSINESS_PROCESS_ID")
  @Result(property = "parentBusinessProcessId", column = "PARENT_BUSINESS_PROCESS_ID")
  @Result(property = "owner", column = "OWNER")
  @Result(property = "primaryObjRef.company", column = "POR_COMPANY")
  @Result(property = "primaryObjRef.system", column = "POR_SYSTEM")
  @Result(property = "primaryObjRef.systemInstance", column = "POR_INSTANCE")
  @Result(property = "primaryObjRef.type", column = "POR_TYPE")
  @Result(property = "primaryObjRef.value", column = "POR_VALUE")
  @Result(property = "isRead", column = "IS_READ")
  @Result(property = "isTransferred", column = "IS_TRANSFERRED")
  @Result(property = "custom1", column = "CUSTOM_1")
  @Result(property = "custom2", column = "CUSTOM_2")
  @Result(property = "custom3", column = "CUSTOM_3")
  @Result(property = "custom4", column = "CUSTOM_4")
  @Result(property = "custom5", column = "CUSTOM_5")
  @Result(property = "custom6", column = "CUSTOM_6")
  @Result(property = "custom7", column = "CUSTOM_7")
  @Result(property = "custom8", column = "CUSTOM_8")
  @Result(property = "custom9", column = "CUSTOM_9")
  @Result(property = "custom10", column = "CUSTOM_10")
  @Result(property = "custom11", column = "CUSTOM_11")
  @Result(property = "custom12", column = "CUSTOM_12")
  @Result(property = "custom13", column = "CUSTOM_13")
  @Result(property = "custom14", column = "CUSTOM_14")
  @Result(property = "custom15", column = "CUSTOM_15")
  @Result(property = "custom16", column = "CUSTOM_16")
  List<TaskSummaryImpl> queryTaskSummariesDb2(TaskQueryImpl taskQuery);

  @SelectProvider(type = TaskQuerySqlProvider.class, method = "queryObjectReferences")
  @Result(property = "id", column = "ID")
  @Result(property = "company", column = "COMPANY")
  @Result(property = "system", column = "SYSTEM")
  @Result(property = "systemInstance", column = "SYSTEM_INSTANCE")
  @Result(property = "type", column = "TYPE")
  @Result(property = "value", column = "VALUE")
  List<ObjectReference> queryObjectReferences(ObjectReferenceQueryImpl objectReference);

  @SelectProvider(type = TaskQuerySqlProvider.class, method = "countQueryTasks")
  Long countQueryTasks(TaskQueryImpl taskQuery);

  @SelectProvider(type = TaskQuerySqlProvider.class, method = "countQueryTasksDb2")
  Long countQueryTasksDb2(TaskQueryImpl taskQuery);

  @SelectProvider(type = TaskQuerySqlProvider.class, method = "countQueryObjectReferences")
  Long countQueryObjectReferences(ObjectReferenceQueryImpl objectReference);

  @SelectProvider(type = TaskQuerySqlProvider.class, method = "queryTaskColumnValues")
  List<String> queryTaskColumnValues(TaskQueryImpl taskQuery);

  @SelectProvider(type = TaskQuerySqlProvider.class, method = "queryObjectReferenceColumnValues")
  List<String> queryObjectReferenceColumnValues(ObjectReferenceQueryImpl objectReference);

  @SuppressWarnings({"checkstyle:LineLength", "checkstyle:Indentation"})
  class TaskQuerySqlProvider {
    private static final String OPENING_SCRIPT_TAG = "<script>";
    private static final String CLOSING_SCRIPT_TAG = "</script>";
    private static final String OPENING_WHERE_TAG = "<where>";
    private static final String CLOSING_WHERE_TAG = "</where>";

    public static String queryTaskSummaries(TaskQueryImpl taskQuery) {
      return OPENING_SCRIPT_TAG
          + "SELECT <if test=\"useDistinctKeyword\">DISTINCT</if> t.ID, t.EXTERNAL_ID, t.CREATED, t.CLAIMED, t.COMPLETED, t.MODIFIED, t.PLANNED, t.DUE, t.NAME, t.CREATOR, t.DESCRIPTION, t.NOTE, t.PRIORITY, t.STATE, t.CLASSIFICATION_KEY, "
          + "t.CLASSIFICATION_CATEGORY, t.CLASSIFICATION_ID, t.WORKBASKET_ID, t.DOMAIN, t.WORKBASKET_KEY, t.BUSINESS_PROCESS_ID, t.PARENT_BUSINESS_PROCESS_ID, t.OWNER, t.POR_COMPANY, t.POR_SYSTEM, t.POR_INSTANCE, t.POR_TYPE, "
          + "t.POR_VALUE, t.IS_READ, t.IS_TRANSFERRED, t.CUSTOM_1, t.CUSTOM_2, t.CUSTOM_3, t.CUSTOM_4, t.CUSTOM_5, t.CUSTOM_6, t.CUSTOM_7, t.CUSTOM_8, t.CUSTOM_9, t.CUSTOM_10, t.CUSTOM_11, t.CUSTOM_12, t.CUSTOM_13, t.CUSTOM_14, "
          + "t.CUSTOM_15, t.CUSTOM_16"
          + "<if test=\"addAttachmentColumnsToSelectClauseForOrdering\">"
          + ", a.CLASSIFICATION_ID, a.CLASSIFICATION_KEY, a.CHANNEL, a.REF_VALUE, a.RECEIVED"
          + "</if>"
          + "<if test=\"addClassificationNameToSelectClauseForOrdering\">"
          + ", c.NAME "
          + "</if>"
          + "<if test=\"addAttachmentClassificationNameToSelectClauseForOrdering\">"
          + ", ac.NAME "
          + "</if>"
          + "<if test=\"addWorkbasketNameToSelectClauseForOrdering\">"
          + ", w.NAME "
          + "</if>"
          + "FROM TASK t "
          + "<if test=\"joinWithAttachments\">"
          + "LEFT JOIN ATTACHMENT AS a ON t.ID = a.TASK_ID "
          + "</if>"
          + "<if test=\"joinWithClassifications\">"
          + "LEFT JOIN CLASSIFICATION AS c ON t.CLASSIFICATION_ID = c.ID "
          + "</if>"
          + "<if test=\"joinWithAttachmentClassifications\">"
          + "LEFT JOIN CLASSIFICATION AS ac ON a.CLASSIFICATION_ID = ac.ID "
          + "</if>"
          + "<if test=\"joinWithWorkbaskets\">"
          + "LEFT JOIN WORKBASKET AS w ON t.WORKBASKET_ID = w.ID "
          + "</if>"
          + OPENING_WHERE_TAG
          + "<if test='accessIdIn != null'> "
          + "AND t.WORKBASKET_ID IN ( "
          + "SELECT WID from (SELECT WORKBASKET_ID as WID, MAX(PERM_READ::int) as MAX_READ FROM WORKBASKET_ACCESS_LIST AS s where "
          + "ACCESS_ID IN (<foreach item='item' collection='accessIdIn' separator=',' >#{item}</foreach>) "
          + "group by WORKBASKET_ID ) AS f where max_read = 1 ) "
          + "</if> "
          + commonWhereStatement()
          + "<if test='wildcardSearchValueLike != null and wildcardSearchFieldIn != null'>AND (<foreach item='item' collection='wildcardSearchFieldIn' separator=' OR '>UPPER(t.${item}) LIKE #{wildcardSearchValueLike}</foreach>)</if> "
          + "<if test='objectReferences != null'>"
          + "AND (<foreach item='item' collection='objectReferences' separator=' OR '> "
          + "<if test='item.company != null'>t.POR_COMPANY = #{item.company} </if>"
          + "<if test='item.system != null'> <if test='item.company != null'>AND</if> t.POR_SYSTEM = #{item.system} </if>"
          + "<if test='item.systemInstance != null'> <if test='item.company != null or item.system != null'>AND</if> t.POR_INSTANCE = #{item.systemInstance} </if>"
          + "<if test='item.type != null'> <if test='item.company != null or item.system != null or item.systemInstance != null'>AND</if> t.POR_TYPE = #{item.type} </if>"
          + "<if test='item.value != null'> <if test='item.company != null or item.system != null or item.systemInstance != null or item.type != null'>AND</if> t.POR_VALUE = #{item.value} </if>"
          + "</foreach>)</if>"
          + "<if test='selectAndClaim == true'> AND t.STATE = 'READY' </if>"
          + CLOSING_WHERE_TAG
          + "<if test='!orderBy.isEmpty()'>ORDER BY <foreach item='item' collection='orderBy' separator=',' >${item}</foreach></if> "
          + "<if test='selectAndClaim == true'> FETCH FIRST ROW ONLY FOR UPDATE </if>"
          + "<if test=\"_databaseId == 'db2'\">WITH RS USE AND KEEP UPDATE LOCKS </if> "
          + CLOSING_SCRIPT_TAG;
    }

    public static String queryTaskSummariesDb2(TaskQueryImpl taskQuery) {
      return OPENING_SCRIPT_TAG
          + "WITH X (ID, EXTERNAL_ID, CREATED, CLAIMED, COMPLETED, MODIFIED, PLANNED, DUE, NAME, CREATOR, DESCRIPTION, NOTE, PRIORITY, STATE, TCLASSIFICATION_KEY, "
          + "CLASSIFICATION_CATEGORY, CLASSIFICATION_ID, WORKBASKET_ID, DOMAIN, WORKBASKET_KEY, BUSINESS_PROCESS_ID, PARENT_BUSINESS_PROCESS_ID, OWNER, "
          + "POR_COMPANY, POR_SYSTEM, POR_INSTANCE, POR_TYPE, POR_VALUE, IS_READ, IS_TRANSFERRED, CUSTOM_1, CUSTOM_2, CUSTOM_3, CUSTOM_4, CUSTOM_5, "
          + "CUSTOM_6, CUSTOM_7, CUSTOM_8, CUSTOM_9, CUSTOM_10, CUSTOM_11, CUSTOM_12, CUSTOM_13, CUSTOM_14, CUSTOM_15, CUSTOM_16"
          + "<if test=\"addAttachmentColumnsToSelectClauseForOrdering\">"
          + ", ACLASSIFICATION_ID, ACLASSIFICATION_KEY, CHANNEL, REF_VALUE, RECEIVED"
          + "</if>"
          + "<if test=\"addClassificationNameToSelectClauseForOrdering\">"
          + ", CNAME "
          + "</if>"
          + "<if test=\"addAttachmentClassificationNameToSelectClauseForOrdering\">"
          + ", ACNAME "
          + "</if>"
          + "<if test=\"addWorkbasketNameToSelectClauseForOrdering\">"
          + ", WNAME "
          + "</if>"
          + " ) "
          + " AS (SELECT <if test=\"useDistinctKeyword\">DISTINCT</if> t.ID, t.EXTERNAL_ID, t.CREATED, t.CLAIMED, t.COMPLETED, t.MODIFIED, t.PLANNED, t.DUE, t.NAME, t.CREATOR, t.DESCRIPTION, t.NOTE, t.PRIORITY, t.STATE, t.CLASSIFICATION_KEY, "
          + " t.CLASSIFICATION_CATEGORY, t.CLASSIFICATION_ID, t.WORKBASKET_ID, t.DOMAIN, t.WORKBASKET_KEY, t.BUSINESS_PROCESS_ID, t.PARENT_BUSINESS_PROCESS_ID, t.OWNER, "
          + "t.POR_COMPANY, t.POR_SYSTEM, t.POR_INSTANCE, t.POR_TYPE, t.POR_VALUE, t.IS_READ, t.IS_TRANSFERRED, t.CUSTOM_1, t.CUSTOM_2, t.CUSTOM_3, t.CUSTOM_4, t.CUSTOM_5, "
          + "t.CUSTOM_6, t.CUSTOM_7, t.CUSTOM_8, t.CUSTOM_9, t.CUSTOM_10, t.CUSTOM_11, t.CUSTOM_12, t.CUSTOM_13, t.CUSTOM_14, t.CUSTOM_15, t.CUSTOM_16"
          + "<if test=\"addAttachmentColumnsToSelectClauseForOrdering\">"
          + ", a.CLASSIFICATION_ID, a.CLASSIFICATION_KEY, a.CHANNEL, a.REF_VALUE, a.RECEIVED"
          + "</if>"
          + "<if test=\"addClassificationNameToSelectClauseForOrdering\">"
          + ", c.NAME "
          + "</if>"
          + "<if test=\"addAttachmentClassificationNameToSelectClauseForOrdering\">"
          + ", ac.NAME "
          + "</if>"
          + "<if test=\"addWorkbasketNameToSelectClauseForOrdering\">"
          + ", w.NAME "
          + "</if>"
          + " FROM TASK t "
          + "<if test=\"joinWithAttachments\">"
          + "LEFT JOIN ATTACHMENT a ON t.ID = a.TASK_ID "
          + "</if>"
          + "<if test=\"joinWithClassifications\">"
          + "LEFT JOIN CLASSIFICATION AS c ON t.CLASSIFICATION_ID = c.ID "
          + "</if>"
          + "<if test=\"joinWithAttachmentClassifications\">"
          + "LEFT JOIN CLASSIFICATION AS ac ON a.CLASSIFICATION_ID = ac.ID "
          + "</if>"
          + "<if test=\"joinWithWorkbaskets\">"
          + "LEFT JOIN WORKBASKET AS w ON t.WORKBASKET_ID = w.ID "
          + "</if>"
          + "<where> "
          + "<if test='taskIds != null'>AND t.ID IN(<foreach item='item' collection='taskIds' separator=',' >#{item}</foreach>)</if> "
          + "<if test='externalIdIn != null'>AND t.EXTERNAL_ID IN(<foreach item='item' collection='externalIdIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='externalIdLike != null'>AND (<foreach item='item' collection='externalIdLike' separator=' OR '>UPPER(t.EXTERNAL_ID) LIKE #{item}</foreach>)</if> "
          + "<if test='createdIn !=null'> AND ( <foreach item='item' collection='createdIn' separator=' OR ' > ( <if test='item.begin!=null'> t.CREATED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.CREATED &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='claimedIn !=null'> AND ( <foreach item='item' collection='claimedIn' separator=' OR ' > ( <if test='item.begin!=null'> t.CLAIMED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.CLAIMED &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='completedIn !=null'> AND ( <foreach item='item' collection='completedIn' separator=' OR ' > ( <if test='item.begin!=null'> t.COMPLETED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.COMPLETED &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='modifiedIn !=null'> AND ( <foreach item='item' collection='modifiedIn' separator=' OR ' > ( <if test='item.begin!=null'> t.MODIFIED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.MODIFIED &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='plannedIn !=null'> AND ( <foreach item='item' collection='plannedIn' separator=' OR ' > ( <if test='item.begin!=null'> t.PLANNED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.PLANNED &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='dueIn !=null'> AND ( <foreach item='item' collection='dueIn' separator=' OR ' > ( <if test='item.begin!=null'> t.DUE &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.DUE &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='nameIn != null'>AND t.NAME IN(<foreach item='item' collection='nameIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='nameLike != null'>AND (<foreach item='item' collection='nameLike' separator=' OR '>UPPER(t.NAME) LIKE #{item}</foreach>)</if> "
          + "<if test='creatorIn != null'>AND CREATOR IN(<foreach item='item' collection='creatorIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='creatorLike != null'>AND (<foreach item='item' collection='creatorLike' separator=' OR '>UPPER(CREATOR) LIKE #{item}</foreach>)</if> "
          + "<if test='description != null'>AND (<foreach item='item' collection='description' separator=' OR '>DESCRIPTION LIKE #{item}</foreach>)</if> "
          + "<if test='noteLike != null'>AND (<foreach item='item' collection='noteLike' separator=' OR '>UPPER(NOTE) LIKE #{item}</foreach>)</if> "
          + "<if test='priority != null'>AND PRIORITY IN(<foreach item='item' collection='priority' separator=',' >#{item}</foreach>)</if> "
          + "<if test='stateIn != null'>AND STATE IN(<foreach item='item' collection='stateIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='callbackStateIn != null'>AND t.CALLBACK_STATE IN(<foreach item='item' collection='callbackStateIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='workbasketIdIn != null'>AND WORKBASKET_ID IN(<foreach item='item' collection='workbasketIdIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='workbasketKeyDomainIn != null'>AND (<foreach item='item' collection='workbasketKeyDomainIn' separator=' OR '>(WORKBASKET_KEY = #{item.key} AND DOMAIN = #{item.domain})</foreach>)</if> "
          + "<if test='classificationKeyIn != null'>AND t.CLASSIFICATION_KEY IN(<foreach item='item' collection='classificationKeyIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='classificationKeyNotIn != null'>AND t.CLASSIFICATION_KEY NOT IN(<foreach item='item' collection='classificationKeyNotIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='classificationKeyLike != null'>AND (<foreach item='item' collection='classificationKeyLike' separator=' OR '>UPPER(t.CLASSIFICATION_KEY) LIKE #{item}</foreach>)</if> "
          + "<if test='classificationIdIn != null'>AND t.CLASSIFICATION_ID IN(<foreach item='item' collection='classificationIdIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='classificationCategoryIn != null'>AND CLASSIFICATION_CATEGORY IN(<foreach item='item' collection='classificationCategoryIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='classificationCategoryLike != null'>AND (<foreach item='item' collection='classificationCategoryLike' separator=' OR '>UPPER(CLASSIFICATION_CATEGORY) LIKE #{item}</foreach>)</if> "
          + "<if test='classificationNameIn != null'>AND c.NAME IN(<foreach item='item' collection='classificationNameIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='classificationNameLike != null'>AND (<foreach item='item' collection='classificationNameLike' separator=' OR '>UPPER(c.NAME) LIKE #{item}</foreach>)</if> "
          + "<if test='attachmentClassificationNameIn != null'>AND ac.NAME IN(<foreach item='item' collection='attachmentClassificationNameIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='attachmentClassificationNameLike != null'>AND (<foreach item='item' collection='attachmentClassificationNameLike' separator=' OR '>UPPER(ac.NAME) LIKE #{item}</foreach>)</if> "
          + "<if test='ownerIn != null'>AND OWNER IN(<foreach item='item' collection='ownerIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='ownerLike != null'>AND (<foreach item='item' collection='ownerLike' separator=' OR '>UPPER(OWNER) LIKE #{item}</foreach>)</if> "
          + "<if test='isRead != null'>AND IS_READ = #{isRead}</if> "
          + "<if test='isTransferred != null'>AND IS_TRANSFERRED = #{isTransferred}</if> "
          + "<if test='objectReferences != null'>"
          + "AND (<foreach item='item' collection='objectReferences' separator=' OR '> "
          + "<if test='item.company != null'>t.POR_COMPANY = #{item.company} </if>"
          + "<if test='item.system != null'> <if test='item.company != null'>AND</if> t.POR_SYSTEM = #{item.system} </if>"
          + "<if test='item.systemInstance != null'> <if test='item.company != null or item.system != null'>AND</if> t.POR_INSTANCE = #{item.systemInstance} </if>"
          + "<if test='item.type != null'> <if test='item.company != null or item.system != null or item.systemInstance != null'>AND</if> t.POR_TYPE = #{item.type} </if>"
          + "<if test='item.value != null'> <if test='item.company != null or item.system != null or item.systemInstance != null or item.type != null'>AND</if> t.POR_VALUE = #{item.value} </if>"
          + "</foreach>)</if>"
          + "<if test='porCompanyIn != null'>AND POR_COMPANY IN(<foreach item='item' collection='porCompanyIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='porCompanyLike != null'>AND (<foreach item='item' collection='porCompanyLike' separator=' OR '>UPPER(POR_COMPANY) LIKE #{item}</foreach>)</if> "
          + "<if test='porSystemIn != null'>AND POR_SYSTEM IN(<foreach item='item' collection='porSystemIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='porSystemLike != null'>AND (<foreach item='item' collection='porSystemLike' separator=' OR '>UPPER(POR_SYSTEM) LIKE #{item}</foreach>)</if> "
          + "<if test='porSystemInstanceIn != null'>AND POR_INSTANCE IN(<foreach item='item' collection='porSystemInstanceIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='porSystemInstanceLike != null'>AND (<foreach item='item' collection='porSystemInstanceLike' separator=' OR '>UPPER(POR_INSTANCE) LIKE #{item}</foreach>)</if> "
          + "<if test='porTypeIn != null'>AND POR_TYPE IN(<foreach item='item' collection='porTypeIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='porTypeLike != null'>AND (<foreach item='item' collection='porTypeLike' separator=' OR '>UPPER(POR_TYPE) LIKE #{item}</foreach>)</if> "
          + "<if test='porValueIn != null'>AND POR_VALUE IN(<foreach item='item' collection='porValueIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='porValueLike != null'>AND (<foreach item='item' collection='porValueLike' separator=' OR '>UPPER(POR_VALUE) LIKE #{item}</foreach>)</if> "
          + "<if test='parentBusinessProcessIdIn != null'>AND PARENT_BUSINESS_PROCESS_ID IN(<foreach item='item' collection='parentBusinessProcessIdIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='parentBusinessProcessIdLike != null'>AND (<foreach item='item' collection='parentBusinessProcessIdLike' separator=' OR '>UPPER(PARENT_BUSINESS_PROCESS_ID) LIKE #{item}</foreach>)</if> "
          + "<if test='businessProcessIdIn != null'>AND BUSINESS_PROCESS_ID IN(<foreach item='item' collection='businessProcessIdIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='businessProcessIdLike != null'>AND (<foreach item='item' collection='businessProcessIdLike' separator=' OR '>UPPER(BUSINESS_PROCESS_ID) LIKE #{item}</foreach>)</if> "
          + "<if test='custom1In != null'>AND CUSTOM_1 IN(<foreach item='item' collection='custom1In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom1Like != null'>AND (<foreach item='item' collection='custom1Like' separator=' OR '>UPPER(CUSTOM_1) LIKE #{item}</foreach>)</if> "
          + "<if test='custom2In != null'>AND CUSTOM_2 IN(<foreach item='item' collection='custom2In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom2Like != null'>AND (<foreach item='item' collection='custom2Like' separator=' OR '>UPPER(CUSTOM_2) LIKE #{item}</foreach>)</if> "
          + "<if test='custom3In != null'>AND CUSTOM_3 IN(<foreach item='item' collection='custom3In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom3Like != null'>AND (<foreach item='item' collection='custom3Like' separator=' OR '>UPPER(CUSTOM_3) LIKE #{item}</foreach>)</if> "
          + "<if test='custom4In != null'>AND CUSTOM_4 IN(<foreach item='item' collection='custom4In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom4Like != null'>AND (<foreach item='item' collection='custom4Like' separator=' OR '>UPPER(CUSTOM_4) LIKE #{item}</foreach>)</if> "
          + "<if test='custom5In != null'>AND CUSTOM_5 IN(<foreach item='item' collection='custom5In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom5Like != null'>AND (<foreach item='item' collection='custom5Like' separator=' OR '>UPPER(CUSTOM_5) LIKE #{item}</foreach>)</if> "
          + "<if test='custom6In != null'>AND CUSTOM_6 IN(<foreach item='item' collection='custom6In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom6Like != null'>AND (<foreach item='item' collection='custom6Like' separator=' OR '>UPPER(CUSTOM_6) LIKE #{item}</foreach>)</if> "
          + "<if test='custom7In != null'>AND CUSTOM_7 IN(<foreach item='item' collection='custom7In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom7Like != null'>AND (<foreach item='item' collection='custom7Like' separator=' OR '>UPPER(CUSTOM_7) LIKE #{item}</foreach>)</if> "
          + "<if test='custom8In != null'>AND CUSTOM_8 IN(<foreach item='item' collection='custom8In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom8Like != null'>AND (<foreach item='item' collection='custom8Like' separator=' OR '>UPPER(CUSTOM_8) LIKE #{item}</foreach>)</if> "
          + "<if test='custom9In != null'>AND CUSTOM_9 IN(<foreach item='item' collection='custom9In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom9Like != null'>AND (<foreach item='item' collection='custom9Like' separator=' OR '>UPPER(CUSTOM_9) LIKE #{item}</foreach>)</if> "
          + "<if test='custom10In != null'>AND CUSTOM_10 IN(<foreach item='item' collection='custom10In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom10Like != null'>AND (<foreach item='item' collection='custom10Like' separator=' OR '>UPPER(CUSTOM_10) LIKE #{item}</foreach>)</if> "
          + "<if test='custom11In != null'>AND CUSTOM_11 IN(<foreach item='item' collection='custom11In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom11Like != null'>AND (<foreach item='item' collection='custom11Like' separator=' OR '>UPPER(CUSTOM_11) LIKE #{item}</foreach>)</if> "
          + "<if test='custom12In != null'>AND CUSTOM_12 IN(<foreach item='item' collection='custom12In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom12Like != null'>AND (<foreach item='item' collection='custom12Like' separator=' OR '>UPPER(CUSTOM_12) LIKE #{item}</foreach>)</if> "
          + "<if test='custom13In != null'>AND CUSTOM_13 IN(<foreach item='item' collection='custom13In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom13Like != null'>AND (<foreach item='item' collection='custom13Like' separator=' OR '>UPPER(CUSTOM_13) LIKE #{item}</foreach>)</if> "
          + "<if test='custom14In != null'>AND CUSTOM_14 IN(<foreach item='item' collection='custom14In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom14Like != null'>AND (<foreach item='item' collection='custom14Like' separator=' OR '>UPPER(CUSTOM_14) LIKE #{item}</foreach>)</if> "
          + "<if test='custom15In != null'>AND CUSTOM_15 IN(<foreach item='item' collection='custom15In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom15Like != null'>AND (<foreach item='item' collection='custom15Like' separator=' OR '>UPPER(CUSTOM_15) LIKE #{item}</foreach>)</if> "
          + "<if test='custom16In != null'>AND CUSTOM_16 IN(<foreach item='item' collection='custom16In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom16Like != null'>AND (<foreach item='item' collection='custom16Like' separator=' OR '>UPPER(CUSTOM_16) LIKE #{item}</foreach>)</if> "
          + "<if test='attachmentClassificationKeyIn != null'>AND a.CLASSIFICATION_KEY IN(<foreach item='item' collection='attachmentClassificationKeyIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='attachmentClassificationKeyLike != null'>AND (<foreach item='item' collection='attachmentClassificationKeyLike' separator=' OR '>UPPER(a.CLASSIFICATION_KEY) LIKE #{item}</foreach>)</if> "
          + "<if test='attachmentClassificationIdIn != null'>AND a.CLASSIFICATION_ID IN(<foreach item='item' collection='attachmentClassificationIdIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='attachmentClassificationIdLike != null'>AND (<foreach item='item' collection='attachmentClassificationIdLike' separator=' OR '>UPPER(a.CLASSIFICATION_ID) LIKE #{item}</foreach>)</if> "
          + "<if test='attachmentChannelIn != null'>AND a.CHANNEL IN(<foreach item='item' collection='attachmentChannelIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='attachmentChannelLike != null'>AND (<foreach item='item' collection='attachmentChannelLike' separator=' OR '>UPPER(a.CHANNEL) LIKE #{item}</foreach>)</if> "
          + "<if test='attachmentReferenceIn != null'>AND a.REF_VALUE IN(<foreach item='item' collection='attachmentReferenceIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='attachmentReferenceLike != null'>AND (<foreach item='item' collection='attachmentReferenceLike' separator=' OR '>UPPER(a.REF_VALUE) LIKE #{item}</foreach>)</if> "
          + "<if test='attachmentReceivedIn !=null'> AND ( <foreach item='item' collection='attachmentReceivedIn' separator=' OR ' > ( <if test='item.begin!=null'> a.RECEIVED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> a.RECEIVED &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='wildcardSearchValueLike != null and wildcardSearchFieldIn != null'>AND (<foreach item='item' collection='wildcardSearchFieldIn' separator=' OR '>UPPER(t.${item}) LIKE #{wildcardSearchValueLike}</foreach>)</if> "
          + "</where> "
          + "), Y (ID, EXTERNAL_ID, CREATED, CLAIMED, COMPLETED, MODIFIED, PLANNED, DUE, NAME, CREATOR, DESCRIPTION, NOTE, PRIORITY, STATE, TCLASSIFICATION_KEY, "
          + " CLASSIFICATION_CATEGORY, CLASSIFICATION_ID, WORKBASKET_ID, DOMAIN, WORKBASKET_KEY, BUSINESS_PROCESS_ID, PARENT_BUSINESS_PROCESS_ID, OWNER, "
          + "POR_COMPANY, POR_SYSTEM, POR_INSTANCE, POR_TYPE, POR_VALUE, IS_READ, IS_TRANSFERRED, CUSTOM_1, CUSTOM_2, CUSTOM_3, CUSTOM_4, CUSTOM_5, "
          + "CUSTOM_6, CUSTOM_7, CUSTOM_8, CUSTOM_9, CUSTOM_10, CUSTOM_11, CUSTOM_12, CUSTOM_13, CUSTOM_14, CUSTOM_15, CUSTOM_16"
          + "<if test=\"addAttachmentColumnsToSelectClauseForOrdering\">"
          + ", ACLASSIFICATION_ID, ACLASSIFICATION_KEY, CHANNEL, REF_VALUE, RECEIVED"
          + "</if>"
          + "<if test=\"addClassificationNameToSelectClauseForOrdering\">"
          + ", CNAME "
          + "</if>"
          + "<if test=\"addAttachmentClassificationNameToSelectClauseForOrdering\">"
          + ", ACNAME "
          + "</if>"
          + "<if test=\"addWorkbasketNameToSelectClauseForOrdering\">"
          + ", WNAME "
          + "</if>"
          + ", FLAG ) "
          + "AS "
          + "(SELECT ID, EXTERNAL_ID, CREATED, CLAIMED, COMPLETED, MODIFIED, PLANNED, DUE, NAME, CREATOR, DESCRIPTION, NOTE, PRIORITY, STATE, TCLASSIFICATION_KEY, "
          + " CLASSIFICATION_CATEGORY, CLASSIFICATION_ID, WORKBASKET_ID, DOMAIN, WORKBASKET_KEY, BUSINESS_PROCESS_ID, PARENT_BUSINESS_PROCESS_ID, OWNER, "
          + "POR_COMPANY, POR_SYSTEM, POR_INSTANCE, POR_TYPE, POR_VALUE, IS_READ, IS_TRANSFERRED, CUSTOM_1, CUSTOM_2, CUSTOM_3, CUSTOM_4, CUSTOM_5, "
          + "CUSTOM_6, CUSTOM_7, CUSTOM_8, CUSTOM_9, CUSTOM_10, CUSTOM_11, CUSTOM_12, CUSTOM_13, CUSTOM_14, CUSTOM_15, CUSTOM_16"
          + "<if test=\"addAttachmentColumnsToSelectClauseForOrdering\">"
          + ", ACLASSIFICATION_ID, ACLASSIFICATION_KEY, CHANNEL, REF_VALUE, RECEIVED"
          + "</if>"
          + "<if test=\"addClassificationNameToSelectClauseForOrdering\">"
          + ", CNAME "
          + "</if>"
          + "<if test=\"addAttachmentClassificationNameToSelectClauseForOrdering\">"
          + ", ACNAME "
          + "</if>"
          + "<if test=\"addWorkbasketNameToSelectClauseForOrdering\">"
          + ", WNAME "
          + "</if>"
          + ", (SELECT 1 FROM WORKBASKET_ACCESS_LIST s WHERE "
          + "<if test='accessIdIn != null'> "
          + "s.ACCESS_ID IN (<foreach item='item' collection='accessIdIn' separator=',' >#{item}</foreach>) and "
          + "</if>"
          + "s.WORKBASKET_ID = X.WORKBASKET_ID AND "
          + "s.perm_read = 1 "
          + "fetch first 1 rows only "
          + ") FROM X )"
          + "SELECT ID, EXTERNAL_ID, CREATED, CLAIMED, COMPLETED, MODIFIED, PLANNED, DUE, NAME, CREATOR, DESCRIPTION, NOTE, PRIORITY, STATE, TCLASSIFICATION_KEY, "
          + " CLASSIFICATION_CATEGORY, CLASSIFICATION_ID, WORKBASKET_ID, DOMAIN, WORKBASKET_KEY, BUSINESS_PROCESS_ID, PARENT_BUSINESS_PROCESS_ID, OWNER, "
          + "POR_COMPANY, POR_SYSTEM, POR_INSTANCE, POR_TYPE, POR_VALUE, IS_READ, IS_TRANSFERRED, CUSTOM_1, CUSTOM_2, CUSTOM_3, CUSTOM_4, CUSTOM_5, "
          + "CUSTOM_6, CUSTOM_7, CUSTOM_8, CUSTOM_9, CUSTOM_10, CUSTOM_11, CUSTOM_12, CUSTOM_13, CUSTOM_14, CUSTOM_15, CUSTOM_16"
          + "<if test=\"addAttachmentColumnsToSelectClauseForOrdering\">"
          + ", ACLASSIFICATION_ID, ACLASSIFICATION_KEY, CHANNEL, REF_VALUE, RECEIVED "
          + "</if>"
          + "<if test=\"addClassificationNameToSelectClauseForOrdering\">"
          + ", CNAME "
          + "</if>"
          + "<if test=\"addAttachmentClassificationNameToSelectClauseForOrdering\">"
          + ", ACNAME "
          + "</if>"
          + "<if test=\"addWorkbasketNameToSelectClauseForOrdering\">"
          + ", WNAME "
          + "</if>"
          + " FROM Y WHERE FLAG = 1 "
          + "<if test='!orderBy.isEmpty()'>ORDER BY <foreach item='item' collection='orderBy' separator=',' >"
          + "${item}"
          + "</foreach>"
          + "</if> "
          + "<if test='selectAndClaim == true'>FETCH FIRST ROW ONLY FOR UPDATE WITH RS USE AND KEEP UPDATE LOCKS</if>"
          + "<if test='selectAndClaim == false'> with UR</if>"
          + CLOSING_SCRIPT_TAG;
    }

    public String queryObjectReferences(ObjectReferenceQueryImpl objectReference) {
      return OPENING_SCRIPT_TAG
          + "SELECT ID, COMPANY, SYSTEM, SYSTEM_INSTANCE, TYPE, VALUE "
          + "FROM OBJECT_REFERENCE "
          + OPENING_WHERE_TAG
          + "<if test='company != null'>AND COMPANY IN(<foreach item='item' collection='company' separator=',' >#{item}</foreach>)</if> "
          + "<if test='system != null'>AND SYSTEM IN(<foreach item='item' collection='system' separator=',' >#{item}</foreach>)</if> "
          + "<if test='systemInstance != null'>AND SYSTEM_INSTANCE IN(<foreach item='item' collection='systemInstance' separator=',' >#{item}</foreach>)</if> "
          + "<if test='type != null'>AND TYPE IN(<foreach item='item' collection='type' separator=',' >#{item}</foreach>)</if> "
          + "<if test='value != null'>AND VALUE IN(<foreach item='item' collection='value' separator=',' >#{item}</foreach>)</if> "
          + CLOSING_WHERE_TAG
          + "<if test=\"_databaseId == 'db2'\">with UR </if> "
          + CLOSING_SCRIPT_TAG;
    }

    public static String countQueryTasks(TaskQueryImpl taskQuery) {
      return OPENING_SCRIPT_TAG
          + "SELECT COUNT( <if test=\"useDistinctKeyword\">DISTINCT</if>  t.ID) FROM TASK t "
          + "<if test=\"joinWithAttachments\">"
          + "LEFT JOIN ATTACHMENT AS a ON t.ID = a.TASK_ID "
          + "</if>"
          + "<if test=\"joinWithClassifications\">"
          + "LEFT JOIN CLASSIFICATION AS c ON t.CLASSIFICATION_ID = c.ID "
          + "</if>"
          + "<if test=\"joinWithAttachmentClassifications\">"
          + "LEFT JOIN CLASSIFICATION AS ac ON a.CLASSIFICATION_ID = ac.ID "
          + "</if>"
          + OPENING_WHERE_TAG
          + "<if test='accessIdIn != null'> "
          + "AND t.WORKBASKET_ID IN ( "
          + "select WID from (select WORKBASKET_ID as WID, MAX(PERM_READ::int) as MAX_READ FROM WORKBASKET_ACCESS_LIST AS s where "
          + "ACCESS_ID IN (<foreach item='item' collection='accessIdIn' separator=',' >#{item}</foreach>) "
          + "group by WORKBASKET_ID ) AS f where max_read = 1 ) "
          + "</if> "
          + "<if test='taskIds != null'>AND t.ID IN(<foreach item='item' collection='taskIds' separator=',' >#{item}</foreach>)</if> "
          + "<if test='externalIdIn != null'>AND t.EXTERNAL_ID IN(<foreach item='item' collection='externalIdIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='externalIdLike != null'>AND (<foreach item='item' collection='externalIdLike' separator=' OR '>UPPER(t.EXTERNAL_ID) LIKE #{item}</foreach>)</if> "
          + "<if test='createdIn !=null'> AND ( <foreach item='item' collection='createdIn' separator=' OR ' > ( <if test='item.begin!=null'> t.CREATED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.CREATED &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='claimedIn !=null'> AND ( <foreach item='item' collection='claimedIn' separator=' OR ' > ( <if test='item.begin!=null'> t.CLAIMED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.CLAIMED &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='completedIn !=null'> AND ( <foreach item='item' collection='completedIn' separator=' OR ' > ( <if test='item.begin!=null'> t.COMPLETED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.COMPLETED &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='modifiedIn !=null'> AND ( <foreach item='item' collection='modifiedIn' separator=' OR ' > ( <if test='item.begin!=null'> t.MODIFIED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.MODIFIED &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='plannedIn !=null'> AND ( <foreach item='item' collection='plannedIn' separator=' OR ' > ( <if test='item.begin!=null'> t.PLANNED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.PLANNED &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='dueIn !=null'> AND ( <foreach item='item' collection='dueIn' separator=' OR ' > ( <if test='item.begin!=null'> t.DUE &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.DUE &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='nameIn != null'>AND t.NAME IN(<foreach item='item' collection='nameIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='nameLike != null'>AND (<foreach item='item' collection='nameLike' separator=' OR '>UPPER(t.NAME) LIKE #{item}</foreach>)</if> "
          + "<if test='creatorIn != null'>AND t.CREATOR IN(<foreach item='item' collection='creatorIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='creatorLike != null'>AND (<foreach item='item' collection='creatorLike' separator=' OR '>UPPER(t.CREATOR) LIKE #{item}</foreach>)</if> "
          + "<if test='description != null'>AND (<foreach item='item' collection='description' separator=' OR '>t.DESCRIPTION LIKE #{item}</foreach>)</if> "
          + "<if test='noteLike != null'>AND (<foreach item='item' collection='noteLike' separator=' OR '>UPPER(t.NOTE) LIKE #{item}</foreach>)</if> "
          + "<if test='priority != null'>AND t.PRIORITY IN(<foreach item='item' collection='priority' separator=',' >#{item}</foreach>)</if> "
          + "<if test='stateIn != null'>AND t.STATE IN(<foreach item='item' collection='stateIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='callbackStateIn != null'>AND t.CALLBACK_STATE IN(<foreach item='item' collection='callbackStateIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='workbasketIdIn != null'>AND t.WORKBASKET_ID IN(<foreach item='item' collection='workbasketIdIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='workbasketKeyDomainIn != null'>AND (<foreach item='item' collection='workbasketKeyDomainIn' separator=' OR '>(t.WORKBASKET_KEY = #{item.key} AND t.DOMAIN = #{item.domain})</foreach>)</if> "
          + "<if test='classificationKeyIn != null'>AND t.CLASSIFICATION_KEY IN(<foreach item='item' collection='classificationKeyIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='classificationKeyNotIn != null'>AND t.CLASSIFICATION_KEY NOT IN(<foreach item='item' collection='classificationKeyNotIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='classificationKeyLike != null'>AND (<foreach item='item' collection='classificationKeyLike' separator=' OR '>UPPER(t.CLASSIFICATION_KEY) LIKE #{item}</foreach>)</if> "
          + "<if test='classificationIdIn != null'>AND t.CLASSIFICATION_ID IN(<foreach item='item' collection='classificationIdIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='classificationCategoryIn != null'>AND t.CLASSIFICATION_CATEGORY IN(<foreach item='item' collection='classificationCategoryIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='classificationCategoryLike != null'>AND (<foreach item='item' collection='classificationCategoryLike' separator=' OR '>UPPER(t.CLASSIFICATION_CATEGORY) LIKE #{item}</foreach>)</if> "
          + "<if test='classificationNameIn != null'>AND c.NAME IN(<foreach item='item' collection='classificationNameIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='classificationNameLike != null'>AND (<foreach item='item' collection='classificationNameLike' separator=' OR '>UPPER(c.NAME) LIKE #{item}</foreach>)</if> "
          + "<if test='attachmentClassificationNameIn != null'>AND ac.NAME IN(<foreach item='item' collection='attachmentClassificationNameIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='attachmentClassificationNameLike != null'>AND (<foreach item='item' collection='attachmentClassificationNameLike' separator=' OR '>UPPER(ac.NAME) LIKE #{item}</foreach>)</if> "
          + "<if test='ownerIn != null'>AND t.OWNER IN(<foreach item='item' collection='ownerIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='ownerLike != null'>AND (<foreach item='item' collection='ownerLike' separator=' OR '>UPPER(t.OWNER) LIKE #{item}</foreach>)</if> "
          + "<if test='isRead != null'>AND t.IS_READ = #{isRead}</if> "
          + "<if test='isTransferred != null'>AND t.IS_TRANSFERRED = #{isTransferred}</if> "
          + "<if test='objectReferences != null'>"
          + "AND (<foreach item='item' collection='objectReferences' separator=' OR '> "
          + "<if test='item.company != null'>t.POR_COMPANY = #{item.company} </if>"
          + "<if test='item.system != null'> <if test='item.company != null'>AND</if> t.POR_SYSTEM = #{item.system} </if>"
          + "<if test='item.systemInstance != null'> <if test='item.company != null or item.system != null'>AND</if> t.POR_INSTANCE = #{item.systemInstance} </if>"
          + "<if test='item.type != null'> <if test='item.company != null or item.system != null or item.systemInstance != null'>AND</if> t.POR_TYPE = #{item.type} </if>"
          + "<if test='item.value != null'> <if test='item.company != null or item.system != null or item.systemInstance != null or item.type != null'>AND</if> t.POR_VALUE = #{item.value} </if>"
          + "</foreach>)</if>"
          + "<if test='porCompanyIn != null'>AND t.POR_COMPANY IN(<foreach item='item' collection='porCompanyIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='porCompanyLike != null'>AND (<foreach item='item' collection='porCompanyLike' separator=' OR '>UPPER(t.POR_COMPANY) LIKE #{item}</foreach>)</if> "
          + "<if test='porSystemIn != null'>AND t.POR_SYSTEM IN(<foreach item='item' collection='porSystemIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='porSystemLike != null'>AND (<foreach item='item' collection='porSystemLike' separator=' OR '>UPPER(t.POR_SYSTEM) LIKE #{item}</foreach>)</if> "
          + "<if test='porSystemInstanceIn != null'>AND t.POR_INSTANCE IN(<foreach item='item' collection='porSystemInstanceIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='porSystemInstanceLike != null'>AND (<foreach item='item' collection='porSystemInstanceLike' separator=' OR '>UPPER(t.POR_INSTANCE) LIKE #{item}</foreach>)</if> "
          + "<if test='porTypeIn != null'>AND t.POR_TYPE IN(<foreach item='item' collection='porTypeIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='porTypeLike != null'>AND (<foreach item='item' collection='porTypeLike' separator=' OR '>UPPER(t.POR_TYPE) LIKE #{item}</foreach>)</if> "
          + "<if test='porValueIn != null'>AND t.POR_VALUE IN(<foreach item='item' collection='porValueIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='porValueLike != null'>AND (<foreach item='item' collection='porValueLike' separator=' OR '>UPPER(t.POR_VALUE) LIKE #{item}</foreach>)</if> "
          + "<if test='parentBusinessProcessIdIn != null'>AND t.PARENT_BUSINESS_PROCESS_ID IN(<foreach item='item' collection='parentBusinessProcessIdIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='parentBusinessProcessIdLike != null'>AND (<foreach item='item' collection='parentBusinessProcessIdLike' separator=' OR '>UPPER(t.PARENT_BUSINESS_PROCESS_ID) LIKE #{item}</foreach>)</if> "
          + "<if test='businessProcessIdIn != null'>AND t.BUSINESS_PROCESS_ID IN(<foreach item='item' collection='businessProcessIdIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='businessProcessIdLike != null'>AND (<foreach item='item' collection='businessProcessIdLike' separator=' OR '>UPPER(t.BUSINESS_PROCESS_ID) LIKE #{item}</foreach>)</if> "
          + "<if test='custom1In != null'>AND t.CUSTOM_1 IN(<foreach item='item' collection='custom1In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom1Like != null'>AND (<foreach item='item' collection='custom1Like' separator=' OR '>UPPER(t.CUSTOM_1) LIKE #{item}</foreach>)</if> "
          + "<if test='custom2In != null'>AND t.CUSTOM_2 IN(<foreach item='item' collection='custom2In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom2Like != null'>AND (<foreach item='item' collection='custom2Like' separator=' OR '>UPPER(t.CUSTOM_2) LIKE #{item}</foreach>)</if> "
          + "<if test='custom3In != null'>AND t.CUSTOM_3 IN(<foreach item='item' collection='custom3In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom3Like != null'>AND (<foreach item='item' collection='custom3Like' separator=' OR '>UPPER(t.CUSTOM_3) LIKE #{item}</foreach>)</if> "
          + "<if test='custom4In != null'>AND t.CUSTOM_4 IN(<foreach item='item' collection='custom4In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom4Like != null'>AND (<foreach item='item' collection='custom4Like' separator=' OR '>UPPER(t.CUSTOM_4) LIKE #{item}</foreach>)</if> "
          + "<if test='custom5In != null'>AND t.CUSTOM_5 IN(<foreach item='item' collection='custom5In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom5Like != null'>AND (<foreach item='item' collection='custom5Like' separator=' OR '>UPPER(t.CUSTOM_5) LIKE #{item}</foreach>)</if> "
          + "<if test='custom6In != null'>AND t.CUSTOM_6 IN(<foreach item='item' collection='custom6In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom6Like != null'>AND (<foreach item='item' collection='custom6Like' separator=' OR '>UPPER(t.CUSTOM_6) LIKE #{item}</foreach>)</if> "
          + "<if test='custom7In != null'>AND t.CUSTOM_7 IN(<foreach item='item' collection='custom7In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom7Like != null'>AND (<foreach item='item' collection='custom7Like' separator=' OR '>UPPER(t.CUSTOM_7) LIKE #{item}</foreach>)</if> "
          + "<if test='custom8In != null'>AND t.CUSTOM_8 IN(<foreach item='item' collection='custom8In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom8Like != null'>AND (<foreach item='item' collection='custom8Like' separator=' OR '>UPPER(t.CUSTOM_8) LIKE #{item}</foreach>)</if> "
          + "<if test='custom9In != null'>AND t.CUSTOM_9 IN(<foreach item='item' collection='custom9In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom9Like != null'>AND (<foreach item='item' collection='custom9Like' separator=' OR '>UPPER(t.CUSTOM_9) LIKE #{item}</foreach>)</if> "
          + "<if test='custom10In != null'>AND t.CUSTOM_10 IN(<foreach item='item' collection='custom10In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom10Like != null'>AND (<foreach item='item' collection='custom10Like' separator=' OR '>UPPER(t.CUSTOM_10) LIKE #{item}</foreach>)</if> "
          + "<if test='custom11In != null'>AND t.CUSTOM_11 IN(<foreach item='item' collection='custom11In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom11Like != null'>AND (<foreach item='item' collection='custom11Like' separator=' OR '>UPPER(t.CUSTOM_11) LIKE #{item}</foreach>)</if> "
          + "<if test='custom12In != null'>AND t.CUSTOM_12 IN(<foreach item='item' collection='custom12In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom12Like != null'>AND (<foreach item='item' collection='custom12Like' separator=' OR '>UPPER(t.CUSTOM_12) LIKE #{item}</foreach>)</if> "
          + "<if test='custom13In != null'>AND t.CUSTOM_13 IN(<foreach item='item' collection='custom13In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom13Like != null'>AND (<foreach item='item' collection='custom13Like' separator=' OR '>UPPER(t.CUSTOM_13) LIKE #{item}</foreach>)</if> "
          + "<if test='custom14In != null'>AND t.CUSTOM_14 IN(<foreach item='item' collection='custom14In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom14Like != null'>AND (<foreach item='item' collection='custom14Like' separator=' OR '>UPPER(t.CUSTOM_14) LIKE #{item}</foreach>)</if> "
          + "<if test='custom15In != null'>AND t.CUSTOM_15 IN(<foreach item='item' collection='custom15In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom15Like != null'>AND (<foreach item='item' collection='custom15Like' separator=' OR '>UPPER(t.CUSTOM_15) LIKE #{item}</foreach>)</if> "
          + "<if test='custom16In != null'>AND t.CUSTOM_16 IN(<foreach item='item' collection='custom16In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom16Like != null'>AND (<foreach item='item' collection='custom16Like' separator=' OR '>UPPER(t.CUSTOM_16) LIKE #{item}</foreach>)</if> "
          + "<if test='attachmentClassificationKeyIn != null'>AND a.CLASSIFICATION_KEY IN(<foreach item='item' collection='attachmentClassificationKeyIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='attachmentClassificationKeyLike != null'>AND (<foreach item='item' collection='attachmentClassificationKeyLike' separator=' OR '>UPPER(a.CLASSIFICATION_KEY) LIKE #{item}</foreach>)</if> "
          + "<if test='attachmentClassificationIdIn != null'>AND a.CLASSIFICATION_ID IN(<foreach item='item' collection='attachmentClassificationIdIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='attachmentClassificationIdLike != null'>AND (<foreach item='item' collection='attachmentclassificationIdLike' separator=' OR '>UPPER(a.CLASSIFICATION_ID) LIKE #{item}</foreach>)</if> "
          + "<if test='attachmentChannelIn != null'>AND a.CHANNEL IN(<foreach item='item' collection='attachmentChannelIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='attachmentChannelLike != null'>AND (<foreach item='item' collection='attachmentChannelLike' separator=' OR '>UPPER(a.CHANNEL) LIKE #{item}</foreach>)</if> "
          + "<if test='attachmentReferenceIn != null'>AND a.REF_VALUE IN(<foreach item='item' collection='attachmentReferenceIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='attachmentReferenceLike != null'>AND (<foreach item='item' collection='attachmentReferenceLike' separator=' OR '>UPPER(a.REF_VALUE) LIKE #{item}</foreach>)</if> "
          + "<if test='attachmentReceivedIn !=null'> AND ( <foreach item='item' collection='attachmentReceivedIn' separator=' OR ' > ( <if test='item.begin!=null'> a.RECEIVED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> a.RECEIVED &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='wildcardSearchValueLike != null and wildcardSearchFieldIn != null'>AND (<foreach item='item' collection='wildcardSearchFieldIn' separator=' OR '>UPPER(t.${item}) LIKE #{wildcardSearchValueLike}</foreach>)</if> "
          + CLOSING_WHERE_TAG
          + CLOSING_SCRIPT_TAG;
    }

    public static String countQueryTasksDb2(TaskQueryImpl taskQuery) {
      return OPENING_SCRIPT_TAG
          + "WITH X (ID, WORKBASKET_ID) AS (SELECT <if test=\"useDistinctKeyword\">DISTINCT</if> t.ID, t.WORKBASKET_ID FROM TASK t "
          + "<if test=\"joinWithAttachments\">"
          + "LEFT JOIN ATTACHMENT AS a ON t.ID = a.TASK_ID "
          + "</if>"
          + "<if test=\"joinWithClassifications\">"
          + "LEFT JOIN CLASSIFICATION AS c ON t.CLASSIFICATION_ID = c.ID "
          + "</if>"
          + "<if test=\"joinWithAttachmentClassifications\">"
          + "LEFT JOIN CLASSIFICATION AS ac ON a.CLASSIFICATION_ID = ac.ID "
          + "</if>"
          + OPENING_WHERE_TAG
          + "<if test='taskIds != null'>AND t.ID IN(<foreach item='item' collection='taskIds' separator=',' >#{item}</foreach>)</if> "
          + "<if test='externalIdIn != null'>AND t.EXTERNAL_ID IN(<foreach item='item' collection='externalIdIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='externalIdLike != null'>AND (<foreach item='item' collection='externalIdLike' separator=' OR '>UPPER(t.EXTERNAL_ID) LIKE #{item}</foreach>)</if> "
          + "<if test='createdIn !=null'> AND ( <foreach item='item' collection='createdIn' separator=' OR ' > ( <if test='item.begin!=null'> t.CREATED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.CREATED &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='claimedIn !=null'> AND ( <foreach item='item' collection='claimedIn' separator=' OR ' > ( <if test='item.begin!=null'> t.CLAIMED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.CLAIMED &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='completedIn !=null'> AND ( <foreach item='item' collection='completedIn' separator=' OR ' > ( <if test='item.begin!=null'> t.COMPLETED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.COMPLETED &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='modifiedIn !=null'> AND ( <foreach item='item' collection='modifiedIn' separator=' OR ' > ( <if test='item.begin!=null'> t.MODIFIED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.MODIFIED &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='plannedIn !=null'> AND ( <foreach item='item' collection='plannedIn' separator=' OR ' > ( <if test='item.begin!=null'> t.PLANNED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.PLANNED &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='dueIn !=null'> AND ( <foreach item='item' collection='dueIn' separator=' OR ' > ( <if test='item.begin!=null'> t.DUE &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.DUE &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='nameIn != null'>AND t.NAME IN(<foreach item='item' collection='nameIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='nameLike != null'>AND (<foreach item='item' collection='nameLike' separator=' OR '>UPPER(t.NAME) LIKE #{item}</foreach>)</if> "
          + "<if test='creatorIn != null'>AND t.CREATOR IN(<foreach item='item' collection='creatorIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='creatorLike != null'>AND (<foreach item='item' collection='creatorLike' separator=' OR '>UPPER(t.CREATOR) LIKE #{item}</foreach>)</if> "
          + "<if test='description != null'>AND (<foreach item='item' collection='description' separator=' OR '>t.DESCRIPTION LIKE #{item}</foreach>)</if> "
          + "<if test='noteLike != null'>AND (<foreach item='item' collection='noteLike' separator=' OR '>UPPER(t.NOTE) LIKE #{item}</foreach>)</if> "
          + "<if test='priority != null'>AND t.PRIORITY IN(<foreach item='item' collection='priority' separator=',' >#{item}</foreach>)</if> "
          + "<if test='stateIn != null'>AND t.STATE IN(<foreach item='item' collection='stateIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='callbackStateIn != null'>AND t.CALLBACK_STATE IN(<foreach item='item' collection='callbackStateIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='workbasketIdIn != null'>AND t.WORKBASKET_ID IN(<foreach item='item' collection='workbasketIdIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='workbasketKeyDomainIn != null'>AND (<foreach item='item' collection='workbasketKeyDomainIn' separator=' OR '>(t.WORKBASKET_KEY = #{item.key} AND t.DOMAIN = #{item.domain})</foreach>)</if> "
          + "<if test='classificationKeyIn != null'>AND t.CLASSIFICATION_KEY IN(<foreach item='item' collection='classificationKeyIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='classificationKeyNotIn != null'>AND t.CLASSIFICATION_KEY NOT IN(<foreach item='item' collection='classificationKeyNotIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='classificationKeyLike != null'>AND (<foreach item='item' collection='classificationKeyLike' separator=' OR '>UPPER(t.CLASSIFICATION_KEY) LIKE #{item}</foreach>)</if> "
          + "<if test='classificationIdIn != null'>AND t.CLASSIFICATION_ID IN(<foreach item='item' collection='classificationIdIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='classificationCategoryIn != null'>AND t.CLASSIFICATION_CATEGORY IN(<foreach item='item' collection='classificationCategoryIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='classificationCategoryLike != null'>AND (<foreach item='item' collection='classificationCategoryLike' separator=' OR '>UPPER(t.CLASSIFICATION_CATEGORY) LIKE #{item}</foreach>)</if> "
          + "<if test='classificationNameIn != null'>AND c.NAME IN(<foreach item='item' collection='classificationNameIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='classificationNameLike != null'>AND (<foreach item='item' collection='classificationNameLike' separator=' OR '>UPPER(c.NAME) LIKE #{item}</foreach>)</if> "
          + "<if test='attachmentClassificationNameIn != null'>AND ac.NAME IN(<foreach item='item' collection='attachmentClassificationNameIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='attachmentClassificationNameLike != null'>AND (<foreach item='item' collection='attachmentClassificationNameLike' separator=' OR '>UPPER(ac.NAME) LIKE #{item}</foreach>)</if> "
          + "<if test='ownerIn != null'>AND t.OWNER IN(<foreach item='item' collection='ownerIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='ownerLike != null'>AND (<foreach item='item' collection='ownerLike' separator=' OR '>UPPER(t.OWNER) LIKE #{item}</foreach>)</if> "
          + "<if test='isRead != null'>AND t.IS_READ = #{isRead}</if> "
          + "<if test='isTransferred != null'>AND t.IS_TRANSFERRED = #{isTransferred}</if> "
          + "<if test='objectReferences != null'>"
          + "AND (<foreach item='item' collection='objectReferences' separator=' OR '> "
          + "<if test='item.company != null'>t.POR_COMPANY = #{item.company} </if>"
          + "<if test='item.system != null'> <if test='item.company != null'>AND</if> t.POR_SYSTEM = #{item.system} </if>"
          + "<if test='item.systemInstance != null'> <if test='item.company != null or item.system != null'>AND</if> t.POR_INSTANCE = #{item.systemInstance} </if>"
          + "<if test='item.type != null'> <if test='item.company != null or item.system != null or item.systemInstance != null'>AND</if> t.POR_TYPE = #{item.type} </if>"
          + "<if test='item.value != null'> <if test='item.company != null or item.system != null or item.systemInstance != null or item.type != null'>AND</if> t.POR_VALUE = #{item.value} </if>"
          + "</foreach>)</if>"
          + "<if test='porCompanyIn != null'>AND t.POR_COMPANY IN(<foreach item='item' collection='porCompanyIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='porCompanyLike != null'>AND (<foreach item='item' collection='porCompanyLike' separator=' OR '>UPPER(t.POR_COMPANY) LIKE #{item}</foreach>)</if> "
          + "<if test='porSystemIn != null'>AND t.POR_SYSTEM IN(<foreach item='item' collection='porSystemIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='porSystemLike != null'>AND (<foreach item='item' collection='porSystemLike' separator=' OR '>UPPER(t.POR_SYSTEM) LIKE #{item}</foreach>)</if> "
          + "<if test='porSystemInstanceIn != null'>AND t.POR_INSTANCE IN(<foreach item='item' collection='porSystemInstanceIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='porSystemInstanceLike != null'>AND (<foreach item='item' collection='porSystemInstanceLike' separator=' OR '>UPPER(t.POR_INSTANCE) LIKE #{item}</foreach>)</if> "
          + "<if test='porTypeIn != null'>AND t.POR_TYPE IN(<foreach item='item' collection='porTypeIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='porTypeLike != null'>AND (<foreach item='item' collection='porTypeLike' separator=' OR '>UPPER(t.POR_TYPE) LIKE #{item}</foreach>)</if> "
          + "<if test='porValueIn != null'>AND t.POR_VALUE IN(<foreach item='item' collection='porValueIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='porValueLike != null'>AND (<foreach item='item' collection='porValueLike' separator=' OR '>UPPER(t.POR_VALUE) LIKE #{item}</foreach>)</if> "
          + "<if test='parentBusinessProcessIdIn != null'>AND t.PARENT_BUSINESS_PROCESS_ID IN(<foreach item='item' collection='parentBusinessProcessIdIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='parentBusinessProcessIdLike != null'>AND (<foreach item='item' collection='parentBusinessProcessIdLike' separator=' OR '>UPPER(t.PARENT_BUSINESS_PROCESS_ID) LIKE #{item}</foreach>)</if> "
          + "<if test='businessProcessIdIn != null'>AND t.BUSINESS_PROCESS_ID IN(<foreach item='item' collection='businessProcessIdIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='businessProcessIdLike != null'>AND (<foreach item='item' collection='businessProcessIdLike' separator=' OR '>UPPER(t.BUSINESS_PROCESS_ID) LIKE #{item}</foreach>)</if> "
          + "<if test='custom1In != null'>AND t.CUSTOM_1 IN(<foreach item='item' collection='custom1In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom1Like != null'>AND (<foreach item='item' collection='custom1Like' separator=' OR '>UPPER(t.CUSTOM_1) LIKE #{item}</foreach>)</if> "
          + "<if test='custom2In != null'>AND t.CUSTOM_2 IN(<foreach item='item' collection='custom2In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom2Like != null'>AND (<foreach item='item' collection='custom2Like' separator=' OR '>UPPER(t.CUSTOM_2) LIKE #{item}</foreach>)</if> "
          + "<if test='custom3In != null'>AND t.CUSTOM_3 IN(<foreach item='item' collection='custom3In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom3Like != null'>AND (<foreach item='item' collection='custom3Like' separator=' OR '>UPPER(t.CUSTOM_3) LIKE #{item}</foreach>)</if> "
          + "<if test='custom4In != null'>AND t.CUSTOM_4 IN(<foreach item='item' collection='custom4In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom4Like != null'>AND (<foreach item='item' collection='custom4Like' separator=' OR '>UPPER(t.CUSTOM_4) LIKE #{item}</foreach>)</if> "
          + "<if test='custom5In != null'>AND t.CUSTOM_5 IN(<foreach item='item' collection='custom5In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom5Like != null'>AND (<foreach item='item' collection='custom5Like' separator=' OR '>UPPER(t.CUSTOM_5) LIKE #{item}</foreach>)</if> "
          + "<if test='custom6In != null'>AND t.CUSTOM_6 IN(<foreach item='item' collection='custom6In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom6Like != null'>AND (<foreach item='item' collection='custom6Like' separator=' OR '>UPPER(t.CUSTOM_6) LIKE #{item}</foreach>)</if> "
          + "<if test='custom7In != null'>AND t.CUSTOM_7 IN(<foreach item='item' collection='custom7In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom7Like != null'>AND (<foreach item='item' collection='custom7Like' separator=' OR '>UPPER(t.CUSTOM_7) LIKE #{item}</foreach>)</if> "
          + "<if test='custom8In != null'>AND t.CUSTOM_8 IN(<foreach item='item' collection='custom8In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom8Like != null'>AND (<foreach item='item' collection='custom8Like' separator=' OR '>UPPER(t.CUSTOM_8) LIKE #{item}</foreach>)</if> "
          + "<if test='custom9In != null'>AND t.CUSTOM_9 IN(<foreach item='item' collection='custom9In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom9Like != null'>AND (<foreach item='item' collection='custom9Like' separator=' OR '>UPPER(t.CUSTOM_9) LIKE #{item}</foreach>)</if> "
          + "<if test='custom10In != null'>AND t.CUSTOM_10 IN(<foreach item='item' collection='custom10In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom10Like != null'>AND (<foreach item='item' collection='custom10Like' separator=' OR '>UPPER(t.CUSTOM_10) LIKE #{item}</foreach>)</if> "
          + "<if test='custom11In != null'>AND t.CUSTOM_11 IN(<foreach item='item' collection='custom11In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom11Like != null'>AND (<foreach item='item' collection='custom11Like' separator=' OR '>UPPER(t.CUSTOM_11) LIKE #{item}</foreach>)</if> "
          + "<if test='custom12In != null'>AND t.CUSTOM_12 IN(<foreach item='item' collection='custom12In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom12Like != null'>AND (<foreach item='item' collection='custom12Like' separator=' OR '>UPPER(t.CUSTOM_12) LIKE #{item}</foreach>)</if> "
          + "<if test='custom13In != null'>AND t.CUSTOM_13 IN(<foreach item='item' collection='custom13In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom13Like != null'>AND (<foreach item='item' collection='custom13Like' separator=' OR '>UPPER(t.CUSTOM_13) LIKE #{item}</foreach>)</if> "
          + "<if test='custom14In != null'>AND t.CUSTOM_14 IN(<foreach item='item' collection='custom14In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom14Like != null'>AND (<foreach item='item' collection='custom14Like' separator=' OR '>UPPER(t.CUSTOM_14) LIKE #{item}</foreach>)</if> "
          + "<if test='custom15In != null'>AND t.CUSTOM_15 IN(<foreach item='item' collection='custom15In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom15Like != null'>AND (<foreach item='item' collection='custom15Like' separator=' OR '>UPPER(t.CUSTOM_15) LIKE #{item}</foreach>)</if> "
          + "<if test='custom16In != null'>AND t.CUSTOM_16 IN(<foreach item='item' collection='custom16In' separator=',' >#{item}</foreach>)</if> "
          + "<if test='custom16Like != null'>AND (<foreach item='item' collection='custom16Like' separator=' OR '>UPPER(t.CUSTOM_16) LIKE #{item}</foreach>)</if> "
          + "<if test='attachmentClassificationKeyIn != null'>AND a.CLASSIFICATION_KEY IN(<foreach item='item' collection='attachmentClassificationKeyIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='attachmentClassificationKeyLike != null'>AND (<foreach item='item' collection='attachmentClassificationKeyLike' separator=' OR '>UPPER(a.CLASSIFICATION_KEY) LIKE #{item}</foreach>)</if> "
          + "<if test='attachmentClassificationIdIn != null'>AND a.CLASSIFICATION_ID IN(<foreach item='item' collection='attachmentClassificationIdIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='attachmentClassificationIdLike != null'>AND (<foreach item='item' collection='attachmentclassificationIdLike' separator=' OR '>UPPER(a.CLASSIFICATION_ID) LIKE #{item}</foreach>)</if> "
          + "<if test='attachmentChannelIn != null'>AND a.CHANNEL IN(<foreach item='item' collection='attachmentChannelIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='attachmentChannelLike != null'>AND (<foreach item='item' collection='attachmentChannelLike' separator=' OR '>UPPER(a.CHANNEL) LIKE #{item}</foreach>)</if> "
          + "<if test='attachmentReferenceIn != null'>AND a.REF_VALUE IN(<foreach item='item' collection='attachmentReferenceIn' separator=',' >#{item}</foreach>)</if> "
          + "<if test='attachmentReferenceLike != null'>AND (<foreach item='item' collection='attachmentReferenceLike' separator=' OR '>UPPER(a.REF_VALUE) LIKE #{item}</foreach>)</if> "
          + "<if test='attachmentReceivedIn !=null'> AND ( <foreach item='item' collection='attachmentReceivedIn' separator=' OR ' > ( <if test='item.begin!=null'> a.RECEIVED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> a.RECEIVED &lt;=#{item.end} </if>)</foreach>)</if> "
          + "<if test='wildcardSearchValueLike != null and wildcardSearchFieldIn != null'>AND (<foreach item='item' collection='wildcardSearchFieldIn' separator=' OR '>UPPER(t.${item}) LIKE #{wildcardSearchValueLike}</foreach>)</if> "
          + CLOSING_WHERE_TAG
          + "), Y (ID, FLAG) AS "
          + "(SELECT ID, (SELECT 1 FROM WORKBASKET_ACCESS_LIST s WHERE "
          + "<if test='accessIdIn != null'> "
          + "s.ACCESS_ID IN (<foreach item='item' collection='accessIdIn' separator=',' >#{item}</foreach>) and "
          + "</if>"
          + "s.WORKBASKET_ID = X.WORKBASKET_ID AND "
          + "s.perm_read = 1 "
          + "fetch first 1 rows only "
          + ") FROM X ) "
          + "SELECT COUNT(*)  FROM Y WHERE FLAG = 1 "
          + "with UR "
          + CLOSING_SCRIPT_TAG;
    }

    public String countQueryObjectReferences(ObjectReferenceQueryImpl objectReference) {
      return OPENING_SCRIPT_TAG
          + "SELECT COUNT(ID) FROM OBJECT_REFERENCE "
          + OPENING_WHERE_TAG
          + "<if test='company != null'>AND COMPANY IN(<foreach item='item' collection='company' separator=',' >#{item}</foreach>)</if> "
          + "<if test='system != null'>AND SYSTEM IN(<foreach item='item' collection='system' separator=',' >#{item}</foreach>)</if> "
          + "<if test='systemInstance != null'>AND SYSTEM_INSTANCE IN(<foreach item='item' collection='systemInstance' separator=',' >#{item}</foreach>)</if> "
          + "<if test='type != null'>AND TYPE IN(<foreach item='item' collection='type' separator=',' >#{item}</foreach>)</if> "
          + "<if test='value != null'>AND VALUE IN(<foreach item='item' collection='value' separator=',' >#{item}</foreach>)</if> "
          + CLOSING_WHERE_TAG
          + "<if test=\"_databaseId == 'db2'\">with UR </if> "
          + CLOSING_SCRIPT_TAG;
    }

    public String queryObjectReferenceColumnValues(ObjectReferenceQueryImpl objectReference) {
      return OPENING_SCRIPT_TAG
          + "SELECT DISTINCT ${columnName} "
          + "FROM TASK t "
          + "<if test=\"joinWithAttachments\">"
          + "LEFT JOIN ATTACHMENT AS a ON t.ID = a.TASK_ID "
          + "</if>"
          + "<if test=\"joinWithClassifications\">"
          + "LEFT JOIN CLASSIFICATION AS c ON t.CLASSIFICATION_ID = c.ID "
          + "</if>"
          + "<if test=\"joinWithAttachmentClassifications\">"
          + "LEFT JOIN CLASSIFICATION AS ac ON a.CLASSIFICATION_ID = ac.ID "
          + "</if>"
          + OPENING_WHERE_TAG
          + "<if test='accessIdIn != null'> "
          + "AND t.WORKBASKET_ID IN ( "
          + "select WID from (select WORKBASKET_ID as WID, MAX(PERM_READ) as MAX_READ FROM WORKBASKET_ACCESS_LIST where "
          + "ACCESS_ID IN (<foreach item='item' collection='accessIdIn' separator=',' >#{item}</foreach>) "
          + "group by WORKBASKET_ID ) where max_read = 1 ) "
          + "</if> "
          + commonWhereStatement()
          + CLOSING_WHERE_TAG
          + "<if test='!orderBy.isEmpty()'>ORDER BY <foreach item='item' collection='orderBy' separator=',' >"
          + "<choose>"
          + "<when test=\"item.contains('TCLASSIFICATION_KEY ASC')\">"
          + "t.CLASSIFICATION_KEY ASC"
          + "</when>"
          + "<when test=\"item.contains('TCLASSIFICATION_KEY DESC')\">"
          + "t.CLASSIFICATION_KEY DESC"
          + "</when>"
          + "<when test=\"item.contains('ACLASSIFICATION_KEY ASC')\">"
          + "a.CLASSIFICATION_KEY ASC"
          + "</when>"
          + "<when test=\"item.contains('ACLASSIFICATION_KEY DESC')\">"
          + "a.CLASSIFICATION_KEY DESC"
          + "</when>"
          + "<when test=\"item.contains('ACLASSIFICATION_ID ASC')\">"
          + "a.CLASSIFICATION_ID ASC"
          + "</when>"
          + "<when test=\"item.contains('ACLASSIFICATION_ID DESC')\">"
          + "a.CLASSIFICATION_ID DESC"
          + "</when>"
          + "<when test=\"item.contains('CLASSIFICATION_NAME DESC')\">"
          + "c.NAME DESC"
          + "</when>"
          + "<when test=\"item.contains('CLASSIFICATION_NAME ASC')\">"
          + "c.NAME ASC"
          + "</when>"
          + "<when test=\"item.contains('A_CLASSIFICATION_NAME DESC')\">"
          + "ac.NAME DESC"
          + "</when>"
          + "<when test=\"item.contains('A_CLASSIFICATION_NAME ASC')\">"
          + "ac.NAME ASC"
          + "</when>"
          + "<otherwise>"
          + "${item}"
          + "</otherwise>"
          + "</choose>"
          + "</foreach></if> "
          + "<if test=\"_databaseId == 'db2'\">with UR </if> "
          + CLOSING_SCRIPT_TAG;
    }

    public String queryTaskColumnValues(TaskQueryImpl taskQuery) {
      return OPENING_SCRIPT_TAG
          + "SELECT DISTINCT ${columnName} "
          + "FROM OBJECT_REFERENCE "
          + OPENING_WHERE_TAG
          + "<if test='company != null'>AND COMPANY IN(<foreach item='item' collection='company' separator=',' >#{item}</foreach>)</if> "
          + "<if test='system != null'>AND SYSTEM IN(<foreach item='item' collection='system' separator=',' >#{item}</foreach>)</if> "
          + "<if test='systemInstance != null'>AND SYSTEM_INSTANCE IN(<foreach item='item' collection='systemInstance' separator=',' >#{item}</foreach>)</if> "
          + "<if test='type != null'>AND TYPE IN(<foreach item='item' collection='type' separator=',' >#{item}</foreach>)</if> "
          + "<if test='value != null'>AND VALUE IN(<foreach item='item' collection='value' separator=',' >#{item}</foreach>)</if> "
          + CLOSING_WHERE_TAG
          + "<if test=\"_databaseId == 'db2'\">with UR </if> "
          + CLOSING_SCRIPT_TAG;
    }

    private static String commonWhereStatement() {
      String s =
          "<if test='taskIds != null'>AND t.ID IN(<foreach item='item' collection='taskIds' separator=',' >#{item}</foreach>)</if> "
              + "<if test='description != null'>AND (<foreach item='item' collection='description' separator=' OR '>DESCRIPTION LIKE #{item}</foreach>)</if> "
              + "<if test='priority != null'>AND PRIORITY IN(<foreach item='item' collection='priority' separator=',' >#{item}</foreach>)</if> "
              + "<if test='isRead != null'>AND IS_READ = #{isRead}</if> "
              + "<if test='isTransferred != null'>AND IS_TRANSFERRED = #{isTransferred}</if> "
              // xynotin
              + "<if test='classificationKeyNotIn != null'>AND t.CLASSIFICATION_KEY NOT IN(<foreach item='item' collection='classificationKeyNotIn' separator=',' >#{item}</foreach>)</if> "
              // xylike + foreach
              + "<if test='externalIdLike != null'>AND (<foreach item='item' collection='externalIdLike' separator=' OR '>UPPER(t.EXTERNAL_ID) LIKE #{item}</foreach>)</if> "
              + "<if test='nameLike != null'>AND (<foreach item='item' collection='nameLike' separator=' OR '>UPPER(t.NAME) LIKE #{item}</foreach>)</if> "
              + "<if test='creatorLike != null'>AND (<foreach item='item' collection='creatorLike' separator=' OR '>UPPER(CREATOR) LIKE #{item}</foreach>)</if> "
              + "<if test='noteLike != null'>AND (<foreach item='item' collection='noteLike' separator=' OR '>UPPER(NOTE) LIKE #{item}</foreach>)</if> "
              + "<if test='classificationKeyLike != null'>AND (<foreach item='item' collection='classificationKeyLike' separator=' OR '>UPPER(t.CLASSIFICATION_KEY) LIKE #{item}</foreach>)</if> "
              + "<if test='classificationCategoryLike != null'>AND (<foreach item='item' collection='classificationCategoryLike' separator=' OR '>UPPER(CLASSIFICATION_CATEGORY) LIKE #{item}</foreach>)</if> "
              + "<if test='classificationNameLike != null'>AND (<foreach item='item' collection='classificationNameLike' separator=' OR '>UPPER(c.NAME) LIKE #{item}</foreach>)</if> "
              + "<if test='attachmentClassificationNameLike != null'>AND (<foreach item='item' collection='attachmentClassificationNameLike' separator=' OR '>UPPER(ac.NAME) LIKE #{item}</foreach>)</if> "
              + "<if test='ownerLike != null'>AND (<foreach item='item' collection='ownerLike' separator=' OR '>UPPER(OWNER) LIKE #{item}</foreach>)</if> "
              + "<if test='porCompanyLike != null'>AND (<foreach item='item' collection='porCompanyLike' separator=' OR '>UPPER(POR_COMPANY) LIKE #{item}</foreach>)</if> "
              + "<if test='porSystemLike != null'>AND (<foreach item='item' collection='porSystemLike' separator=' OR '>UPPER(POR_SYSTEM) LIKE #{item}</foreach>)</if> "
              + "<if test='porSystemInstanceLike != null'>AND (<foreach item='item' collection='porSystemInstanceLike' separator=' OR '>UPPER(POR_INSTANCE) LIKE #{item}</foreach>)</if> "
              + "<if test='porTypeLike != null'>AND (<foreach item='item' collection='porTypeLike' separator=' OR '>UPPER(POR_TYPE) LIKE #{item}</foreach>)</if> "
              + "<if test='porValueLike != null'>AND (<foreach item='item' collection='porValueLike' separator=' OR '>UPPER(POR_VALUE) LIKE #{item}</foreach>)</if> "
              + "<if test='parentBusinessProcessIdLike != null'>AND (<foreach item='item' collection='parentBusinessProcessIdLike' separator=' OR '>UPPER(PARENT_BUSINESS_PROCESS_ID) LIKE #{item}</foreach>)</if> "
              + "<if test='businessProcessIdLike != null'>AND (<foreach item='item' collection='businessProcessIdLike' separator=' OR '>UPPER(BUSINESS_PROCESS_ID) LIKE #{item}</foreach>)</if> "
              + "<if test='custom1Like != null'>AND (<foreach item='item' collection='custom1Like' separator=' OR '>UPPER(CUSTOM_1) LIKE #{item}</foreach>)</if> "
              + "<if test='custom2Like != null'>AND (<foreach item='item' collection='custom2Like' separator=' OR '>UPPER(CUSTOM_2) LIKE #{item}</foreach>)</if> "
              + "<if test='custom3Like != null'>AND (<foreach item='item' collection='custom3Like' separator=' OR '>UPPER(CUSTOM_3) LIKE #{item}</foreach>)</if> "
              + "<if test='custom4Like != null'>AND (<foreach item='item' collection='custom4Like' separator=' OR '>UPPER(CUSTOM_4) LIKE #{item}</foreach>)</if> "
              + "<if test='custom5Like != null'>AND (<foreach item='item' collection='custom5Like' separator=' OR '>UPPER(CUSTOM_5) LIKE #{item}</foreach>)</if> "
              + "<if test='custom6Like != null'>AND (<foreach item='item' collection='custom6Like' separator=' OR '>UPPER(CUSTOM_6) LIKE #{item}</foreach>)</if> "
              + "<if test='custom7Like != null'>AND (<foreach item='item' collection='custom7Like' separator=' OR '>UPPER(CUSTOM_7) LIKE #{item}</foreach>)</if> "
              + "<if test='custom8Like != null'>AND (<foreach item='item' collection='custom8Like' separator=' OR '>UPPER(CUSTOM_8) LIKE #{item}</foreach>)</if> "
              + "<if test='custom9Like != null'>AND (<foreach item='item' collection='custom9Like' separator=' OR '>UPPER(CUSTOM_9) LIKE #{item}</foreach>)</if> "
              + "<if test='custom10Like != null'>AND (<foreach item='item' collection='custom10Like' separator=' OR '>UPPER(CUSTOM_10) LIKE #{item}</foreach>)</if> "
              + "<if test='custom11Like != null'>AND (<foreach item='item' collection='custom11Like' separator=' OR '>UPPER(CUSTOM_11) LIKE #{item}</foreach>)</if> "
              + "<if test='custom12Like != null'>AND (<foreach item='item' collection='custom12Like' separator=' OR '>UPPER(CUSTOM_12) LIKE #{item}</foreach>)</if> "
              + "<if test='custom13Like != null'>AND (<foreach item='item' collection='custom13Like' separator=' OR '>UPPER(CUSTOM_13) LIKE #{item}</foreach>)</if> "
              + "<if test='custom14Like != null'>AND (<foreach item='item' collection='custom14Like' separator=' OR '>UPPER(CUSTOM_14) LIKE #{item}</foreach>)</if> "
              + "<if test='custom15Like != null'>AND (<foreach item='item' collection='custom15Like' separator=' OR '>UPPER(CUSTOM_15) LIKE #{item}</foreach>)</if> "
              + "<if test='custom16Like != null'>AND (<foreach item='item' collection='custom16Like' separator=' OR '>UPPER(CUSTOM_16) LIKE #{item}</foreach>)</if> "
              + "<if test='attachmentClassificationKeyLike != null'>AND (<foreach item='item' collection='attachmentClassificationKeyLike' separator=' OR '>UPPER(a.CLASSIFICATION_KEY) LIKE #{item}</foreach>)</if> "
              + "<if test='attachmentClassificationIdLike != null'>AND (<foreach item='item' collection='attachmentClassificationIdLike' separator=' OR '>UPPER(a.CLASSIFICATION_ID) LIKE #{item}</foreach>)</if> "
              + "<if test='attachmentChannelLike != null'>AND (<foreach item='item' collection='attachmentChannelLike' separator=' OR '>UPPER(a.CHANNEL) LIKE #{item}</foreach>)</if> "
              + "<if test='attachmentReferenceLike != null'>AND (<foreach item='item' collection='attachmentReferenceLike' separator=' OR '>UPPER(a.REF_VALUE) LIKE #{item}</foreach>)</if> "
              // xyin
              + "<if test='createdIn !=null'> AND ( <foreach item='item' collection='createdIn' separator=' OR ' > ( <if test='item.begin!=null'> t.CREATED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.CREATED &lt;=#{item.end} </if>)</foreach>)</if> "
              + "<if test='claimedIn !=null'> AND ( <foreach item='item' collection='claimedIn' separator=' OR ' > ( <if test='item.begin!=null'> t.CLAIMED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.CLAIMED &lt;=#{item.end} </if>)</foreach>)</if> "
              + "<if test='completedIn !=null'> AND ( <foreach item='item' collection='completedIn' separator=' OR ' > ( <if test='item.begin!=null'> t.COMPLETED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.COMPLETED &lt;=#{item.end} </if>)</foreach>)</if> "
              + "<if test='modifiedIn !=null'> AND ( <foreach item='item' collection='modifiedIn' separator=' OR ' > ( <if test='item.begin!=null'> t.MODIFIED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.MODIFIED &lt;=#{item.end} </if>)</foreach>)</if> "
              + "<if test='plannedIn !=null'> AND ( <foreach item='item' collection='plannedIn' separator=' OR ' > ( <if test='item.begin!=null'> t.PLANNED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.PLANNED &lt;=#{item.end} </if>)</foreach>)</if> "
              + "<if test='dueIn !=null'> AND ( <foreach item='item' collection='dueIn' separator=' OR ' > ( <if test='item.begin!=null'> t.DUE &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> t.DUE &lt;=#{item.end} </if>)</foreach>)</if> "
              + "<if test='attachmentReceivedIn !=null'> AND ( <foreach item='item' collection='attachmentReceivedIn' separator=' OR ' > ( <if test='item.begin!=null'> a.RECEIVED &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> a.RECEIVED &lt;=#{item.end} </if>)</foreach>)</if> "
              // xyin + foreach xy
              + "<if test='externalIdIn != null'>AND t.EXTERNAL_ID IN(<foreach item='item' collection='externalIdIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='nameIn != null'>AND t.NAME IN(<foreach item='item' collection='nameIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='creatorIn != null'>AND CREATOR IN(<foreach item='item' collection='creatorIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='stateIn != null'>AND STATE IN(<foreach item='item' collection='stateIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='callbackStateIn != null'>AND t.CALLBACK_STATE IN(<foreach item='item' collection='callbackStateIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='workbasketIdIn != null'>AND WORKBASKET_ID IN(<foreach item='item' collection='workbasketIdIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='workbasketKeyDomainIn != null'>AND (<foreach item='item' collection='workbasketKeyDomainIn' separator=' OR '>(WORKBASKET_KEY = #{item.key} AND DOMAIN = #{item.domain})</foreach>)</if> "
              + "<if test='classificationKeyIn != null'>AND t.CLASSIFICATION_KEY IN(<foreach item='item' collection='classificationKeyIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='classificationIdIn != null'>AND t.CLASSIFICATION_ID IN(<foreach item='item' collection='classificationIdIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='classificationCategoryIn != null'>AND CLASSIFICATION_CATEGORY IN(<foreach item='item' collection='classificationCategoryIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='classificationNameIn != null'>AND c.NAME IN(<foreach item='item' collection='classificationNameIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='attachmentClassificationNameIn != null'>AND ac.NAME IN(<foreach item='item' collection='attachmentClassificationNameIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='ownerIn != null'>AND OWNER IN(<foreach item='item' collection='ownerIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='porCompanyIn != null'>AND POR_COMPANY IN(<foreach item='item' collection='porCompanyIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='porSystemIn != null'>AND POR_SYSTEM IN(<foreach item='item' collection='porSystemIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='porSystemInstanceIn != null'>AND POR_INSTANCE IN(<foreach item='item' collection='porSystemInstanceIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='porTypeIn != null'>AND POR_TYPE IN(<foreach item='item' collection='porTypeIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='porValueIn != null'>AND POR_VALUE IN(<foreach item='item' collection='porValueIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='parentBusinessProcessIdIn != null'>AND PARENT_BUSINESS_PROCESS_ID IN(<foreach item='item' collection='parentBusinessProcessIdIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='businessProcessIdIn != null'>AND BUSINESS_PROCESS_ID IN(<foreach item='item' collection='businessProcessIdIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='custom1In != null'>AND CUSTOM_1 IN(<foreach item='item' collection='custom1In' separator=',' >#{item}</foreach>)</if> "
              + "<if test='custom2In != null'>AND CUSTOM_2 IN(<foreach item='item' collection='custom2In' separator=',' >#{item}</foreach>)</if> "
              + "<if test='custom3In != null'>AND CUSTOM_3 IN(<foreach item='item' collection='custom3In' separator=',' >#{item}</foreach>)</if> "
              + "<if test='custom4In != null'>AND CUSTOM_4 IN(<foreach item='item' collection='custom4In' separator=',' >#{item}</foreach>)</if> "
              + "<if test='custom5In != null'>AND CUSTOM_5 IN(<foreach item='item' collection='custom5In' separator=',' >#{item}</foreach>)</if> "
              + "<if test='custom6In != null'>AND CUSTOM_6 IN(<foreach item='item' collection='custom6In' separator=',' >#{item}</foreach>)</if> "
              + "<if test='custom7In != null'>AND CUSTOM_7 IN(<foreach item='item' collection='custom7In' separator=',' >#{item}</foreach>)</if> "
              + "<if test='custom8In != null'>AND CUSTOM_8 IN(<foreach item='item' collection='custom8In' separator=',' >#{item}</foreach>)</if> "
              + "<if test='custom9In != null'>AND CUSTOM_9 IN(<foreach item='item' collection='custom9In' separator=',' >#{item}</foreach>)</if> "
              + "<if test='custom10In != null'>AND CUSTOM_10 IN(<foreach item='item' collection='custom10In' separator=',' >#{item}</foreach>)</if> "
              + "<if test='custom11In != null'>AND CUSTOM_11 IN(<foreach item='item' collection='custom11In' separator=',' >#{item}</foreach>)</if> "
              + "<if test='custom12In != null'>AND CUSTOM_12 IN(<foreach item='item' collection='custom12In' separator=',' >#{item}</foreach>)</if> "
              + "<if test='custom13In != null'>AND CUSTOM_13 IN(<foreach item='item' collection='custom13In' separator=',' >#{item}</foreach>)</if> "
              + "<if test='custom14In != null'>AND CUSTOM_14 IN(<foreach item='item' collection='custom14In' separator=',' >#{item}</foreach>)</if> "
              + "<if test='custom15In != null'>AND CUSTOM_15 IN(<foreach item='item' collection='custom15In' separator=',' >#{item}</foreach>)</if> "
              + "<if test='custom16In != null'>AND CUSTOM_16 IN(<foreach item='item' collection='custom16In' separator=',' >#{item}</foreach>)</if> "
              + "<if test='attachmentClassificationKeyIn != null'>AND a.CLASSIFICATION_KEY IN(<foreach item='item' collection='attachmentClassificationKeyIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='attachmentClassificationIdIn != null'>AND a.CLASSIFICATION_ID IN(<foreach item='item' collection='attachmentClassificationIdIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='attachmentChannelIn != null'>AND a.CHANNEL IN(<foreach item='item' collection='attachmentChannelIn' separator=',' >#{item}</foreach>)</if> "
              + "<if test='attachmentReferenceIn != null'>AND a.REF_VALUE IN(<foreach item='item' collection='attachmentReferenceIn' separator=',' >#{item}</foreach>)</if> ";
    }
  }
}
