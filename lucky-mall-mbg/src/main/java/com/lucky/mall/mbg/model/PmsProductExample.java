package com.lucky.mall.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsProductExample() {
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

        public Criteria andBrand_idIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrand_idIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrand_idEqualTo(Long value) {
            addCriterion("brand_id =", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idNotEqualTo(Long value) {
            addCriterion("brand_id <>", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idGreaterThan(Long value) {
            addCriterion("brand_id >", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idGreaterThanOrEqualTo(Long value) {
            addCriterion("brand_id >=", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idLessThan(Long value) {
            addCriterion("brand_id <", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idLessThanOrEqualTo(Long value) {
            addCriterion("brand_id <=", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idIn(List<Long> values) {
            addCriterion("brand_id in", values, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idNotIn(List<Long> values) {
            addCriterion("brand_id not in", values, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idBetween(Long value1, Long value2) {
            addCriterion("brand_id between", value1, value2, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idNotBetween(Long value1, Long value2) {
            addCriterion("brand_id not between", value1, value2, "brand_id");
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

        public Criteria andFeight_template_idIsNull() {
            addCriterion("feight_template_id is null");
            return (Criteria) this;
        }

        public Criteria andFeight_template_idIsNotNull() {
            addCriterion("feight_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeight_template_idEqualTo(Long value) {
            addCriterion("feight_template_id =", value, "feight_template_id");
            return (Criteria) this;
        }

        public Criteria andFeight_template_idNotEqualTo(Long value) {
            addCriterion("feight_template_id <>", value, "feight_template_id");
            return (Criteria) this;
        }

        public Criteria andFeight_template_idGreaterThan(Long value) {
            addCriterion("feight_template_id >", value, "feight_template_id");
            return (Criteria) this;
        }

        public Criteria andFeight_template_idGreaterThanOrEqualTo(Long value) {
            addCriterion("feight_template_id >=", value, "feight_template_id");
            return (Criteria) this;
        }

        public Criteria andFeight_template_idLessThan(Long value) {
            addCriterion("feight_template_id <", value, "feight_template_id");
            return (Criteria) this;
        }

        public Criteria andFeight_template_idLessThanOrEqualTo(Long value) {
            addCriterion("feight_template_id <=", value, "feight_template_id");
            return (Criteria) this;
        }

        public Criteria andFeight_template_idIn(List<Long> values) {
            addCriterion("feight_template_id in", values, "feight_template_id");
            return (Criteria) this;
        }

        public Criteria andFeight_template_idNotIn(List<Long> values) {
            addCriterion("feight_template_id not in", values, "feight_template_id");
            return (Criteria) this;
        }

        public Criteria andFeight_template_idBetween(Long value1, Long value2) {
            addCriterion("feight_template_id between", value1, value2, "feight_template_id");
            return (Criteria) this;
        }

        public Criteria andFeight_template_idNotBetween(Long value1, Long value2) {
            addCriterion("feight_template_id not between", value1, value2, "feight_template_id");
            return (Criteria) this;
        }

        public Criteria andProduct_attribute_category_idIsNull() {
            addCriterion("product_attribute_category_id is null");
            return (Criteria) this;
        }

        public Criteria andProduct_attribute_category_idIsNotNull() {
            addCriterion("product_attribute_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_attribute_category_idEqualTo(Long value) {
            addCriterion("product_attribute_category_id =", value, "product_attribute_category_id");
            return (Criteria) this;
        }

        public Criteria andProduct_attribute_category_idNotEqualTo(Long value) {
            addCriterion("product_attribute_category_id <>", value, "product_attribute_category_id");
            return (Criteria) this;
        }

        public Criteria andProduct_attribute_category_idGreaterThan(Long value) {
            addCriterion("product_attribute_category_id >", value, "product_attribute_category_id");
            return (Criteria) this;
        }

        public Criteria andProduct_attribute_category_idGreaterThanOrEqualTo(Long value) {
            addCriterion("product_attribute_category_id >=", value, "product_attribute_category_id");
            return (Criteria) this;
        }

        public Criteria andProduct_attribute_category_idLessThan(Long value) {
            addCriterion("product_attribute_category_id <", value, "product_attribute_category_id");
            return (Criteria) this;
        }

        public Criteria andProduct_attribute_category_idLessThanOrEqualTo(Long value) {
            addCriterion("product_attribute_category_id <=", value, "product_attribute_category_id");
            return (Criteria) this;
        }

        public Criteria andProduct_attribute_category_idIn(List<Long> values) {
            addCriterion("product_attribute_category_id in", values, "product_attribute_category_id");
            return (Criteria) this;
        }

        public Criteria andProduct_attribute_category_idNotIn(List<Long> values) {
            addCriterion("product_attribute_category_id not in", values, "product_attribute_category_id");
            return (Criteria) this;
        }

        public Criteria andProduct_attribute_category_idBetween(Long value1, Long value2) {
            addCriterion("product_attribute_category_id between", value1, value2, "product_attribute_category_id");
            return (Criteria) this;
        }

        public Criteria andProduct_attribute_category_idNotBetween(Long value1, Long value2) {
            addCriterion("product_attribute_category_id not between", value1, value2, "product_attribute_category_id");
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

        public Criteria andPublish_statusIsNull() {
            addCriterion("publish_status is null");
            return (Criteria) this;
        }

        public Criteria andPublish_statusIsNotNull() {
            addCriterion("publish_status is not null");
            return (Criteria) this;
        }

        public Criteria andPublish_statusEqualTo(Integer value) {
            addCriterion("publish_status =", value, "publish_status");
            return (Criteria) this;
        }

        public Criteria andPublish_statusNotEqualTo(Integer value) {
            addCriterion("publish_status <>", value, "publish_status");
            return (Criteria) this;
        }

        public Criteria andPublish_statusGreaterThan(Integer value) {
            addCriterion("publish_status >", value, "publish_status");
            return (Criteria) this;
        }

        public Criteria andPublish_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_status >=", value, "publish_status");
            return (Criteria) this;
        }

        public Criteria andPublish_statusLessThan(Integer value) {
            addCriterion("publish_status <", value, "publish_status");
            return (Criteria) this;
        }

        public Criteria andPublish_statusLessThanOrEqualTo(Integer value) {
            addCriterion("publish_status <=", value, "publish_status");
            return (Criteria) this;
        }

        public Criteria andPublish_statusIn(List<Integer> values) {
            addCriterion("publish_status in", values, "publish_status");
            return (Criteria) this;
        }

        public Criteria andPublish_statusNotIn(List<Integer> values) {
            addCriterion("publish_status not in", values, "publish_status");
            return (Criteria) this;
        }

        public Criteria andPublish_statusBetween(Integer value1, Integer value2) {
            addCriterion("publish_status between", value1, value2, "publish_status");
            return (Criteria) this;
        }

        public Criteria andPublish_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_status not between", value1, value2, "publish_status");
            return (Criteria) this;
        }

        public Criteria andNew_statusIsNull() {
            addCriterion("new_status is null");
            return (Criteria) this;
        }

        public Criteria andNew_statusIsNotNull() {
            addCriterion("new_status is not null");
            return (Criteria) this;
        }

        public Criteria andNew_statusEqualTo(Integer value) {
            addCriterion("new_status =", value, "new_status");
            return (Criteria) this;
        }

        public Criteria andNew_statusNotEqualTo(Integer value) {
            addCriterion("new_status <>", value, "new_status");
            return (Criteria) this;
        }

        public Criteria andNew_statusGreaterThan(Integer value) {
            addCriterion("new_status >", value, "new_status");
            return (Criteria) this;
        }

        public Criteria andNew_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_status >=", value, "new_status");
            return (Criteria) this;
        }

        public Criteria andNew_statusLessThan(Integer value) {
            addCriterion("new_status <", value, "new_status");
            return (Criteria) this;
        }

        public Criteria andNew_statusLessThanOrEqualTo(Integer value) {
            addCriterion("new_status <=", value, "new_status");
            return (Criteria) this;
        }

        public Criteria andNew_statusIn(List<Integer> values) {
            addCriterion("new_status in", values, "new_status");
            return (Criteria) this;
        }

        public Criteria andNew_statusNotIn(List<Integer> values) {
            addCriterion("new_status not in", values, "new_status");
            return (Criteria) this;
        }

        public Criteria andNew_statusBetween(Integer value1, Integer value2) {
            addCriterion("new_status between", value1, value2, "new_status");
            return (Criteria) this;
        }

        public Criteria andNew_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("new_status not between", value1, value2, "new_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusIsNull() {
            addCriterion("recommand_status is null");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusIsNotNull() {
            addCriterion("recommand_status is not null");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusEqualTo(Integer value) {
            addCriterion("recommand_status =", value, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusNotEqualTo(Integer value) {
            addCriterion("recommand_status <>", value, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusGreaterThan(Integer value) {
            addCriterion("recommand_status >", value, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommand_status >=", value, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusLessThan(Integer value) {
            addCriterion("recommand_status <", value, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusLessThanOrEqualTo(Integer value) {
            addCriterion("recommand_status <=", value, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusIn(List<Integer> values) {
            addCriterion("recommand_status in", values, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusNotIn(List<Integer> values) {
            addCriterion("recommand_status not in", values, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusBetween(Integer value1, Integer value2) {
            addCriterion("recommand_status between", value1, value2, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("recommand_status not between", value1, value2, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andVerify_statusIsNull() {
            addCriterion("verify_status is null");
            return (Criteria) this;
        }

        public Criteria andVerify_statusIsNotNull() {
            addCriterion("verify_status is not null");
            return (Criteria) this;
        }

        public Criteria andVerify_statusEqualTo(Integer value) {
            addCriterion("verify_status =", value, "verify_status");
            return (Criteria) this;
        }

        public Criteria andVerify_statusNotEqualTo(Integer value) {
            addCriterion("verify_status <>", value, "verify_status");
            return (Criteria) this;
        }

        public Criteria andVerify_statusGreaterThan(Integer value) {
            addCriterion("verify_status >", value, "verify_status");
            return (Criteria) this;
        }

        public Criteria andVerify_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("verify_status >=", value, "verify_status");
            return (Criteria) this;
        }

        public Criteria andVerify_statusLessThan(Integer value) {
            addCriterion("verify_status <", value, "verify_status");
            return (Criteria) this;
        }

        public Criteria andVerify_statusLessThanOrEqualTo(Integer value) {
            addCriterion("verify_status <=", value, "verify_status");
            return (Criteria) this;
        }

        public Criteria andVerify_statusIn(List<Integer> values) {
            addCriterion("verify_status in", values, "verify_status");
            return (Criteria) this;
        }

        public Criteria andVerify_statusNotIn(List<Integer> values) {
            addCriterion("verify_status not in", values, "verify_status");
            return (Criteria) this;
        }

        public Criteria andVerify_statusBetween(Integer value1, Integer value2) {
            addCriterion("verify_status between", value1, value2, "verify_status");
            return (Criteria) this;
        }

        public Criteria andVerify_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("verify_status not between", value1, value2, "verify_status");
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

        public Criteria andGift_pointIsNull() {
            addCriterion("gift_point is null");
            return (Criteria) this;
        }

        public Criteria andGift_pointIsNotNull() {
            addCriterion("gift_point is not null");
            return (Criteria) this;
        }

        public Criteria andGift_pointEqualTo(Integer value) {
            addCriterion("gift_point =", value, "gift_point");
            return (Criteria) this;
        }

        public Criteria andGift_pointNotEqualTo(Integer value) {
            addCriterion("gift_point <>", value, "gift_point");
            return (Criteria) this;
        }

        public Criteria andGift_pointGreaterThan(Integer value) {
            addCriterion("gift_point >", value, "gift_point");
            return (Criteria) this;
        }

        public Criteria andGift_pointGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_point >=", value, "gift_point");
            return (Criteria) this;
        }

        public Criteria andGift_pointLessThan(Integer value) {
            addCriterion("gift_point <", value, "gift_point");
            return (Criteria) this;
        }

        public Criteria andGift_pointLessThanOrEqualTo(Integer value) {
            addCriterion("gift_point <=", value, "gift_point");
            return (Criteria) this;
        }

        public Criteria andGift_pointIn(List<Integer> values) {
            addCriterion("gift_point in", values, "gift_point");
            return (Criteria) this;
        }

        public Criteria andGift_pointNotIn(List<Integer> values) {
            addCriterion("gift_point not in", values, "gift_point");
            return (Criteria) this;
        }

        public Criteria andGift_pointBetween(Integer value1, Integer value2) {
            addCriterion("gift_point between", value1, value2, "gift_point");
            return (Criteria) this;
        }

        public Criteria andGift_pointNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_point not between", value1, value2, "gift_point");
            return (Criteria) this;
        }

        public Criteria andUse_point_limitIsNull() {
            addCriterion("use_point_limit is null");
            return (Criteria) this;
        }

        public Criteria andUse_point_limitIsNotNull() {
            addCriterion("use_point_limit is not null");
            return (Criteria) this;
        }

        public Criteria andUse_point_limitEqualTo(Integer value) {
            addCriterion("use_point_limit =", value, "use_point_limit");
            return (Criteria) this;
        }

        public Criteria andUse_point_limitNotEqualTo(Integer value) {
            addCriterion("use_point_limit <>", value, "use_point_limit");
            return (Criteria) this;
        }

        public Criteria andUse_point_limitGreaterThan(Integer value) {
            addCriterion("use_point_limit >", value, "use_point_limit");
            return (Criteria) this;
        }

        public Criteria andUse_point_limitGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_point_limit >=", value, "use_point_limit");
            return (Criteria) this;
        }

        public Criteria andUse_point_limitLessThan(Integer value) {
            addCriterion("use_point_limit <", value, "use_point_limit");
            return (Criteria) this;
        }

        public Criteria andUse_point_limitLessThanOrEqualTo(Integer value) {
            addCriterion("use_point_limit <=", value, "use_point_limit");
            return (Criteria) this;
        }

        public Criteria andUse_point_limitIn(List<Integer> values) {
            addCriterion("use_point_limit in", values, "use_point_limit");
            return (Criteria) this;
        }

        public Criteria andUse_point_limitNotIn(List<Integer> values) {
            addCriterion("use_point_limit not in", values, "use_point_limit");
            return (Criteria) this;
        }

        public Criteria andUse_point_limitBetween(Integer value1, Integer value2) {
            addCriterion("use_point_limit between", value1, value2, "use_point_limit");
            return (Criteria) this;
        }

        public Criteria andUse_point_limitNotBetween(Integer value1, Integer value2) {
            addCriterion("use_point_limit not between", value1, value2, "use_point_limit");
            return (Criteria) this;
        }

        public Criteria andSub_titleIsNull() {
            addCriterion("sub_title is null");
            return (Criteria) this;
        }

        public Criteria andSub_titleIsNotNull() {
            addCriterion("sub_title is not null");
            return (Criteria) this;
        }

        public Criteria andSub_titleEqualTo(String value) {
            addCriterion("sub_title =", value, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleNotEqualTo(String value) {
            addCriterion("sub_title <>", value, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleGreaterThan(String value) {
            addCriterion("sub_title >", value, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleGreaterThanOrEqualTo(String value) {
            addCriterion("sub_title >=", value, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleLessThan(String value) {
            addCriterion("sub_title <", value, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleLessThanOrEqualTo(String value) {
            addCriterion("sub_title <=", value, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleLike(String value) {
            addCriterion("sub_title like", value, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleNotLike(String value) {
            addCriterion("sub_title not like", value, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleIn(List<String> values) {
            addCriterion("sub_title in", values, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleNotIn(List<String> values) {
            addCriterion("sub_title not in", values, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleBetween(String value1, String value2) {
            addCriterion("sub_title between", value1, value2, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleNotBetween(String value1, String value2) {
            addCriterion("sub_title not between", value1, value2, "sub_title");
            return (Criteria) this;
        }

        public Criteria andOriginal_priceIsNull() {
            addCriterion("original_price is null");
            return (Criteria) this;
        }

        public Criteria andOriginal_priceIsNotNull() {
            addCriterion("original_price is not null");
            return (Criteria) this;
        }

        public Criteria andOriginal_priceEqualTo(BigDecimal value) {
            addCriterion("original_price =", value, "original_price");
            return (Criteria) this;
        }

        public Criteria andOriginal_priceNotEqualTo(BigDecimal value) {
            addCriterion("original_price <>", value, "original_price");
            return (Criteria) this;
        }

        public Criteria andOriginal_priceGreaterThan(BigDecimal value) {
            addCriterion("original_price >", value, "original_price");
            return (Criteria) this;
        }

        public Criteria andOriginal_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("original_price >=", value, "original_price");
            return (Criteria) this;
        }

        public Criteria andOriginal_priceLessThan(BigDecimal value) {
            addCriterion("original_price <", value, "original_price");
            return (Criteria) this;
        }

        public Criteria andOriginal_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("original_price <=", value, "original_price");
            return (Criteria) this;
        }

        public Criteria andOriginal_priceIn(List<BigDecimal> values) {
            addCriterion("original_price in", values, "original_price");
            return (Criteria) this;
        }

        public Criteria andOriginal_priceNotIn(List<BigDecimal> values) {
            addCriterion("original_price not in", values, "original_price");
            return (Criteria) this;
        }

        public Criteria andOriginal_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_price between", value1, value2, "original_price");
            return (Criteria) this;
        }

        public Criteria andOriginal_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_price not between", value1, value2, "original_price");
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

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andPreview_statusIsNull() {
            addCriterion("preview_status is null");
            return (Criteria) this;
        }

        public Criteria andPreview_statusIsNotNull() {
            addCriterion("preview_status is not null");
            return (Criteria) this;
        }

        public Criteria andPreview_statusEqualTo(Integer value) {
            addCriterion("preview_status =", value, "preview_status");
            return (Criteria) this;
        }

        public Criteria andPreview_statusNotEqualTo(Integer value) {
            addCriterion("preview_status <>", value, "preview_status");
            return (Criteria) this;
        }

        public Criteria andPreview_statusGreaterThan(Integer value) {
            addCriterion("preview_status >", value, "preview_status");
            return (Criteria) this;
        }

        public Criteria andPreview_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("preview_status >=", value, "preview_status");
            return (Criteria) this;
        }

        public Criteria andPreview_statusLessThan(Integer value) {
            addCriterion("preview_status <", value, "preview_status");
            return (Criteria) this;
        }

        public Criteria andPreview_statusLessThanOrEqualTo(Integer value) {
            addCriterion("preview_status <=", value, "preview_status");
            return (Criteria) this;
        }

        public Criteria andPreview_statusIn(List<Integer> values) {
            addCriterion("preview_status in", values, "preview_status");
            return (Criteria) this;
        }

        public Criteria andPreview_statusNotIn(List<Integer> values) {
            addCriterion("preview_status not in", values, "preview_status");
            return (Criteria) this;
        }

        public Criteria andPreview_statusBetween(Integer value1, Integer value2) {
            addCriterion("preview_status between", value1, value2, "preview_status");
            return (Criteria) this;
        }

        public Criteria andPreview_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("preview_status not between", value1, value2, "preview_status");
            return (Criteria) this;
        }

        public Criteria andService_idsIsNull() {
            addCriterion("service_ids is null");
            return (Criteria) this;
        }

        public Criteria andService_idsIsNotNull() {
            addCriterion("service_ids is not null");
            return (Criteria) this;
        }

        public Criteria andService_idsEqualTo(String value) {
            addCriterion("service_ids =", value, "service_ids");
            return (Criteria) this;
        }

        public Criteria andService_idsNotEqualTo(String value) {
            addCriterion("service_ids <>", value, "service_ids");
            return (Criteria) this;
        }

        public Criteria andService_idsGreaterThan(String value) {
            addCriterion("service_ids >", value, "service_ids");
            return (Criteria) this;
        }

        public Criteria andService_idsGreaterThanOrEqualTo(String value) {
            addCriterion("service_ids >=", value, "service_ids");
            return (Criteria) this;
        }

        public Criteria andService_idsLessThan(String value) {
            addCriterion("service_ids <", value, "service_ids");
            return (Criteria) this;
        }

        public Criteria andService_idsLessThanOrEqualTo(String value) {
            addCriterion("service_ids <=", value, "service_ids");
            return (Criteria) this;
        }

        public Criteria andService_idsLike(String value) {
            addCriterion("service_ids like", value, "service_ids");
            return (Criteria) this;
        }

        public Criteria andService_idsNotLike(String value) {
            addCriterion("service_ids not like", value, "service_ids");
            return (Criteria) this;
        }

        public Criteria andService_idsIn(List<String> values) {
            addCriterion("service_ids in", values, "service_ids");
            return (Criteria) this;
        }

        public Criteria andService_idsNotIn(List<String> values) {
            addCriterion("service_ids not in", values, "service_ids");
            return (Criteria) this;
        }

        public Criteria andService_idsBetween(String value1, String value2) {
            addCriterion("service_ids between", value1, value2, "service_ids");
            return (Criteria) this;
        }

        public Criteria andService_idsNotBetween(String value1, String value2) {
            addCriterion("service_ids not between", value1, value2, "service_ids");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
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

        public Criteria andAlbum_picsIsNull() {
            addCriterion("album_pics is null");
            return (Criteria) this;
        }

        public Criteria andAlbum_picsIsNotNull() {
            addCriterion("album_pics is not null");
            return (Criteria) this;
        }

        public Criteria andAlbum_picsEqualTo(String value) {
            addCriterion("album_pics =", value, "album_pics");
            return (Criteria) this;
        }

        public Criteria andAlbum_picsNotEqualTo(String value) {
            addCriterion("album_pics <>", value, "album_pics");
            return (Criteria) this;
        }

        public Criteria andAlbum_picsGreaterThan(String value) {
            addCriterion("album_pics >", value, "album_pics");
            return (Criteria) this;
        }

        public Criteria andAlbum_picsGreaterThanOrEqualTo(String value) {
            addCriterion("album_pics >=", value, "album_pics");
            return (Criteria) this;
        }

        public Criteria andAlbum_picsLessThan(String value) {
            addCriterion("album_pics <", value, "album_pics");
            return (Criteria) this;
        }

        public Criteria andAlbum_picsLessThanOrEqualTo(String value) {
            addCriterion("album_pics <=", value, "album_pics");
            return (Criteria) this;
        }

        public Criteria andAlbum_picsLike(String value) {
            addCriterion("album_pics like", value, "album_pics");
            return (Criteria) this;
        }

        public Criteria andAlbum_picsNotLike(String value) {
            addCriterion("album_pics not like", value, "album_pics");
            return (Criteria) this;
        }

        public Criteria andAlbum_picsIn(List<String> values) {
            addCriterion("album_pics in", values, "album_pics");
            return (Criteria) this;
        }

        public Criteria andAlbum_picsNotIn(List<String> values) {
            addCriterion("album_pics not in", values, "album_pics");
            return (Criteria) this;
        }

        public Criteria andAlbum_picsBetween(String value1, String value2) {
            addCriterion("album_pics between", value1, value2, "album_pics");
            return (Criteria) this;
        }

        public Criteria andAlbum_picsNotBetween(String value1, String value2) {
            addCriterion("album_pics not between", value1, value2, "album_pics");
            return (Criteria) this;
        }

        public Criteria andDetail_titleIsNull() {
            addCriterion("detail_title is null");
            return (Criteria) this;
        }

        public Criteria andDetail_titleIsNotNull() {
            addCriterion("detail_title is not null");
            return (Criteria) this;
        }

        public Criteria andDetail_titleEqualTo(String value) {
            addCriterion("detail_title =", value, "detail_title");
            return (Criteria) this;
        }

        public Criteria andDetail_titleNotEqualTo(String value) {
            addCriterion("detail_title <>", value, "detail_title");
            return (Criteria) this;
        }

        public Criteria andDetail_titleGreaterThan(String value) {
            addCriterion("detail_title >", value, "detail_title");
            return (Criteria) this;
        }

        public Criteria andDetail_titleGreaterThanOrEqualTo(String value) {
            addCriterion("detail_title >=", value, "detail_title");
            return (Criteria) this;
        }

        public Criteria andDetail_titleLessThan(String value) {
            addCriterion("detail_title <", value, "detail_title");
            return (Criteria) this;
        }

        public Criteria andDetail_titleLessThanOrEqualTo(String value) {
            addCriterion("detail_title <=", value, "detail_title");
            return (Criteria) this;
        }

        public Criteria andDetail_titleLike(String value) {
            addCriterion("detail_title like", value, "detail_title");
            return (Criteria) this;
        }

        public Criteria andDetail_titleNotLike(String value) {
            addCriterion("detail_title not like", value, "detail_title");
            return (Criteria) this;
        }

        public Criteria andDetail_titleIn(List<String> values) {
            addCriterion("detail_title in", values, "detail_title");
            return (Criteria) this;
        }

        public Criteria andDetail_titleNotIn(List<String> values) {
            addCriterion("detail_title not in", values, "detail_title");
            return (Criteria) this;
        }

        public Criteria andDetail_titleBetween(String value1, String value2) {
            addCriterion("detail_title between", value1, value2, "detail_title");
            return (Criteria) this;
        }

        public Criteria andDetail_titleNotBetween(String value1, String value2) {
            addCriterion("detail_title not between", value1, value2, "detail_title");
            return (Criteria) this;
        }

        public Criteria andPromotion_start_timeIsNull() {
            addCriterion("promotion_start_time is null");
            return (Criteria) this;
        }

        public Criteria andPromotion_start_timeIsNotNull() {
            addCriterion("promotion_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andPromotion_start_timeEqualTo(Date value) {
            addCriterion("promotion_start_time =", value, "promotion_start_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_start_timeNotEqualTo(Date value) {
            addCriterion("promotion_start_time <>", value, "promotion_start_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_start_timeGreaterThan(Date value) {
            addCriterion("promotion_start_time >", value, "promotion_start_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_start_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("promotion_start_time >=", value, "promotion_start_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_start_timeLessThan(Date value) {
            addCriterion("promotion_start_time <", value, "promotion_start_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_start_timeLessThanOrEqualTo(Date value) {
            addCriterion("promotion_start_time <=", value, "promotion_start_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_start_timeIn(List<Date> values) {
            addCriterion("promotion_start_time in", values, "promotion_start_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_start_timeNotIn(List<Date> values) {
            addCriterion("promotion_start_time not in", values, "promotion_start_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_start_timeBetween(Date value1, Date value2) {
            addCriterion("promotion_start_time between", value1, value2, "promotion_start_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_start_timeNotBetween(Date value1, Date value2) {
            addCriterion("promotion_start_time not between", value1, value2, "promotion_start_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_end_timeIsNull() {
            addCriterion("promotion_end_time is null");
            return (Criteria) this;
        }

        public Criteria andPromotion_end_timeIsNotNull() {
            addCriterion("promotion_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andPromotion_end_timeEqualTo(Date value) {
            addCriterion("promotion_end_time =", value, "promotion_end_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_end_timeNotEqualTo(Date value) {
            addCriterion("promotion_end_time <>", value, "promotion_end_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_end_timeGreaterThan(Date value) {
            addCriterion("promotion_end_time >", value, "promotion_end_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_end_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("promotion_end_time >=", value, "promotion_end_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_end_timeLessThan(Date value) {
            addCriterion("promotion_end_time <", value, "promotion_end_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_end_timeLessThanOrEqualTo(Date value) {
            addCriterion("promotion_end_time <=", value, "promotion_end_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_end_timeIn(List<Date> values) {
            addCriterion("promotion_end_time in", values, "promotion_end_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_end_timeNotIn(List<Date> values) {
            addCriterion("promotion_end_time not in", values, "promotion_end_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_end_timeBetween(Date value1, Date value2) {
            addCriterion("promotion_end_time between", value1, value2, "promotion_end_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_end_timeNotBetween(Date value1, Date value2) {
            addCriterion("promotion_end_time not between", value1, value2, "promotion_end_time");
            return (Criteria) this;
        }

        public Criteria andPromotion_per_limitIsNull() {
            addCriterion("promotion_per_limit is null");
            return (Criteria) this;
        }

        public Criteria andPromotion_per_limitIsNotNull() {
            addCriterion("promotion_per_limit is not null");
            return (Criteria) this;
        }

        public Criteria andPromotion_per_limitEqualTo(Integer value) {
            addCriterion("promotion_per_limit =", value, "promotion_per_limit");
            return (Criteria) this;
        }

        public Criteria andPromotion_per_limitNotEqualTo(Integer value) {
            addCriterion("promotion_per_limit <>", value, "promotion_per_limit");
            return (Criteria) this;
        }

        public Criteria andPromotion_per_limitGreaterThan(Integer value) {
            addCriterion("promotion_per_limit >", value, "promotion_per_limit");
            return (Criteria) this;
        }

        public Criteria andPromotion_per_limitGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotion_per_limit >=", value, "promotion_per_limit");
            return (Criteria) this;
        }

        public Criteria andPromotion_per_limitLessThan(Integer value) {
            addCriterion("promotion_per_limit <", value, "promotion_per_limit");
            return (Criteria) this;
        }

        public Criteria andPromotion_per_limitLessThanOrEqualTo(Integer value) {
            addCriterion("promotion_per_limit <=", value, "promotion_per_limit");
            return (Criteria) this;
        }

        public Criteria andPromotion_per_limitIn(List<Integer> values) {
            addCriterion("promotion_per_limit in", values, "promotion_per_limit");
            return (Criteria) this;
        }

        public Criteria andPromotion_per_limitNotIn(List<Integer> values) {
            addCriterion("promotion_per_limit not in", values, "promotion_per_limit");
            return (Criteria) this;
        }

        public Criteria andPromotion_per_limitBetween(Integer value1, Integer value2) {
            addCriterion("promotion_per_limit between", value1, value2, "promotion_per_limit");
            return (Criteria) this;
        }

        public Criteria andPromotion_per_limitNotBetween(Integer value1, Integer value2) {
            addCriterion("promotion_per_limit not between", value1, value2, "promotion_per_limit");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeIsNull() {
            addCriterion("promotion_type is null");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeIsNotNull() {
            addCriterion("promotion_type is not null");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeEqualTo(Integer value) {
            addCriterion("promotion_type =", value, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeNotEqualTo(Integer value) {
            addCriterion("promotion_type <>", value, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeGreaterThan(Integer value) {
            addCriterion("promotion_type >", value, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotion_type >=", value, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeLessThan(Integer value) {
            addCriterion("promotion_type <", value, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeLessThanOrEqualTo(Integer value) {
            addCriterion("promotion_type <=", value, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeIn(List<Integer> values) {
            addCriterion("promotion_type in", values, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeNotIn(List<Integer> values) {
            addCriterion("promotion_type not in", values, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeBetween(Integer value1, Integer value2) {
            addCriterion("promotion_type between", value1, value2, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("promotion_type not between", value1, value2, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andBrand_nameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrand_nameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrand_nameEqualTo(String value) {
            addCriterion("brand_name =", value, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameLessThan(String value) {
            addCriterion("brand_name <", value, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameLike(String value) {
            addCriterion("brand_name like", value, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameNotLike(String value) {
            addCriterion("brand_name not like", value, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameIn(List<String> values) {
            addCriterion("brand_name in", values, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brand_name");
            return (Criteria) this;
        }

        public Criteria andProduct_category_nameIsNull() {
            addCriterion("product_category_name is null");
            return (Criteria) this;
        }

        public Criteria andProduct_category_nameIsNotNull() {
            addCriterion("product_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_category_nameEqualTo(String value) {
            addCriterion("product_category_name =", value, "product_category_name");
            return (Criteria) this;
        }

        public Criteria andProduct_category_nameNotEqualTo(String value) {
            addCriterion("product_category_name <>", value, "product_category_name");
            return (Criteria) this;
        }

        public Criteria andProduct_category_nameGreaterThan(String value) {
            addCriterion("product_category_name >", value, "product_category_name");
            return (Criteria) this;
        }

        public Criteria andProduct_category_nameGreaterThanOrEqualTo(String value) {
            addCriterion("product_category_name >=", value, "product_category_name");
            return (Criteria) this;
        }

        public Criteria andProduct_category_nameLessThan(String value) {
            addCriterion("product_category_name <", value, "product_category_name");
            return (Criteria) this;
        }

        public Criteria andProduct_category_nameLessThanOrEqualTo(String value) {
            addCriterion("product_category_name <=", value, "product_category_name");
            return (Criteria) this;
        }

        public Criteria andProduct_category_nameLike(String value) {
            addCriterion("product_category_name like", value, "product_category_name");
            return (Criteria) this;
        }

        public Criteria andProduct_category_nameNotLike(String value) {
            addCriterion("product_category_name not like", value, "product_category_name");
            return (Criteria) this;
        }

        public Criteria andProduct_category_nameIn(List<String> values) {
            addCriterion("product_category_name in", values, "product_category_name");
            return (Criteria) this;
        }

        public Criteria andProduct_category_nameNotIn(List<String> values) {
            addCriterion("product_category_name not in", values, "product_category_name");
            return (Criteria) this;
        }

        public Criteria andProduct_category_nameBetween(String value1, String value2) {
            addCriterion("product_category_name between", value1, value2, "product_category_name");
            return (Criteria) this;
        }

        public Criteria andProduct_category_nameNotBetween(String value1, String value2) {
            addCriterion("product_category_name not between", value1, value2, "product_category_name");
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