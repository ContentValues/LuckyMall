package com.lucky.mall.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PmsSkuStockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsSkuStockExample() {
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

        public Criteria andSku_codeIsNull() {
            addCriterion("sku_code is null");
            return (Criteria) this;
        }

        public Criteria andSku_codeIsNotNull() {
            addCriterion("sku_code is not null");
            return (Criteria) this;
        }

        public Criteria andSku_codeEqualTo(String value) {
            addCriterion("sku_code =", value, "sku_code");
            return (Criteria) this;
        }

        public Criteria andSku_codeNotEqualTo(String value) {
            addCriterion("sku_code <>", value, "sku_code");
            return (Criteria) this;
        }

        public Criteria andSku_codeGreaterThan(String value) {
            addCriterion("sku_code >", value, "sku_code");
            return (Criteria) this;
        }

        public Criteria andSku_codeGreaterThanOrEqualTo(String value) {
            addCriterion("sku_code >=", value, "sku_code");
            return (Criteria) this;
        }

        public Criteria andSku_codeLessThan(String value) {
            addCriterion("sku_code <", value, "sku_code");
            return (Criteria) this;
        }

        public Criteria andSku_codeLessThanOrEqualTo(String value) {
            addCriterion("sku_code <=", value, "sku_code");
            return (Criteria) this;
        }

        public Criteria andSku_codeLike(String value) {
            addCriterion("sku_code like", value, "sku_code");
            return (Criteria) this;
        }

        public Criteria andSku_codeNotLike(String value) {
            addCriterion("sku_code not like", value, "sku_code");
            return (Criteria) this;
        }

        public Criteria andSku_codeIn(List<String> values) {
            addCriterion("sku_code in", values, "sku_code");
            return (Criteria) this;
        }

        public Criteria andSku_codeNotIn(List<String> values) {
            addCriterion("sku_code not in", values, "sku_code");
            return (Criteria) this;
        }

        public Criteria andSku_codeBetween(String value1, String value2) {
            addCriterion("sku_code between", value1, value2, "sku_code");
            return (Criteria) this;
        }

        public Criteria andSku_codeNotBetween(String value1, String value2) {
            addCriterion("sku_code not between", value1, value2, "sku_code");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andLow_stockIsNull() {
            addCriterion("low_stock is null");
            return (Criteria) this;
        }

        public Criteria andLow_stockIsNotNull() {
            addCriterion("low_stock is not null");
            return (Criteria) this;
        }

        public Criteria andLow_stockEqualTo(Integer value) {
            addCriterion("low_stock =", value, "low_stock");
            return (Criteria) this;
        }

        public Criteria andLow_stockNotEqualTo(Integer value) {
            addCriterion("low_stock <>", value, "low_stock");
            return (Criteria) this;
        }

        public Criteria andLow_stockGreaterThan(Integer value) {
            addCriterion("low_stock >", value, "low_stock");
            return (Criteria) this;
        }

        public Criteria andLow_stockGreaterThanOrEqualTo(Integer value) {
            addCriterion("low_stock >=", value, "low_stock");
            return (Criteria) this;
        }

        public Criteria andLow_stockLessThan(Integer value) {
            addCriterion("low_stock <", value, "low_stock");
            return (Criteria) this;
        }

        public Criteria andLow_stockLessThanOrEqualTo(Integer value) {
            addCriterion("low_stock <=", value, "low_stock");
            return (Criteria) this;
        }

        public Criteria andLow_stockIn(List<Integer> values) {
            addCriterion("low_stock in", values, "low_stock");
            return (Criteria) this;
        }

        public Criteria andLow_stockNotIn(List<Integer> values) {
            addCriterion("low_stock not in", values, "low_stock");
            return (Criteria) this;
        }

        public Criteria andLow_stockBetween(Integer value1, Integer value2) {
            addCriterion("low_stock between", value1, value2, "low_stock");
            return (Criteria) this;
        }

        public Criteria andLow_stockNotBetween(Integer value1, Integer value2) {
            addCriterion("low_stock not between", value1, value2, "low_stock");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andSaleIsNull() {
            addCriterion("sale is null");
            return (Criteria) this;
        }

        public Criteria andSaleIsNotNull() {
            addCriterion("sale is not null");
            return (Criteria) this;
        }

        public Criteria andSaleEqualTo(Integer value) {
            addCriterion("sale =", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotEqualTo(Integer value) {
            addCriterion("sale <>", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThan(Integer value) {
            addCriterion("sale >", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale >=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThan(Integer value) {
            addCriterion("sale <", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThanOrEqualTo(Integer value) {
            addCriterion("sale <=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleIn(List<Integer> values) {
            addCriterion("sale in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotIn(List<Integer> values) {
            addCriterion("sale not in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleBetween(Integer value1, Integer value2) {
            addCriterion("sale between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotBetween(Integer value1, Integer value2) {
            addCriterion("sale not between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceIsNull() {
            addCriterion("promotion_price is null");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceIsNotNull() {
            addCriterion("promotion_price is not null");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceEqualTo(BigDecimal value) {
            addCriterion("promotion_price =", value, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceNotEqualTo(BigDecimal value) {
            addCriterion("promotion_price <>", value, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceGreaterThan(BigDecimal value) {
            addCriterion("promotion_price >", value, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_price >=", value, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceLessThan(BigDecimal value) {
            addCriterion("promotion_price <", value, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_price <=", value, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceIn(List<BigDecimal> values) {
            addCriterion("promotion_price in", values, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceNotIn(List<BigDecimal> values) {
            addCriterion("promotion_price not in", values, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_price between", value1, value2, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_price not between", value1, value2, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andLock_stockIsNull() {
            addCriterion("lock_stock is null");
            return (Criteria) this;
        }

        public Criteria andLock_stockIsNotNull() {
            addCriterion("lock_stock is not null");
            return (Criteria) this;
        }

        public Criteria andLock_stockEqualTo(Integer value) {
            addCriterion("lock_stock =", value, "lock_stock");
            return (Criteria) this;
        }

        public Criteria andLock_stockNotEqualTo(Integer value) {
            addCriterion("lock_stock <>", value, "lock_stock");
            return (Criteria) this;
        }

        public Criteria andLock_stockGreaterThan(Integer value) {
            addCriterion("lock_stock >", value, "lock_stock");
            return (Criteria) this;
        }

        public Criteria andLock_stockGreaterThanOrEqualTo(Integer value) {
            addCriterion("lock_stock >=", value, "lock_stock");
            return (Criteria) this;
        }

        public Criteria andLock_stockLessThan(Integer value) {
            addCriterion("lock_stock <", value, "lock_stock");
            return (Criteria) this;
        }

        public Criteria andLock_stockLessThanOrEqualTo(Integer value) {
            addCriterion("lock_stock <=", value, "lock_stock");
            return (Criteria) this;
        }

        public Criteria andLock_stockIn(List<Integer> values) {
            addCriterion("lock_stock in", values, "lock_stock");
            return (Criteria) this;
        }

        public Criteria andLock_stockNotIn(List<Integer> values) {
            addCriterion("lock_stock not in", values, "lock_stock");
            return (Criteria) this;
        }

        public Criteria andLock_stockBetween(Integer value1, Integer value2) {
            addCriterion("lock_stock between", value1, value2, "lock_stock");
            return (Criteria) this;
        }

        public Criteria andLock_stockNotBetween(Integer value1, Integer value2) {
            addCriterion("lock_stock not between", value1, value2, "lock_stock");
            return (Criteria) this;
        }

        public Criteria andSp_dataIsNull() {
            addCriterion("sp_data is null");
            return (Criteria) this;
        }

        public Criteria andSp_dataIsNotNull() {
            addCriterion("sp_data is not null");
            return (Criteria) this;
        }

        public Criteria andSp_dataEqualTo(String value) {
            addCriterion("sp_data =", value, "sp_data");
            return (Criteria) this;
        }

        public Criteria andSp_dataNotEqualTo(String value) {
            addCriterion("sp_data <>", value, "sp_data");
            return (Criteria) this;
        }

        public Criteria andSp_dataGreaterThan(String value) {
            addCriterion("sp_data >", value, "sp_data");
            return (Criteria) this;
        }

        public Criteria andSp_dataGreaterThanOrEqualTo(String value) {
            addCriterion("sp_data >=", value, "sp_data");
            return (Criteria) this;
        }

        public Criteria andSp_dataLessThan(String value) {
            addCriterion("sp_data <", value, "sp_data");
            return (Criteria) this;
        }

        public Criteria andSp_dataLessThanOrEqualTo(String value) {
            addCriterion("sp_data <=", value, "sp_data");
            return (Criteria) this;
        }

        public Criteria andSp_dataLike(String value) {
            addCriterion("sp_data like", value, "sp_data");
            return (Criteria) this;
        }

        public Criteria andSp_dataNotLike(String value) {
            addCriterion("sp_data not like", value, "sp_data");
            return (Criteria) this;
        }

        public Criteria andSp_dataIn(List<String> values) {
            addCriterion("sp_data in", values, "sp_data");
            return (Criteria) this;
        }

        public Criteria andSp_dataNotIn(List<String> values) {
            addCriterion("sp_data not in", values, "sp_data");
            return (Criteria) this;
        }

        public Criteria andSp_dataBetween(String value1, String value2) {
            addCriterion("sp_data between", value1, value2, "sp_data");
            return (Criteria) this;
        }

        public Criteria andSp_dataNotBetween(String value1, String value2) {
            addCriterion("sp_data not between", value1, value2, "sp_data");
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