package com.lucky.mall.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmsCouponHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmsCouponHistoryExample() {
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

        public Criteria andCoupon_idIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCoupon_idIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon_idEqualTo(Long value) {
            addCriterion("coupon_id =", value, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idNotEqualTo(Long value) {
            addCriterion("coupon_id <>", value, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idGreaterThan(Long value) {
            addCriterion("coupon_id >", value, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idGreaterThanOrEqualTo(Long value) {
            addCriterion("coupon_id >=", value, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idLessThan(Long value) {
            addCriterion("coupon_id <", value, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idLessThanOrEqualTo(Long value) {
            addCriterion("coupon_id <=", value, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idIn(List<Long> values) {
            addCriterion("coupon_id in", values, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idNotIn(List<Long> values) {
            addCriterion("coupon_id not in", values, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idBetween(Long value1, Long value2) {
            addCriterion("coupon_id between", value1, value2, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idNotBetween(Long value1, Long value2) {
            addCriterion("coupon_id not between", value1, value2, "coupon_id");
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

        public Criteria andCoupon_codeIsNull() {
            addCriterion("coupon_code is null");
            return (Criteria) this;
        }

        public Criteria andCoupon_codeIsNotNull() {
            addCriterion("coupon_code is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon_codeEqualTo(String value) {
            addCriterion("coupon_code =", value, "coupon_code");
            return (Criteria) this;
        }

        public Criteria andCoupon_codeNotEqualTo(String value) {
            addCriterion("coupon_code <>", value, "coupon_code");
            return (Criteria) this;
        }

        public Criteria andCoupon_codeGreaterThan(String value) {
            addCriterion("coupon_code >", value, "coupon_code");
            return (Criteria) this;
        }

        public Criteria andCoupon_codeGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_code >=", value, "coupon_code");
            return (Criteria) this;
        }

        public Criteria andCoupon_codeLessThan(String value) {
            addCriterion("coupon_code <", value, "coupon_code");
            return (Criteria) this;
        }

        public Criteria andCoupon_codeLessThanOrEqualTo(String value) {
            addCriterion("coupon_code <=", value, "coupon_code");
            return (Criteria) this;
        }

        public Criteria andCoupon_codeLike(String value) {
            addCriterion("coupon_code like", value, "coupon_code");
            return (Criteria) this;
        }

        public Criteria andCoupon_codeNotLike(String value) {
            addCriterion("coupon_code not like", value, "coupon_code");
            return (Criteria) this;
        }

        public Criteria andCoupon_codeIn(List<String> values) {
            addCriterion("coupon_code in", values, "coupon_code");
            return (Criteria) this;
        }

        public Criteria andCoupon_codeNotIn(List<String> values) {
            addCriterion("coupon_code not in", values, "coupon_code");
            return (Criteria) this;
        }

        public Criteria andCoupon_codeBetween(String value1, String value2) {
            addCriterion("coupon_code between", value1, value2, "coupon_code");
            return (Criteria) this;
        }

        public Criteria andCoupon_codeNotBetween(String value1, String value2) {
            addCriterion("coupon_code not between", value1, value2, "coupon_code");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameIsNull() {
            addCriterion("member_nickname is null");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameIsNotNull() {
            addCriterion("member_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameEqualTo(String value) {
            addCriterion("member_nickname =", value, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameNotEqualTo(String value) {
            addCriterion("member_nickname <>", value, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameGreaterThan(String value) {
            addCriterion("member_nickname >", value, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameGreaterThanOrEqualTo(String value) {
            addCriterion("member_nickname >=", value, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameLessThan(String value) {
            addCriterion("member_nickname <", value, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameLessThanOrEqualTo(String value) {
            addCriterion("member_nickname <=", value, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameLike(String value) {
            addCriterion("member_nickname like", value, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameNotLike(String value) {
            addCriterion("member_nickname not like", value, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameIn(List<String> values) {
            addCriterion("member_nickname in", values, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameNotIn(List<String> values) {
            addCriterion("member_nickname not in", values, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameBetween(String value1, String value2) {
            addCriterion("member_nickname between", value1, value2, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameNotBetween(String value1, String value2) {
            addCriterion("member_nickname not between", value1, value2, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andGet_typeIsNull() {
            addCriterion("get_type is null");
            return (Criteria) this;
        }

        public Criteria andGet_typeIsNotNull() {
            addCriterion("get_type is not null");
            return (Criteria) this;
        }

        public Criteria andGet_typeEqualTo(Integer value) {
            addCriterion("get_type =", value, "get_type");
            return (Criteria) this;
        }

        public Criteria andGet_typeNotEqualTo(Integer value) {
            addCriterion("get_type <>", value, "get_type");
            return (Criteria) this;
        }

        public Criteria andGet_typeGreaterThan(Integer value) {
            addCriterion("get_type >", value, "get_type");
            return (Criteria) this;
        }

        public Criteria andGet_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("get_type >=", value, "get_type");
            return (Criteria) this;
        }

        public Criteria andGet_typeLessThan(Integer value) {
            addCriterion("get_type <", value, "get_type");
            return (Criteria) this;
        }

        public Criteria andGet_typeLessThanOrEqualTo(Integer value) {
            addCriterion("get_type <=", value, "get_type");
            return (Criteria) this;
        }

        public Criteria andGet_typeIn(List<Integer> values) {
            addCriterion("get_type in", values, "get_type");
            return (Criteria) this;
        }

        public Criteria andGet_typeNotIn(List<Integer> values) {
            addCriterion("get_type not in", values, "get_type");
            return (Criteria) this;
        }

        public Criteria andGet_typeBetween(Integer value1, Integer value2) {
            addCriterion("get_type between", value1, value2, "get_type");
            return (Criteria) this;
        }

        public Criteria andGet_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("get_type not between", value1, value2, "get_type");
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

        public Criteria andUse_statusIsNull() {
            addCriterion("use_status is null");
            return (Criteria) this;
        }

        public Criteria andUse_statusIsNotNull() {
            addCriterion("use_status is not null");
            return (Criteria) this;
        }

        public Criteria andUse_statusEqualTo(Integer value) {
            addCriterion("use_status =", value, "use_status");
            return (Criteria) this;
        }

        public Criteria andUse_statusNotEqualTo(Integer value) {
            addCriterion("use_status <>", value, "use_status");
            return (Criteria) this;
        }

        public Criteria andUse_statusGreaterThan(Integer value) {
            addCriterion("use_status >", value, "use_status");
            return (Criteria) this;
        }

        public Criteria andUse_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_status >=", value, "use_status");
            return (Criteria) this;
        }

        public Criteria andUse_statusLessThan(Integer value) {
            addCriterion("use_status <", value, "use_status");
            return (Criteria) this;
        }

        public Criteria andUse_statusLessThanOrEqualTo(Integer value) {
            addCriterion("use_status <=", value, "use_status");
            return (Criteria) this;
        }

        public Criteria andUse_statusIn(List<Integer> values) {
            addCriterion("use_status in", values, "use_status");
            return (Criteria) this;
        }

        public Criteria andUse_statusNotIn(List<Integer> values) {
            addCriterion("use_status not in", values, "use_status");
            return (Criteria) this;
        }

        public Criteria andUse_statusBetween(Integer value1, Integer value2) {
            addCriterion("use_status between", value1, value2, "use_status");
            return (Criteria) this;
        }

        public Criteria andUse_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("use_status not between", value1, value2, "use_status");
            return (Criteria) this;
        }

        public Criteria andUse_timeIsNull() {
            addCriterion("use_time is null");
            return (Criteria) this;
        }

        public Criteria andUse_timeIsNotNull() {
            addCriterion("use_time is not null");
            return (Criteria) this;
        }

        public Criteria andUse_timeEqualTo(Date value) {
            addCriterion("use_time =", value, "use_time");
            return (Criteria) this;
        }

        public Criteria andUse_timeNotEqualTo(Date value) {
            addCriterion("use_time <>", value, "use_time");
            return (Criteria) this;
        }

        public Criteria andUse_timeGreaterThan(Date value) {
            addCriterion("use_time >", value, "use_time");
            return (Criteria) this;
        }

        public Criteria andUse_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("use_time >=", value, "use_time");
            return (Criteria) this;
        }

        public Criteria andUse_timeLessThan(Date value) {
            addCriterion("use_time <", value, "use_time");
            return (Criteria) this;
        }

        public Criteria andUse_timeLessThanOrEqualTo(Date value) {
            addCriterion("use_time <=", value, "use_time");
            return (Criteria) this;
        }

        public Criteria andUse_timeIn(List<Date> values) {
            addCriterion("use_time in", values, "use_time");
            return (Criteria) this;
        }

        public Criteria andUse_timeNotIn(List<Date> values) {
            addCriterion("use_time not in", values, "use_time");
            return (Criteria) this;
        }

        public Criteria andUse_timeBetween(Date value1, Date value2) {
            addCriterion("use_time between", value1, value2, "use_time");
            return (Criteria) this;
        }

        public Criteria andUse_timeNotBetween(Date value1, Date value2) {
            addCriterion("use_time not between", value1, value2, "use_time");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_idEqualTo(Long value) {
            addCriterion("order_id =", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThan(Long value) {
            addCriterion("order_id >", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThan(Long value) {
            addCriterion("order_id <", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idIn(List<Long> values) {
            addCriterion("order_id in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_snIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrder_snIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_snEqualTo(String value) {
            addCriterion("order_sn =", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snGreaterThan(String value) {
            addCriterion("order_sn >", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snLessThan(String value) {
            addCriterion("order_sn <", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snLike(String value) {
            addCriterion("order_sn like", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snNotLike(String value) {
            addCriterion("order_sn not like", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snIn(List<String> values) {
            addCriterion("order_sn in", values, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "order_sn");
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