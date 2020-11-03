package com.lucky.mall.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsProductOperateLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsProductOperateLogExample() {
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

        public Criteria andPrice_oldIsNull() {
            addCriterion("price_old is null");
            return (Criteria) this;
        }

        public Criteria andPrice_oldIsNotNull() {
            addCriterion("price_old is not null");
            return (Criteria) this;
        }

        public Criteria andPrice_oldEqualTo(BigDecimal value) {
            addCriterion("price_old =", value, "price_old");
            return (Criteria) this;
        }

        public Criteria andPrice_oldNotEqualTo(BigDecimal value) {
            addCriterion("price_old <>", value, "price_old");
            return (Criteria) this;
        }

        public Criteria andPrice_oldGreaterThan(BigDecimal value) {
            addCriterion("price_old >", value, "price_old");
            return (Criteria) this;
        }

        public Criteria andPrice_oldGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_old >=", value, "price_old");
            return (Criteria) this;
        }

        public Criteria andPrice_oldLessThan(BigDecimal value) {
            addCriterion("price_old <", value, "price_old");
            return (Criteria) this;
        }

        public Criteria andPrice_oldLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_old <=", value, "price_old");
            return (Criteria) this;
        }

        public Criteria andPrice_oldIn(List<BigDecimal> values) {
            addCriterion("price_old in", values, "price_old");
            return (Criteria) this;
        }

        public Criteria andPrice_oldNotIn(List<BigDecimal> values) {
            addCriterion("price_old not in", values, "price_old");
            return (Criteria) this;
        }

        public Criteria andPrice_oldBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_old between", value1, value2, "price_old");
            return (Criteria) this;
        }

        public Criteria andPrice_oldNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_old not between", value1, value2, "price_old");
            return (Criteria) this;
        }

        public Criteria andPrice_newIsNull() {
            addCriterion("price_new is null");
            return (Criteria) this;
        }

        public Criteria andPrice_newIsNotNull() {
            addCriterion("price_new is not null");
            return (Criteria) this;
        }

        public Criteria andPrice_newEqualTo(BigDecimal value) {
            addCriterion("price_new =", value, "price_new");
            return (Criteria) this;
        }

        public Criteria andPrice_newNotEqualTo(BigDecimal value) {
            addCriterion("price_new <>", value, "price_new");
            return (Criteria) this;
        }

        public Criteria andPrice_newGreaterThan(BigDecimal value) {
            addCriterion("price_new >", value, "price_new");
            return (Criteria) this;
        }

        public Criteria andPrice_newGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_new >=", value, "price_new");
            return (Criteria) this;
        }

        public Criteria andPrice_newLessThan(BigDecimal value) {
            addCriterion("price_new <", value, "price_new");
            return (Criteria) this;
        }

        public Criteria andPrice_newLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_new <=", value, "price_new");
            return (Criteria) this;
        }

        public Criteria andPrice_newIn(List<BigDecimal> values) {
            addCriterion("price_new in", values, "price_new");
            return (Criteria) this;
        }

        public Criteria andPrice_newNotIn(List<BigDecimal> values) {
            addCriterion("price_new not in", values, "price_new");
            return (Criteria) this;
        }

        public Criteria andPrice_newBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_new between", value1, value2, "price_new");
            return (Criteria) this;
        }

        public Criteria andPrice_newNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_new not between", value1, value2, "price_new");
            return (Criteria) this;
        }

        public Criteria andSale_price_oldIsNull() {
            addCriterion("sale_price_old is null");
            return (Criteria) this;
        }

        public Criteria andSale_price_oldIsNotNull() {
            addCriterion("sale_price_old is not null");
            return (Criteria) this;
        }

        public Criteria andSale_price_oldEqualTo(BigDecimal value) {
            addCriterion("sale_price_old =", value, "sale_price_old");
            return (Criteria) this;
        }

        public Criteria andSale_price_oldNotEqualTo(BigDecimal value) {
            addCriterion("sale_price_old <>", value, "sale_price_old");
            return (Criteria) this;
        }

        public Criteria andSale_price_oldGreaterThan(BigDecimal value) {
            addCriterion("sale_price_old >", value, "sale_price_old");
            return (Criteria) this;
        }

        public Criteria andSale_price_oldGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_price_old >=", value, "sale_price_old");
            return (Criteria) this;
        }

        public Criteria andSale_price_oldLessThan(BigDecimal value) {
            addCriterion("sale_price_old <", value, "sale_price_old");
            return (Criteria) this;
        }

        public Criteria andSale_price_oldLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_price_old <=", value, "sale_price_old");
            return (Criteria) this;
        }

        public Criteria andSale_price_oldIn(List<BigDecimal> values) {
            addCriterion("sale_price_old in", values, "sale_price_old");
            return (Criteria) this;
        }

        public Criteria andSale_price_oldNotIn(List<BigDecimal> values) {
            addCriterion("sale_price_old not in", values, "sale_price_old");
            return (Criteria) this;
        }

        public Criteria andSale_price_oldBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_price_old between", value1, value2, "sale_price_old");
            return (Criteria) this;
        }

        public Criteria andSale_price_oldNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_price_old not between", value1, value2, "sale_price_old");
            return (Criteria) this;
        }

        public Criteria andSale_price_newIsNull() {
            addCriterion("sale_price_new is null");
            return (Criteria) this;
        }

        public Criteria andSale_price_newIsNotNull() {
            addCriterion("sale_price_new is not null");
            return (Criteria) this;
        }

        public Criteria andSale_price_newEqualTo(BigDecimal value) {
            addCriterion("sale_price_new =", value, "sale_price_new");
            return (Criteria) this;
        }

        public Criteria andSale_price_newNotEqualTo(BigDecimal value) {
            addCriterion("sale_price_new <>", value, "sale_price_new");
            return (Criteria) this;
        }

        public Criteria andSale_price_newGreaterThan(BigDecimal value) {
            addCriterion("sale_price_new >", value, "sale_price_new");
            return (Criteria) this;
        }

        public Criteria andSale_price_newGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_price_new >=", value, "sale_price_new");
            return (Criteria) this;
        }

        public Criteria andSale_price_newLessThan(BigDecimal value) {
            addCriterion("sale_price_new <", value, "sale_price_new");
            return (Criteria) this;
        }

        public Criteria andSale_price_newLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_price_new <=", value, "sale_price_new");
            return (Criteria) this;
        }

        public Criteria andSale_price_newIn(List<BigDecimal> values) {
            addCriterion("sale_price_new in", values, "sale_price_new");
            return (Criteria) this;
        }

        public Criteria andSale_price_newNotIn(List<BigDecimal> values) {
            addCriterion("sale_price_new not in", values, "sale_price_new");
            return (Criteria) this;
        }

        public Criteria andSale_price_newBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_price_new between", value1, value2, "sale_price_new");
            return (Criteria) this;
        }

        public Criteria andSale_price_newNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_price_new not between", value1, value2, "sale_price_new");
            return (Criteria) this;
        }

        public Criteria andGift_point_oldIsNull() {
            addCriterion("gift_point_old is null");
            return (Criteria) this;
        }

        public Criteria andGift_point_oldIsNotNull() {
            addCriterion("gift_point_old is not null");
            return (Criteria) this;
        }

        public Criteria andGift_point_oldEqualTo(Integer value) {
            addCriterion("gift_point_old =", value, "gift_point_old");
            return (Criteria) this;
        }

        public Criteria andGift_point_oldNotEqualTo(Integer value) {
            addCriterion("gift_point_old <>", value, "gift_point_old");
            return (Criteria) this;
        }

        public Criteria andGift_point_oldGreaterThan(Integer value) {
            addCriterion("gift_point_old >", value, "gift_point_old");
            return (Criteria) this;
        }

        public Criteria andGift_point_oldGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_point_old >=", value, "gift_point_old");
            return (Criteria) this;
        }

        public Criteria andGift_point_oldLessThan(Integer value) {
            addCriterion("gift_point_old <", value, "gift_point_old");
            return (Criteria) this;
        }

        public Criteria andGift_point_oldLessThanOrEqualTo(Integer value) {
            addCriterion("gift_point_old <=", value, "gift_point_old");
            return (Criteria) this;
        }

        public Criteria andGift_point_oldIn(List<Integer> values) {
            addCriterion("gift_point_old in", values, "gift_point_old");
            return (Criteria) this;
        }

        public Criteria andGift_point_oldNotIn(List<Integer> values) {
            addCriterion("gift_point_old not in", values, "gift_point_old");
            return (Criteria) this;
        }

        public Criteria andGift_point_oldBetween(Integer value1, Integer value2) {
            addCriterion("gift_point_old between", value1, value2, "gift_point_old");
            return (Criteria) this;
        }

        public Criteria andGift_point_oldNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_point_old not between", value1, value2, "gift_point_old");
            return (Criteria) this;
        }

        public Criteria andGift_point_newIsNull() {
            addCriterion("gift_point_new is null");
            return (Criteria) this;
        }

        public Criteria andGift_point_newIsNotNull() {
            addCriterion("gift_point_new is not null");
            return (Criteria) this;
        }

        public Criteria andGift_point_newEqualTo(Integer value) {
            addCriterion("gift_point_new =", value, "gift_point_new");
            return (Criteria) this;
        }

        public Criteria andGift_point_newNotEqualTo(Integer value) {
            addCriterion("gift_point_new <>", value, "gift_point_new");
            return (Criteria) this;
        }

        public Criteria andGift_point_newGreaterThan(Integer value) {
            addCriterion("gift_point_new >", value, "gift_point_new");
            return (Criteria) this;
        }

        public Criteria andGift_point_newGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_point_new >=", value, "gift_point_new");
            return (Criteria) this;
        }

        public Criteria andGift_point_newLessThan(Integer value) {
            addCriterion("gift_point_new <", value, "gift_point_new");
            return (Criteria) this;
        }

        public Criteria andGift_point_newLessThanOrEqualTo(Integer value) {
            addCriterion("gift_point_new <=", value, "gift_point_new");
            return (Criteria) this;
        }

        public Criteria andGift_point_newIn(List<Integer> values) {
            addCriterion("gift_point_new in", values, "gift_point_new");
            return (Criteria) this;
        }

        public Criteria andGift_point_newNotIn(List<Integer> values) {
            addCriterion("gift_point_new not in", values, "gift_point_new");
            return (Criteria) this;
        }

        public Criteria andGift_point_newBetween(Integer value1, Integer value2) {
            addCriterion("gift_point_new between", value1, value2, "gift_point_new");
            return (Criteria) this;
        }

        public Criteria andGift_point_newNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_point_new not between", value1, value2, "gift_point_new");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_oldIsNull() {
            addCriterion("use_point_limit_old is null");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_oldIsNotNull() {
            addCriterion("use_point_limit_old is not null");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_oldEqualTo(Integer value) {
            addCriterion("use_point_limit_old =", value, "use_point_limit_old");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_oldNotEqualTo(Integer value) {
            addCriterion("use_point_limit_old <>", value, "use_point_limit_old");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_oldGreaterThan(Integer value) {
            addCriterion("use_point_limit_old >", value, "use_point_limit_old");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_oldGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_point_limit_old >=", value, "use_point_limit_old");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_oldLessThan(Integer value) {
            addCriterion("use_point_limit_old <", value, "use_point_limit_old");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_oldLessThanOrEqualTo(Integer value) {
            addCriterion("use_point_limit_old <=", value, "use_point_limit_old");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_oldIn(List<Integer> values) {
            addCriterion("use_point_limit_old in", values, "use_point_limit_old");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_oldNotIn(List<Integer> values) {
            addCriterion("use_point_limit_old not in", values, "use_point_limit_old");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_oldBetween(Integer value1, Integer value2) {
            addCriterion("use_point_limit_old between", value1, value2, "use_point_limit_old");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_oldNotBetween(Integer value1, Integer value2) {
            addCriterion("use_point_limit_old not between", value1, value2, "use_point_limit_old");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_newIsNull() {
            addCriterion("use_point_limit_new is null");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_newIsNotNull() {
            addCriterion("use_point_limit_new is not null");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_newEqualTo(Integer value) {
            addCriterion("use_point_limit_new =", value, "use_point_limit_new");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_newNotEqualTo(Integer value) {
            addCriterion("use_point_limit_new <>", value, "use_point_limit_new");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_newGreaterThan(Integer value) {
            addCriterion("use_point_limit_new >", value, "use_point_limit_new");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_newGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_point_limit_new >=", value, "use_point_limit_new");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_newLessThan(Integer value) {
            addCriterion("use_point_limit_new <", value, "use_point_limit_new");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_newLessThanOrEqualTo(Integer value) {
            addCriterion("use_point_limit_new <=", value, "use_point_limit_new");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_newIn(List<Integer> values) {
            addCriterion("use_point_limit_new in", values, "use_point_limit_new");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_newNotIn(List<Integer> values) {
            addCriterion("use_point_limit_new not in", values, "use_point_limit_new");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_newBetween(Integer value1, Integer value2) {
            addCriterion("use_point_limit_new between", value1, value2, "use_point_limit_new");
            return (Criteria) this;
        }

        public Criteria andUse_point_limit_newNotBetween(Integer value1, Integer value2) {
            addCriterion("use_point_limit_new not between", value1, value2, "use_point_limit_new");
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