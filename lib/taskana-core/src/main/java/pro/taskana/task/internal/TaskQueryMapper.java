package pro.taskana.task.internal;

import java.util.List;
import java.util.stream.IntStream;
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
          + OPENING_WHERE_TAG
          + commonWhereStatement()
          + "<if test='objectReferences != null'>"
          + "AND (<foreach item='item' collection='objectReferences' separator=' OR '> "
          + "<if test='item.company != null'>t.POR_COMPANY = #{item.company} </if>"
          + "<if test='item.system != null'> <if test='item.company != null'>AND</if> t.POR_SYSTEM = #{item.system} </if>"
          + "<if test='item.systemInstance != null'> <if test='item.company != null or item.system != null'>AND</if> t.POR_INSTANCE = #{item.systemInstance} </if>"
          + "<if test='item.type != null'> <if test='item.company != null or item.system != null or item.systemInstance != null'>AND</if> t.POR_TYPE = #{item.type} </if>"
          + "<if test='item.value != null'> <if test='item.company != null or item.system != null or item.systemInstance != null or item.type != null'>AND</if> t.POR_VALUE = #{item.value} </if>"
          + "</foreach>)</if>"
          + "<if test='wildcardSearchValueLike != null and wildcardSearchFieldIn != null'>AND (<foreach item='item' collection='wildcardSearchFieldIn' separator=' OR '>UPPER(t.${item}) LIKE #{wildcardSearchValueLike}</foreach>)</if> "
          + CLOSING_WHERE_TAG
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
          + commonWhereStatement()
          + "<if test='objectReferences != null'>"
          + "AND (<foreach item='item' collection='objectReferences' separator=' OR '> "
          + "<if test='item.company != null'>t.POR_COMPANY = #{item.company} </if>"
          + "<if test='item.system != null'> <if test='item.company != null'>AND</if> t.POR_SYSTEM = #{item.system} </if>"
          + "<if test='item.systemInstance != null'> <if test='item.company != null or item.system != null'>AND</if> t.POR_INSTANCE = #{item.systemInstance} </if>"
          + "<if test='item.type != null'> <if test='item.company != null or item.system != null or item.systemInstance != null'>AND</if> t.POR_TYPE = #{item.type} </if>"
          + "<if test='item.value != null'> <if test='item.company != null or item.system != null or item.systemInstance != null or item.type != null'>AND</if> t.POR_VALUE = #{item.value} </if>"
          + "</foreach>)</if>"
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
          + commonWhereStatement()
          + "<if test='objectReferences != null'>"
          + "AND (<foreach item='item' collection='objectReferences' separator=' OR '> "
          + "<if test='item.company != null'>t.POR_COMPANY = #{item.company} </if>"
          + "<if test='item.system != null'> <if test='item.company != null'>AND</if> t.POR_SYSTEM = #{item.system} </if>"
          + "<if test='item.systemInstance != null'> <if test='item.company != null or item.system != null'>AND</if> t.POR_INSTANCE = #{item.systemInstance} </if>"
          + "<if test='item.type != null'> <if test='item.company != null or item.system != null or item.systemInstance != null'>AND</if> t.POR_TYPE = #{item.type} </if>"
          + "<if test='item.value != null'> <if test='item.company != null or item.system != null or item.systemInstance != null or item.type != null'>AND</if> t.POR_VALUE = #{item.value} </if>"
          + "</foreach>)</if>"
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
      StringBuilder sb = new StringBuilder();
      whereIn("taskIds", "t.ID", sb);
      whereIn("priority", "PRIORITY", sb);
      whereIn("externalIdIn", "t.EXTERNAL_ID", sb);
      whereIn("nameIn", "t.NAME", sb);
      whereIn("creatorIn", "CREATOR", sb);
      whereIn("stateIn", "STATE", sb);
      whereIn("callbackStateIn", "t.CALLBACK_STATE", sb);
      whereIn("workbasketIdIn", "WORKBASKET_ID", sb);
      whereIn("classificationKeyIn", "t.CLASSIFICATION_KEY", sb);
      whereIn("classificationIdIn", "t.CLASSIFICATION_ID", sb);
      whereIn("classificationCategoryIn", "CLASSIFICATION_CATEGORY", sb);
      whereIn("classificationNameIn", "c.NAME", sb);
      whereIn("attachmentClassificationNameIn", "ac.NAME", sb);
      whereIn("ownerIn", "OWNER", sb);
      whereIn("porCompanyIn", "POR_COMPANY", sb);
      whereIn("porSystemIn", "POR_SYSTEM", sb);
      whereIn("porSystemInstanceIn", "POR_INSTANCE", sb);
      whereIn("porTypeIn", "POR_TYPE", sb);
      whereIn("porValueIn", "POR_VALUE", sb);
      whereIn("parentBusinessProcessIdIn", "PARENT_BUSINESS_PROCESS_ID", sb);
      whereIn("businessProcessIdIn", "BUSINESS_PROCESS_ID", sb);
      whereIn("attachmentClassificationKeyIn", "a.CLASSIFICATION_KEY", sb);
      whereIn("attachmentClassificationIdIn", "a.CLASSIFICATION_ID", sb);
      whereIn("attachmentChannelIn", "a.CHANNEL", sb);
      whereIn("attachmentReferenceIn", "a.REF_VALUE", sb);
      whereInTime("createdIn", "t.CREATED", sb);
      whereInTime("claimedIn", "t.CLAIMED", sb);
      whereInTime("completedIn", "t.COMPLETED", sb);
      whereInTime("modifiedIn", "t.MODIFIED", sb);
      whereInTime("plannedIn", "t.PLANNED", sb);
      whereInTime("dueIn", "t.DUE", sb);
      whereInTime("attachmentReceivedIn", "a.RECEIVED", sb);
      whereNotIn("classificationKeyNotIn", "t.CLASSIFICATION_KEY", sb);
      whereLike("externalIdLike", "t.EXTERNAL_ID", sb);
      whereLike("nameLike", "t.NAME", sb);
      whereLike("creatorLike", "CREATOR", sb);
      whereLike("noteLike", "NOTE", sb);
      whereLike("classificationKeyLike", "t.CLASSIFICATION_KEY", sb);
      whereLike("classificationCategoryLike", "CLASSIFICATION_CATEGORY", sb);
      whereLike("classificationNameLike", "c.NAME", sb);
      whereLike("attachmentClassificationNameLike", "ac.NAME", sb);
      whereLike("ownerLike", "OWNER", sb);
      whereLike("porCompanyLike", "POR_COMPANY", sb);
      whereLike("porSystemLike", "POR_SYSTEM", sb);
      whereLike("porSystemInstanceLike", "POR_INSTANCE", sb);
      whereLike("porTypeLike", "POR_TYPE", sb);
      whereLike("porValueLike", "POR_VALUE", sb);
      whereLike("parentBusinessProcessIdLike", "PARENT_BUSINESS_PROCESS_ID", sb);
      whereLike("businessProcessIdLike", "BUSINESS_PROCESS_ID", sb);
      whereLike("attachmentClassificationKeyLike", "a.CLASSIFICATION_KEY", sb);
      whereLike("attachmentClassificationIdLike", "a.CLASSIFICATION_ID", sb);
      whereLike("attachmentChannelLike", "a.CHANNEL", sb);
      whereLike("attachmentReferenceLike", "a.REF_VALUE", sb);
      whereLike("description", "DESCRIPTION", sb); // TODO Upper vs no UPPER
      whereCustomLikeInAndNot(sb);
      sb.append("<if test='isRead != null'>AND IS_READ = #{isRead}</if> ");
      sb.append("<if test='isTransferred != null'>AND IS_TRANSFERRED = #{isTransferred}</if> ");
      sb.append(
          "<if test='workbasketKeyDomainIn != null'>AND (<foreach item='item' collection='workbasketKeyDomainIn' separator=' OR '>(WORKBASKET_KEY = #{item.key} AND DOMAIN = #{item.domain})</foreach>)</if> ");
      return sb.toString();
    }

    private static void whereCustomLikeInAndNot(StringBuilder sb) {
      IntStream.range(1, 17)
          .forEach(
              x -> {
                String collectionIn = "custom" + x + "In";
                String collectionNotIn = "custom" + x + "NotIn";
                String collectionLike = "custom" + x + "Like";
                String column = "CUSTOM_" + x;
                whereIn(collectionIn, column, sb);
                whereLike(collectionLike, column, sb);
                whereNotIn(collectionNotIn, column, sb);
              });
    }

    private static void whereIn(String collection, String column, StringBuilder sb) {
      sb.append("<if test='")
          .append(collection)
          .append(" != null'>AND ")
          .append(column)
          .append(" IN(<foreach item='item' collection='")
          .append(collection)
          .append("' separator=',' >#{item}</foreach>)</if> ");
    }

    private static void whereNotIn(String collection, String column, StringBuilder sb) {
      sb.append("<if test='")
          .append(collection)
          .append(" != null'>AND ")
          .append(column)
          .append(" NOT IN(<foreach item='item' collection='")
          .append(collection)
          .append("' separator=',' >#{item}</foreach>)</if> ");
    }

    private static void whereInTime(String collection, String column, StringBuilder sb) {
      sb.append("<if test='")
          .append(collection)
          .append(" !=null'> AND (<foreach item='item' collection='")
          .append(collection)
          .append("' separator=' OR ' > ( <if test='item.begin!=null'> ")
          .append(column)
          .append(
              " &gt;= #{item.begin} </if> <if test='item.begin!=null and item.end!=null'> AND </if><if test='item.end!=null'> ")
          .append(column)
          .append(" &lt;=#{item.end} </if>)</foreach>)</if> ");
    }

    private static void whereLike(String collection, String column, StringBuilder sb) {
      sb.append("<if test='")
          .append(collection)
          .append(" != null'>AND (<foreach item='item' collection='")
          .append(collection)
          .append("' separator=' OR '>UPPER(")
          .append(column)
          .append(") LIKE #{item}</foreach>)</if> ");
    }
  }
}
