package com.lucky.mall.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UmsMemberRuleSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsMemberRuleSettingExample() {
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

        public Criteria andContinue_sign_dayIsNull() {
            addCriterion("continue_sign_day is null");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_dayIsNotNull() {
            addCriterion("continue_sign_day is not null");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_dayEqualTo(Integer value) {
            addCriterion("continue_sign_day =", value, "continue_sign_day");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_dayNotEqualTo(Integer value) {
            addCriterion("continue_sign_day <>", value, "continue_sign_day");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_dayGreaterThan(Integer value) {
            addCriterion("continue_sign_day >", value, "continue_sign_day");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_dayGreaterThanOrEqualTo(Integer value) {
            addCriterion("continue_sign_day >=", value, "continue_sign_day");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_dayLessThan(Integer value) {
            addCriterion("continue_sign_day <", value, "continue_sign_day");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_dayLessThanOrEqualTo(Integer value) {
            addCriterion("continue_sign_day <=", value, "continue_sign_day");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_dayIn(List<Integer> values) {
            addCriterion("continue_sign_day in", values, "continue_sign_day");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_dayNotIn(List<Integer> values) {
            addCriterion("continue_sign_day not in", values, "continue_sign_day");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_dayBetween(Integer value1, Integer value2) {
            addCriterion("continue_sign_day between", value1, value2, "continue_sign_day");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_dayNotBetween(Integer value1, Integer value2) {
            addCriterion("continue_sign_day not between", value1, value2, "continue_sign_day");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_pointIsNull() {
            addCriterion("continue_sign_point is null");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_pointIsNotNull() {
            addCriterion("continue_sign_point is not null");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_pointEqualTo(Integer value) {
            addCriterion("continue_sign_point =", value, "continue_sign_point");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_pointNotEqualTo(Integer value) {
            addCriterion("continue_sign_point <>", value, "continue_sign_point");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_pointGreaterThan(Integer value) {
            addCriterion("continue_sign_point >", value, "continue_sign_point");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_pointGreaterThanOrEqualTo(Integer value) {
            addCriterion("continue_sign_point >=", value, "continue_sign_point");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_pointLessThan(Integer value) {
            addCriterion("continue_sign_point <", value, "continue_sign_point");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_pointLessThanOrEqualTo(Integer value) {
            addCriterion("continue_sign_point <=", value, "continue_sign_point");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_pointIn(List<Integer> values) {
            addCriterion("continue_sign_point in", values, "continue_sign_point");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_pointNotIn(List<Integer> values) {
            addCriterion("continue_sign_point not in", values, "continue_sign_point");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_pointBetween(Integer value1, Integer value2) {
            addCriterion("continue_sign_point between", value1, value2, "continue_sign_point");
            return (Criteria) this;
        }

        public Criteria andContinue_sign_pointNotBetween(Integer value1, Integer value2) {
            addCriterion("continue_sign_point not between", value1, value2, "continue_sign_point");
            return (Criteria) this;
        }

        public Criteria andConsume_per_pointIsNull() {
            addCriterion("consume_per_point is null");
            return (Criteria) this;
        }

        public Criteria andConsume_per_pointIsNotNull() {
            addCriterion("consume_per_point is not null");
            return (Criteria) this;
        }

        public Criteria andConsume_per_pointEqualTo(BigDecimal value) {
            addCriterion("consume_per_point =", value, "consume_per_point");
            return (Criteria) this;
        }

        public Criteria andConsume_per_pointNotEqualTo(BigDecimal value) {
            addCriterion("consume_per_point <>", value, "consume_per_point");
            return (Criteria) this;
        }

        public Criteria andConsume_per_pointGreaterThan(BigDecimal value) {
            addCriterion("consume_per_point >", value, "consume_per_point");
            return (Criteria) this;
        }

        public Criteria andConsume_per_pointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("consume_per_point >=", value, "consume_per_point");
            return (Criteria) this;
        }

        public Criteria andConsume_per_pointLessThan(BigDecimal value) {
            addCriterion("consume_per_point <", value, "consume_per_point");
            return (Criteria) this;
        }

        public Criteria andConsume_per_pointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("consume_per_point <=", value, "consume_per_point");
            return (Criteria) this;
        }

        public Criteria andConsume_per_pointIn(List<BigDecimal> values) {
            addCriterion("consume_per_point in", values, "consume_per_point");
            return (Criteria) this;
        }

        public Criteria andConsume_per_pointNotIn(List<BigDecimal> values) {
            addCriterion("consume_per_point not in", values, "consume_per_point");
            return (Criteria) this;
        }

        public Criteria andConsume_per_pointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consume_per_point between", value1, value2, "consume_per_point");
            return (Criteria) this;
        }

        public Criteria andConsume_per_pointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consume_per_point not between", value1, value2, "consume_per_point");
            return (Criteria) this;
        }

        public Criteria andLow_order_amountIsNull() {
            addCriterion("low_order_amount is null");
            return (Criteria) this;
        }

        public Criteria andLow_order_amountIsNotNull() {
            addCriterion("low_order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLow_order_amountEqualTo(BigDecimal value) {
            addCriterion("low_order_amount =", value, "low_order_amount");
            return (Criteria) this;
        }

        public Criteria andLow_order_amountNotEqualTo(BigDecimal value) {
            addCriterion("low_order_amount <>", value, "low_order_amount");
            return (Criteria) this;
        }

        public Criteria andLow_order_amountGreaterThan(BigDecimal value) {
            addCriterion("low_order_amount >", value, "low_order_amount");
            return (Criteria) this;
        }

        public Criteria andLow_order_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("low_order_amount >=", value, "low_order_amount");
            return (Criteria) this;
        }

        public Criteria andLow_order_amountLessThan(BigDecimal value) {
            addCriterion("low_order_amount <", value, "low_order_amount");
            return (Criteria) this;
        }

        public Criteria andLow_order_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("low_order_amount <=", value, "low_order_amount");
            return (Criteria) this;
        }

        public Criteria andLow_order_amountIn(List<BigDecimal> values) {
            addCriterion("low_order_amount in", values, "low_order_amount");
            return (Criteria) this;
        }

        public Criteria andLow_order_amountNotIn(List<BigDecimal> values) {
            addCriterion("low_order_amount not in", values, "low_order_amount");
            return (Criteria) this;
        }

        public Criteria andLow_order_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("low_order_amount between", value1, value2, "low_order_amount");
            return (Criteria) this;
        }

        public Criteria andLow_order_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("low_order_amount not between", value1, value2, "low_order_amount");
            return (Criteria) this;
        }

        public Criteria andMax_point_per_orderIsNull() {
            addCriterion("max_point_per_order is null");
            return (Criteria) this;
        }

        public Criteria andMax_point_per_orderIsNotNull() {
            addCriterion("max_point_per_order is not null");
            return (Criteria) this;
        }

        public Criteria andMax_point_per_orderEqualTo(Integer value) {
            addCriterion("max_point_per_order =", value, "max_point_per_order");
            return (Criteria) this;
        }

        public Criteria andMax_point_per_orderNotEqualTo(Integer value) {
            addCriterion("max_point_per_order <>", value, "max_point_per_order");
            return (Criteria) this;
        }

        public Criteria andMax_point_per_orderGreaterThan(Integer value) {
            addCriterion("max_point_per_order >", value, "max_point_per_order");
            return (Criteria) this;
        }

        public Criteria andMax_point_per_orderGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_point_per_order >=", value, "max_point_per_order");
            return (Criteria) this;
        }

        public Criteria andMax_point_per_orderLessThan(Integer value) {
            addCriterion("max_point_per_order <", value, "max_point_per_order");
            return (Criteria) this;
        }

        public Criteria andMax_point_per_orderLessThanOrEqualTo(Integer value) {
            addCriterion("max_point_per_order <=", value, "max_point_per_order");
            return (Criteria) this;
        }

        public Criteria andMax_point_per_orderIn(List<Integer> values) {
            addCriterion("max_point_per_order in", values, "max_point_per_order");
            return (Criteria) this;
        }

        public Criteria andMax_point_per_orderNotIn(List<Integer> values) {
            addCriterion("max_point_per_order not in", values, "max_point_per_order");
            return (Criteria) this;
        }

        public Criteria andMax_point_per_orderBetween(Integer value1, Integer value2) {
            addCriterion("max_point_per_order between", value1, value2, "max_point_per_order");
            return (Criteria) this;
        }

        public Criteria andMax_point_per_orderNotBetween(Integer value1, Integer value2) {
            addCriterion("max_point_per_order not between", value1, value2, "max_point_per_order");
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