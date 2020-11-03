package com.lucky.mall.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmsCartItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsCartItemExample() {
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

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
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

        public Criteria andProduct_sub_titleIsNull() {
            addCriterion("product_sub_title is null");
            return (Criteria) this;
        }

        public Criteria andProduct_sub_titleIsNotNull() {
            addCriterion("product_sub_title is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_sub_titleEqualTo(String value) {
            addCriterion("product_sub_title =", value, "product_sub_title");
            return (Criteria) this;
        }

        public Criteria andProduct_sub_titleNotEqualTo(String value) {
            addCriterion("product_sub_title <>", value, "product_sub_title");
            return (Criteria) this;
        }

        public Criteria andProduct_sub_titleGreaterThan(String value) {
            addCriterion("product_sub_title >", value, "product_sub_title");
            return (Criteria) this;
        }

        public Criteria andProduct_sub_titleGreaterThanOrEqualTo(String value) {
            addCriterion("product_sub_title >=", value, "product_sub_title");
            return (Criteria) this;
        }

        public Criteria andProduct_sub_titleLessThan(String value) {
            addCriterion("product_sub_title <", value, "product_sub_title");
            return (Criteria) this;
        }

        public Criteria andProduct_sub_titleLessThanOrEqualTo(String value) {
            addCriterion("product_sub_title <=", value, "product_sub_title");
            return (Criteria) this;
        }

        public Criteria andProduct_sub_titleLike(String value) {
            addCriterion("product_sub_title like", value, "product_sub_title");
            return (Criteria) this;
        }

        public Criteria andProduct_sub_titleNotLike(String value) {
            addCriterion("product_sub_title not like", value, "product_sub_title");
            return (Criteria) this;
        }

        public Criteria andProduct_sub_titleIn(List<String> values) {
            addCriterion("product_sub_title in", values, "product_sub_title");
            return (Criteria) this;
        }

        public Criteria andProduct_sub_titleNotIn(List<String> values) {
            addCriterion("product_sub_title not in", values, "product_sub_title");
            return (Criteria) this;
        }

        public Criteria andProduct_sub_titleBetween(String value1, String value2) {
            addCriterion("product_sub_title between", value1, value2, "product_sub_title");
            return (Criteria) this;
        }

        public Criteria andProduct_sub_titleNotBetween(String value1, String value2) {
            addCriterion("product_sub_title not between", value1, value2, "product_sub_title");
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

        public Criteria andMember_nicknameIsNull() {
            addCriterion("member_nickname is null");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameIsNotNull() {
            addCriterion("member_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameEqualTo(String value) {
            addCriterion("member_nickname =", value, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameNotEqualTo(String value) {
            addCriterion("member_nickname <>", value, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameGreaterThan(String value) {
            addCriterion("member_nickname >", value, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameGreaterThanOrEqualTo(String value) {
            addCriterion("member_nickname >=", value, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameLessThan(String value) {
            addCriterion("member_nickname <", value, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameLessThanOrEqualTo(String value) {
            addCriterion("member_nickname <=", value, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameLike(String value) {
            addCriterion("member_nickname like", value, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameNotLike(String value) {
            addCriterion("member_nickname not like", value, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameIn(List<String> values) {
            addCriterion("member_nickname in", values, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameNotIn(List<String> values) {
            addCriterion("member_nickname not in", values, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameBetween(String value1, String value2) {
            addCriterion("member_nickname between", value1, value2, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andMember_nicknameNotBetween(String value1, String value2) {
            addCriterion("member_nickname not between", value1, value2, "member_nickname");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_dateEqualTo(Date value) {
            addCriterion("create_date =", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateGreaterThan(Date value) {
            addCriterion("create_date >", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateLessThan(Date value) {
            addCriterion("create_date <", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIn(List<Date> values) {
            addCriterion("create_date in", values, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "create_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModify_dateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModify_dateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateLessThan(Date value) {
            addCriterion("modify_date <", value, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modify_date");
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