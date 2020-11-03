package com.lucky.mall.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OmsOrderItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsOrderItemExample() {
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

        public Criteria andProduct_picIsNull() {
            addCriterion("product_pic is null");
            return (Criteria) this;
        }

        public Criteria andProduct_picIsNotNull() {
            addCriterion("product_pic is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_picEqualTo(String value) {
            addCriterion("product_pic =", value, "product_pic");
            return (Criteria) this;
        }

        public Criteria andProduct_picNotEqualTo(String value) {
            addCriterion("product_pic <>", value, "product_pic");
            return (Criteria) this;
        }

        public Criteria andProduct_picGreaterThan(String value) {
            addCriterion("product_pic >", value, "product_pic");
            return (Criteria) this;
        }

        public Criteria andProduct_picGreaterThanOrEqualTo(String value) {
            addCriterion("product_pic >=", value, "product_pic");
            return (Criteria) this;
        }

        public Criteria andProduct_picLessThan(String value) {
            addCriterion("product_pic <", value, "product_pic");
            return (Criteria) this;
        }

        public Criteria andProduct_picLessThanOrEqualTo(String value) {
            addCriterion("product_pic <=", value, "product_pic");
            return (Criteria) this;
        }

        public Criteria andProduct_picLike(String value) {
            addCriterion("product_pic like", value, "product_pic");
            return (Criteria) this;
        }

        public Criteria andProduct_picNotLike(String value) {
            addCriterion("product_pic not like", value, "product_pic");
            return (Criteria) this;
        }

        public Criteria andProduct_picIn(List<String> values) {
            addCriterion("product_pic in", values, "product_pic");
            return (Criteria) this;
        }

        public Criteria andProduct_picNotIn(List<String> values) {
            addCriterion("product_pic not in", values, "product_pic");
            return (Criteria) this;
        }

        public Criteria andProduct_picBetween(String value1, String value2) {
            addCriterion("product_pic between", value1, value2, "product_pic");
            return (Criteria) this;
        }

        public Criteria andProduct_picNotBetween(String value1, String value2) {
            addCriterion("product_pic not between", value1, value2, "product_pic");
            return (Criteria) this;
        }

        public Criteria andProduct_nameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProduct_nameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_nameEqualTo(String value) {
            addCriterion("product_name =", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameGreaterThan(String value) {
            addCriterion("product_name >", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameLessThan(String value) {
            addCriterion("product_name <", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameLike(String value) {
            addCriterion("product_name like", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameNotLike(String value) {
            addCriterion("product_name not like", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameIn(List<String> values) {
            addCriterion("product_name in", values, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_brandIsNull() {
            addCriterion("product_brand is null");
            return (Criteria) this;
        }

        public Criteria andProduct_brandIsNotNull() {
            addCriterion("product_brand is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_brandEqualTo(String value) {
            addCriterion("product_brand =", value, "product_brand");
            return (Criteria) this;
        }

        public Criteria andProduct_brandNotEqualTo(String value) {
            addCriterion("product_brand <>", value, "product_brand");
            return (Criteria) this;
        }

        public Criteria andProduct_brandGreaterThan(String value) {
            addCriterion("product_brand >", value, "product_brand");
            return (Criteria) this;
        }

        public Criteria andProduct_brandGreaterThanOrEqualTo(String value) {
            addCriterion("product_brand >=", value, "product_brand");
            return (Criteria) this;
        }

        public Criteria andProduct_brandLessThan(String value) {
            addCriterion("product_brand <", value, "product_brand");
            return (Criteria) this;
        }

        public Criteria andProduct_brandLessThanOrEqualTo(String value) {
            addCriterion("product_brand <=", value, "product_brand");
            return (Criteria) this;
        }

        public Criteria andProduct_brandLike(String value) {
            addCriterion("product_brand like", value, "product_brand");
            return (Criteria) this;
        }

        public Criteria andProduct_brandNotLike(String value) {
            addCriterion("product_brand not like", value, "product_brand");
            return (Criteria) this;
        }

        public Criteria andProduct_brandIn(List<String> values) {
            addCriterion("product_brand in", values, "product_brand");
            return (Criteria) this;
        }

        public Criteria andProduct_brandNotIn(List<String> values) {
            addCriterion("product_brand not in", values, "product_brand");
            return (Criteria) this;
        }

        public Criteria andProduct_brandBetween(String value1, String value2) {
            addCriterion("product_brand between", value1, value2, "product_brand");
            return (Criteria) this;
        }

        public Criteria andProduct_brandNotBetween(String value1, String value2) {
            addCriterion("product_brand not between", value1, value2, "product_brand");
            return (Criteria) this;
        }

        public Criteria andProduct_snIsNull() {
            addCriterion("product_sn is null");
            return (Criteria) this;
        }

        public Criteria andProduct_snIsNotNull() {
            addCriterion("product_sn is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_snEqualTo(String value) {
            addCriterion("product_sn =", value, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snNotEqualTo(String value) {
            addCriterion("product_sn <>", value, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snGreaterThan(String value) {
            addCriterion("product_sn >", value, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snGreaterThanOrEqualTo(String value) {
            addCriterion("product_sn >=", value, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snLessThan(String value) {
            addCriterion("product_sn <", value, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snLessThanOrEqualTo(String value) {
            addCriterion("product_sn <=", value, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snLike(String value) {
            addCriterion("product_sn like", value, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snNotLike(String value) {
            addCriterion("product_sn not like", value, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snIn(List<String> values) {
            addCriterion("product_sn in", values, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snNotIn(List<String> values) {
            addCriterion("product_sn not in", values, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snBetween(String value1, String value2) {
            addCriterion("product_sn between", value1, value2, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snNotBetween(String value1, String value2) {
            addCriterion("product_sn not between", value1, value2, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_priceIsNull() {
            addCriterion("product_price is null");
            return (Criteria) this;
        }

        public Criteria andProduct_priceIsNotNull() {
            addCriterion("product_price is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_priceEqualTo(BigDecimal value) {
            addCriterion("product_price =", value, "product_price");
            return (Criteria) this;
        }

        public Criteria andProduct_priceNotEqualTo(BigDecimal value) {
            addCriterion("product_price <>", value, "product_price");
            return (Criteria) this;
        }

        public Criteria andProduct_priceGreaterThan(BigDecimal value) {
            addCriterion("product_price >", value, "product_price");
            return (Criteria) this;
        }

        public Criteria andProduct_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("product_price >=", value, "product_price");
            return (Criteria) this;
        }

        public Criteria andProduct_priceLessThan(BigDecimal value) {
            addCriterion("product_price <", value, "product_price");
            return (Criteria) this;
        }

        public Criteria andProduct_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("product_price <=", value, "product_price");
            return (Criteria) this;
        }

        public Criteria andProduct_priceIn(List<BigDecimal> values) {
            addCriterion("product_price in", values, "product_price");
            return (Criteria) this;
        }

        public Criteria andProduct_priceNotIn(List<BigDecimal> values) {
            addCriterion("product_price not in", values, "product_price");
            return (Criteria) this;
        }

        public Criteria andProduct_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_price between", value1, value2, "product_price");
            return (Criteria) this;
        }

        public Criteria andProduct_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_price not between", value1, value2, "product_price");
            return (Criteria) this;
        }

        public Criteria andProduct_quantityIsNull() {
            addCriterion("product_quantity is null");
            return (Criteria) this;
        }

        public Criteria andProduct_quantityIsNotNull() {
            addCriterion("product_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_quantityEqualTo(Integer value) {
            addCriterion("product_quantity =", value, "product_quantity");
            return (Criteria) this;
        }

        public Criteria andProduct_quantityNotEqualTo(Integer value) {
            addCriterion("product_quantity <>", value, "product_quantity");
            return (Criteria) this;
        }

        public Criteria andProduct_quantityGreaterThan(Integer value) {
            addCriterion("product_quantity >", value, "product_quantity");
            return (Criteria) this;
        }

        public Criteria andProduct_quantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_quantity >=", value, "product_quantity");
            return (Criteria) this;
        }

        public Criteria andProduct_quantityLessThan(Integer value) {
            addCriterion("product_quantity <", value, "product_quantity");
            return (Criteria) this;
        }

        public Criteria andProduct_quantityLessThanOrEqualTo(Integer value) {
            addCriterion("product_quantity <=", value, "product_quantity");
            return (Criteria) this;
        }

        public Criteria andProduct_quantityIn(List<Integer> values) {
            addCriterion("product_quantity in", values, "product_quantity");
            return (Criteria) this;
        }

        public Criteria andProduct_quantityNotIn(List<Integer> values) {
            addCriterion("product_quantity not in", values, "product_quantity");
            return (Criteria) this;
        }

        public Criteria andProduct_quantityBetween(Integer value1, Integer value2) {
            addCriterion("product_quantity between", value1, value2, "product_quantity");
            return (Criteria) this;
        }

        public Criteria andProduct_quantityNotBetween(Integer value1, Integer value2) {
            addCriterion("product_quantity not between", value1, value2, "product_quantity");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_idIsNull() {
            addCriterion("product_sku_id is null");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_idIsNotNull() {
            addCriterion("product_sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_idEqualTo(Long value) {
            addCriterion("product_sku_id =", value, "product_sku_id");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_idNotEqualTo(Long value) {
            addCriterion("product_sku_id <>", value, "product_sku_id");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_idGreaterThan(Long value) {
            addCriterion("product_sku_id >", value, "product_sku_id");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_idGreaterThanOrEqualTo(Long value) {
            addCriterion("product_sku_id >=", value, "product_sku_id");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_idLessThan(Long value) {
            addCriterion("product_sku_id <", value, "product_sku_id");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_idLessThanOrEqualTo(Long value) {
            addCriterion("product_sku_id <=", value, "product_sku_id");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_idIn(List<Long> values) {
            addCriterion("product_sku_id in", values, "product_sku_id");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_idNotIn(List<Long> values) {
            addCriterion("product_sku_id not in", values, "product_sku_id");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_idBetween(Long value1, Long value2) {
            addCriterion("product_sku_id between", value1, value2, "product_sku_id");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_idNotBetween(Long value1, Long value2) {
            addCriterion("product_sku_id not between", value1, value2, "product_sku_id");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_codeIsNull() {
            addCriterion("product_sku_code is null");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_codeIsNotNull() {
            addCriterion("product_sku_code is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_codeEqualTo(String value) {
            addCriterion("product_sku_code =", value, "product_sku_code");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_codeNotEqualTo(String value) {
            addCriterion("product_sku_code <>", value, "product_sku_code");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_codeGreaterThan(String value) {
            addCriterion("product_sku_code >", value, "product_sku_code");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_codeGreaterThanOrEqualTo(String value) {
            addCriterion("product_sku_code >=", value, "product_sku_code");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_codeLessThan(String value) {
            addCriterion("product_sku_code <", value, "product_sku_code");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_codeLessThanOrEqualTo(String value) {
            addCriterion("product_sku_code <=", value, "product_sku_code");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_codeLike(String value) {
            addCriterion("product_sku_code like", value, "product_sku_code");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_codeNotLike(String value) {
            addCriterion("product_sku_code not like", value, "product_sku_code");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_codeIn(List<String> values) {
            addCriterion("product_sku_code in", values, "product_sku_code");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_codeNotIn(List<String> values) {
            addCriterion("product_sku_code not in", values, "product_sku_code");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_codeBetween(String value1, String value2) {
            addCriterion("product_sku_code between", value1, value2, "product_sku_code");
            return (Criteria) this;
        }

        public Criteria andProduct_sku_codeNotBetween(String value1, String value2) {
            addCriterion("product_sku_code not between", value1, value2, "product_sku_code");
            return (Criteria) this;
        }

        public Criteria andProduct_category_idIsNull() {
            addCriterion("product_category_id is null");
            return (Criteria) this;
        }

        public Criteria andProduct_category_idIsNotNull() {
            addCriterion("product_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_category_idEqualTo(Long value) {
            addCriterion("product_category_id =", value, "product_category_id");
            return (Criteria) this;
        }

        public Criteria andProduct_category_idNotEqualTo(Long value) {
            addCriterion("product_category_id <>", value, "product_category_id");
            return (Criteria) this;
        }

        public Criteria andProduct_category_idGreaterThan(Long value) {
            addCriterion("product_category_id >", value, "product_category_id");
            return (Criteria) this;
        }

        public Criteria andProduct_category_idGreaterThanOrEqualTo(Long value) {
            addCriterion("product_category_id >=", value, "product_category_id");
            return (Criteria) this;
        }

        public Criteria andProduct_category_idLessThan(Long value) {
            addCriterion("product_category_id <", value, "product_category_id");
            return (Criteria) this;
        }

        public Criteria andProduct_category_idLessThanOrEqualTo(Long value) {
            addCriterion("product_category_id <=", value, "product_category_id");
            return (Criteria) this;
        }

        public Criteria andProduct_category_idIn(List<Long> values) {
            addCriterion("product_category_id in", values, "product_category_id");
            return (Criteria) this;
        }

        public Criteria andProduct_category_idNotIn(List<Long> values) {
            addCriterion("product_category_id not in", values, "product_category_id");
            return (Criteria) this;
        }

        public Criteria andProduct_category_idBetween(Long value1, Long value2) {
            addCriterion("product_category_id between", value1, value2, "product_category_id");
            return (Criteria) this;
        }

        public Criteria andProduct_category_idNotBetween(Long value1, Long value2) {
            addCriterion("product_category_id not between", value1, value2, "product_category_id");
            return (Criteria) this;
        }

        public Criteria andPromotion_nameIsNull() {
            addCriterion("promotion_name is null");
            return (Criteria) this;
        }

        public Criteria andPromotion_nameIsNotNull() {
            addCriterion("promotion_name is not null");
            return (Criteria) this;
        }

        public Criteria andPromotion_nameEqualTo(String value) {
            addCriterion("promotion_name =", value, "promotion_name");
            return (Criteria) this;
        }

        public Criteria andPromotion_nameNotEqualTo(String value) {
            addCriterion("promotion_name <>", value, "promotion_name");
            return (Criteria) this;
        }

        public Criteria andPromotion_nameGreaterThan(String value) {
            addCriterion("promotion_name >", value, "promotion_name");
            return (Criteria) this;
        }

        public Criteria andPromotion_nameGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_name >=", value, "promotion_name");
            return (Criteria) this;
        }

        public Criteria andPromotion_nameLessThan(String value) {
            addCriterion("promotion_name <", value, "promotion_name");
            return (Criteria) this;
        }

        public Criteria andPromotion_nameLessThanOrEqualTo(String value) {
            addCriterion("promotion_name <=", value, "promotion_name");
            return (Criteria) this;
        }

        public Criteria andPromotion_nameLike(String value) {
            addCriterion("promotion_name like", value, "promotion_name");
            return (Criteria) this;
        }

        public Criteria andPromotion_nameNotLike(String value) {
            addCriterion("promotion_name not like", value, "promotion_name");
            return (Criteria) this;
        }

        public Criteria andPromotion_nameIn(List<String> values) {
            addCriterion("promotion_name in", values, "promotion_name");
            return (Criteria) this;
        }

        public Criteria andPromotion_nameNotIn(List<String> values) {
            addCriterion("promotion_name not in", values, "promotion_name");
            return (Criteria) this;
        }

        public Criteria andPromotion_nameBetween(String value1, String value2) {
            addCriterion("promotion_name between", value1, value2, "promotion_name");
            return (Criteria) this;
        }

        public Criteria andPromotion_nameNotBetween(String value1, String value2) {
            addCriterion("promotion_name not between", value1, value2, "promotion_name");
            return (Criteria) this;
        }

        public Criteria andPromotion_amountIsNull() {
            addCriterion("promotion_amount is null");
            return (Criteria) this;
        }

        public Criteria andPromotion_amountIsNotNull() {
            addCriterion("promotion_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPromotion_amountEqualTo(BigDecimal value) {
            addCriterion("promotion_amount =", value, "promotion_amount");
            return (Criteria) this;
        }

        public Criteria andPromotion_amountNotEqualTo(BigDecimal value) {
            addCriterion("promotion_amount <>", value, "promotion_amount");
            return (Criteria) this;
        }

        public Criteria andPromotion_amountGreaterThan(BigDecimal value) {
            addCriterion("promotion_amount >", value, "promotion_amount");
            return (Criteria) this;
        }

        public Criteria andPromotion_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_amount >=", value, "promotion_amount");
            return (Criteria) this;
        }

        public Criteria andPromotion_amountLessThan(BigDecimal value) {
            addCriterion("promotion_amount <", value, "promotion_amount");
            return (Criteria) this;
        }

        public Criteria andPromotion_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_amount <=", value, "promotion_amount");
            return (Criteria) this;
        }

        public Criteria andPromotion_amountIn(List<BigDecimal> values) {
            addCriterion("promotion_amount in", values, "promotion_amount");
            return (Criteria) this;
        }

        public Criteria andPromotion_amountNotIn(List<BigDecimal> values) {
            addCriterion("promotion_amount not in", values, "promotion_amount");
            return (Criteria) this;
        }

        public Criteria andPromotion_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_amount between", value1, value2, "promotion_amount");
            return (Criteria) this;
        }

        public Criteria andPromotion_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_amount not between", value1, value2, "promotion_amount");
            return (Criteria) this;
        }

        public Criteria andCoupon_amountIsNull() {
            addCriterion("coupon_amount is null");
            return (Criteria) this;
        }

        public Criteria andCoupon_amountIsNotNull() {
            addCriterion("coupon_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon_amountEqualTo(BigDecimal value) {
            addCriterion("coupon_amount =", value, "coupon_amount");
            return (Criteria) this;
        }

        public Criteria andCoupon_amountNotEqualTo(BigDecimal value) {
            addCriterion("coupon_amount <>", value, "coupon_amount");
            return (Criteria) this;
        }

        public Criteria andCoupon_amountGreaterThan(BigDecimal value) {
            addCriterion("coupon_amount >", value, "coupon_amount");
            return (Criteria) this;
        }

        public Criteria andCoupon_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_amount >=", value, "coupon_amount");
            return (Criteria) this;
        }

        public Criteria andCoupon_amountLessThan(BigDecimal value) {
            addCriterion("coupon_amount <", value, "coupon_amount");
            return (Criteria) this;
        }

        public Criteria andCoupon_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_amount <=", value, "coupon_amount");
            return (Criteria) this;
        }

        public Criteria andCoupon_amountIn(List<BigDecimal> values) {
            addCriterion("coupon_amount in", values, "coupon_amount");
            return (Criteria) this;
        }

        public Criteria andCoupon_amountNotIn(List<BigDecimal> values) {
            addCriterion("coupon_amount not in", values, "coupon_amount");
            return (Criteria) this;
        }

        public Criteria andCoupon_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_amount between", value1, value2, "coupon_amount");
            return (Criteria) this;
        }

        public Criteria andCoupon_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_amount not between", value1, value2, "coupon_amount");
            return (Criteria) this;
        }

        public Criteria andIntegration_amountIsNull() {
            addCriterion("integration_amount is null");
            return (Criteria) this;
        }

        public Criteria andIntegration_amountIsNotNull() {
            addCriterion("integration_amount is not null");
            return (Criteria) this;
        }

        public Criteria andIntegration_amountEqualTo(BigDecimal value) {
            addCriterion("integration_amount =", value, "integration_amount");
            return (Criteria) this;
        }

        public Criteria andIntegration_amountNotEqualTo(BigDecimal value) {
            addCriterion("integration_amount <>", value, "integration_amount");
            return (Criteria) this;
        }

        public Criteria andIntegration_amountGreaterThan(BigDecimal value) {
            addCriterion("integration_amount >", value, "integration_amount");
            return (Criteria) this;
        }

        public Criteria andIntegration_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("integration_amount >=", value, "integration_amount");
            return (Criteria) this;
        }

        public Criteria andIntegration_amountLessThan(BigDecimal value) {
            addCriterion("integration_amount <", value, "integration_amount");
            return (Criteria) this;
        }

        public Criteria andIntegration_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("integration_amount <=", value, "integration_amount");
            return (Criteria) this;
        }

        public Criteria andIntegration_amountIn(List<BigDecimal> values) {
            addCriterion("integration_amount in", values, "integration_amount");
            return (Criteria) this;
        }

        public Criteria andIntegration_amountNotIn(List<BigDecimal> values) {
            addCriterion("integration_amount not in", values, "integration_amount");
            return (Criteria) this;
        }

        public Criteria andIntegration_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("integration_amount between", value1, value2, "integration_amount");
            return (Criteria) this;
        }

        public Criteria andIntegration_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("integration_amount not between", value1, value2, "integration_amount");
            return (Criteria) this;
        }

        public Criteria andReal_amountIsNull() {
            addCriterion("real_amount is null");
            return (Criteria) this;
        }

        public Criteria andReal_amountIsNotNull() {
            addCriterion("real_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReal_amountEqualTo(BigDecimal value) {
            addCriterion("real_amount =", value, "real_amount");
            return (Criteria) this;
        }

        public Criteria andReal_amountNotEqualTo(BigDecimal value) {
            addCriterion("real_amount <>", value, "real_amount");
            return (Criteria) this;
        }

        public Criteria andReal_amountGreaterThan(BigDecimal value) {
            addCriterion("real_amount >", value, "real_amount");
            return (Criteria) this;
        }

        public Criteria andReal_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_amount >=", value, "real_amount");
            return (Criteria) this;
        }

        public Criteria andReal_amountLessThan(BigDecimal value) {
            addCriterion("real_amount <", value, "real_amount");
            return (Criteria) this;
        }

        public Criteria andReal_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_amount <=", value, "real_amount");
            return (Criteria) this;
        }

        public Criteria andReal_amountIn(List<BigDecimal> values) {
            addCriterion("real_amount in", values, "real_amount");
            return (Criteria) this;
        }

        public Criteria andReal_amountNotIn(List<BigDecimal> values) {
            addCriterion("real_amount not in", values, "real_amount");
            return (Criteria) this;
        }

        public Criteria andReal_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_amount between", value1, value2, "real_amount");
            return (Criteria) this;
        }

        public Criteria andReal_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_amount not between", value1, value2, "real_amount");
            return (Criteria) this;
        }

        public Criteria andGift_integrationIsNull() {
            addCriterion("gift_integration is null");
            return (Criteria) this;
        }

        public Criteria andGift_integrationIsNotNull() {
            addCriterion("gift_integration is not null");
            return (Criteria) this;
        }

        public Criteria andGift_integrationEqualTo(Integer value) {
            addCriterion("gift_integration =", value, "gift_integration");
            return (Criteria) this;
        }

        public Criteria andGift_integrationNotEqualTo(Integer value) {
            addCriterion("gift_integration <>", value, "gift_integration");
            return (Criteria) this;
        }

        public Criteria andGift_integrationGreaterThan(Integer value) {
            addCriterion("gift_integration >", value, "gift_integration");
            return (Criteria) this;
        }

        public Criteria andGift_integrationGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_integration >=", value, "gift_integration");
            return (Criteria) this;
        }

        public Criteria andGift_integrationLessThan(Integer value) {
            addCriterion("gift_integration <", value, "gift_integration");
            return (Criteria) this;
        }

        public Criteria andGift_integrationLessThanOrEqualTo(Integer value) {
            addCriterion("gift_integration <=", value, "gift_integration");
            return (Criteria) this;
        }

        public Criteria andGift_integrationIn(List<Integer> values) {
            addCriterion("gift_integration in", values, "gift_integration");
            return (Criteria) this;
        }

        public Criteria andGift_integrationNotIn(List<Integer> values) {
            addCriterion("gift_integration not in", values, "gift_integration");
            return (Criteria) this;
        }

        public Criteria andGift_integrationBetween(Integer value1, Integer value2) {
            addCriterion("gift_integration between", value1, value2, "gift_integration");
            return (Criteria) this;
        }

        public Criteria andGift_integrationNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_integration not between", value1, value2, "gift_integration");
            return (Criteria) this;
        }

        public Criteria andGift_growthIsNull() {
            addCriterion("gift_growth is null");
            return (Criteria) this;
        }

        public Criteria andGift_growthIsNotNull() {
            addCriterion("gift_growth is not null");
            return (Criteria) this;
        }

        public Criteria andGift_growthEqualTo(Integer value) {
            addCriterion("gift_growth =", value, "gift_growth");
            return (Criteria) this;
        }

        public Criteria andGift_growthNotEqualTo(Integer value) {
            addCriterion("gift_growth <>", value, "gift_growth");
            return (Criteria) this;
        }

        public Criteria andGift_growthGreaterThan(Integer value) {
            addCriterion("gift_growth >", value, "gift_growth");
            return (Criteria) this;
        }

        public Criteria andGift_growthGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_growth >=", value, "gift_growth");
            return (Criteria) this;
        }

        public Criteria andGift_growthLessThan(Integer value) {
            addCriterion("gift_growth <", value, "gift_growth");
            return (Criteria) this;
        }

        public Criteria andGift_growthLessThanOrEqualTo(Integer value) {
            addCriterion("gift_growth <=", value, "gift_growth");
            return (Criteria) this;
        }

        public Criteria andGift_growthIn(List<Integer> values) {
            addCriterion("gift_growth in", values, "gift_growth");
            return (Criteria) this;
        }

        public Criteria andGift_growthNotIn(List<Integer> values) {
            addCriterion("gift_growth not in", values, "gift_growth");
            return (Criteria) this;
        }

        public Criteria andGift_growthBetween(Integer value1, Integer value2) {
            addCriterion("gift_growth between", value1, value2, "gift_growth");
            return (Criteria) this;
        }

        public Criteria andGift_growthNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_growth not between", value1, value2, "gift_growth");
            return (Criteria) this;
        }

        public Criteria andProduct_attrIsNull() {
            addCriterion("product_attr is null");
            return (Criteria) this;
        }

        public Criteria andProduct_attrIsNotNull() {
            addCriterion("product_attr is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_attrEqualTo(String value) {
            addCriterion("product_attr =", value, "product_attr");
            return (Criteria) this;
        }

        public Criteria andProduct_attrNotEqualTo(String value) {
            addCriterion("product_attr <>", value, "product_attr");
            return (Criteria) this;
        }

        public Criteria andProduct_attrGreaterThan(String value) {
            addCriterion("product_attr >", value, "product_attr");
            return (Criteria) this;
        }

        public Criteria andProduct_attrGreaterThanOrEqualTo(String value) {
            addCriterion("product_attr >=", value, "product_attr");
            return (Criteria) this;
        }

        public Criteria andProduct_attrLessThan(String value) {
            addCriterion("product_attr <", value, "product_attr");
            return (Criteria) this;
        }

        public Criteria andProduct_attrLessThanOrEqualTo(String value) {
            addCriterion("product_attr <=", value, "product_attr");
            return (Criteria) this;
        }

        public Criteria andProduct_attrLike(String value) {
            addCriterion("product_attr like", value, "product_attr");
            return (Criteria) this;
        }

        public Criteria andProduct_attrNotLike(String value) {
            addCriterion("product_attr not like", value, "product_attr");
            return (Criteria) this;
        }

        public Criteria andProduct_attrIn(List<String> values) {
            addCriterion("product_attr in", values, "product_attr");
            return (Criteria) this;
        }

        public Criteria andProduct_attrNotIn(List<String> values) {
            addCriterion("product_attr not in", values, "product_attr");
            return (Criteria) this;
        }

        public Criteria andProduct_attrBetween(String value1, String value2) {
            addCriterion("product_attr between", value1, value2, "product_attr");
            return (Criteria) this;
        }

        public Criteria andProduct_attrNotBetween(String value1, String value2) {
            addCriterion("product_attr not between", value1, value2, "product_attr");
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