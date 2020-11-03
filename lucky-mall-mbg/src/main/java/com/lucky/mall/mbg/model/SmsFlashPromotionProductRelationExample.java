package com.lucky.mall.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SmsFlashPromotionProductRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmsFlashPromotionProductRelationExample() {
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

        public Criteria andFlash_promotion_idIsNull() {
            addCriterion("flash_promotion_id is null");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_idIsNotNull() {
            addCriterion("flash_promotion_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_idEqualTo(Long value) {
            addCriterion("flash_promotion_id =", value, "flash_promotion_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_idNotEqualTo(Long value) {
            addCriterion("flash_promotion_id <>", value, "flash_promotion_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_idGreaterThan(Long value) {
            addCriterion("flash_promotion_id >", value, "flash_promotion_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_idGreaterThanOrEqualTo(Long value) {
            addCriterion("flash_promotion_id >=", value, "flash_promotion_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_idLessThan(Long value) {
            addCriterion("flash_promotion_id <", value, "flash_promotion_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_idLessThanOrEqualTo(Long value) {
            addCriterion("flash_promotion_id <=", value, "flash_promotion_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_idIn(List<Long> values) {
            addCriterion("flash_promotion_id in", values, "flash_promotion_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_idNotIn(List<Long> values) {
            addCriterion("flash_promotion_id not in", values, "flash_promotion_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_idBetween(Long value1, Long value2) {
            addCriterion("flash_promotion_id between", value1, value2, "flash_promotion_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_idNotBetween(Long value1, Long value2) {
            addCriterion("flash_promotion_id not between", value1, value2, "flash_promotion_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_session_idIsNull() {
            addCriterion("flash_promotion_session_id is null");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_session_idIsNotNull() {
            addCriterion("flash_promotion_session_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_session_idEqualTo(Long value) {
            addCriterion("flash_promotion_session_id =", value, "flash_promotion_session_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_session_idNotEqualTo(Long value) {
            addCriterion("flash_promotion_session_id <>", value, "flash_promotion_session_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_session_idGreaterThan(Long value) {
            addCriterion("flash_promotion_session_id >", value, "flash_promotion_session_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_session_idGreaterThanOrEqualTo(Long value) {
            addCriterion("flash_promotion_session_id >=", value, "flash_promotion_session_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_session_idLessThan(Long value) {
            addCriterion("flash_promotion_session_id <", value, "flash_promotion_session_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_session_idLessThanOrEqualTo(Long value) {
            addCriterion("flash_promotion_session_id <=", value, "flash_promotion_session_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_session_idIn(List<Long> values) {
            addCriterion("flash_promotion_session_id in", values, "flash_promotion_session_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_session_idNotIn(List<Long> values) {
            addCriterion("flash_promotion_session_id not in", values, "flash_promotion_session_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_session_idBetween(Long value1, Long value2) {
            addCriterion("flash_promotion_session_id between", value1, value2, "flash_promotion_session_id");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_session_idNotBetween(Long value1, Long value2) {
            addCriterion("flash_promotion_session_id not between", value1, value2, "flash_promotion_session_id");
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

        public Criteria andFlash_promotion_priceIsNull() {
            addCriterion("flash_promotion_price is null");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_priceIsNotNull() {
            addCriterion("flash_promotion_price is not null");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_priceEqualTo(BigDecimal value) {
            addCriterion("flash_promotion_price =", value, "flash_promotion_price");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_priceNotEqualTo(BigDecimal value) {
            addCriterion("flash_promotion_price <>", value, "flash_promotion_price");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_priceGreaterThan(BigDecimal value) {
            addCriterion("flash_promotion_price >", value, "flash_promotion_price");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("flash_promotion_price >=", value, "flash_promotion_price");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_priceLessThan(BigDecimal value) {
            addCriterion("flash_promotion_price <", value, "flash_promotion_price");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("flash_promotion_price <=", value, "flash_promotion_price");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_priceIn(List<BigDecimal> values) {
            addCriterion("flash_promotion_price in", values, "flash_promotion_price");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_priceNotIn(List<BigDecimal> values) {
            addCriterion("flash_promotion_price not in", values, "flash_promotion_price");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("flash_promotion_price between", value1, value2, "flash_promotion_price");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("flash_promotion_price not between", value1, value2, "flash_promotion_price");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_countIsNull() {
            addCriterion("flash_promotion_count is null");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_countIsNotNull() {
            addCriterion("flash_promotion_count is not null");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_countEqualTo(Integer value) {
            addCriterion("flash_promotion_count =", value, "flash_promotion_count");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_countNotEqualTo(Integer value) {
            addCriterion("flash_promotion_count <>", value, "flash_promotion_count");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_countGreaterThan(Integer value) {
            addCriterion("flash_promotion_count >", value, "flash_promotion_count");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("flash_promotion_count >=", value, "flash_promotion_count");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_countLessThan(Integer value) {
            addCriterion("flash_promotion_count <", value, "flash_promotion_count");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_countLessThanOrEqualTo(Integer value) {
            addCriterion("flash_promotion_count <=", value, "flash_promotion_count");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_countIn(List<Integer> values) {
            addCriterion("flash_promotion_count in", values, "flash_promotion_count");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_countNotIn(List<Integer> values) {
            addCriterion("flash_promotion_count not in", values, "flash_promotion_count");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_countBetween(Integer value1, Integer value2) {
            addCriterion("flash_promotion_count between", value1, value2, "flash_promotion_count");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_countNotBetween(Integer value1, Integer value2) {
            addCriterion("flash_promotion_count not between", value1, value2, "flash_promotion_count");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_limitIsNull() {
            addCriterion("flash_promotion_limit is null");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_limitIsNotNull() {
            addCriterion("flash_promotion_limit is not null");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_limitEqualTo(Integer value) {
            addCriterion("flash_promotion_limit =", value, "flash_promotion_limit");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_limitNotEqualTo(Integer value) {
            addCriterion("flash_promotion_limit <>", value, "flash_promotion_limit");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_limitGreaterThan(Integer value) {
            addCriterion("flash_promotion_limit >", value, "flash_promotion_limit");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_limitGreaterThanOrEqualTo(Integer value) {
            addCriterion("flash_promotion_limit >=", value, "flash_promotion_limit");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_limitLessThan(Integer value) {
            addCriterion("flash_promotion_limit <", value, "flash_promotion_limit");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_limitLessThanOrEqualTo(Integer value) {
            addCriterion("flash_promotion_limit <=", value, "flash_promotion_limit");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_limitIn(List<Integer> values) {
            addCriterion("flash_promotion_limit in", values, "flash_promotion_limit");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_limitNotIn(List<Integer> values) {
            addCriterion("flash_promotion_limit not in", values, "flash_promotion_limit");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_limitBetween(Integer value1, Integer value2) {
            addCriterion("flash_promotion_limit between", value1, value2, "flash_promotion_limit");
            return (Criteria) this;
        }

        public Criteria andFlash_promotion_limitNotBetween(Integer value1, Integer value2) {
            addCriterion("flash_promotion_limit not between", value1, value2, "flash_promotion_limit");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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