package com.lucky.mall.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsTopicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsTopicExample() {
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

        public Criteria andCategory_idIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategory_idIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory_idEqualTo(Long value) {
            addCriterion("category_id =", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idNotEqualTo(Long value) {
            addCriterion("category_id <>", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idGreaterThan(Long value) {
            addCriterion("category_id >", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idGreaterThanOrEqualTo(Long value) {
            addCriterion("category_id >=", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idLessThan(Long value) {
            addCriterion("category_id <", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idLessThanOrEqualTo(Long value) {
            addCriterion("category_id <=", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idIn(List<Long> values) {
            addCriterion("category_id in", values, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idNotIn(List<Long> values) {
            addCriterion("category_id not in", values, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idBetween(Long value1, Long value2) {
            addCriterion("category_id between", value1, value2, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idNotBetween(Long value1, Long value2) {
            addCriterion("category_id not between", value1, value2, "category_id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andStart_timeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStart_timeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStart_timeEqualTo(Date value) {
            addCriterion("start_time =", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeGreaterThan(Date value) {
            addCriterion("start_time >", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeLessThan(Date value) {
            addCriterion("start_time <", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeIn(List<Date> values) {
            addCriterion("start_time in", values, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "start_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeEqualTo(Date value) {
            addCriterion("end_time =", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThan(Date value) {
            addCriterion("end_time >", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThan(Date value) {
            addCriterion("end_time <", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIn(List<Date> values) {
            addCriterion("end_time in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andAttend_countIsNull() {
            addCriterion("attend_count is null");
            return (Criteria) this;
        }

        public Criteria andAttend_countIsNotNull() {
            addCriterion("attend_count is not null");
            return (Criteria) this;
        }

        public Criteria andAttend_countEqualTo(Integer value) {
            addCriterion("attend_count =", value, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countNotEqualTo(Integer value) {
            addCriterion("attend_count <>", value, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countGreaterThan(Integer value) {
            addCriterion("attend_count >", value, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("attend_count >=", value, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countLessThan(Integer value) {
            addCriterion("attend_count <", value, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countLessThanOrEqualTo(Integer value) {
            addCriterion("attend_count <=", value, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countIn(List<Integer> values) {
            addCriterion("attend_count in", values, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countNotIn(List<Integer> values) {
            addCriterion("attend_count not in", values, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countBetween(Integer value1, Integer value2) {
            addCriterion("attend_count between", value1, value2, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countNotBetween(Integer value1, Integer value2) {
            addCriterion("attend_count not between", value1, value2, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttention_countIsNull() {
            addCriterion("attention_count is null");
            return (Criteria) this;
        }

        public Criteria andAttention_countIsNotNull() {
            addCriterion("attention_count is not null");
            return (Criteria) this;
        }

        public Criteria andAttention_countEqualTo(Integer value) {
            addCriterion("attention_count =", value, "attention_count");
            return (Criteria) this;
        }

        public Criteria andAttention_countNotEqualTo(Integer value) {
            addCriterion("attention_count <>", value, "attention_count");
            return (Criteria) this;
        }

        public Criteria andAttention_countGreaterThan(Integer value) {
            addCriterion("attention_count >", value, "attention_count");
            return (Criteria) this;
        }

        public Criteria andAttention_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("attention_count >=", value, "attention_count");
            return (Criteria) this;
        }

        public Criteria andAttention_countLessThan(Integer value) {
            addCriterion("attention_count <", value, "attention_count");
            return (Criteria) this;
        }

        public Criteria andAttention_countLessThanOrEqualTo(Integer value) {
            addCriterion("attention_count <=", value, "attention_count");
            return (Criteria) this;
        }

        public Criteria andAttention_countIn(List<Integer> values) {
            addCriterion("attention_count in", values, "attention_count");
            return (Criteria) this;
        }

        public Criteria andAttention_countNotIn(List<Integer> values) {
            addCriterion("attention_count not in", values, "attention_count");
            return (Criteria) this;
        }

        public Criteria andAttention_countBetween(Integer value1, Integer value2) {
            addCriterion("attention_count between", value1, value2, "attention_count");
            return (Criteria) this;
        }

        public Criteria andAttention_countNotBetween(Integer value1, Integer value2) {
            addCriterion("attention_count not between", value1, value2, "attention_count");
            return (Criteria) this;
        }

        public Criteria andRead_countIsNull() {
            addCriterion("read_count is null");
            return (Criteria) this;
        }

        public Criteria andRead_countIsNotNull() {
            addCriterion("read_count is not null");
            return (Criteria) this;
        }

        public Criteria andRead_countEqualTo(Integer value) {
            addCriterion("read_count =", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countNotEqualTo(Integer value) {
            addCriterion("read_count <>", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countGreaterThan(Integer value) {
            addCriterion("read_count >", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_count >=", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countLessThan(Integer value) {
            addCriterion("read_count <", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countLessThanOrEqualTo(Integer value) {
            addCriterion("read_count <=", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countIn(List<Integer> values) {
            addCriterion("read_count in", values, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countNotIn(List<Integer> values) {
            addCriterion("read_count not in", values, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countBetween(Integer value1, Integer value2) {
            addCriterion("read_count between", value1, value2, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countNotBetween(Integer value1, Integer value2) {
            addCriterion("read_count not between", value1, value2, "read_count");
            return (Criteria) this;
        }

        public Criteria andAward_nameIsNull() {
            addCriterion("award_name is null");
            return (Criteria) this;
        }

        public Criteria andAward_nameIsNotNull() {
            addCriterion("award_name is not null");
            return (Criteria) this;
        }

        public Criteria andAward_nameEqualTo(String value) {
            addCriterion("award_name =", value, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameNotEqualTo(String value) {
            addCriterion("award_name <>", value, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameGreaterThan(String value) {
            addCriterion("award_name >", value, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameGreaterThanOrEqualTo(String value) {
            addCriterion("award_name >=", value, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameLessThan(String value) {
            addCriterion("award_name <", value, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameLessThanOrEqualTo(String value) {
            addCriterion("award_name <=", value, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameLike(String value) {
            addCriterion("award_name like", value, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameNotLike(String value) {
            addCriterion("award_name not like", value, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameIn(List<String> values) {
            addCriterion("award_name in", values, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameNotIn(List<String> values) {
            addCriterion("award_name not in", values, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameBetween(String value1, String value2) {
            addCriterion("award_name between", value1, value2, "award_name");
            return (Criteria) this;
        }

        public Criteria andAward_nameNotBetween(String value1, String value2) {
            addCriterion("award_name not between", value1, value2, "award_name");
            return (Criteria) this;
        }

        public Criteria andAttend_typeIsNull() {
            addCriterion("attend_type is null");
            return (Criteria) this;
        }

        public Criteria andAttend_typeIsNotNull() {
            addCriterion("attend_type is not null");
            return (Criteria) this;
        }

        public Criteria andAttend_typeEqualTo(String value) {
            addCriterion("attend_type =", value, "attend_type");
            return (Criteria) this;
        }

        public Criteria andAttend_typeNotEqualTo(String value) {
            addCriterion("attend_type <>", value, "attend_type");
            return (Criteria) this;
        }

        public Criteria andAttend_typeGreaterThan(String value) {
            addCriterion("attend_type >", value, "attend_type");
            return (Criteria) this;
        }

        public Criteria andAttend_typeGreaterThanOrEqualTo(String value) {
            addCriterion("attend_type >=", value, "attend_type");
            return (Criteria) this;
        }

        public Criteria andAttend_typeLessThan(String value) {
            addCriterion("attend_type <", value, "attend_type");
            return (Criteria) this;
        }

        public Criteria andAttend_typeLessThanOrEqualTo(String value) {
            addCriterion("attend_type <=", value, "attend_type");
            return (Criteria) this;
        }

        public Criteria andAttend_typeLike(String value) {
            addCriterion("attend_type like", value, "attend_type");
            return (Criteria) this;
        }

        public Criteria andAttend_typeNotLike(String value) {
            addCriterion("attend_type not like", value, "attend_type");
            return (Criteria) this;
        }

        public Criteria andAttend_typeIn(List<String> values) {
            addCriterion("attend_type in", values, "attend_type");
            return (Criteria) this;
        }

        public Criteria andAttend_typeNotIn(List<String> values) {
            addCriterion("attend_type not in", values, "attend_type");
            return (Criteria) this;
        }

        public Criteria andAttend_typeBetween(String value1, String value2) {
            addCriterion("attend_type between", value1, value2, "attend_type");
            return (Criteria) this;
        }

        public Criteria andAttend_typeNotBetween(String value1, String value2) {
            addCriterion("attend_type not between", value1, value2, "attend_type");
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