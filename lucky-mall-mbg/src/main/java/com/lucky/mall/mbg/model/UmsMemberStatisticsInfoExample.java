package com.lucky.mall.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UmsMemberStatisticsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsMemberStatisticsInfoExample() {
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

        public Criteria andConsume_amountIsNull() {
            addCriterion("consume_amount is null");
            return (Criteria) this;
        }

        public Criteria andConsume_amountIsNotNull() {
            addCriterion("consume_amount is not null");
            return (Criteria) this;
        }

        public Criteria andConsume_amountEqualTo(BigDecimal value) {
            addCriterion("consume_amount =", value, "consume_amount");
            return (Criteria) this;
        }

        public Criteria andConsume_amountNotEqualTo(BigDecimal value) {
            addCriterion("consume_amount <>", value, "consume_amount");
            return (Criteria) this;
        }

        public Criteria andConsume_amountGreaterThan(BigDecimal value) {
            addCriterion("consume_amount >", value, "consume_amount");
            return (Criteria) this;
        }

        public Criteria andConsume_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("consume_amount >=", value, "consume_amount");
            return (Criteria) this;
        }

        public Criteria andConsume_amountLessThan(BigDecimal value) {
            addCriterion("consume_amount <", value, "consume_amount");
            return (Criteria) this;
        }

        public Criteria andConsume_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("consume_amount <=", value, "consume_amount");
            return (Criteria) this;
        }

        public Criteria andConsume_amountIn(List<BigDecimal> values) {
            addCriterion("consume_amount in", values, "consume_amount");
            return (Criteria) this;
        }

        public Criteria andConsume_amountNotIn(List<BigDecimal> values) {
            addCriterion("consume_amount not in", values, "consume_amount");
            return (Criteria) this;
        }

        public Criteria andConsume_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consume_amount between", value1, value2, "consume_amount");
            return (Criteria) this;
        }

        public Criteria andConsume_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consume_amount not between", value1, value2, "consume_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_countIsNull() {
            addCriterion("order_count is null");
            return (Criteria) this;
        }

        public Criteria andOrder_countIsNotNull() {
            addCriterion("order_count is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_countEqualTo(Integer value) {
            addCriterion("order_count =", value, "order_count");
            return (Criteria) this;
        }

        public Criteria andOrder_countNotEqualTo(Integer value) {
            addCriterion("order_count <>", value, "order_count");
            return (Criteria) this;
        }

        public Criteria andOrder_countGreaterThan(Integer value) {
            addCriterion("order_count >", value, "order_count");
            return (Criteria) this;
        }

        public Criteria andOrder_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_count >=", value, "order_count");
            return (Criteria) this;
        }

        public Criteria andOrder_countLessThan(Integer value) {
            addCriterion("order_count <", value, "order_count");
            return (Criteria) this;
        }

        public Criteria andOrder_countLessThanOrEqualTo(Integer value) {
            addCriterion("order_count <=", value, "order_count");
            return (Criteria) this;
        }

        public Criteria andOrder_countIn(List<Integer> values) {
            addCriterion("order_count in", values, "order_count");
            return (Criteria) this;
        }

        public Criteria andOrder_countNotIn(List<Integer> values) {
            addCriterion("order_count not in", values, "order_count");
            return (Criteria) this;
        }

        public Criteria andOrder_countBetween(Integer value1, Integer value2) {
            addCriterion("order_count between", value1, value2, "order_count");
            return (Criteria) this;
        }

        public Criteria andOrder_countNotBetween(Integer value1, Integer value2) {
            addCriterion("order_count not between", value1, value2, "order_count");
            return (Criteria) this;
        }

        public Criteria andCoupon_countIsNull() {
            addCriterion("coupon_count is null");
            return (Criteria) this;
        }

        public Criteria andCoupon_countIsNotNull() {
            addCriterion("coupon_count is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon_countEqualTo(Integer value) {
            addCriterion("coupon_count =", value, "coupon_count");
            return (Criteria) this;
        }

        public Criteria andCoupon_countNotEqualTo(Integer value) {
            addCriterion("coupon_count <>", value, "coupon_count");
            return (Criteria) this;
        }

        public Criteria andCoupon_countGreaterThan(Integer value) {
            addCriterion("coupon_count >", value, "coupon_count");
            return (Criteria) this;
        }

        public Criteria andCoupon_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_count >=", value, "coupon_count");
            return (Criteria) this;
        }

        public Criteria andCoupon_countLessThan(Integer value) {
            addCriterion("coupon_count <", value, "coupon_count");
            return (Criteria) this;
        }

        public Criteria andCoupon_countLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_count <=", value, "coupon_count");
            return (Criteria) this;
        }

        public Criteria andCoupon_countIn(List<Integer> values) {
            addCriterion("coupon_count in", values, "coupon_count");
            return (Criteria) this;
        }

        public Criteria andCoupon_countNotIn(List<Integer> values) {
            addCriterion("coupon_count not in", values, "coupon_count");
            return (Criteria) this;
        }

        public Criteria andCoupon_countBetween(Integer value1, Integer value2) {
            addCriterion("coupon_count between", value1, value2, "coupon_count");
            return (Criteria) this;
        }

        public Criteria andCoupon_countNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_count not between", value1, value2, "coupon_count");
            return (Criteria) this;
        }

        public Criteria andComment_countIsNull() {
            addCriterion("comment_count is null");
            return (Criteria) this;
        }

        public Criteria andComment_countIsNotNull() {
            addCriterion("comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andComment_countEqualTo(Integer value) {
            addCriterion("comment_count =", value, "comment_count");
            return (Criteria) this;
        }

        public Criteria andComment_countNotEqualTo(Integer value) {
            addCriterion("comment_count <>", value, "comment_count");
            return (Criteria) this;
        }

        public Criteria andComment_countGreaterThan(Integer value) {
            addCriterion("comment_count >", value, "comment_count");
            return (Criteria) this;
        }

        public Criteria andComment_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_count >=", value, "comment_count");
            return (Criteria) this;
        }

        public Criteria andComment_countLessThan(Integer value) {
            addCriterion("comment_count <", value, "comment_count");
            return (Criteria) this;
        }

        public Criteria andComment_countLessThanOrEqualTo(Integer value) {
            addCriterion("comment_count <=", value, "comment_count");
            return (Criteria) this;
        }

        public Criteria andComment_countIn(List<Integer> values) {
            addCriterion("comment_count in", values, "comment_count");
            return (Criteria) this;
        }

        public Criteria andComment_countNotIn(List<Integer> values) {
            addCriterion("comment_count not in", values, "comment_count");
            return (Criteria) this;
        }

        public Criteria andComment_countBetween(Integer value1, Integer value2) {
            addCriterion("comment_count between", value1, value2, "comment_count");
            return (Criteria) this;
        }

        public Criteria andComment_countNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_count not between", value1, value2, "comment_count");
            return (Criteria) this;
        }

        public Criteria andReturn_order_countIsNull() {
            addCriterion("return_order_count is null");
            return (Criteria) this;
        }

        public Criteria andReturn_order_countIsNotNull() {
            addCriterion("return_order_count is not null");
            return (Criteria) this;
        }

        public Criteria andReturn_order_countEqualTo(Integer value) {
            addCriterion("return_order_count =", value, "return_order_count");
            return (Criteria) this;
        }

        public Criteria andReturn_order_countNotEqualTo(Integer value) {
            addCriterion("return_order_count <>", value, "return_order_count");
            return (Criteria) this;
        }

        public Criteria andReturn_order_countGreaterThan(Integer value) {
            addCriterion("return_order_count >", value, "return_order_count");
            return (Criteria) this;
        }

        public Criteria andReturn_order_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_order_count >=", value, "return_order_count");
            return (Criteria) this;
        }

        public Criteria andReturn_order_countLessThan(Integer value) {
            addCriterion("return_order_count <", value, "return_order_count");
            return (Criteria) this;
        }

        public Criteria andReturn_order_countLessThanOrEqualTo(Integer value) {
            addCriterion("return_order_count <=", value, "return_order_count");
            return (Criteria) this;
        }

        public Criteria andReturn_order_countIn(List<Integer> values) {
            addCriterion("return_order_count in", values, "return_order_count");
            return (Criteria) this;
        }

        public Criteria andReturn_order_countNotIn(List<Integer> values) {
            addCriterion("return_order_count not in", values, "return_order_count");
            return (Criteria) this;
        }

        public Criteria andReturn_order_countBetween(Integer value1, Integer value2) {
            addCriterion("return_order_count between", value1, value2, "return_order_count");
            return (Criteria) this;
        }

        public Criteria andReturn_order_countNotBetween(Integer value1, Integer value2) {
            addCriterion("return_order_count not between", value1, value2, "return_order_count");
            return (Criteria) this;
        }

        public Criteria andLogin_countIsNull() {
            addCriterion("login_count is null");
            return (Criteria) this;
        }

        public Criteria andLogin_countIsNotNull() {
            addCriterion("login_count is not null");
            return (Criteria) this;
        }

        public Criteria andLogin_countEqualTo(Integer value) {
            addCriterion("login_count =", value, "login_count");
            return (Criteria) this;
        }

        public Criteria andLogin_countNotEqualTo(Integer value) {
            addCriterion("login_count <>", value, "login_count");
            return (Criteria) this;
        }

        public Criteria andLogin_countGreaterThan(Integer value) {
            addCriterion("login_count >", value, "login_count");
            return (Criteria) this;
        }

        public Criteria andLogin_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_count >=", value, "login_count");
            return (Criteria) this;
        }

        public Criteria andLogin_countLessThan(Integer value) {
            addCriterion("login_count <", value, "login_count");
            return (Criteria) this;
        }

        public Criteria andLogin_countLessThanOrEqualTo(Integer value) {
            addCriterion("login_count <=", value, "login_count");
            return (Criteria) this;
        }

        public Criteria andLogin_countIn(List<Integer> values) {
            addCriterion("login_count in", values, "login_count");
            return (Criteria) this;
        }

        public Criteria andLogin_countNotIn(List<Integer> values) {
            addCriterion("login_count not in", values, "login_count");
            return (Criteria) this;
        }

        public Criteria andLogin_countBetween(Integer value1, Integer value2) {
            addCriterion("login_count between", value1, value2, "login_count");
            return (Criteria) this;
        }

        public Criteria andLogin_countNotBetween(Integer value1, Integer value2) {
            addCriterion("login_count not between", value1, value2, "login_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countIsNull() {
            addCriterion("attend_count is null");
            return (Criteria) this;
        }

        public Criteria andAttend_countIsNotNull() {
            addCriterion("attend_count is not null");
            return (Criteria) this;
        }

        public Criteria andAttend_countEqualTo(Integer value) {
            addCriterion("attend_count =", value, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countNotEqualTo(Integer value) {
            addCriterion("attend_count <>", value, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countGreaterThan(Integer value) {
            addCriterion("attend_count >", value, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("attend_count >=", value, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countLessThan(Integer value) {
            addCriterion("attend_count <", value, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countLessThanOrEqualTo(Integer value) {
            addCriterion("attend_count <=", value, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countIn(List<Integer> values) {
            addCriterion("attend_count in", values, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countNotIn(List<Integer> values) {
            addCriterion("attend_count not in", values, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countBetween(Integer value1, Integer value2) {
            addCriterion("attend_count between", value1, value2, "attend_count");
            return (Criteria) this;
        }

        public Criteria andAttend_countNotBetween(Integer value1, Integer value2) {
            addCriterion("attend_count not between", value1, value2, "attend_count");
            return (Criteria) this;
        }

        public Criteria andFans_countIsNull() {
            addCriterion("fans_count is null");
            return (Criteria) this;
        }

        public Criteria andFans_countIsNotNull() {
            addCriterion("fans_count is not null");
            return (Criteria) this;
        }

        public Criteria andFans_countEqualTo(Integer value) {
            addCriterion("fans_count =", value, "fans_count");
            return (Criteria) this;
        }

        public Criteria andFans_countNotEqualTo(Integer value) {
            addCriterion("fans_count <>", value, "fans_count");
            return (Criteria) this;
        }

        public Criteria andFans_countGreaterThan(Integer value) {
            addCriterion("fans_count >", value, "fans_count");
            return (Criteria) this;
        }

        public Criteria andFans_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans_count >=", value, "fans_count");
            return (Criteria) this;
        }

        public Criteria andFans_countLessThan(Integer value) {
            addCriterion("fans_count <", value, "fans_count");
            return (Criteria) this;
        }

        public Criteria andFans_countLessThanOrEqualTo(Integer value) {
            addCriterion("fans_count <=", value, "fans_count");
            return (Criteria) this;
        }

        public Criteria andFans_countIn(List<Integer> values) {
            addCriterion("fans_count in", values, "fans_count");
            return (Criteria) this;
        }

        public Criteria andFans_countNotIn(List<Integer> values) {
            addCriterion("fans_count not in", values, "fans_count");
            return (Criteria) this;
        }

        public Criteria andFans_countBetween(Integer value1, Integer value2) {
            addCriterion("fans_count between", value1, value2, "fans_count");
            return (Criteria) this;
        }

        public Criteria andFans_countNotBetween(Integer value1, Integer value2) {
            addCriterion("fans_count not between", value1, value2, "fans_count");
            return (Criteria) this;
        }

        public Criteria andCollect_product_countIsNull() {
            addCriterion("collect_product_count is null");
            return (Criteria) this;
        }

        public Criteria andCollect_product_countIsNotNull() {
            addCriterion("collect_product_count is not null");
            return (Criteria) this;
        }

        public Criteria andCollect_product_countEqualTo(Integer value) {
            addCriterion("collect_product_count =", value, "collect_product_count");
            return (Criteria) this;
        }

        public Criteria andCollect_product_countNotEqualTo(Integer value) {
            addCriterion("collect_product_count <>", value, "collect_product_count");
            return (Criteria) this;
        }

        public Criteria andCollect_product_countGreaterThan(Integer value) {
            addCriterion("collect_product_count >", value, "collect_product_count");
            return (Criteria) this;
        }

        public Criteria andCollect_product_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_product_count >=", value, "collect_product_count");
            return (Criteria) this;
        }

        public Criteria andCollect_product_countLessThan(Integer value) {
            addCriterion("collect_product_count <", value, "collect_product_count");
            return (Criteria) this;
        }

        public Criteria andCollect_product_countLessThanOrEqualTo(Integer value) {
            addCriterion("collect_product_count <=", value, "collect_product_count");
            return (Criteria) this;
        }

        public Criteria andCollect_product_countIn(List<Integer> values) {
            addCriterion("collect_product_count in", values, "collect_product_count");
            return (Criteria) this;
        }

        public Criteria andCollect_product_countNotIn(List<Integer> values) {
            addCriterion("collect_product_count not in", values, "collect_product_count");
            return (Criteria) this;
        }

        public Criteria andCollect_product_countBetween(Integer value1, Integer value2) {
            addCriterion("collect_product_count between", value1, value2, "collect_product_count");
            return (Criteria) this;
        }

        public Criteria andCollect_product_countNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_product_count not between", value1, value2, "collect_product_count");
            return (Criteria) this;
        }

        public Criteria andCollect_subject_countIsNull() {
            addCriterion("collect_subject_count is null");
            return (Criteria) this;
        }

        public Criteria andCollect_subject_countIsNotNull() {
            addCriterion("collect_subject_count is not null");
            return (Criteria) this;
        }

        public Criteria andCollect_subject_countEqualTo(Integer value) {
            addCriterion("collect_subject_count =", value, "collect_subject_count");
            return (Criteria) this;
        }

        public Criteria andCollect_subject_countNotEqualTo(Integer value) {
            addCriterion("collect_subject_count <>", value, "collect_subject_count");
            return (Criteria) this;
        }

        public Criteria andCollect_subject_countGreaterThan(Integer value) {
            addCriterion("collect_subject_count >", value, "collect_subject_count");
            return (Criteria) this;
        }

        public Criteria andCollect_subject_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_subject_count >=", value, "collect_subject_count");
            return (Criteria) this;
        }

        public Criteria andCollect_subject_countLessThan(Integer value) {
            addCriterion("collect_subject_count <", value, "collect_subject_count");
            return (Criteria) this;
        }

        public Criteria andCollect_subject_countLessThanOrEqualTo(Integer value) {
            addCriterion("collect_subject_count <=", value, "collect_subject_count");
            return (Criteria) this;
        }

        public Criteria andCollect_subject_countIn(List<Integer> values) {
            addCriterion("collect_subject_count in", values, "collect_subject_count");
            return (Criteria) this;
        }

        public Criteria andCollect_subject_countNotIn(List<Integer> values) {
            addCriterion("collect_subject_count not in", values, "collect_subject_count");
            return (Criteria) this;
        }

        public Criteria andCollect_subject_countBetween(Integer value1, Integer value2) {
            addCriterion("collect_subject_count between", value1, value2, "collect_subject_count");
            return (Criteria) this;
        }

        public Criteria andCollect_subject_countNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_subject_count not between", value1, value2, "collect_subject_count");
            return (Criteria) this;
        }

        public Criteria andCollect_topic_countIsNull() {
            addCriterion("collect_topic_count is null");
            return (Criteria) this;
        }

        public Criteria andCollect_topic_countIsNotNull() {
            addCriterion("collect_topic_count is not null");
            return (Criteria) this;
        }

        public Criteria andCollect_topic_countEqualTo(Integer value) {
            addCriterion("collect_topic_count =", value, "collect_topic_count");
            return (Criteria) this;
        }

        public Criteria andCollect_topic_countNotEqualTo(Integer value) {
            addCriterion("collect_topic_count <>", value, "collect_topic_count");
            return (Criteria) this;
        }

        public Criteria andCollect_topic_countGreaterThan(Integer value) {
            addCriterion("collect_topic_count >", value, "collect_topic_count");
            return (Criteria) this;
        }

        public Criteria andCollect_topic_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_topic_count >=", value, "collect_topic_count");
            return (Criteria) this;
        }

        public Criteria andCollect_topic_countLessThan(Integer value) {
            addCriterion("collect_topic_count <", value, "collect_topic_count");
            return (Criteria) this;
        }

        public Criteria andCollect_topic_countLessThanOrEqualTo(Integer value) {
            addCriterion("collect_topic_count <=", value, "collect_topic_count");
            return (Criteria) this;
        }

        public Criteria andCollect_topic_countIn(List<Integer> values) {
            addCriterion("collect_topic_count in", values, "collect_topic_count");
            return (Criteria) this;
        }

        public Criteria andCollect_topic_countNotIn(List<Integer> values) {
            addCriterion("collect_topic_count not in", values, "collect_topic_count");
            return (Criteria) this;
        }

        public Criteria andCollect_topic_countBetween(Integer value1, Integer value2) {
            addCriterion("collect_topic_count between", value1, value2, "collect_topic_count");
            return (Criteria) this;
        }

        public Criteria andCollect_topic_countNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_topic_count not between", value1, value2, "collect_topic_count");
            return (Criteria) this;
        }

        public Criteria andCollect_comment_countIsNull() {
            addCriterion("collect_comment_count is null");
            return (Criteria) this;
        }

        public Criteria andCollect_comment_countIsNotNull() {
            addCriterion("collect_comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andCollect_comment_countEqualTo(Integer value) {
            addCriterion("collect_comment_count =", value, "collect_comment_count");
            return (Criteria) this;
        }

        public Criteria andCollect_comment_countNotEqualTo(Integer value) {
            addCriterion("collect_comment_count <>", value, "collect_comment_count");
            return (Criteria) this;
        }

        public Criteria andCollect_comment_countGreaterThan(Integer value) {
            addCriterion("collect_comment_count >", value, "collect_comment_count");
            return (Criteria) this;
        }

        public Criteria andCollect_comment_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_comment_count >=", value, "collect_comment_count");
            return (Criteria) this;
        }

        public Criteria andCollect_comment_countLessThan(Integer value) {
            addCriterion("collect_comment_count <", value, "collect_comment_count");
            return (Criteria) this;
        }

        public Criteria andCollect_comment_countLessThanOrEqualTo(Integer value) {
            addCriterion("collect_comment_count <=", value, "collect_comment_count");
            return (Criteria) this;
        }

        public Criteria andCollect_comment_countIn(List<Integer> values) {
            addCriterion("collect_comment_count in", values, "collect_comment_count");
            return (Criteria) this;
        }

        public Criteria andCollect_comment_countNotIn(List<Integer> values) {
            addCriterion("collect_comment_count not in", values, "collect_comment_count");
            return (Criteria) this;
        }

        public Criteria andCollect_comment_countBetween(Integer value1, Integer value2) {
            addCriterion("collect_comment_count between", value1, value2, "collect_comment_count");
            return (Criteria) this;
        }

        public Criteria andCollect_comment_countNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_comment_count not between", value1, value2, "collect_comment_count");
            return (Criteria) this;
        }

        public Criteria andInvite_friend_countIsNull() {
            addCriterion("invite_friend_count is null");
            return (Criteria) this;
        }

        public Criteria andInvite_friend_countIsNotNull() {
            addCriterion("invite_friend_count is not null");
            return (Criteria) this;
        }

        public Criteria andInvite_friend_countEqualTo(Integer value) {
            addCriterion("invite_friend_count =", value, "invite_friend_count");
            return (Criteria) this;
        }

        public Criteria andInvite_friend_countNotEqualTo(Integer value) {
            addCriterion("invite_friend_count <>", value, "invite_friend_count");
            return (Criteria) this;
        }

        public Criteria andInvite_friend_countGreaterThan(Integer value) {
            addCriterion("invite_friend_count >", value, "invite_friend_count");
            return (Criteria) this;
        }

        public Criteria andInvite_friend_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("invite_friend_count >=", value, "invite_friend_count");
            return (Criteria) this;
        }

        public Criteria andInvite_friend_countLessThan(Integer value) {
            addCriterion("invite_friend_count <", value, "invite_friend_count");
            return (Criteria) this;
        }

        public Criteria andInvite_friend_countLessThanOrEqualTo(Integer value) {
            addCriterion("invite_friend_count <=", value, "invite_friend_count");
            return (Criteria) this;
        }

        public Criteria andInvite_friend_countIn(List<Integer> values) {
            addCriterion("invite_friend_count in", values, "invite_friend_count");
            return (Criteria) this;
        }

        public Criteria andInvite_friend_countNotIn(List<Integer> values) {
            addCriterion("invite_friend_count not in", values, "invite_friend_count");
            return (Criteria) this;
        }

        public Criteria andInvite_friend_countBetween(Integer value1, Integer value2) {
            addCriterion("invite_friend_count between", value1, value2, "invite_friend_count");
            return (Criteria) this;
        }

        public Criteria andInvite_friend_countNotBetween(Integer value1, Integer value2) {
            addCriterion("invite_friend_count not between", value1, value2, "invite_friend_count");
            return (Criteria) this;
        }

        public Criteria andRecent_order_timeIsNull() {
            addCriterion("recent_order_time is null");
            return (Criteria) this;
        }

        public Criteria andRecent_order_timeIsNotNull() {
            addCriterion("recent_order_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecent_order_timeEqualTo(Date value) {
            addCriterion("recent_order_time =", value, "recent_order_time");
            return (Criteria) this;
        }

        public Criteria andRecent_order_timeNotEqualTo(Date value) {
            addCriterion("recent_order_time <>", value, "recent_order_time");
            return (Criteria) this;
        }

        public Criteria andRecent_order_timeGreaterThan(Date value) {
            addCriterion("recent_order_time >", value, "recent_order_time");
            return (Criteria) this;
        }

        public Criteria andRecent_order_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("recent_order_time >=", value, "recent_order_time");
            return (Criteria) this;
        }

        public Criteria andRecent_order_timeLessThan(Date value) {
            addCriterion("recent_order_time <", value, "recent_order_time");
            return (Criteria) this;
        }

        public Criteria andRecent_order_timeLessThanOrEqualTo(Date value) {
            addCriterion("recent_order_time <=", value, "recent_order_time");
            return (Criteria) this;
        }

        public Criteria andRecent_order_timeIn(List<Date> values) {
            addCriterion("recent_order_time in", values, "recent_order_time");
            return (Criteria) this;
        }

        public Criteria andRecent_order_timeNotIn(List<Date> values) {
            addCriterion("recent_order_time not in", values, "recent_order_time");
            return (Criteria) this;
        }

        public Criteria andRecent_order_timeBetween(Date value1, Date value2) {
            addCriterion("recent_order_time between", value1, value2, "recent_order_time");
            return (Criteria) this;
        }

        public Criteria andRecent_order_timeNotBetween(Date value1, Date value2) {
            addCriterion("recent_order_time not between", value1, value2, "recent_order_time");
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