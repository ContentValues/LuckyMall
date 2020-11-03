package com.lucky.mall.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsCommentReplayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsCommentReplayExample() {
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

        public Criteria andComment_idIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andComment_idIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andComment_idEqualTo(Long value) {
            addCriterion("comment_id =", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotEqualTo(Long value) {
            addCriterion("comment_id <>", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idGreaterThan(Long value) {
            addCriterion("comment_id >", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_id >=", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idLessThan(Long value) {
            addCriterion("comment_id <", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idLessThanOrEqualTo(Long value) {
            addCriterion("comment_id <=", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idIn(List<Long> values) {
            addCriterion("comment_id in", values, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotIn(List<Long> values) {
            addCriterion("comment_id not in", values, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idBetween(Long value1, Long value2) {
            addCriterion("comment_id between", value1, value2, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotBetween(Long value1, Long value2) {
            addCriterion("comment_id not between", value1, value2, "comment_id");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameIsNull() {
            addCriterion("member_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameIsNotNull() {
            addCriterion("member_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameEqualTo(String value) {
            addCriterion("member_nick_name =", value, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameNotEqualTo(String value) {
            addCriterion("member_nick_name <>", value, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameGreaterThan(String value) {
            addCriterion("member_nick_name >", value, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameGreaterThanOrEqualTo(String value) {
            addCriterion("member_nick_name >=", value, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameLessThan(String value) {
            addCriterion("member_nick_name <", value, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameLessThanOrEqualTo(String value) {
            addCriterion("member_nick_name <=", value, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameLike(String value) {
            addCriterion("member_nick_name like", value, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameNotLike(String value) {
            addCriterion("member_nick_name not like", value, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameIn(List<String> values) {
            addCriterion("member_nick_name in", values, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameNotIn(List<String> values) {
            addCriterion("member_nick_name not in", values, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameBetween(String value1, String value2) {
            addCriterion("member_nick_name between", value1, value2, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameNotBetween(String value1, String value2) {
            addCriterion("member_nick_name not between", value1, value2, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_iconIsNull() {
            addCriterion("member_icon is null");
            return (Criteria) this;
        }

        public Criteria andMember_iconIsNotNull() {
            addCriterion("member_icon is not null");
            return (Criteria) this;
        }

        public Criteria andMember_iconEqualTo(String value) {
            addCriterion("member_icon =", value, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconNotEqualTo(String value) {
            addCriterion("member_icon <>", value, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconGreaterThan(String value) {
            addCriterion("member_icon >", value, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconGreaterThanOrEqualTo(String value) {
            addCriterion("member_icon >=", value, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconLessThan(String value) {
            addCriterion("member_icon <", value, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconLessThanOrEqualTo(String value) {
            addCriterion("member_icon <=", value, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconLike(String value) {
            addCriterion("member_icon like", value, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconNotLike(String value) {
            addCriterion("member_icon not like", value, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconIn(List<String> values) {
            addCriterion("member_icon in", values, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconNotIn(List<String> values) {
            addCriterion("member_icon not in", values, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconBetween(String value1, String value2) {
            addCriterion("member_icon between", value1, value2, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconNotBetween(String value1, String value2) {
            addCriterion("member_icon not between", value1, value2, "member_icon");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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