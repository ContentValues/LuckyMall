package com.lucky.mall.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UmsIntegrationChangeHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsIntegrationChangeHistoryExample() {
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

        public Criteria andMember_idIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMember_idIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMember_idEqualTo(Long value) {
            addCriterion("member_id =", value, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idNotEqualTo(Long value) {
            addCriterion("member_id <>", value, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idGreaterThan(Long value) {
            addCriterion("member_id >", value, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idGreaterThanOrEqualTo(Long value) {
            addCriterion("member_id >=", value, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idLessThan(Long value) {
            addCriterion("member_id <", value, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idLessThanOrEqualTo(Long value) {
            addCriterion("member_id <=", value, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idIn(List<Long> values) {
            addCriterion("member_id in", values, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idNotIn(List<Long> values) {
            addCriterion("member_id not in", values, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idBetween(Long value1, Long value2) {
            addCriterion("member_id between", value1, value2, "member_id");
            return (Criteria) this;
        }

        public Criteria andMember_idNotBetween(Long value1, Long value2) {
            addCriterion("member_id not between", value1, value2, "member_id");
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

        public Criteria andChange_typeIsNull() {
            addCriterion("change_type is null");
            return (Criteria) this;
        }

        public Criteria andChange_typeIsNotNull() {
            addCriterion("change_type is not null");
            return (Criteria) this;
        }

        public Criteria andChange_typeEqualTo(Integer value) {
            addCriterion("change_type =", value, "change_type");
            return (Criteria) this;
        }

        public Criteria andChange_typeNotEqualTo(Integer value) {
            addCriterion("change_type <>", value, "change_type");
            return (Criteria) this;
        }

        public Criteria andChange_typeGreaterThan(Integer value) {
            addCriterion("change_type >", value, "change_type");
            return (Criteria) this;
        }

        public Criteria andChange_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_type >=", value, "change_type");
            return (Criteria) this;
        }

        public Criteria andChange_typeLessThan(Integer value) {
            addCriterion("change_type <", value, "change_type");
            return (Criteria) this;
        }

        public Criteria andChange_typeLessThanOrEqualTo(Integer value) {
            addCriterion("change_type <=", value, "change_type");
            return (Criteria) this;
        }

        public Criteria andChange_typeIn(List<Integer> values) {
            addCriterion("change_type in", values, "change_type");
            return (Criteria) this;
        }

        public Criteria andChange_typeNotIn(List<Integer> values) {
            addCriterion("change_type not in", values, "change_type");
            return (Criteria) this;
        }

        public Criteria andChange_typeBetween(Integer value1, Integer value2) {
            addCriterion("change_type between", value1, value2, "change_type");
            return (Criteria) this;
        }

        public Criteria andChange_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("change_type not between", value1, value2, "change_type");
            return (Criteria) this;
        }

        public Criteria andChange_countIsNull() {
            addCriterion("change_count is null");
            return (Criteria) this;
        }

        public Criteria andChange_countIsNotNull() {
            addCriterion("change_count is not null");
            return (Criteria) this;
        }

        public Criteria andChange_countEqualTo(Integer value) {
            addCriterion("change_count =", value, "change_count");
            return (Criteria) this;
        }

        public Criteria andChange_countNotEqualTo(Integer value) {
            addCriterion("change_count <>", value, "change_count");
            return (Criteria) this;
        }

        public Criteria andChange_countGreaterThan(Integer value) {
            addCriterion("change_count >", value, "change_count");
            return (Criteria) this;
        }

        public Criteria andChange_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_count >=", value, "change_count");
            return (Criteria) this;
        }

        public Criteria andChange_countLessThan(Integer value) {
            addCriterion("change_count <", value, "change_count");
            return (Criteria) this;
        }

        public Criteria andChange_countLessThanOrEqualTo(Integer value) {
            addCriterion("change_count <=", value, "change_count");
            return (Criteria) this;
        }

        public Criteria andChange_countIn(List<Integer> values) {
            addCriterion("change_count in", values, "change_count");
            return (Criteria) this;
        }

        public Criteria andChange_countNotIn(List<Integer> values) {
            addCriterion("change_count not in", values, "change_count");
            return (Criteria) this;
        }

        public Criteria andChange_countBetween(Integer value1, Integer value2) {
            addCriterion("change_count between", value1, value2, "change_count");
            return (Criteria) this;
        }

        public Criteria andChange_countNotBetween(Integer value1, Integer value2) {
            addCriterion("change_count not between", value1, value2, "change_count");
            return (Criteria) this;
        }

        public Criteria andOperate_manIsNull() {
            addCriterion("operate_man is null");
            return (Criteria) this;
        }

        public Criteria andOperate_manIsNotNull() {
            addCriterion("operate_man is not null");
            return (Criteria) this;
        }

        public Criteria andOperate_manEqualTo(String value) {
            addCriterion("operate_man =", value, "operate_man");
            return (Criteria) this;
        }

        public Criteria andOperate_manNotEqualTo(String value) {
            addCriterion("operate_man <>", value, "operate_man");
            return (Criteria) this;
        }

        public Criteria andOperate_manGreaterThan(String value) {
            addCriterion("operate_man >", value, "operate_man");
            return (Criteria) this;
        }

        public Criteria andOperate_manGreaterThanOrEqualTo(String value) {
            addCriterion("operate_man >=", value, "operate_man");
            return (Criteria) this;
        }

        public Criteria andOperate_manLessThan(String value) {
            addCriterion("operate_man <", value, "operate_man");
            return (Criteria) this;
        }

        public Criteria andOperate_manLessThanOrEqualTo(String value) {
            addCriterion("operate_man <=", value, "operate_man");
            return (Criteria) this;
        }

        public Criteria andOperate_manLike(String value) {
            addCriterion("operate_man like", value, "operate_man");
            return (Criteria) this;
        }

        public Criteria andOperate_manNotLike(String value) {
            addCriterion("operate_man not like", value, "operate_man");
            return (Criteria) this;
        }

        public Criteria andOperate_manIn(List<String> values) {
            addCriterion("operate_man in", values, "operate_man");
            return (Criteria) this;
        }

        public Criteria andOperate_manNotIn(List<String> values) {
            addCriterion("operate_man not in", values, "operate_man");
            return (Criteria) this;
        }

        public Criteria andOperate_manBetween(String value1, String value2) {
            addCriterion("operate_man between", value1, value2, "operate_man");
            return (Criteria) this;
        }

        public Criteria andOperate_manNotBetween(String value1, String value2) {
            addCriterion("operate_man not between", value1, value2, "operate_man");
            return (Criteria) this;
        }

        public Criteria andOperate_noteIsNull() {
            addCriterion("operate_note is null");
            return (Criteria) this;
        }

        public Criteria andOperate_noteIsNotNull() {
            addCriterion("operate_note is not null");
            return (Criteria) this;
        }

        public Criteria andOperate_noteEqualTo(String value) {
            addCriterion("operate_note =", value, "operate_note");
            return (Criteria) this;
        }

        public Criteria andOperate_noteNotEqualTo(String value) {
            addCriterion("operate_note <>", value, "operate_note");
            return (Criteria) this;
        }

        public Criteria andOperate_noteGreaterThan(String value) {
            addCriterion("operate_note >", value, "operate_note");
            return (Criteria) this;
        }

        public Criteria andOperate_noteGreaterThanOrEqualTo(String value) {
            addCriterion("operate_note >=", value, "operate_note");
            return (Criteria) this;
        }

        public Criteria andOperate_noteLessThan(String value) {
            addCriterion("operate_note <", value, "operate_note");
            return (Criteria) this;
        }

        public Criteria andOperate_noteLessThanOrEqualTo(String value) {
            addCriterion("operate_note <=", value, "operate_note");
            return (Criteria) this;
        }

        public Criteria andOperate_noteLike(String value) {
            addCriterion("operate_note like", value, "operate_note");
            return (Criteria) this;
        }

        public Criteria andOperate_noteNotLike(String value) {
            addCriterion("operate_note not like", value, "operate_note");
            return (Criteria) this;
        }

        public Criteria andOperate_noteIn(List<String> values) {
            addCriterion("operate_note in", values, "operate_note");
            return (Criteria) this;
        }

        public Criteria andOperate_noteNotIn(List<String> values) {
            addCriterion("operate_note not in", values, "operate_note");
            return (Criteria) this;
        }

        public Criteria andOperate_noteBetween(String value1, String value2) {
            addCriterion("operate_note between", value1, value2, "operate_note");
            return (Criteria) this;
        }

        public Criteria andOperate_noteNotBetween(String value1, String value2) {
            addCriterion("operate_note not between", value1, value2, "operate_note");
            return (Criteria) this;
        }

        public Criteria andSource_typeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
        }

        public Criteria andSource_typeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
        }

        public Criteria andSource_typeEqualTo(Integer value) {
            addCriterion("source_type =", value, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeNotEqualTo(Integer value) {
            addCriterion("source_type <>", value, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeGreaterThan(Integer value) {
            addCriterion("source_type >", value, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_type >=", value, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeLessThan(Integer value) {
            addCriterion("source_type <", value, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeLessThanOrEqualTo(Integer value) {
            addCriterion("source_type <=", value, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeIn(List<Integer> values) {
            addCriterion("source_type in", values, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeNotIn(List<Integer> values) {
            addCriterion("source_type not in", values, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeBetween(Integer value1, Integer value2) {
            addCriterion("source_type between", value1, value2, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("source_type not between", value1, value2, "source_type");
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