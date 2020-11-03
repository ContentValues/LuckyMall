package com.lucky.mall.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PmsFeightTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsFeightTemplateExample() {
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

        public Criteria andCharge_typeIsNull() {
            addCriterion("charge_type is null");
            return (Criteria) this;
        }

        public Criteria andCharge_typeIsNotNull() {
            addCriterion("charge_type is not null");
            return (Criteria) this;
        }

        public Criteria andCharge_typeEqualTo(Integer value) {
            addCriterion("charge_type =", value, "charge_type");
            return (Criteria) this;
        }

        public Criteria andCharge_typeNotEqualTo(Integer value) {
            addCriterion("charge_type <>", value, "charge_type");
            return (Criteria) this;
        }

        public Criteria andCharge_typeGreaterThan(Integer value) {
            addCriterion("charge_type >", value, "charge_type");
            return (Criteria) this;
        }

        public Criteria andCharge_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_type >=", value, "charge_type");
            return (Criteria) this;
        }

        public Criteria andCharge_typeLessThan(Integer value) {
            addCriterion("charge_type <", value, "charge_type");
            return (Criteria) this;
        }

        public Criteria andCharge_typeLessThanOrEqualTo(Integer value) {
            addCriterion("charge_type <=", value, "charge_type");
            return (Criteria) this;
        }

        public Criteria andCharge_typeIn(List<Integer> values) {
            addCriterion("charge_type in", values, "charge_type");
            return (Criteria) this;
        }

        public Criteria andCharge_typeNotIn(List<Integer> values) {
            addCriterion("charge_type not in", values, "charge_type");
            return (Criteria) this;
        }

        public Criteria andCharge_typeBetween(Integer value1, Integer value2) {
            addCriterion("charge_type between", value1, value2, "charge_type");
            return (Criteria) this;
        }

        public Criteria andCharge_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_type not between", value1, value2, "charge_type");
            return (Criteria) this;
        }

        public Criteria andFirst_weightIsNull() {
            addCriterion("first_weight is null");
            return (Criteria) this;
        }

        public Criteria andFirst_weightIsNotNull() {
            addCriterion("first_weight is not null");
            return (Criteria) this;
        }

        public Criteria andFirst_weightEqualTo(BigDecimal value) {
            addCriterion("first_weight =", value, "first_weight");
            return (Criteria) this;
        }

        public Criteria andFirst_weightNotEqualTo(BigDecimal value) {
            addCriterion("first_weight <>", value, "first_weight");
            return (Criteria) this;
        }

        public Criteria andFirst_weightGreaterThan(BigDecimal value) {
            addCriterion("first_weight >", value, "first_weight");
            return (Criteria) this;
        }

        public Criteria andFirst_weightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_weight >=", value, "first_weight");
            return (Criteria) this;
        }

        public Criteria andFirst_weightLessThan(BigDecimal value) {
            addCriterion("first_weight <", value, "first_weight");
            return (Criteria) this;
        }

        public Criteria andFirst_weightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_weight <=", value, "first_weight");
            return (Criteria) this;
        }

        public Criteria andFirst_weightIn(List<BigDecimal> values) {
            addCriterion("first_weight in", values, "first_weight");
            return (Criteria) this;
        }

        public Criteria andFirst_weightNotIn(List<BigDecimal> values) {
            addCriterion("first_weight not in", values, "first_weight");
            return (Criteria) this;
        }

        public Criteria andFirst_weightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_weight between", value1, value2, "first_weight");
            return (Criteria) this;
        }

        public Criteria andFirst_weightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_weight not between", value1, value2, "first_weight");
            return (Criteria) this;
        }

        public Criteria andFirst_feeIsNull() {
            addCriterion("first_fee is null");
            return (Criteria) this;
        }

        public Criteria andFirst_feeIsNotNull() {
            addCriterion("first_fee is not null");
            return (Criteria) this;
        }

        public Criteria andFirst_feeEqualTo(BigDecimal value) {
            addCriterion("first_fee =", value, "first_fee");
            return (Criteria) this;
        }

        public Criteria andFirst_feeNotEqualTo(BigDecimal value) {
            addCriterion("first_fee <>", value, "first_fee");
            return (Criteria) this;
        }

        public Criteria andFirst_feeGreaterThan(BigDecimal value) {
            addCriterion("first_fee >", value, "first_fee");
            return (Criteria) this;
        }

        public Criteria andFirst_feeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_fee >=", value, "first_fee");
            return (Criteria) this;
        }

        public Criteria andFirst_feeLessThan(BigDecimal value) {
            addCriterion("first_fee <", value, "first_fee");
            return (Criteria) this;
        }

        public Criteria andFirst_feeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_fee <=", value, "first_fee");
            return (Criteria) this;
        }

        public Criteria andFirst_feeIn(List<BigDecimal> values) {
            addCriterion("first_fee in", values, "first_fee");
            return (Criteria) this;
        }

        public Criteria andFirst_feeNotIn(List<BigDecimal> values) {
            addCriterion("first_fee not in", values, "first_fee");
            return (Criteria) this;
        }

        public Criteria andFirst_feeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_fee between", value1, value2, "first_fee");
            return (Criteria) this;
        }

        public Criteria andFirst_feeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_fee not between", value1, value2, "first_fee");
            return (Criteria) this;
        }

        public Criteria andContinue_weightIsNull() {
            addCriterion("continue_weight is null");
            return (Criteria) this;
        }

        public Criteria andContinue_weightIsNotNull() {
            addCriterion("continue_weight is not null");
            return (Criteria) this;
        }

        public Criteria andContinue_weightEqualTo(BigDecimal value) {
            addCriterion("continue_weight =", value, "continue_weight");
            return (Criteria) this;
        }

        public Criteria andContinue_weightNotEqualTo(BigDecimal value) {
            addCriterion("continue_weight <>", value, "continue_weight");
            return (Criteria) this;
        }

        public Criteria andContinue_weightGreaterThan(BigDecimal value) {
            addCriterion("continue_weight >", value, "continue_weight");
            return (Criteria) this;
        }

        public Criteria andContinue_weightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("continue_weight >=", value, "continue_weight");
            return (Criteria) this;
        }

        public Criteria andContinue_weightLessThan(BigDecimal value) {
            addCriterion("continue_weight <", value, "continue_weight");
            return (Criteria) this;
        }

        public Criteria andContinue_weightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("continue_weight <=", value, "continue_weight");
            return (Criteria) this;
        }

        public Criteria andContinue_weightIn(List<BigDecimal> values) {
            addCriterion("continue_weight in", values, "continue_weight");
            return (Criteria) this;
        }

        public Criteria andContinue_weightNotIn(List<BigDecimal> values) {
            addCriterion("continue_weight not in", values, "continue_weight");
            return (Criteria) this;
        }

        public Criteria andContinue_weightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continue_weight between", value1, value2, "continue_weight");
            return (Criteria) this;
        }

        public Criteria andContinue_weightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continue_weight not between", value1, value2, "continue_weight");
            return (Criteria) this;
        }

        public Criteria andContinme_feeIsNull() {
            addCriterion("continme_fee is null");
            return (Criteria) this;
        }

        public Criteria andContinme_feeIsNotNull() {
            addCriterion("continme_fee is not null");
            return (Criteria) this;
        }

        public Criteria andContinme_feeEqualTo(BigDecimal value) {
            addCriterion("continme_fee =", value, "continme_fee");
            return (Criteria) this;
        }

        public Criteria andContinme_feeNotEqualTo(BigDecimal value) {
            addCriterion("continme_fee <>", value, "continme_fee");
            return (Criteria) this;
        }

        public Criteria andContinme_feeGreaterThan(BigDecimal value) {
            addCriterion("continme_fee >", value, "continme_fee");
            return (Criteria) this;
        }

        public Criteria andContinme_feeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("continme_fee >=", value, "continme_fee");
            return (Criteria) this;
        }

        public Criteria andContinme_feeLessThan(BigDecimal value) {
            addCriterion("continme_fee <", value, "continme_fee");
            return (Criteria) this;
        }

        public Criteria andContinme_feeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("continme_fee <=", value, "continme_fee");
            return (Criteria) this;
        }

        public Criteria andContinme_feeIn(List<BigDecimal> values) {
            addCriterion("continme_fee in", values, "continme_fee");
            return (Criteria) this;
        }

        public Criteria andContinme_feeNotIn(List<BigDecimal> values) {
            addCriterion("continme_fee not in", values, "continme_fee");
            return (Criteria) this;
        }

        public Criteria andContinme_feeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continme_fee between", value1, value2, "continme_fee");
            return (Criteria) this;
        }

        public Criteria andContinme_feeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continme_fee not between", value1, value2, "continme_fee");
            return (Criteria) this;
        }

        public Criteria andDestIsNull() {
            addCriterion("dest is null");
            return (Criteria) this;
        }

        public Criteria andDestIsNotNull() {
            addCriterion("dest is not null");
            return (Criteria) this;
        }

        public Criteria andDestEqualTo(String value) {
            addCriterion("dest =", value, "dest");
            return (Criteria) this;
        }

        public Criteria andDestNotEqualTo(String value) {
            addCriterion("dest <>", value, "dest");
            return (Criteria) this;
        }

        public Criteria andDestGreaterThan(String value) {
            addCriterion("dest >", value, "dest");
            return (Criteria) this;
        }

        public Criteria andDestGreaterThanOrEqualTo(String value) {
            addCriterion("dest >=", value, "dest");
            return (Criteria) this;
        }

        public Criteria andDestLessThan(String value) {
            addCriterion("dest <", value, "dest");
            return (Criteria) this;
        }

        public Criteria andDestLessThanOrEqualTo(String value) {
            addCriterion("dest <=", value, "dest");
            return (Criteria) this;
        }

        public Criteria andDestLike(String value) {
            addCriterion("dest like", value, "dest");
            return (Criteria) this;
        }

        public Criteria andDestNotLike(String value) {
            addCriterion("dest not like", value, "dest");
            return (Criteria) this;
        }

        public Criteria andDestIn(List<String> values) {
            addCriterion("dest in", values, "dest");
            return (Criteria) this;
        }

        public Criteria andDestNotIn(List<String> values) {
            addCriterion("dest not in", values, "dest");
            return (Criteria) this;
        }

        public Criteria andDestBetween(String value1, String value2) {
            addCriterion("dest between", value1, value2, "dest");
            return (Criteria) this;
        }

        public Criteria andDestNotBetween(String value1, String value2) {
            addCriterion("dest not between", value1, value2, "dest");
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