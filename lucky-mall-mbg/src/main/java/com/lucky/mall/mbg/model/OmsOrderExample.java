package com.lucky.mall.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmsOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsOrderExample() {
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

        public Criteria andMember_usernameIsNull() {
            addCriterion("member_username is null");
            return (Criteria) this;
        }

        public Criteria andMember_usernameIsNotNull() {
            addCriterion("member_username is not null");
            return (Criteria) this;
        }

        public Criteria andMember_usernameEqualTo(String value) {
            addCriterion("member_username =", value, "member_username");
            return (Criteria) this;
        }

        public Criteria andMember_usernameNotEqualTo(String value) {
            addCriterion("member_username <>", value, "member_username");
            return (Criteria) this;
        }

        public Criteria andMember_usernameGreaterThan(String value) {
            addCriterion("member_username >", value, "member_username");
            return (Criteria) this;
        }

        public Criteria andMember_usernameGreaterThanOrEqualTo(String value) {
            addCriterion("member_username >=", value, "member_username");
            return (Criteria) this;
        }

        public Criteria andMember_usernameLessThan(String value) {
            addCriterion("member_username <", value, "member_username");
            return (Criteria) this;
        }

        public Criteria andMember_usernameLessThanOrEqualTo(String value) {
            addCriterion("member_username <=", value, "member_username");
            return (Criteria) this;
        }

        public Criteria andMember_usernameLike(String value) {
            addCriterion("member_username like", value, "member_username");
            return (Criteria) this;
        }

        public Criteria andMember_usernameNotLike(String value) {
            addCriterion("member_username not like", value, "member_username");
            return (Criteria) this;
        }

        public Criteria andMember_usernameIn(List<String> values) {
            addCriterion("member_username in", values, "member_username");
            return (Criteria) this;
        }

        public Criteria andMember_usernameNotIn(List<String> values) {
            addCriterion("member_username not in", values, "member_username");
            return (Criteria) this;
        }

        public Criteria andMember_usernameBetween(String value1, String value2) {
            addCriterion("member_username between", value1, value2, "member_username");
            return (Criteria) this;
        }

        public Criteria andMember_usernameNotBetween(String value1, String value2) {
            addCriterion("member_username not between", value1, value2, "member_username");
            return (Criteria) this;
        }

        public Criteria andTotal_amountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotal_amountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_amountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "total_amount");
            return (Criteria) this;
        }

        public Criteria andTotal_amountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "total_amount");
            return (Criteria) this;
        }

        public Criteria andTotal_amountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "total_amount");
            return (Criteria) this;
        }

        public Criteria andTotal_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "total_amount");
            return (Criteria) this;
        }

        public Criteria andTotal_amountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "total_amount");
            return (Criteria) this;
        }

        public Criteria andTotal_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "total_amount");
            return (Criteria) this;
        }

        public Criteria andTotal_amountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "total_amount");
            return (Criteria) this;
        }

        public Criteria andTotal_amountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "total_amount");
            return (Criteria) this;
        }

        public Criteria andTotal_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "total_amount");
            return (Criteria) this;
        }

        public Criteria andTotal_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "total_amount");
            return (Criteria) this;
        }

        public Criteria andPay_amountIsNull() {
            addCriterion("pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPay_amountIsNotNull() {
            addCriterion("pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPay_amountEqualTo(BigDecimal value) {
            addCriterion("pay_amount =", value, "pay_amount");
            return (Criteria) this;
        }

        public Criteria andPay_amountNotEqualTo(BigDecimal value) {
            addCriterion("pay_amount <>", value, "pay_amount");
            return (Criteria) this;
        }

        public Criteria andPay_amountGreaterThan(BigDecimal value) {
            addCriterion("pay_amount >", value, "pay_amount");
            return (Criteria) this;
        }

        public Criteria andPay_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount >=", value, "pay_amount");
            return (Criteria) this;
        }

        public Criteria andPay_amountLessThan(BigDecimal value) {
            addCriterion("pay_amount <", value, "pay_amount");
            return (Criteria) this;
        }

        public Criteria andPay_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount <=", value, "pay_amount");
            return (Criteria) this;
        }

        public Criteria andPay_amountIn(List<BigDecimal> values) {
            addCriterion("pay_amount in", values, "pay_amount");
            return (Criteria) this;
        }

        public Criteria andPay_amountNotIn(List<BigDecimal> values) {
            addCriterion("pay_amount not in", values, "pay_amount");
            return (Criteria) this;
        }

        public Criteria andPay_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount between", value1, value2, "pay_amount");
            return (Criteria) this;
        }

        public Criteria andPay_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount not between", value1, value2, "pay_amount");
            return (Criteria) this;
        }

        public Criteria andFreight_amountIsNull() {
            addCriterion("freight_amount is null");
            return (Criteria) this;
        }

        public Criteria andFreight_amountIsNotNull() {
            addCriterion("freight_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFreight_amountEqualTo(BigDecimal value) {
            addCriterion("freight_amount =", value, "freight_amount");
            return (Criteria) this;
        }

        public Criteria andFreight_amountNotEqualTo(BigDecimal value) {
            addCriterion("freight_amount <>", value, "freight_amount");
            return (Criteria) this;
        }

        public Criteria andFreight_amountGreaterThan(BigDecimal value) {
            addCriterion("freight_amount >", value, "freight_amount");
            return (Criteria) this;
        }

        public Criteria andFreight_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_amount >=", value, "freight_amount");
            return (Criteria) this;
        }

        public Criteria andFreight_amountLessThan(BigDecimal value) {
            addCriterion("freight_amount <", value, "freight_amount");
            return (Criteria) this;
        }

        public Criteria andFreight_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_amount <=", value, "freight_amount");
            return (Criteria) this;
        }

        public Criteria andFreight_amountIn(List<BigDecimal> values) {
            addCriterion("freight_amount in", values, "freight_amount");
            return (Criteria) this;
        }

        public Criteria andFreight_amountNotIn(List<BigDecimal> values) {
            addCriterion("freight_amount not in", values, "freight_amount");
            return (Criteria) this;
        }

        public Criteria andFreight_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_amount between", value1, value2, "freight_amount");
            return (Criteria) this;
        }

        public Criteria andFreight_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_amount not between", value1, value2, "freight_amount");
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

        public Criteria andDiscount_amountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountEqualTo(BigDecimal value) {
            addCriterion("discount_amount =", value, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountNotEqualTo(BigDecimal value) {
            addCriterion("discount_amount <>", value, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountGreaterThan(BigDecimal value) {
            addCriterion("discount_amount >", value, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount >=", value, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountLessThan(BigDecimal value) {
            addCriterion("discount_amount <", value, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount <=", value, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountIn(List<BigDecimal> values) {
            addCriterion("discount_amount in", values, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountNotIn(List<BigDecimal> values) {
            addCriterion("discount_amount not in", values, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount between", value1, value2, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount not between", value1, value2, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andPay_typeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPay_typeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPay_typeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "pay_type");
            return (Criteria) this;
        }

        public Criteria andPay_typeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "pay_type");
            return (Criteria) this;
        }

        public Criteria andPay_typeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "pay_type");
            return (Criteria) this;
        }

        public Criteria andPay_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "pay_type");
            return (Criteria) this;
        }

        public Criteria andPay_typeLessThan(Integer value) {
            addCriterion("pay_type <", value, "pay_type");
            return (Criteria) this;
        }

        public Criteria andPay_typeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "pay_type");
            return (Criteria) this;
        }

        public Criteria andPay_typeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "pay_type");
            return (Criteria) this;
        }

        public Criteria andPay_typeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "pay_type");
            return (Criteria) this;
        }

        public Criteria andPay_typeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "pay_type");
            return (Criteria) this;
        }

        public Criteria andPay_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "pay_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
        }

        public Criteria andSource_typeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
        }

        public Criteria andSource_typeEqualTo(Integer value) {
            addCriterion("source_type =", value, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeNotEqualTo(Integer value) {
            addCriterion("source_type <>", value, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeGreaterThan(Integer value) {
            addCriterion("source_type >", value, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_type >=", value, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeLessThan(Integer value) {
            addCriterion("source_type <", value, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeLessThanOrEqualTo(Integer value) {
            addCriterion("source_type <=", value, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeIn(List<Integer> values) {
            addCriterion("source_type in", values, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeNotIn(List<Integer> values) {
            addCriterion("source_type not in", values, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeBetween(Integer value1, Integer value2) {
            addCriterion("source_type between", value1, value2, "source_type");
            return (Criteria) this;
        }

        public Criteria andSource_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("source_type not between", value1, value2, "source_type");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOrder_typeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrder_typeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_typeEqualTo(Integer value) {
            addCriterion("order_type =", value, "order_type");
            return (Criteria) this;
        }

        public Criteria andOrder_typeNotEqualTo(Integer value) {
            addCriterion("order_type <>", value, "order_type");
            return (Criteria) this;
        }

        public Criteria andOrder_typeGreaterThan(Integer value) {
            addCriterion("order_type >", value, "order_type");
            return (Criteria) this;
        }

        public Criteria andOrder_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type >=", value, "order_type");
            return (Criteria) this;
        }

        public Criteria andOrder_typeLessThan(Integer value) {
            addCriterion("order_type <", value, "order_type");
            return (Criteria) this;
        }

        public Criteria andOrder_typeLessThanOrEqualTo(Integer value) {
            addCriterion("order_type <=", value, "order_type");
            return (Criteria) this;
        }

        public Criteria andOrder_typeIn(List<Integer> values) {
            addCriterion("order_type in", values, "order_type");
            return (Criteria) this;
        }

        public Criteria andOrder_typeNotIn(List<Integer> values) {
            addCriterion("order_type not in", values, "order_type");
            return (Criteria) this;
        }

        public Criteria andOrder_typeBetween(Integer value1, Integer value2) {
            addCriterion("order_type between", value1, value2, "order_type");
            return (Criteria) this;
        }

        public Criteria andOrder_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type not between", value1, value2, "order_type");
            return (Criteria) this;
        }

        public Criteria andDelivery_companyIsNull() {
            addCriterion("delivery_company is null");
            return (Criteria) this;
        }

        public Criteria andDelivery_companyIsNotNull() {
            addCriterion("delivery_company is not null");
            return (Criteria) this;
        }

        public Criteria andDelivery_companyEqualTo(String value) {
            addCriterion("delivery_company =", value, "delivery_company");
            return (Criteria) this;
        }

        public Criteria andDelivery_companyNotEqualTo(String value) {
            addCriterion("delivery_company <>", value, "delivery_company");
            return (Criteria) this;
        }

        public Criteria andDelivery_companyGreaterThan(String value) {
            addCriterion("delivery_company >", value, "delivery_company");
            return (Criteria) this;
        }

        public Criteria andDelivery_companyGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_company >=", value, "delivery_company");
            return (Criteria) this;
        }

        public Criteria andDelivery_companyLessThan(String value) {
            addCriterion("delivery_company <", value, "delivery_company");
            return (Criteria) this;
        }

        public Criteria andDelivery_companyLessThanOrEqualTo(String value) {
            addCriterion("delivery_company <=", value, "delivery_company");
            return (Criteria) this;
        }

        public Criteria andDelivery_companyLike(String value) {
            addCriterion("delivery_company like", value, "delivery_company");
            return (Criteria) this;
        }

        public Criteria andDelivery_companyNotLike(String value) {
            addCriterion("delivery_company not like", value, "delivery_company");
            return (Criteria) this;
        }

        public Criteria andDelivery_companyIn(List<String> values) {
            addCriterion("delivery_company in", values, "delivery_company");
            return (Criteria) this;
        }

        public Criteria andDelivery_companyNotIn(List<String> values) {
            addCriterion("delivery_company not in", values, "delivery_company");
            return (Criteria) this;
        }

        public Criteria andDelivery_companyBetween(String value1, String value2) {
            addCriterion("delivery_company between", value1, value2, "delivery_company");
            return (Criteria) this;
        }

        public Criteria andDelivery_companyNotBetween(String value1, String value2) {
            addCriterion("delivery_company not between", value1, value2, "delivery_company");
            return (Criteria) this;
        }

        public Criteria andDelivery_snIsNull() {
            addCriterion("delivery_sn is null");
            return (Criteria) this;
        }

        public Criteria andDelivery_snIsNotNull() {
            addCriterion("delivery_sn is not null");
            return (Criteria) this;
        }

        public Criteria andDelivery_snEqualTo(String value) {
            addCriterion("delivery_sn =", value, "delivery_sn");
            return (Criteria) this;
        }

        public Criteria andDelivery_snNotEqualTo(String value) {
            addCriterion("delivery_sn <>", value, "delivery_sn");
            return (Criteria) this;
        }

        public Criteria andDelivery_snGreaterThan(String value) {
            addCriterion("delivery_sn >", value, "delivery_sn");
            return (Criteria) this;
        }

        public Criteria andDelivery_snGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_sn >=", value, "delivery_sn");
            return (Criteria) this;
        }

        public Criteria andDelivery_snLessThan(String value) {
            addCriterion("delivery_sn <", value, "delivery_sn");
            return (Criteria) this;
        }

        public Criteria andDelivery_snLessThanOrEqualTo(String value) {
            addCriterion("delivery_sn <=", value, "delivery_sn");
            return (Criteria) this;
        }

        public Criteria andDelivery_snLike(String value) {
            addCriterion("delivery_sn like", value, "delivery_sn");
            return (Criteria) this;
        }

        public Criteria andDelivery_snNotLike(String value) {
            addCriterion("delivery_sn not like", value, "delivery_sn");
            return (Criteria) this;
        }

        public Criteria andDelivery_snIn(List<String> values) {
            addCriterion("delivery_sn in", values, "delivery_sn");
            return (Criteria) this;
        }

        public Criteria andDelivery_snNotIn(List<String> values) {
            addCriterion("delivery_sn not in", values, "delivery_sn");
            return (Criteria) this;
        }

        public Criteria andDelivery_snBetween(String value1, String value2) {
            addCriterion("delivery_sn between", value1, value2, "delivery_sn");
            return (Criteria) this;
        }

        public Criteria andDelivery_snNotBetween(String value1, String value2) {
            addCriterion("delivery_sn not between", value1, value2, "delivery_sn");
            return (Criteria) this;
        }

        public Criteria andAuto_confirm_dayIsNull() {
            addCriterion("auto_confirm_day is null");
            return (Criteria) this;
        }

        public Criteria andAuto_confirm_dayIsNotNull() {
            addCriterion("auto_confirm_day is not null");
            return (Criteria) this;
        }

        public Criteria andAuto_confirm_dayEqualTo(Integer value) {
            addCriterion("auto_confirm_day =", value, "auto_confirm_day");
            return (Criteria) this;
        }

        public Criteria andAuto_confirm_dayNotEqualTo(Integer value) {
            addCriterion("auto_confirm_day <>", value, "auto_confirm_day");
            return (Criteria) this;
        }

        public Criteria andAuto_confirm_dayGreaterThan(Integer value) {
            addCriterion("auto_confirm_day >", value, "auto_confirm_day");
            return (Criteria) this;
        }

        public Criteria andAuto_confirm_dayGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_confirm_day >=", value, "auto_confirm_day");
            return (Criteria) this;
        }

        public Criteria andAuto_confirm_dayLessThan(Integer value) {
            addCriterion("auto_confirm_day <", value, "auto_confirm_day");
            return (Criteria) this;
        }

        public Criteria andAuto_confirm_dayLessThanOrEqualTo(Integer value) {
            addCriterion("auto_confirm_day <=", value, "auto_confirm_day");
            return (Criteria) this;
        }

        public Criteria andAuto_confirm_dayIn(List<Integer> values) {
            addCriterion("auto_confirm_day in", values, "auto_confirm_day");
            return (Criteria) this;
        }

        public Criteria andAuto_confirm_dayNotIn(List<Integer> values) {
            addCriterion("auto_confirm_day not in", values, "auto_confirm_day");
            return (Criteria) this;
        }

        public Criteria andAuto_confirm_dayBetween(Integer value1, Integer value2) {
            addCriterion("auto_confirm_day between", value1, value2, "auto_confirm_day");
            return (Criteria) this;
        }

        public Criteria andAuto_confirm_dayNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_confirm_day not between", value1, value2, "auto_confirm_day");
            return (Criteria) this;
        }

        public Criteria andIntegrationIsNull() {
            addCriterion("integration is null");
            return (Criteria) this;
        }

        public Criteria andIntegrationIsNotNull() {
            addCriterion("integration is not null");
            return (Criteria) this;
        }

        public Criteria andIntegrationEqualTo(Integer value) {
            addCriterion("integration =", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationNotEqualTo(Integer value) {
            addCriterion("integration <>", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationGreaterThan(Integer value) {
            addCriterion("integration >", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationGreaterThanOrEqualTo(Integer value) {
            addCriterion("integration >=", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationLessThan(Integer value) {
            addCriterion("integration <", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationLessThanOrEqualTo(Integer value) {
            addCriterion("integration <=", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationIn(List<Integer> values) {
            addCriterion("integration in", values, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationNotIn(List<Integer> values) {
            addCriterion("integration not in", values, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationBetween(Integer value1, Integer value2) {
            addCriterion("integration between", value1, value2, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationNotBetween(Integer value1, Integer value2) {
            addCriterion("integration not between", value1, value2, "integration");
            return (Criteria) this;
        }

        public Criteria andGrowthIsNull() {
            addCriterion("growth is null");
            return (Criteria) this;
        }

        public Criteria andGrowthIsNotNull() {
            addCriterion("growth is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthEqualTo(Integer value) {
            addCriterion("growth =", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotEqualTo(Integer value) {
            addCriterion("growth <>", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthGreaterThan(Integer value) {
            addCriterion("growth >", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthGreaterThanOrEqualTo(Integer value) {
            addCriterion("growth >=", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthLessThan(Integer value) {
            addCriterion("growth <", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthLessThanOrEqualTo(Integer value) {
            addCriterion("growth <=", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthIn(List<Integer> values) {
            addCriterion("growth in", values, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotIn(List<Integer> values) {
            addCriterion("growth not in", values, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthBetween(Integer value1, Integer value2) {
            addCriterion("growth between", value1, value2, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotBetween(Integer value1, Integer value2) {
            addCriterion("growth not between", value1, value2, "growth");
            return (Criteria) this;
        }

        public Criteria andPromotion_infoIsNull() {
            addCriterion("promotion_info is null");
            return (Criteria) this;
        }

        public Criteria andPromotion_infoIsNotNull() {
            addCriterion("promotion_info is not null");
            return (Criteria) this;
        }

        public Criteria andPromotion_infoEqualTo(String value) {
            addCriterion("promotion_info =", value, "promotion_info");
            return (Criteria) this;
        }

        public Criteria andPromotion_infoNotEqualTo(String value) {
            addCriterion("promotion_info <>", value, "promotion_info");
            return (Criteria) this;
        }

        public Criteria andPromotion_infoGreaterThan(String value) {
            addCriterion("promotion_info >", value, "promotion_info");
            return (Criteria) this;
        }

        public Criteria andPromotion_infoGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_info >=", value, "promotion_info");
            return (Criteria) this;
        }

        public Criteria andPromotion_infoLessThan(String value) {
            addCriterion("promotion_info <", value, "promotion_info");
            return (Criteria) this;
        }

        public Criteria andPromotion_infoLessThanOrEqualTo(String value) {
            addCriterion("promotion_info <=", value, "promotion_info");
            return (Criteria) this;
        }

        public Criteria andPromotion_infoLike(String value) {
            addCriterion("promotion_info like", value, "promotion_info");
            return (Criteria) this;
        }

        public Criteria andPromotion_infoNotLike(String value) {
            addCriterion("promotion_info not like", value, "promotion_info");
            return (Criteria) this;
        }

        public Criteria andPromotion_infoIn(List<String> values) {
            addCriterion("promotion_info in", values, "promotion_info");
            return (Criteria) this;
        }

        public Criteria andPromotion_infoNotIn(List<String> values) {
            addCriterion("promotion_info not in", values, "promotion_info");
            return (Criteria) this;
        }

        public Criteria andPromotion_infoBetween(String value1, String value2) {
            addCriterion("promotion_info between", value1, value2, "promotion_info");
            return (Criteria) this;
        }

        public Criteria andPromotion_infoNotBetween(String value1, String value2) {
            addCriterion("promotion_info not between", value1, value2, "promotion_info");
            return (Criteria) this;
        }

        public Criteria andBill_typeIsNull() {
            addCriterion("bill_type is null");
            return (Criteria) this;
        }

        public Criteria andBill_typeIsNotNull() {
            addCriterion("bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andBill_typeEqualTo(Integer value) {
            addCriterion("bill_type =", value, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeNotEqualTo(Integer value) {
            addCriterion("bill_type <>", value, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeGreaterThan(Integer value) {
            addCriterion("bill_type >", value, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_type >=", value, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeLessThan(Integer value) {
            addCriterion("bill_type <", value, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeLessThanOrEqualTo(Integer value) {
            addCriterion("bill_type <=", value, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeIn(List<Integer> values) {
            addCriterion("bill_type in", values, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeNotIn(List<Integer> values) {
            addCriterion("bill_type not in", values, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeBetween(Integer value1, Integer value2) {
            addCriterion("bill_type between", value1, value2, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_type not between", value1, value2, "bill_type");
            return (Criteria) this;
        }

        public Criteria andBill_headerIsNull() {
            addCriterion("bill_header is null");
            return (Criteria) this;
        }

        public Criteria andBill_headerIsNotNull() {
            addCriterion("bill_header is not null");
            return (Criteria) this;
        }

        public Criteria andBill_headerEqualTo(String value) {
            addCriterion("bill_header =", value, "bill_header");
            return (Criteria) this;
        }

        public Criteria andBill_headerNotEqualTo(String value) {
            addCriterion("bill_header <>", value, "bill_header");
            return (Criteria) this;
        }

        public Criteria andBill_headerGreaterThan(String value) {
            addCriterion("bill_header >", value, "bill_header");
            return (Criteria) this;
        }

        public Criteria andBill_headerGreaterThanOrEqualTo(String value) {
            addCriterion("bill_header >=", value, "bill_header");
            return (Criteria) this;
        }

        public Criteria andBill_headerLessThan(String value) {
            addCriterion("bill_header <", value, "bill_header");
            return (Criteria) this;
        }

        public Criteria andBill_headerLessThanOrEqualTo(String value) {
            addCriterion("bill_header <=", value, "bill_header");
            return (Criteria) this;
        }

        public Criteria andBill_headerLike(String value) {
            addCriterion("bill_header like", value, "bill_header");
            return (Criteria) this;
        }

        public Criteria andBill_headerNotLike(String value) {
            addCriterion("bill_header not like", value, "bill_header");
            return (Criteria) this;
        }

        public Criteria andBill_headerIn(List<String> values) {
            addCriterion("bill_header in", values, "bill_header");
            return (Criteria) this;
        }

        public Criteria andBill_headerNotIn(List<String> values) {
            addCriterion("bill_header not in", values, "bill_header");
            return (Criteria) this;
        }

        public Criteria andBill_headerBetween(String value1, String value2) {
            addCriterion("bill_header between", value1, value2, "bill_header");
            return (Criteria) this;
        }

        public Criteria andBill_headerNotBetween(String value1, String value2) {
            addCriterion("bill_header not between", value1, value2, "bill_header");
            return (Criteria) this;
        }

        public Criteria andBill_contentIsNull() {
            addCriterion("bill_content is null");
            return (Criteria) this;
        }

        public Criteria andBill_contentIsNotNull() {
            addCriterion("bill_content is not null");
            return (Criteria) this;
        }

        public Criteria andBill_contentEqualTo(String value) {
            addCriterion("bill_content =", value, "bill_content");
            return (Criteria) this;
        }

        public Criteria andBill_contentNotEqualTo(String value) {
            addCriterion("bill_content <>", value, "bill_content");
            return (Criteria) this;
        }

        public Criteria andBill_contentGreaterThan(String value) {
            addCriterion("bill_content >", value, "bill_content");
            return (Criteria) this;
        }

        public Criteria andBill_contentGreaterThanOrEqualTo(String value) {
            addCriterion("bill_content >=", value, "bill_content");
            return (Criteria) this;
        }

        public Criteria andBill_contentLessThan(String value) {
            addCriterion("bill_content <", value, "bill_content");
            return (Criteria) this;
        }

        public Criteria andBill_contentLessThanOrEqualTo(String value) {
            addCriterion("bill_content <=", value, "bill_content");
            return (Criteria) this;
        }

        public Criteria andBill_contentLike(String value) {
            addCriterion("bill_content like", value, "bill_content");
            return (Criteria) this;
        }

        public Criteria andBill_contentNotLike(String value) {
            addCriterion("bill_content not like", value, "bill_content");
            return (Criteria) this;
        }

        public Criteria andBill_contentIn(List<String> values) {
            addCriterion("bill_content in", values, "bill_content");
            return (Criteria) this;
        }

        public Criteria andBill_contentNotIn(List<String> values) {
            addCriterion("bill_content not in", values, "bill_content");
            return (Criteria) this;
        }

        public Criteria andBill_contentBetween(String value1, String value2) {
            addCriterion("bill_content between", value1, value2, "bill_content");
            return (Criteria) this;
        }

        public Criteria andBill_contentNotBetween(String value1, String value2) {
            addCriterion("bill_content not between", value1, value2, "bill_content");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_phoneIsNull() {
            addCriterion("bill_receiver_phone is null");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_phoneIsNotNull() {
            addCriterion("bill_receiver_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_phoneEqualTo(String value) {
            addCriterion("bill_receiver_phone =", value, "bill_receiver_phone");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_phoneNotEqualTo(String value) {
            addCriterion("bill_receiver_phone <>", value, "bill_receiver_phone");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_phoneGreaterThan(String value) {
            addCriterion("bill_receiver_phone >", value, "bill_receiver_phone");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("bill_receiver_phone >=", value, "bill_receiver_phone");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_phoneLessThan(String value) {
            addCriterion("bill_receiver_phone <", value, "bill_receiver_phone");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_phoneLessThanOrEqualTo(String value) {
            addCriterion("bill_receiver_phone <=", value, "bill_receiver_phone");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_phoneLike(String value) {
            addCriterion("bill_receiver_phone like", value, "bill_receiver_phone");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_phoneNotLike(String value) {
            addCriterion("bill_receiver_phone not like", value, "bill_receiver_phone");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_phoneIn(List<String> values) {
            addCriterion("bill_receiver_phone in", values, "bill_receiver_phone");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_phoneNotIn(List<String> values) {
            addCriterion("bill_receiver_phone not in", values, "bill_receiver_phone");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_phoneBetween(String value1, String value2) {
            addCriterion("bill_receiver_phone between", value1, value2, "bill_receiver_phone");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_phoneNotBetween(String value1, String value2) {
            addCriterion("bill_receiver_phone not between", value1, value2, "bill_receiver_phone");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_emailIsNull() {
            addCriterion("bill_receiver_email is null");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_emailIsNotNull() {
            addCriterion("bill_receiver_email is not null");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_emailEqualTo(String value) {
            addCriterion("bill_receiver_email =", value, "bill_receiver_email");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_emailNotEqualTo(String value) {
            addCriterion("bill_receiver_email <>", value, "bill_receiver_email");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_emailGreaterThan(String value) {
            addCriterion("bill_receiver_email >", value, "bill_receiver_email");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_emailGreaterThanOrEqualTo(String value) {
            addCriterion("bill_receiver_email >=", value, "bill_receiver_email");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_emailLessThan(String value) {
            addCriterion("bill_receiver_email <", value, "bill_receiver_email");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_emailLessThanOrEqualTo(String value) {
            addCriterion("bill_receiver_email <=", value, "bill_receiver_email");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_emailLike(String value) {
            addCriterion("bill_receiver_email like", value, "bill_receiver_email");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_emailNotLike(String value) {
            addCriterion("bill_receiver_email not like", value, "bill_receiver_email");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_emailIn(List<String> values) {
            addCriterion("bill_receiver_email in", values, "bill_receiver_email");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_emailNotIn(List<String> values) {
            addCriterion("bill_receiver_email not in", values, "bill_receiver_email");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_emailBetween(String value1, String value2) {
            addCriterion("bill_receiver_email between", value1, value2, "bill_receiver_email");
            return (Criteria) this;
        }

        public Criteria andBill_receiver_emailNotBetween(String value1, String value2) {
            addCriterion("bill_receiver_email not between", value1, value2, "bill_receiver_email");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameIsNull() {
            addCriterion("receiver_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameIsNotNull() {
            addCriterion("receiver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameEqualTo(String value) {
            addCriterion("receiver_name =", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameNotEqualTo(String value) {
            addCriterion("receiver_name <>", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameGreaterThan(String value) {
            addCriterion("receiver_name >", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name >=", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameLessThan(String value) {
            addCriterion("receiver_name <", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameLessThanOrEqualTo(String value) {
            addCriterion("receiver_name <=", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameLike(String value) {
            addCriterion("receiver_name like", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameNotLike(String value) {
            addCriterion("receiver_name not like", value, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameIn(List<String> values) {
            addCriterion("receiver_name in", values, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameNotIn(List<String> values) {
            addCriterion("receiver_name not in", values, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameBetween(String value1, String value2) {
            addCriterion("receiver_name between", value1, value2, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_nameNotBetween(String value1, String value2) {
            addCriterion("receiver_name not between", value1, value2, "receiver_name");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneIsNull() {
            addCriterion("receiver_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneIsNotNull() {
            addCriterion("receiver_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneEqualTo(String value) {
            addCriterion("receiver_phone =", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneNotEqualTo(String value) {
            addCriterion("receiver_phone <>", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneGreaterThan(String value) {
            addCriterion("receiver_phone >", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_phone >=", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneLessThan(String value) {
            addCriterion("receiver_phone <", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneLessThanOrEqualTo(String value) {
            addCriterion("receiver_phone <=", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneLike(String value) {
            addCriterion("receiver_phone like", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneNotLike(String value) {
            addCriterion("receiver_phone not like", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneIn(List<String> values) {
            addCriterion("receiver_phone in", values, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneNotIn(List<String> values) {
            addCriterion("receiver_phone not in", values, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneBetween(String value1, String value2) {
            addCriterion("receiver_phone between", value1, value2, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneNotBetween(String value1, String value2) {
            addCriterion("receiver_phone not between", value1, value2, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_post_codeIsNull() {
            addCriterion("receiver_post_code is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_post_codeIsNotNull() {
            addCriterion("receiver_post_code is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_post_codeEqualTo(String value) {
            addCriterion("receiver_post_code =", value, "receiver_post_code");
            return (Criteria) this;
        }

        public Criteria andReceiver_post_codeNotEqualTo(String value) {
            addCriterion("receiver_post_code <>", value, "receiver_post_code");
            return (Criteria) this;
        }

        public Criteria andReceiver_post_codeGreaterThan(String value) {
            addCriterion("receiver_post_code >", value, "receiver_post_code");
            return (Criteria) this;
        }

        public Criteria andReceiver_post_codeGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_post_code >=", value, "receiver_post_code");
            return (Criteria) this;
        }

        public Criteria andReceiver_post_codeLessThan(String value) {
            addCriterion("receiver_post_code <", value, "receiver_post_code");
            return (Criteria) this;
        }

        public Criteria andReceiver_post_codeLessThanOrEqualTo(String value) {
            addCriterion("receiver_post_code <=", value, "receiver_post_code");
            return (Criteria) this;
        }

        public Criteria andReceiver_post_codeLike(String value) {
            addCriterion("receiver_post_code like", value, "receiver_post_code");
            return (Criteria) this;
        }

        public Criteria andReceiver_post_codeNotLike(String value) {
            addCriterion("receiver_post_code not like", value, "receiver_post_code");
            return (Criteria) this;
        }

        public Criteria andReceiver_post_codeIn(List<String> values) {
            addCriterion("receiver_post_code in", values, "receiver_post_code");
            return (Criteria) this;
        }

        public Criteria andReceiver_post_codeNotIn(List<String> values) {
            addCriterion("receiver_post_code not in", values, "receiver_post_code");
            return (Criteria) this;
        }

        public Criteria andReceiver_post_codeBetween(String value1, String value2) {
            addCriterion("receiver_post_code between", value1, value2, "receiver_post_code");
            return (Criteria) this;
        }

        public Criteria andReceiver_post_codeNotBetween(String value1, String value2) {
            addCriterion("receiver_post_code not between", value1, value2, "receiver_post_code");
            return (Criteria) this;
        }

        public Criteria andReceiver_provinceIsNull() {
            addCriterion("receiver_province is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_provinceIsNotNull() {
            addCriterion("receiver_province is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_provinceEqualTo(String value) {
            addCriterion("receiver_province =", value, "receiver_province");
            return (Criteria) this;
        }

        public Criteria andReceiver_provinceNotEqualTo(String value) {
            addCriterion("receiver_province <>", value, "receiver_province");
            return (Criteria) this;
        }

        public Criteria andReceiver_provinceGreaterThan(String value) {
            addCriterion("receiver_province >", value, "receiver_province");
            return (Criteria) this;
        }

        public Criteria andReceiver_provinceGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_province >=", value, "receiver_province");
            return (Criteria) this;
        }

        public Criteria andReceiver_provinceLessThan(String value) {
            addCriterion("receiver_province <", value, "receiver_province");
            return (Criteria) this;
        }

        public Criteria andReceiver_provinceLessThanOrEqualTo(String value) {
            addCriterion("receiver_province <=", value, "receiver_province");
            return (Criteria) this;
        }

        public Criteria andReceiver_provinceLike(String value) {
            addCriterion("receiver_province like", value, "receiver_province");
            return (Criteria) this;
        }

        public Criteria andReceiver_provinceNotLike(String value) {
            addCriterion("receiver_province not like", value, "receiver_province");
            return (Criteria) this;
        }

        public Criteria andReceiver_provinceIn(List<String> values) {
            addCriterion("receiver_province in", values, "receiver_province");
            return (Criteria) this;
        }

        public Criteria andReceiver_provinceNotIn(List<String> values) {
            addCriterion("receiver_province not in", values, "receiver_province");
            return (Criteria) this;
        }

        public Criteria andReceiver_provinceBetween(String value1, String value2) {
            addCriterion("receiver_province between", value1, value2, "receiver_province");
            return (Criteria) this;
        }

        public Criteria andReceiver_provinceNotBetween(String value1, String value2) {
            addCriterion("receiver_province not between", value1, value2, "receiver_province");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityIsNull() {
            addCriterion("receiver_city is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityIsNotNull() {
            addCriterion("receiver_city is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityEqualTo(String value) {
            addCriterion("receiver_city =", value, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityNotEqualTo(String value) {
            addCriterion("receiver_city <>", value, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityGreaterThan(String value) {
            addCriterion("receiver_city >", value, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_city >=", value, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityLessThan(String value) {
            addCriterion("receiver_city <", value, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityLessThanOrEqualTo(String value) {
            addCriterion("receiver_city <=", value, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityLike(String value) {
            addCriterion("receiver_city like", value, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityNotLike(String value) {
            addCriterion("receiver_city not like", value, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityIn(List<String> values) {
            addCriterion("receiver_city in", values, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityNotIn(List<String> values) {
            addCriterion("receiver_city not in", values, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityBetween(String value1, String value2) {
            addCriterion("receiver_city between", value1, value2, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_cityNotBetween(String value1, String value2) {
            addCriterion("receiver_city not between", value1, value2, "receiver_city");
            return (Criteria) this;
        }

        public Criteria andReceiver_regionIsNull() {
            addCriterion("receiver_region is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_regionIsNotNull() {
            addCriterion("receiver_region is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_regionEqualTo(String value) {
            addCriterion("receiver_region =", value, "receiver_region");
            return (Criteria) this;
        }

        public Criteria andReceiver_regionNotEqualTo(String value) {
            addCriterion("receiver_region <>", value, "receiver_region");
            return (Criteria) this;
        }

        public Criteria andReceiver_regionGreaterThan(String value) {
            addCriterion("receiver_region >", value, "receiver_region");
            return (Criteria) this;
        }

        public Criteria andReceiver_regionGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_region >=", value, "receiver_region");
            return (Criteria) this;
        }

        public Criteria andReceiver_regionLessThan(String value) {
            addCriterion("receiver_region <", value, "receiver_region");
            return (Criteria) this;
        }

        public Criteria andReceiver_regionLessThanOrEqualTo(String value) {
            addCriterion("receiver_region <=", value, "receiver_region");
            return (Criteria) this;
        }

        public Criteria andReceiver_regionLike(String value) {
            addCriterion("receiver_region like", value, "receiver_region");
            return (Criteria) this;
        }

        public Criteria andReceiver_regionNotLike(String value) {
            addCriterion("receiver_region not like", value, "receiver_region");
            return (Criteria) this;
        }

        public Criteria andReceiver_regionIn(List<String> values) {
            addCriterion("receiver_region in", values, "receiver_region");
            return (Criteria) this;
        }

        public Criteria andReceiver_regionNotIn(List<String> values) {
            addCriterion("receiver_region not in", values, "receiver_region");
            return (Criteria) this;
        }

        public Criteria andReceiver_regionBetween(String value1, String value2) {
            addCriterion("receiver_region between", value1, value2, "receiver_region");
            return (Criteria) this;
        }

        public Criteria andReceiver_regionNotBetween(String value1, String value2) {
            addCriterion("receiver_region not between", value1, value2, "receiver_region");
            return (Criteria) this;
        }

        public Criteria andReceiver_detail_addressIsNull() {
            addCriterion("receiver_detail_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_detail_addressIsNotNull() {
            addCriterion("receiver_detail_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_detail_addressEqualTo(String value) {
            addCriterion("receiver_detail_address =", value, "receiver_detail_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_detail_addressNotEqualTo(String value) {
            addCriterion("receiver_detail_address <>", value, "receiver_detail_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_detail_addressGreaterThan(String value) {
            addCriterion("receiver_detail_address >", value, "receiver_detail_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_detail_addressGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_detail_address >=", value, "receiver_detail_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_detail_addressLessThan(String value) {
            addCriterion("receiver_detail_address <", value, "receiver_detail_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_detail_addressLessThanOrEqualTo(String value) {
            addCriterion("receiver_detail_address <=", value, "receiver_detail_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_detail_addressLike(String value) {
            addCriterion("receiver_detail_address like", value, "receiver_detail_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_detail_addressNotLike(String value) {
            addCriterion("receiver_detail_address not like", value, "receiver_detail_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_detail_addressIn(List<String> values) {
            addCriterion("receiver_detail_address in", values, "receiver_detail_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_detail_addressNotIn(List<String> values) {
            addCriterion("receiver_detail_address not in", values, "receiver_detail_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_detail_addressBetween(String value1, String value2) {
            addCriterion("receiver_detail_address between", value1, value2, "receiver_detail_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_detail_addressNotBetween(String value1, String value2) {
            addCriterion("receiver_detail_address not between", value1, value2, "receiver_detail_address");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andConfirm_statusIsNull() {
            addCriterion("confirm_status is null");
            return (Criteria) this;
        }

        public Criteria andConfirm_statusIsNotNull() {
            addCriterion("confirm_status is not null");
            return (Criteria) this;
        }

        public Criteria andConfirm_statusEqualTo(Integer value) {
            addCriterion("confirm_status =", value, "confirm_status");
            return (Criteria) this;
        }

        public Criteria andConfirm_statusNotEqualTo(Integer value) {
            addCriterion("confirm_status <>", value, "confirm_status");
            return (Criteria) this;
        }

        public Criteria andConfirm_statusGreaterThan(Integer value) {
            addCriterion("confirm_status >", value, "confirm_status");
            return (Criteria) this;
        }

        public Criteria andConfirm_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_status >=", value, "confirm_status");
            return (Criteria) this;
        }

        public Criteria andConfirm_statusLessThan(Integer value) {
            addCriterion("confirm_status <", value, "confirm_status");
            return (Criteria) this;
        }

        public Criteria andConfirm_statusLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_status <=", value, "confirm_status");
            return (Criteria) this;
        }

        public Criteria andConfirm_statusIn(List<Integer> values) {
            addCriterion("confirm_status in", values, "confirm_status");
            return (Criteria) this;
        }

        public Criteria andConfirm_statusNotIn(List<Integer> values) {
            addCriterion("confirm_status not in", values, "confirm_status");
            return (Criteria) this;
        }

        public Criteria andConfirm_statusBetween(Integer value1, Integer value2) {
            addCriterion("confirm_status between", value1, value2, "confirm_status");
            return (Criteria) this;
        }

        public Criteria andConfirm_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_status not between", value1, value2, "confirm_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusIsNull() {
            addCriterion("delete_status is null");
            return (Criteria) this;
        }

        public Criteria andDelete_statusIsNotNull() {
            addCriterion("delete_status is not null");
            return (Criteria) this;
        }

        public Criteria andDelete_statusEqualTo(Integer value) {
            addCriterion("delete_status =", value, "delete_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusNotEqualTo(Integer value) {
            addCriterion("delete_status <>", value, "delete_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusGreaterThan(Integer value) {
            addCriterion("delete_status >", value, "delete_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_status >=", value, "delete_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusLessThan(Integer value) {
            addCriterion("delete_status <", value, "delete_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusLessThanOrEqualTo(Integer value) {
            addCriterion("delete_status <=", value, "delete_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusIn(List<Integer> values) {
            addCriterion("delete_status in", values, "delete_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusNotIn(List<Integer> values) {
            addCriterion("delete_status not in", values, "delete_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusBetween(Integer value1, Integer value2) {
            addCriterion("delete_status between", value1, value2, "delete_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_status not between", value1, value2, "delete_status");
            return (Criteria) this;
        }

        public Criteria andUse_integrationIsNull() {
            addCriterion("use_integration is null");
            return (Criteria) this;
        }

        public Criteria andUse_integrationIsNotNull() {
            addCriterion("use_integration is not null");
            return (Criteria) this;
        }

        public Criteria andUse_integrationEqualTo(Integer value) {
            addCriterion("use_integration =", value, "use_integration");
            return (Criteria) this;
        }

        public Criteria andUse_integrationNotEqualTo(Integer value) {
            addCriterion("use_integration <>", value, "use_integration");
            return (Criteria) this;
        }

        public Criteria andUse_integrationGreaterThan(Integer value) {
            addCriterion("use_integration >", value, "use_integration");
            return (Criteria) this;
        }

        public Criteria andUse_integrationGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_integration >=", value, "use_integration");
            return (Criteria) this;
        }

        public Criteria andUse_integrationLessThan(Integer value) {
            addCriterion("use_integration <", value, "use_integration");
            return (Criteria) this;
        }

        public Criteria andUse_integrationLessThanOrEqualTo(Integer value) {
            addCriterion("use_integration <=", value, "use_integration");
            return (Criteria) this;
        }

        public Criteria andUse_integrationIn(List<Integer> values) {
            addCriterion("use_integration in", values, "use_integration");
            return (Criteria) this;
        }

        public Criteria andUse_integrationNotIn(List<Integer> values) {
            addCriterion("use_integration not in", values, "use_integration");
            return (Criteria) this;
        }

        public Criteria andUse_integrationBetween(Integer value1, Integer value2) {
            addCriterion("use_integration between", value1, value2, "use_integration");
            return (Criteria) this;
        }

        public Criteria andUse_integrationNotBetween(Integer value1, Integer value2) {
            addCriterion("use_integration not between", value1, value2, "use_integration");
            return (Criteria) this;
        }

        public Criteria andPayment_timeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPayment_timeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayment_timeEqualTo(Date value) {
            addCriterion("payment_time =", value, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeLessThan(Date value) {
            addCriterion("payment_time <", value, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeIn(List<Date> values) {
            addCriterion("payment_time in", values, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeNotIn(List<Date> values) {
            addCriterion("payment_time not in", values, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeBetween(Date value1, Date value2) {
            addCriterion("payment_time between", value1, value2, "payment_time");
            return (Criteria) this;
        }

        public Criteria andPayment_timeNotBetween(Date value1, Date value2) {
            addCriterion("payment_time not between", value1, value2, "payment_time");
            return (Criteria) this;
        }

        public Criteria andDelivery_timeIsNull() {
            addCriterion("delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andDelivery_timeIsNotNull() {
            addCriterion("delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andDelivery_timeEqualTo(Date value) {
            addCriterion("delivery_time =", value, "delivery_time");
            return (Criteria) this;
        }

        public Criteria andDelivery_timeNotEqualTo(Date value) {
            addCriterion("delivery_time <>", value, "delivery_time");
            return (Criteria) this;
        }

        public Criteria andDelivery_timeGreaterThan(Date value) {
            addCriterion("delivery_time >", value, "delivery_time");
            return (Criteria) this;
        }

        public Criteria andDelivery_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("delivery_time >=", value, "delivery_time");
            return (Criteria) this;
        }

        public Criteria andDelivery_timeLessThan(Date value) {
            addCriterion("delivery_time <", value, "delivery_time");
            return (Criteria) this;
        }

        public Criteria andDelivery_timeLessThanOrEqualTo(Date value) {
            addCriterion("delivery_time <=", value, "delivery_time");
            return (Criteria) this;
        }

        public Criteria andDelivery_timeIn(List<Date> values) {
            addCriterion("delivery_time in", values, "delivery_time");
            return (Criteria) this;
        }

        public Criteria andDelivery_timeNotIn(List<Date> values) {
            addCriterion("delivery_time not in", values, "delivery_time");
            return (Criteria) this;
        }

        public Criteria andDelivery_timeBetween(Date value1, Date value2) {
            addCriterion("delivery_time between", value1, value2, "delivery_time");
            return (Criteria) this;
        }

        public Criteria andDelivery_timeNotBetween(Date value1, Date value2) {
            addCriterion("delivery_time not between", value1, value2, "delivery_time");
            return (Criteria) this;
        }

        public Criteria andReceive_timeIsNull() {
            addCriterion("receive_time is null");
            return (Criteria) this;
        }

        public Criteria andReceive_timeIsNotNull() {
            addCriterion("receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceive_timeEqualTo(Date value) {
            addCriterion("receive_time =", value, "receive_time");
            return (Criteria) this;
        }

        public Criteria andReceive_timeNotEqualTo(Date value) {
            addCriterion("receive_time <>", value, "receive_time");
            return (Criteria) this;
        }

        public Criteria andReceive_timeGreaterThan(Date value) {
            addCriterion("receive_time >", value, "receive_time");
            return (Criteria) this;
        }

        public Criteria andReceive_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_time >=", value, "receive_time");
            return (Criteria) this;
        }

        public Criteria andReceive_timeLessThan(Date value) {
            addCriterion("receive_time <", value, "receive_time");
            return (Criteria) this;
        }

        public Criteria andReceive_timeLessThanOrEqualTo(Date value) {
            addCriterion("receive_time <=", value, "receive_time");
            return (Criteria) this;
        }

        public Criteria andReceive_timeIn(List<Date> values) {
            addCriterion("receive_time in", values, "receive_time");
            return (Criteria) this;
        }

        public Criteria andReceive_timeNotIn(List<Date> values) {
            addCriterion("receive_time not in", values, "receive_time");
            return (Criteria) this;
        }

        public Criteria andReceive_timeBetween(Date value1, Date value2) {
            addCriterion("receive_time between", value1, value2, "receive_time");
            return (Criteria) this;
        }

        public Criteria andReceive_timeNotBetween(Date value1, Date value2) {
            addCriterion("receive_time not between", value1, value2, "receive_time");
            return (Criteria) this;
        }

        public Criteria andComment_timeIsNull() {
            addCriterion("comment_time is null");
            return (Criteria) this;
        }

        public Criteria andComment_timeIsNotNull() {
            addCriterion("comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andComment_timeEqualTo(Date value) {
            addCriterion("comment_time =", value, "comment_time");
            return (Criteria) this;
        }

        public Criteria andComment_timeNotEqualTo(Date value) {
            addCriterion("comment_time <>", value, "comment_time");
            return (Criteria) this;
        }

        public Criteria andComment_timeGreaterThan(Date value) {
            addCriterion("comment_time >", value, "comment_time");
            return (Criteria) this;
        }

        public Criteria andComment_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_time >=", value, "comment_time");
            return (Criteria) this;
        }

        public Criteria andComment_timeLessThan(Date value) {
            addCriterion("comment_time <", value, "comment_time");
            return (Criteria) this;
        }

        public Criteria andComment_timeLessThanOrEqualTo(Date value) {
            addCriterion("comment_time <=", value, "comment_time");
            return (Criteria) this;
        }

        public Criteria andComment_timeIn(List<Date> values) {
            addCriterion("comment_time in", values, "comment_time");
            return (Criteria) this;
        }

        public Criteria andComment_timeNotIn(List<Date> values) {
            addCriterion("comment_time not in", values, "comment_time");
            return (Criteria) this;
        }

        public Criteria andComment_timeBetween(Date value1, Date value2) {
            addCriterion("comment_time between", value1, value2, "comment_time");
            return (Criteria) this;
        }

        public Criteria andComment_timeNotBetween(Date value1, Date value2) {
            addCriterion("comment_time not between", value1, value2, "comment_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModify_timeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModify_timeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeLessThan(Date value) {
            addCriterion("modify_time <", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modify_time");
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