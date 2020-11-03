package com.lucky.mall.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsMemberReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsMemberReportExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andReport_typeIsNull() {
            addCriterion("report_type is null");
            return (Criteria) this;
        }

        public Criteria andReport_typeIsNotNull() {
            addCriterion("report_type is not null");
            return (Criteria) this;
        }

        public Criteria andReport_typeEqualTo(Integer value) {
            addCriterion("report_type =", value, "report_type");
            return (Criteria) this;
        }

        public Criteria andReport_typeNotEqualTo(Integer value) {
            addCriterion("report_type <>", value, "report_type");
            return (Criteria) this;
        }

        public Criteria andReport_typeGreaterThan(Integer value) {
            addCriterion("report_type >", value, "report_type");
            return (Criteria) this;
        }

        public Criteria andReport_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_type >=", value, "report_type");
            return (Criteria) this;
        }

        public Criteria andReport_typeLessThan(Integer value) {
            addCriterion("report_type <", value, "report_type");
            return (Criteria) this;
        }

        public Criteria andReport_typeLessThanOrEqualTo(Integer value) {
            addCriterion("report_type <=", value, "report_type");
            return (Criteria) this;
        }

        public Criteria andReport_typeIn(List<Integer> values) {
            addCriterion("report_type in", values, "report_type");
            return (Criteria) this;
        }

        public Criteria andReport_typeNotIn(List<Integer> values) {
            addCriterion("report_type not in", values, "report_type");
            return (Criteria) this;
        }

        public Criteria andReport_typeBetween(Integer value1, Integer value2) {
            addCriterion("report_type between", value1, value2, "report_type");
            return (Criteria) this;
        }

        public Criteria andReport_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("report_type not between", value1, value2, "report_type");
            return (Criteria) this;
        }

        public Criteria andReport_member_nameIsNull() {
            addCriterion("report_member_name is null");
            return (Criteria) this;
        }

        public Criteria andReport_member_nameIsNotNull() {
            addCriterion("report_member_name is not null");
            return (Criteria) this;
        }

        public Criteria andReport_member_nameEqualTo(String value) {
            addCriterion("report_member_name =", value, "report_member_name");
            return (Criteria) this;
        }

        public Criteria andReport_member_nameNotEqualTo(String value) {
            addCriterion("report_member_name <>", value, "report_member_name");
            return (Criteria) this;
        }

        public Criteria andReport_member_nameGreaterThan(String value) {
            addCriterion("report_member_name >", value, "report_member_name");
            return (Criteria) this;
        }

        public Criteria andReport_member_nameGreaterThanOrEqualTo(String value) {
            addCriterion("report_member_name >=", value, "report_member_name");
            return (Criteria) this;
        }

        public Criteria andReport_member_nameLessThan(String value) {
            addCriterion("report_member_name <", value, "report_member_name");
            return (Criteria) this;
        }

        public Criteria andReport_member_nameLessThanOrEqualTo(String value) {
            addCriterion("report_member_name <=", value, "report_member_name");
            return (Criteria) this;
        }

        public Criteria andReport_member_nameLike(String value) {
            addCriterion("report_member_name like", value, "report_member_name");
            return (Criteria) this;
        }

        public Criteria andReport_member_nameNotLike(String value) {
            addCriterion("report_member_name not like", value, "report_member_name");
            return (Criteria) this;
        }

        public Criteria andReport_member_nameIn(List<String> values) {
            addCriterion("report_member_name in", values, "report_member_name");
            return (Criteria) this;
        }

        public Criteria andReport_member_nameNotIn(List<String> values) {
            addCriterion("report_member_name not in", values, "report_member_name");
            return (Criteria) this;
        }

        public Criteria andReport_member_nameBetween(String value1, String value2) {
            addCriterion("report_member_name between", value1, value2, "report_member_name");
            return (Criteria) this;
        }

        public Criteria andReport_member_nameNotBetween(String value1, String value2) {
            addCriterion("report_member_name not between", value1, value2, "report_member_name");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andReport_objectIsNull() {
            addCriterion("report_object is null");
            return (Criteria) this;
        }

        public Criteria andReport_objectIsNotNull() {
            addCriterion("report_object is not null");
            return (Criteria) this;
        }

        public Criteria andReport_objectEqualTo(String value) {
            addCriterion("report_object =", value, "report_object");
            return (Criteria) this;
        }

        public Criteria andReport_objectNotEqualTo(String value) {
            addCriterion("report_object <>", value, "report_object");
            return (Criteria) this;
        }

        public Criteria andReport_objectGreaterThan(String value) {
            addCriterion("report_object >", value, "report_object");
            return (Criteria) this;
        }

        public Criteria andReport_objectGreaterThanOrEqualTo(String value) {
            addCriterion("report_object >=", value, "report_object");
            return (Criteria) this;
        }

        public Criteria andReport_objectLessThan(String value) {
            addCriterion("report_object <", value, "report_object");
            return (Criteria) this;
        }

        public Criteria andReport_objectLessThanOrEqualTo(String value) {
            addCriterion("report_object <=", value, "report_object");
            return (Criteria) this;
        }

        public Criteria andReport_objectLike(String value) {
            addCriterion("report_object like", value, "report_object");
            return (Criteria) this;
        }

        public Criteria andReport_objectNotLike(String value) {
            addCriterion("report_object not like", value, "report_object");
            return (Criteria) this;
        }

        public Criteria andReport_objectIn(List<String> values) {
            addCriterion("report_object in", values, "report_object");
            return (Criteria) this;
        }

        public Criteria andReport_objectNotIn(List<String> values) {
            addCriterion("report_object not in", values, "report_object");
            return (Criteria) this;
        }

        public Criteria andReport_objectBetween(String value1, String value2) {
            addCriterion("report_object between", value1, value2, "report_object");
            return (Criteria) this;
        }

        public Criteria andReport_objectNotBetween(String value1, String value2) {
            addCriterion("report_object not between", value1, value2, "report_object");
            return (Criteria) this;
        }

        public Criteria andReport_statusIsNull() {
            addCriterion("report_status is null");
            return (Criteria) this;
        }

        public Criteria andReport_statusIsNotNull() {
            addCriterion("report_status is not null");
            return (Criteria) this;
        }

        public Criteria andReport_statusEqualTo(Integer value) {
            addCriterion("report_status =", value, "report_status");
            return (Criteria) this;
        }

        public Criteria andReport_statusNotEqualTo(Integer value) {
            addCriterion("report_status <>", value, "report_status");
            return (Criteria) this;
        }

        public Criteria andReport_statusGreaterThan(Integer value) {
            addCriterion("report_status >", value, "report_status");
            return (Criteria) this;
        }

        public Criteria andReport_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_status >=", value, "report_status");
            return (Criteria) this;
        }

        public Criteria andReport_statusLessThan(Integer value) {
            addCriterion("report_status <", value, "report_status");
            return (Criteria) this;
        }

        public Criteria andReport_statusLessThanOrEqualTo(Integer value) {
            addCriterion("report_status <=", value, "report_status");
            return (Criteria) this;
        }

        public Criteria andReport_statusIn(List<Integer> values) {
            addCriterion("report_status in", values, "report_status");
            return (Criteria) this;
        }

        public Criteria andReport_statusNotIn(List<Integer> values) {
            addCriterion("report_status not in", values, "report_status");
            return (Criteria) this;
        }

        public Criteria andReport_statusBetween(Integer value1, Integer value2) {
            addCriterion("report_status between", value1, value2, "report_status");
            return (Criteria) this;
        }

        public Criteria andReport_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("report_status not between", value1, value2, "report_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusIsNull() {
            addCriterion("handle_status is null");
            return (Criteria) this;
        }

        public Criteria andHandle_statusIsNotNull() {
            addCriterion("handle_status is not null");
            return (Criteria) this;
        }

        public Criteria andHandle_statusEqualTo(Integer value) {
            addCriterion("handle_status =", value, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusNotEqualTo(Integer value) {
            addCriterion("handle_status <>", value, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusGreaterThan(Integer value) {
            addCriterion("handle_status >", value, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("handle_status >=", value, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusLessThan(Integer value) {
            addCriterion("handle_status <", value, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusLessThanOrEqualTo(Integer value) {
            addCriterion("handle_status <=", value, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusIn(List<Integer> values) {
            addCriterion("handle_status in", values, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusNotIn(List<Integer> values) {
            addCriterion("handle_status not in", values, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusBetween(Integer value1, Integer value2) {
            addCriterion("handle_status between", value1, value2, "handle_status");
            return (Criteria) this;
        }

        public Criteria andHandle_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("handle_status not between", value1, value2, "handle_status");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}