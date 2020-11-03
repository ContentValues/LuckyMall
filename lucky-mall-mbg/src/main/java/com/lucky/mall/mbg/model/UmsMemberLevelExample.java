package com.lucky.mall.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UmsMemberLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsMemberLevelExample() {
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

        public Criteria andGrowth_pointIsNull() {
            addCriterion("growth_point is null");
            return (Criteria) this;
        }

        public Criteria andGrowth_pointIsNotNull() {
            addCriterion("growth_point is not null");
            return (Criteria) this;
        }

        public Criteria andGrowth_pointEqualTo(Integer value) {
            addCriterion("growth_point =", value, "growth_point");
            return (Criteria) this;
        }

        public Criteria andGrowth_pointNotEqualTo(Integer value) {
            addCriterion("growth_point <>", value, "growth_point");
            return (Criteria) this;
        }

        public Criteria andGrowth_pointGreaterThan(Integer value) {
            addCriterion("growth_point >", value, "growth_point");
            return (Criteria) this;
        }

        public Criteria andGrowth_pointGreaterThanOrEqualTo(Integer value) {
            addCriterion("growth_point >=", value, "growth_point");
            return (Criteria) this;
        }

        public Criteria andGrowth_pointLessThan(Integer value) {
            addCriterion("growth_point <", value, "growth_point");
            return (Criteria) this;
        }

        public Criteria andGrowth_pointLessThanOrEqualTo(Integer value) {
            addCriterion("growth_point <=", value, "growth_point");
            return (Criteria) this;
        }

        public Criteria andGrowth_pointIn(List<Integer> values) {
            addCriterion("growth_point in", values, "growth_point");
            return (Criteria) this;
        }

        public Criteria andGrowth_pointNotIn(List<Integer> values) {
            addCriterion("growth_point not in", values, "growth_point");
            return (Criteria) this;
        }

        public Criteria andGrowth_pointBetween(Integer value1, Integer value2) {
            addCriterion("growth_point between", value1, value2, "growth_point");
            return (Criteria) this;
        }

        public Criteria andGrowth_pointNotBetween(Integer value1, Integer value2) {
            addCriterion("growth_point not between", value1, value2, "growth_point");
            return (Criteria) this;
        }

        public Criteria andDefault_statusIsNull() {
            addCriterion("default_status is null");
            return (Criteria) this;
        }

        public Criteria andDefault_statusIsNotNull() {
            addCriterion("default_status is not null");
            return (Criteria) this;
        }

        public Criteria andDefault_statusEqualTo(Integer value) {
            addCriterion("default_status =", value, "default_status");
            return (Criteria) this;
        }

        public Criteria andDefault_statusNotEqualTo(Integer value) {
            addCriterion("default_status <>", value, "default_status");
            return (Criteria) this;
        }

        public Criteria andDefault_statusGreaterThan(Integer value) {
            addCriterion("default_status >", value, "default_status");
            return (Criteria) this;
        }

        public Criteria andDefault_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("default_status >=", value, "default_status");
            return (Criteria) this;
        }

        public Criteria andDefault_statusLessThan(Integer value) {
            addCriterion("default_status <", value, "default_status");
            return (Criteria) this;
        }

        public Criteria andDefault_statusLessThanOrEqualTo(Integer value) {
            addCriterion("default_status <=", value, "default_status");
            return (Criteria) this;
        }

        public Criteria andDefault_statusIn(List<Integer> values) {
            addCriterion("default_status in", values, "default_status");
            return (Criteria) this;
        }

        public Criteria andDefault_statusNotIn(List<Integer> values) {
            addCriterion("default_status not in", values, "default_status");
            return (Criteria) this;
        }

        public Criteria andDefault_statusBetween(Integer value1, Integer value2) {
            addCriterion("default_status between", value1, value2, "default_status");
            return (Criteria) this;
        }

        public Criteria andDefault_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("default_status not between", value1, value2, "default_status");
            return (Criteria) this;
        }

        public Criteria andFree_freight_pointIsNull() {
            addCriterion("free_freight_point is null");
            return (Criteria) this;
        }

        public Criteria andFree_freight_pointIsNotNull() {
            addCriterion("free_freight_point is not null");
            return (Criteria) this;
        }

        public Criteria andFree_freight_pointEqualTo(BigDecimal value) {
            addCriterion("free_freight_point =", value, "free_freight_point");
            return (Criteria) this;
        }

        public Criteria andFree_freight_pointNotEqualTo(BigDecimal value) {
            addCriterion("free_freight_point <>", value, "free_freight_point");
            return (Criteria) this;
        }

        public Criteria andFree_freight_pointGreaterThan(BigDecimal value) {
            addCriterion("free_freight_point >", value, "free_freight_point");
            return (Criteria) this;
        }

        public Criteria andFree_freight_pointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("free_freight_point >=", value, "free_freight_point");
            return (Criteria) this;
        }

        public Criteria andFree_freight_pointLessThan(BigDecimal value) {
            addCriterion("free_freight_point <", value, "free_freight_point");
            return (Criteria) this;
        }

        public Criteria andFree_freight_pointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("free_freight_point <=", value, "free_freight_point");
            return (Criteria) this;
        }

        public Criteria andFree_freight_pointIn(List<BigDecimal> values) {
            addCriterion("free_freight_point in", values, "free_freight_point");
            return (Criteria) this;
        }

        public Criteria andFree_freight_pointNotIn(List<BigDecimal> values) {
            addCriterion("free_freight_point not in", values, "free_freight_point");
            return (Criteria) this;
        }

        public Criteria andFree_freight_pointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("free_freight_point between", value1, value2, "free_freight_point");
            return (Criteria) this;
        }

        public Criteria andFree_freight_pointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("free_freight_point not between", value1, value2, "free_freight_point");
            return (Criteria) this;
        }

        public Criteria andComment_growth_pointIsNull() {
            addCriterion("comment_growth_point is null");
            return (Criteria) this;
        }

        public Criteria andComment_growth_pointIsNotNull() {
            addCriterion("comment_growth_point is not null");
            return (Criteria) this;
        }

        public Criteria andComment_growth_pointEqualTo(Integer value) {
            addCriterion("comment_growth_point =", value, "comment_growth_point");
            return (Criteria) this;
        }

        public Criteria andComment_growth_pointNotEqualTo(Integer value) {
            addCriterion("comment_growth_point <>", value, "comment_growth_point");
            return (Criteria) this;
        }

        public Criteria andComment_growth_pointGreaterThan(Integer value) {
            addCriterion("comment_growth_point >", value, "comment_growth_point");
            return (Criteria) this;
        }

        public Criteria andComment_growth_pointGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_growth_point >=", value, "comment_growth_point");
            return (Criteria) this;
        }

        public Criteria andComment_growth_pointLessThan(Integer value) {
            addCriterion("comment_growth_point <", value, "comment_growth_point");
            return (Criteria) this;
        }

        public Criteria andComment_growth_pointLessThanOrEqualTo(Integer value) {
            addCriterion("comment_growth_point <=", value, "comment_growth_point");
            return (Criteria) this;
        }

        public Criteria andComment_growth_pointIn(List<Integer> values) {
            addCriterion("comment_growth_point in", values, "comment_growth_point");
            return (Criteria) this;
        }

        public Criteria andComment_growth_pointNotIn(List<Integer> values) {
            addCriterion("comment_growth_point not in", values, "comment_growth_point");
            return (Criteria) this;
        }

        public Criteria andComment_growth_pointBetween(Integer value1, Integer value2) {
            addCriterion("comment_growth_point between", value1, value2, "comment_growth_point");
            return (Criteria) this;
        }

        public Criteria andComment_growth_pointNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_growth_point not between", value1, value2, "comment_growth_point");
            return (Criteria) this;
        }

        public Criteria andPriviledge_free_freightIsNull() {
            addCriterion("priviledge_free_freight is null");
            return (Criteria) this;
        }

        public Criteria andPriviledge_free_freightIsNotNull() {
            addCriterion("priviledge_free_freight is not null");
            return (Criteria) this;
        }

        public Criteria andPriviledge_free_freightEqualTo(Integer value) {
            addCriterion("priviledge_free_freight =", value, "priviledge_free_freight");
            return (Criteria) this;
        }

        public Criteria andPriviledge_free_freightNotEqualTo(Integer value) {
            addCriterion("priviledge_free_freight <>", value, "priviledge_free_freight");
            return (Criteria) this;
        }

        public Criteria andPriviledge_free_freightGreaterThan(Integer value) {
            addCriterion("priviledge_free_freight >", value, "priviledge_free_freight");
            return (Criteria) this;
        }

        public Criteria andPriviledge_free_freightGreaterThanOrEqualTo(Integer value) {
            addCriterion("priviledge_free_freight >=", value, "priviledge_free_freight");
            return (Criteria) this;
        }

        public Criteria andPriviledge_free_freightLessThan(Integer value) {
            addCriterion("priviledge_free_freight <", value, "priviledge_free_freight");
            return (Criteria) this;
        }

        public Criteria andPriviledge_free_freightLessThanOrEqualTo(Integer value) {
            addCriterion("priviledge_free_freight <=", value, "priviledge_free_freight");
            return (Criteria) this;
        }

        public Criteria andPriviledge_free_freightIn(List<Integer> values) {
            addCriterion("priviledge_free_freight in", values, "priviledge_free_freight");
            return (Criteria) this;
        }

        public Criteria andPriviledge_free_freightNotIn(List<Integer> values) {
            addCriterion("priviledge_free_freight not in", values, "priviledge_free_freight");
            return (Criteria) this;
        }

        public Criteria andPriviledge_free_freightBetween(Integer value1, Integer value2) {
            addCriterion("priviledge_free_freight between", value1, value2, "priviledge_free_freight");
            return (Criteria) this;
        }

        public Criteria andPriviledge_free_freightNotBetween(Integer value1, Integer value2) {
            addCriterion("priviledge_free_freight not between", value1, value2, "priviledge_free_freight");
            return (Criteria) this;
        }

        public Criteria andPriviledge_sign_inIsNull() {
            addCriterion("priviledge_sign_in is null");
            return (Criteria) this;
        }

        public Criteria andPriviledge_sign_inIsNotNull() {
            addCriterion("priviledge_sign_in is not null");
            return (Criteria) this;
        }

        public Criteria andPriviledge_sign_inEqualTo(Integer value) {
            addCriterion("priviledge_sign_in =", value, "priviledge_sign_in");
            return (Criteria) this;
        }

        public Criteria andPriviledge_sign_inNotEqualTo(Integer value) {
            addCriterion("priviledge_sign_in <>", value, "priviledge_sign_in");
            return (Criteria) this;
        }

        public Criteria andPriviledge_sign_inGreaterThan(Integer value) {
            addCriterion("priviledge_sign_in >", value, "priviledge_sign_in");
            return (Criteria) this;
        }

        public Criteria andPriviledge_sign_inGreaterThanOrEqualTo(Integer value) {
            addCriterion("priviledge_sign_in >=", value, "priviledge_sign_in");
            return (Criteria) this;
        }

        public Criteria andPriviledge_sign_inLessThan(Integer value) {
            addCriterion("priviledge_sign_in <", value, "priviledge_sign_in");
            return (Criteria) this;
        }

        public Criteria andPriviledge_sign_inLessThanOrEqualTo(Integer value) {
            addCriterion("priviledge_sign_in <=", value, "priviledge_sign_in");
            return (Criteria) this;
        }

        public Criteria andPriviledge_sign_inIn(List<Integer> values) {
            addCriterion("priviledge_sign_in in", values, "priviledge_sign_in");
            return (Criteria) this;
        }

        public Criteria andPriviledge_sign_inNotIn(List<Integer> values) {
            addCriterion("priviledge_sign_in not in", values, "priviledge_sign_in");
            return (Criteria) this;
        }

        public Criteria andPriviledge_sign_inBetween(Integer value1, Integer value2) {
            addCriterion("priviledge_sign_in between", value1, value2, "priviledge_sign_in");
            return (Criteria) this;
        }

        public Criteria andPriviledge_sign_inNotBetween(Integer value1, Integer value2) {
            addCriterion("priviledge_sign_in not between", value1, value2, "priviledge_sign_in");
            return (Criteria) this;
        }

        public Criteria andPriviledge_commentIsNull() {
            addCriterion("priviledge_comment is null");
            return (Criteria) this;
        }

        public Criteria andPriviledge_commentIsNotNull() {
            addCriterion("priviledge_comment is not null");
            return (Criteria) this;
        }

        public Criteria andPriviledge_commentEqualTo(Integer value) {
            addCriterion("priviledge_comment =", value, "priviledge_comment");
            return (Criteria) this;
        }

        public Criteria andPriviledge_commentNotEqualTo(Integer value) {
            addCriterion("priviledge_comment <>", value, "priviledge_comment");
            return (Criteria) this;
        }

        public Criteria andPriviledge_commentGreaterThan(Integer value) {
            addCriterion("priviledge_comment >", value, "priviledge_comment");
            return (Criteria) this;
        }

        public Criteria andPriviledge_commentGreaterThanOrEqualTo(Integer value) {
            addCriterion("priviledge_comment >=", value, "priviledge_comment");
            return (Criteria) this;
        }

        public Criteria andPriviledge_commentLessThan(Integer value) {
            addCriterion("priviledge_comment <", value, "priviledge_comment");
            return (Criteria) this;
        }

        public Criteria andPriviledge_commentLessThanOrEqualTo(Integer value) {
            addCriterion("priviledge_comment <=", value, "priviledge_comment");
            return (Criteria) this;
        }

        public Criteria andPriviledge_commentIn(List<Integer> values) {
            addCriterion("priviledge_comment in", values, "priviledge_comment");
            return (Criteria) this;
        }

        public Criteria andPriviledge_commentNotIn(List<Integer> values) {
            addCriterion("priviledge_comment not in", values, "priviledge_comment");
            return (Criteria) this;
        }

        public Criteria andPriviledge_commentBetween(Integer value1, Integer value2) {
            addCriterion("priviledge_comment between", value1, value2, "priviledge_comment");
            return (Criteria) this;
        }

        public Criteria andPriviledge_commentNotBetween(Integer value1, Integer value2) {
            addCriterion("priviledge_comment not between", value1, value2, "priviledge_comment");
            return (Criteria) this;
        }

        public Criteria andPriviledge_promotionIsNull() {
            addCriterion("priviledge_promotion is null");
            return (Criteria) this;
        }

        public Criteria andPriviledge_promotionIsNotNull() {
            addCriterion("priviledge_promotion is not null");
            return (Criteria) this;
        }

        public Criteria andPriviledge_promotionEqualTo(Integer value) {
            addCriterion("priviledge_promotion =", value, "priviledge_promotion");
            return (Criteria) this;
        }

        public Criteria andPriviledge_promotionNotEqualTo(Integer value) {
            addCriterion("priviledge_promotion <>", value, "priviledge_promotion");
            return (Criteria) this;
        }

        public Criteria andPriviledge_promotionGreaterThan(Integer value) {
            addCriterion("priviledge_promotion >", value, "priviledge_promotion");
            return (Criteria) this;
        }

        public Criteria andPriviledge_promotionGreaterThanOrEqualTo(Integer value) {
            addCriterion("priviledge_promotion >=", value, "priviledge_promotion");
            return (Criteria) this;
        }

        public Criteria andPriviledge_promotionLessThan(Integer value) {
            addCriterion("priviledge_promotion <", value, "priviledge_promotion");
            return (Criteria) this;
        }

        public Criteria andPriviledge_promotionLessThanOrEqualTo(Integer value) {
            addCriterion("priviledge_promotion <=", value, "priviledge_promotion");
            return (Criteria) this;
        }

        public Criteria andPriviledge_promotionIn(List<Integer> values) {
            addCriterion("priviledge_promotion in", values, "priviledge_promotion");
            return (Criteria) this;
        }

        public Criteria andPriviledge_promotionNotIn(List<Integer> values) {
            addCriterion("priviledge_promotion not in", values, "priviledge_promotion");
            return (Criteria) this;
        }

        public Criteria andPriviledge_promotionBetween(Integer value1, Integer value2) {
            addCriterion("priviledge_promotion between", value1, value2, "priviledge_promotion");
            return (Criteria) this;
        }

        public Criteria andPriviledge_promotionNotBetween(Integer value1, Integer value2) {
            addCriterion("priviledge_promotion not between", value1, value2, "priviledge_promotion");
            return (Criteria) this;
        }

        public Criteria andPriviledge_member_priceIsNull() {
            addCriterion("priviledge_member_price is null");
            return (Criteria) this;
        }

        public Criteria andPriviledge_member_priceIsNotNull() {
            addCriterion("priviledge_member_price is not null");
            return (Criteria) this;
        }

        public Criteria andPriviledge_member_priceEqualTo(Integer value) {
            addCriterion("priviledge_member_price =", value, "priviledge_member_price");
            return (Criteria) this;
        }

        public Criteria andPriviledge_member_priceNotEqualTo(Integer value) {
            addCriterion("priviledge_member_price <>", value, "priviledge_member_price");
            return (Criteria) this;
        }

        public Criteria andPriviledge_member_priceGreaterThan(Integer value) {
            addCriterion("priviledge_member_price >", value, "priviledge_member_price");
            return (Criteria) this;
        }

        public Criteria andPriviledge_member_priceGreaterThanOrEqualTo(Integer value) {
            addCriterion("priviledge_member_price >=", value, "priviledge_member_price");
            return (Criteria) this;
        }

        public Criteria andPriviledge_member_priceLessThan(Integer value) {
            addCriterion("priviledge_member_price <", value, "priviledge_member_price");
            return (Criteria) this;
        }

        public Criteria andPriviledge_member_priceLessThanOrEqualTo(Integer value) {
            addCriterion("priviledge_member_price <=", value, "priviledge_member_price");
            return (Criteria) this;
        }

        public Criteria andPriviledge_member_priceIn(List<Integer> values) {
            addCriterion("priviledge_member_price in", values, "priviledge_member_price");
            return (Criteria) this;
        }

        public Criteria andPriviledge_member_priceNotIn(List<Integer> values) {
            addCriterion("priviledge_member_price not in", values, "priviledge_member_price");
            return (Criteria) this;
        }

        public Criteria andPriviledge_member_priceBetween(Integer value1, Integer value2) {
            addCriterion("priviledge_member_price between", value1, value2, "priviledge_member_price");
            return (Criteria) this;
        }

        public Criteria andPriviledge_member_priceNotBetween(Integer value1, Integer value2) {
            addCriterion("priviledge_member_price not between", value1, value2, "priviledge_member_price");
            return (Criteria) this;
        }

        public Criteria andPriviledge_birthdayIsNull() {
            addCriterion("priviledge_birthday is null");
            return (Criteria) this;
        }

        public Criteria andPriviledge_birthdayIsNotNull() {
            addCriterion("priviledge_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andPriviledge_birthdayEqualTo(Integer value) {
            addCriterion("priviledge_birthday =", value, "priviledge_birthday");
            return (Criteria) this;
        }

        public Criteria andPriviledge_birthdayNotEqualTo(Integer value) {
            addCriterion("priviledge_birthday <>", value, "priviledge_birthday");
            return (Criteria) this;
        }

        public Criteria andPriviledge_birthdayGreaterThan(Integer value) {
            addCriterion("priviledge_birthday >", value, "priviledge_birthday");
            return (Criteria) this;
        }

        public Criteria andPriviledge_birthdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("priviledge_birthday >=", value, "priviledge_birthday");
            return (Criteria) this;
        }

        public Criteria andPriviledge_birthdayLessThan(Integer value) {
            addCriterion("priviledge_birthday <", value, "priviledge_birthday");
            return (Criteria) this;
        }

        public Criteria andPriviledge_birthdayLessThanOrEqualTo(Integer value) {
            addCriterion("priviledge_birthday <=", value, "priviledge_birthday");
            return (Criteria) this;
        }

        public Criteria andPriviledge_birthdayIn(List<Integer> values) {
            addCriterion("priviledge_birthday in", values, "priviledge_birthday");
            return (Criteria) this;
        }

        public Criteria andPriviledge_birthdayNotIn(List<Integer> values) {
            addCriterion("priviledge_birthday not in", values, "priviledge_birthday");
            return (Criteria) this;
        }

        public Criteria andPriviledge_birthdayBetween(Integer value1, Integer value2) {
            addCriterion("priviledge_birthday between", value1, value2, "priviledge_birthday");
            return (Criteria) this;
        }

        public Criteria andPriviledge_birthdayNotBetween(Integer value1, Integer value2) {
            addCriterion("priviledge_birthday not between", value1, value2, "priviledge_birthday");
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