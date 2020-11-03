package com.lucky.mall.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PmsMemberPriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsMemberPriceExample() {
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

        public Criteria andProduct_idIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProduct_idIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_idEqualTo(Long value) {
            addCriterion("product_id =", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idGreaterThan(Long value) {
            addCriterion("product_id >", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idLessThan(Long value) {
            addCriterion("product_id <", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idIn(List<Long> values) {
            addCriterion("product_id in", values, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "product_id");
            return (Criteria) this;
        }

        public Criteria andMember_level_idIsNull() {
            addCriterion("member_level_id is null");
            return (Criteria) this;
        }

        public Criteria andMember_level_idIsNotNull() {
            addCriterion("member_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andMember_level_idEqualTo(Long value) {
            addCriterion("member_level_id =", value, "member_level_id");
            return (Criteria) this;
        }

        public Criteria andMember_level_idNotEqualTo(Long value) {
            addCriterion("member_level_id <>", value, "member_level_id");
            return (Criteria) this;
        }

        public Criteria andMember_level_idGreaterThan(Long value) {
            addCriterion("member_level_id >", value, "member_level_id");
            return (Criteria) this;
        }

        public Criteria andMember_level_idGreaterThanOrEqualTo(Long value) {
            addCriterion("member_level_id >=", value, "member_level_id");
            return (Criteria) this;
        }

        public Criteria andMember_level_idLessThan(Long value) {
            addCriterion("member_level_id <", value, "member_level_id");
            return (Criteria) this;
        }

        public Criteria andMember_level_idLessThanOrEqualTo(Long value) {
            addCriterion("member_level_id <=", value, "member_level_id");
            return (Criteria) this;
        }

        public Criteria andMember_level_idIn(List<Long> values) {
            addCriterion("member_level_id in", values, "member_level_id");
            return (Criteria) this;
        }

        public Criteria andMember_level_idNotIn(List<Long> values) {
            addCriterion("member_level_id not in", values, "member_level_id");
            return (Criteria) this;
        }

        public Criteria andMember_level_idBetween(Long value1, Long value2) {
            addCriterion("member_level_id between", value1, value2, "member_level_id");
            return (Criteria) this;
        }

        public Criteria andMember_level_idNotBetween(Long value1, Long value2) {
            addCriterion("member_level_id not between", value1, value2, "member_level_id");
            return (Criteria) this;
        }

        public Criteria andMember_priceIsNull() {
            addCriterion("member_price is null");
            return (Criteria) this;
        }

        public Criteria andMember_priceIsNotNull() {
            addCriterion("member_price is not null");
            return (Criteria) this;
        }

        public Criteria andMember_priceEqualTo(BigDecimal value) {
            addCriterion("member_price =", value, "member_price");
            return (Criteria) this;
        }

        public Criteria andMember_priceNotEqualTo(BigDecimal value) {
            addCriterion("member_price <>", value, "member_price");
            return (Criteria) this;
        }

        public Criteria andMember_priceGreaterThan(BigDecimal value) {
            addCriterion("member_price >", value, "member_price");
            return (Criteria) this;
        }

        public Criteria andMember_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("member_price >=", value, "member_price");
            return (Criteria) this;
        }

        public Criteria andMember_priceLessThan(BigDecimal value) {
            addCriterion("member_price <", value, "member_price");
            return (Criteria) this;
        }

        public Criteria andMember_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("member_price <=", value, "member_price");
            return (Criteria) this;
        }

        public Criteria andMember_priceIn(List<BigDecimal> values) {
            addCriterion("member_price in", values, "member_price");
            return (Criteria) this;
        }

        public Criteria andMember_priceNotIn(List<BigDecimal> values) {
            addCriterion("member_price not in", values, "member_price");
            return (Criteria) this;
        }

        public Criteria andMember_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_price between", value1, value2, "member_price");
            return (Criteria) this;
        }

        public Criteria andMember_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_price not between", value1, value2, "member_price");
            return (Criteria) this;
        }

        public Criteria andMember_level_nameIsNull() {
            addCriterion("member_level_name is null");
            return (Criteria) this;
        }

        public Criteria andMember_level_nameIsNotNull() {
            addCriterion("member_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andMember_level_nameEqualTo(String value) {
            addCriterion("member_level_name =", value, "member_level_name");
            return (Criteria) this;
        }

        public Criteria andMember_level_nameNotEqualTo(String value) {
            addCriterion("member_level_name <>", value, "member_level_name");
            return (Criteria) this;
        }

        public Criteria andMember_level_nameGreaterThan(String value) {
            addCriterion("member_level_name >", value, "member_level_name");
            return (Criteria) this;
        }

        public Criteria andMember_level_nameGreaterThanOrEqualTo(String value) {
            addCriterion("member_level_name >=", value, "member_level_name");
            return (Criteria) this;
        }

        public Criteria andMember_level_nameLessThan(String value) {
            addCriterion("member_level_name <", value, "member_level_name");
            return (Criteria) this;
        }

        public Criteria andMember_level_nameLessThanOrEqualTo(String value) {
            addCriterion("member_level_name <=", value, "member_level_name");
            return (Criteria) this;
        }

        public Criteria andMember_level_nameLike(String value) {
            addCriterion("member_level_name like", value, "member_level_name");
            return (Criteria) this;
        }

        public Criteria andMember_level_nameNotLike(String value) {
            addCriterion("member_level_name not like", value, "member_level_name");
            return (Criteria) this;
        }

        public Criteria andMember_level_nameIn(List<String> values) {
            addCriterion("member_level_name in", values, "member_level_name");
            return (Criteria) this;
        }

        public Criteria andMember_level_nameNotIn(List<String> values) {
            addCriterion("member_level_name not in", values, "member_level_name");
            return (Criteria) this;
        }

        public Criteria andMember_level_nameBetween(String value1, String value2) {
            addCriterion("member_level_name between", value1, value2, "member_level_name");
            return (Criteria) this;
        }

        public Criteria andMember_level_nameNotBetween(String value1, String value2) {
            addCriterion("member_level_name not between", value1, value2, "member_level_name");
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