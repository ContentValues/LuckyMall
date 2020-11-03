package com.lucky.mall.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class UmsIntegrationConsumeSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsIntegrationConsumeSettingExample() {
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

        public Criteria andDeduction_per_amountIsNull() {
            addCriterion("deduction_per_amount is null");
            return (Criteria) this;
        }

        public Criteria andDeduction_per_amountIsNotNull() {
            addCriterion("deduction_per_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDeduction_per_amountEqualTo(Integer value) {
            addCriterion("deduction_per_amount =", value, "deduction_per_amount");
            return (Criteria) this;
        }

        public Criteria andDeduction_per_amountNotEqualTo(Integer value) {
            addCriterion("deduction_per_amount <>", value, "deduction_per_amount");
            return (Criteria) this;
        }

        public Criteria andDeduction_per_amountGreaterThan(Integer value) {
            addCriterion("deduction_per_amount >", value, "deduction_per_amount");
            return (Criteria) this;
        }

        public Criteria andDeduction_per_amountGreaterThanOrEqualTo(Integer value) {
            addCriterion("deduction_per_amount >=", value, "deduction_per_amount");
            return (Criteria) this;
        }

        public Criteria andDeduction_per_amountLessThan(Integer value) {
            addCriterion("deduction_per_amount <", value, "deduction_per_amount");
            return (Criteria) this;
        }

        public Criteria andDeduction_per_amountLessThanOrEqualTo(Integer value) {
            addCriterion("deduction_per_amount <=", value, "deduction_per_amount");
            return (Criteria) this;
        }

        public Criteria andDeduction_per_amountIn(List<Integer> values) {
            addCriterion("deduction_per_amount in", values, "deduction_per_amount");
            return (Criteria) this;
        }

        public Criteria andDeduction_per_amountNotIn(List<Integer> values) {
            addCriterion("deduction_per_amount not in", values, "deduction_per_amount");
            return (Criteria) this;
        }

        public Criteria andDeduction_per_amountBetween(Integer value1, Integer value2) {
            addCriterion("deduction_per_amount between", value1, value2, "deduction_per_amount");
            return (Criteria) this;
        }

        public Criteria andDeduction_per_amountNotBetween(Integer value1, Integer value2) {
            addCriterion("deduction_per_amount not between", value1, value2, "deduction_per_amount");
            return (Criteria) this;
        }

        public Criteria andMax_percent_per_orderIsNull() {
            addCriterion("max_percent_per_order is null");
            return (Criteria) this;
        }

        public Criteria andMax_percent_per_orderIsNotNull() {
            addCriterion("max_percent_per_order is not null");
            return (Criteria) this;
        }

        public Criteria andMax_percent_per_orderEqualTo(Integer value) {
            addCriterion("max_percent_per_order =", value, "max_percent_per_order");
            return (Criteria) this;
        }

        public Criteria andMax_percent_per_orderNotEqualTo(Integer value) {
            addCriterion("max_percent_per_order <>", value, "max_percent_per_order");
            return (Criteria) this;
        }

        public Criteria andMax_percent_per_orderGreaterThan(Integer value) {
            addCriterion("max_percent_per_order >", value, "max_percent_per_order");
            return (Criteria) this;
        }

        public Criteria andMax_percent_per_orderGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_percent_per_order >=", value, "max_percent_per_order");
            return (Criteria) this;
        }

        public Criteria andMax_percent_per_orderLessThan(Integer value) {
            addCriterion("max_percent_per_order <", value, "max_percent_per_order");
            return (Criteria) this;
        }

        public Criteria andMax_percent_per_orderLessThanOrEqualTo(Integer value) {
            addCriterion("max_percent_per_order <=", value, "max_percent_per_order");
            return (Criteria) this;
        }

        public Criteria andMax_percent_per_orderIn(List<Integer> values) {
            addCriterion("max_percent_per_order in", values, "max_percent_per_order");
            return (Criteria) this;
        }

        public Criteria andMax_percent_per_orderNotIn(List<Integer> values) {
            addCriterion("max_percent_per_order not in", values, "max_percent_per_order");
            return (Criteria) this;
        }

        public Criteria andMax_percent_per_orderBetween(Integer value1, Integer value2) {
            addCriterion("max_percent_per_order between", value1, value2, "max_percent_per_order");
            return (Criteria) this;
        }

        public Criteria andMax_percent_per_orderNotBetween(Integer value1, Integer value2) {
            addCriterion("max_percent_per_order not between", value1, value2, "max_percent_per_order");
            return (Criteria) this;
        }

        public Criteria andUse_unitIsNull() {
            addCriterion("use_unit is null");
            return (Criteria) this;
        }

        public Criteria andUse_unitIsNotNull() {
            addCriterion("use_unit is not null");
            return (Criteria) this;
        }

        public Criteria andUse_unitEqualTo(Integer value) {
            addCriterion("use_unit =", value, "use_unit");
            return (Criteria) this;
        }

        public Criteria andUse_unitNotEqualTo(Integer value) {
            addCriterion("use_unit <>", value, "use_unit");
            return (Criteria) this;
        }

        public Criteria andUse_unitGreaterThan(Integer value) {
            addCriterion("use_unit >", value, "use_unit");
            return (Criteria) this;
        }

        public Criteria andUse_unitGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_unit >=", value, "use_unit");
            return (Criteria) this;
        }

        public Criteria andUse_unitLessThan(Integer value) {
            addCriterion("use_unit <", value, "use_unit");
            return (Criteria) this;
        }

        public Criteria andUse_unitLessThanOrEqualTo(Integer value) {
            addCriterion("use_unit <=", value, "use_unit");
            return (Criteria) this;
        }

        public Criteria andUse_unitIn(List<Integer> values) {
            addCriterion("use_unit in", values, "use_unit");
            return (Criteria) this;
        }

        public Criteria andUse_unitNotIn(List<Integer> values) {
            addCriterion("use_unit not in", values, "use_unit");
            return (Criteria) this;
        }

        public Criteria andUse_unitBetween(Integer value1, Integer value2) {
            addCriterion("use_unit between", value1, value2, "use_unit");
            return (Criteria) this;
        }

        public Criteria andUse_unitNotBetween(Integer value1, Integer value2) {
            addCriterion("use_unit not between", value1, value2, "use_unit");
            return (Criteria) this;
        }

        public Criteria andCoupon_statusIsNull() {
            addCriterion("coupon_status is null");
            return (Criteria) this;
        }

        public Criteria andCoupon_statusIsNotNull() {
            addCriterion("coupon_status is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon_statusEqualTo(Integer value) {
            addCriterion("coupon_status =", value, "coupon_status");
            return (Criteria) this;
        }

        public Criteria andCoupon_statusNotEqualTo(Integer value) {
            addCriterion("coupon_status <>", value, "coupon_status");
            return (Criteria) this;
        }

        public Criteria andCoupon_statusGreaterThan(Integer value) {
            addCriterion("coupon_status >", value, "coupon_status");
            return (Criteria) this;
        }

        public Criteria andCoupon_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_status >=", value, "coupon_status");
            return (Criteria) this;
        }

        public Criteria andCoupon_statusLessThan(Integer value) {
            addCriterion("coupon_status <", value, "coupon_status");
            return (Criteria) this;
        }

        public Criteria andCoupon_statusLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_status <=", value, "coupon_status");
            return (Criteria) this;
        }

        public Criteria andCoupon_statusIn(List<Integer> values) {
            addCriterion("coupon_status in", values, "coupon_status");
            return (Criteria) this;
        }

        public Criteria andCoupon_statusNotIn(List<Integer> values) {
            addCriterion("coupon_status not in", values, "coupon_status");
            return (Criteria) this;
        }

        public Criteria andCoupon_statusBetween(Integer value1, Integer value2) {
            addCriterion("coupon_status between", value1, value2, "coupon_status");
            return (Criteria) this;
        }

        public Criteria andCoupon_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_status not between", value1, value2, "coupon_status");
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