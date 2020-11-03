package com.lucky.mall.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class PmsProductAttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsProductAttributeExample() {
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

        public Criteria andSelect_typeIsNull() {
            addCriterion("select_type is null");
            return (Criteria) this;
        }

        public Criteria andSelect_typeIsNotNull() {
            addCriterion("select_type is not null");
            return (Criteria) this;
        }

        public Criteria andSelect_typeEqualTo(Integer value) {
            addCriterion("select_type =", value, "select_type");
            return (Criteria) this;
        }

        public Criteria andSelect_typeNotEqualTo(Integer value) {
            addCriterion("select_type <>", value, "select_type");
            return (Criteria) this;
        }

        public Criteria andSelect_typeGreaterThan(Integer value) {
            addCriterion("select_type >", value, "select_type");
            return (Criteria) this;
        }

        public Criteria andSelect_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("select_type >=", value, "select_type");
            return (Criteria) this;
        }

        public Criteria andSelect_typeLessThan(Integer value) {
            addCriterion("select_type <", value, "select_type");
            return (Criteria) this;
        }

        public Criteria andSelect_typeLessThanOrEqualTo(Integer value) {
            addCriterion("select_type <=", value, "select_type");
            return (Criteria) this;
        }

        public Criteria andSelect_typeIn(List<Integer> values) {
            addCriterion("select_type in", values, "select_type");
            return (Criteria) this;
        }

        public Criteria andSelect_typeNotIn(List<Integer> values) {
            addCriterion("select_type not in", values, "select_type");
            return (Criteria) this;
        }

        public Criteria andSelect_typeBetween(Integer value1, Integer value2) {
            addCriterion("select_type between", value1, value2, "select_type");
            return (Criteria) this;
        }

        public Criteria andSelect_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("select_type not between", value1, value2, "select_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeIsNull() {
            addCriterion("input_type is null");
            return (Criteria) this;
        }

        public Criteria andInput_typeIsNotNull() {
            addCriterion("input_type is not null");
            return (Criteria) this;
        }

        public Criteria andInput_typeEqualTo(Integer value) {
            addCriterion("input_type =", value, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeNotEqualTo(Integer value) {
            addCriterion("input_type <>", value, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeGreaterThan(Integer value) {
            addCriterion("input_type >", value, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("input_type >=", value, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeLessThan(Integer value) {
            addCriterion("input_type <", value, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeLessThanOrEqualTo(Integer value) {
            addCriterion("input_type <=", value, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeIn(List<Integer> values) {
            addCriterion("input_type in", values, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeNotIn(List<Integer> values) {
            addCriterion("input_type not in", values, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeBetween(Integer value1, Integer value2) {
            addCriterion("input_type between", value1, value2, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("input_type not between", value1, value2, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_listIsNull() {
            addCriterion("input_list is null");
            return (Criteria) this;
        }

        public Criteria andInput_listIsNotNull() {
            addCriterion("input_list is not null");
            return (Criteria) this;
        }

        public Criteria andInput_listEqualTo(String value) {
            addCriterion("input_list =", value, "input_list");
            return (Criteria) this;
        }

        public Criteria andInput_listNotEqualTo(String value) {
            addCriterion("input_list <>", value, "input_list");
            return (Criteria) this;
        }

        public Criteria andInput_listGreaterThan(String value) {
            addCriterion("input_list >", value, "input_list");
            return (Criteria) this;
        }

        public Criteria andInput_listGreaterThanOrEqualTo(String value) {
            addCriterion("input_list >=", value, "input_list");
            return (Criteria) this;
        }

        public Criteria andInput_listLessThan(String value) {
            addCriterion("input_list <", value, "input_list");
            return (Criteria) this;
        }

        public Criteria andInput_listLessThanOrEqualTo(String value) {
            addCriterion("input_list <=", value, "input_list");
            return (Criteria) this;
        }

        public Criteria andInput_listLike(String value) {
            addCriterion("input_list like", value, "input_list");
            return (Criteria) this;
        }

        public Criteria andInput_listNotLike(String value) {
            addCriterion("input_list not like", value, "input_list");
            return (Criteria) this;
        }

        public Criteria andInput_listIn(List<String> values) {
            addCriterion("input_list in", values, "input_list");
            return (Criteria) this;
        }

        public Criteria andInput_listNotIn(List<String> values) {
            addCriterion("input_list not in", values, "input_list");
            return (Criteria) this;
        }

        public Criteria andInput_listBetween(String value1, String value2) {
            addCriterion("input_list between", value1, value2, "input_list");
            return (Criteria) this;
        }

        public Criteria andInput_listNotBetween(String value1, String value2) {
            addCriterion("input_list not between", value1, value2, "input_list");
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

        public Criteria andFilter_typeIsNull() {
            addCriterion("filter_type is null");
            return (Criteria) this;
        }

        public Criteria andFilter_typeIsNotNull() {
            addCriterion("filter_type is not null");
            return (Criteria) this;
        }

        public Criteria andFilter_typeEqualTo(Integer value) {
            addCriterion("filter_type =", value, "filter_type");
            return (Criteria) this;
        }

        public Criteria andFilter_typeNotEqualTo(Integer value) {
            addCriterion("filter_type <>", value, "filter_type");
            return (Criteria) this;
        }

        public Criteria andFilter_typeGreaterThan(Integer value) {
            addCriterion("filter_type >", value, "filter_type");
            return (Criteria) this;
        }

        public Criteria andFilter_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("filter_type >=", value, "filter_type");
            return (Criteria) this;
        }

        public Criteria andFilter_typeLessThan(Integer value) {
            addCriterion("filter_type <", value, "filter_type");
            return (Criteria) this;
        }

        public Criteria andFilter_typeLessThanOrEqualTo(Integer value) {
            addCriterion("filter_type <=", value, "filter_type");
            return (Criteria) this;
        }

        public Criteria andFilter_typeIn(List<Integer> values) {
            addCriterion("filter_type in", values, "filter_type");
            return (Criteria) this;
        }

        public Criteria andFilter_typeNotIn(List<Integer> values) {
            addCriterion("filter_type not in", values, "filter_type");
            return (Criteria) this;
        }

        public Criteria andFilter_typeBetween(Integer value1, Integer value2) {
            addCriterion("filter_type between", value1, value2, "filter_type");
            return (Criteria) this;
        }

        public Criteria andFilter_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("filter_type not between", value1, value2, "filter_type");
            return (Criteria) this;
        }

        public Criteria andSearch_typeIsNull() {
            addCriterion("search_type is null");
            return (Criteria) this;
        }

        public Criteria andSearch_typeIsNotNull() {
            addCriterion("search_type is not null");
            return (Criteria) this;
        }

        public Criteria andSearch_typeEqualTo(Integer value) {
            addCriterion("search_type =", value, "search_type");
            return (Criteria) this;
        }

        public Criteria andSearch_typeNotEqualTo(Integer value) {
            addCriterion("search_type <>", value, "search_type");
            return (Criteria) this;
        }

        public Criteria andSearch_typeGreaterThan(Integer value) {
            addCriterion("search_type >", value, "search_type");
            return (Criteria) this;
        }

        public Criteria andSearch_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("search_type >=", value, "search_type");
            return (Criteria) this;
        }

        public Criteria andSearch_typeLessThan(Integer value) {
            addCriterion("search_type <", value, "search_type");
            return (Criteria) this;
        }

        public Criteria andSearch_typeLessThanOrEqualTo(Integer value) {
            addCriterion("search_type <=", value, "search_type");
            return (Criteria) this;
        }

        public Criteria andSearch_typeIn(List<Integer> values) {
            addCriterion("search_type in", values, "search_type");
            return (Criteria) this;
        }

        public Criteria andSearch_typeNotIn(List<Integer> values) {
            addCriterion("search_type not in", values, "search_type");
            return (Criteria) this;
        }

        public Criteria andSearch_typeBetween(Integer value1, Integer value2) {
            addCriterion("search_type between", value1, value2, "search_type");
            return (Criteria) this;
        }

        public Criteria andSearch_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("search_type not between", value1, value2, "search_type");
            return (Criteria) this;
        }

        public Criteria andRelated_statusIsNull() {
            addCriterion("related_status is null");
            return (Criteria) this;
        }

        public Criteria andRelated_statusIsNotNull() {
            addCriterion("related_status is not null");
            return (Criteria) this;
        }

        public Criteria andRelated_statusEqualTo(Integer value) {
            addCriterion("related_status =", value, "related_status");
            return (Criteria) this;
        }

        public Criteria andRelated_statusNotEqualTo(Integer value) {
            addCriterion("related_status <>", value, "related_status");
            return (Criteria) this;
        }

        public Criteria andRelated_statusGreaterThan(Integer value) {
            addCriterion("related_status >", value, "related_status");
            return (Criteria) this;
        }

        public Criteria andRelated_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("related_status >=", value, "related_status");
            return (Criteria) this;
        }

        public Criteria andRelated_statusLessThan(Integer value) {
            addCriterion("related_status <", value, "related_status");
            return (Criteria) this;
        }

        public Criteria andRelated_statusLessThanOrEqualTo(Integer value) {
            addCriterion("related_status <=", value, "related_status");
            return (Criteria) this;
        }

        public Criteria andRelated_statusIn(List<Integer> values) {
            addCriterion("related_status in", values, "related_status");
            return (Criteria) this;
        }

        public Criteria andRelated_statusNotIn(List<Integer> values) {
            addCriterion("related_status not in", values, "related_status");
            return (Criteria) this;
        }

        public Criteria andRelated_statusBetween(Integer value1, Integer value2) {
            addCriterion("related_status between", value1, value2, "related_status");
            return (Criteria) this;
        }

        public Criteria andRelated_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("related_status not between", value1, value2, "related_status");
            return (Criteria) this;
        }

        public Criteria andHand_add_statusIsNull() {
            addCriterion("hand_add_status is null");
            return (Criteria) this;
        }

        public Criteria andHand_add_statusIsNotNull() {
            addCriterion("hand_add_status is not null");
            return (Criteria) this;
        }

        public Criteria andHand_add_statusEqualTo(Integer value) {
            addCriterion("hand_add_status =", value, "hand_add_status");
            return (Criteria) this;
        }

        public Criteria andHand_add_statusNotEqualTo(Integer value) {
            addCriterion("hand_add_status <>", value, "hand_add_status");
            return (Criteria) this;
        }

        public Criteria andHand_add_statusGreaterThan(Integer value) {
            addCriterion("hand_add_status >", value, "hand_add_status");
            return (Criteria) this;
        }

        public Criteria andHand_add_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("hand_add_status >=", value, "hand_add_status");
            return (Criteria) this;
        }

        public Criteria andHand_add_statusLessThan(Integer value) {
            addCriterion("hand_add_status <", value, "hand_add_status");
            return (Criteria) this;
        }

        public Criteria andHand_add_statusLessThanOrEqualTo(Integer value) {
            addCriterion("hand_add_status <=", value, "hand_add_status");
            return (Criteria) this;
        }

        public Criteria andHand_add_statusIn(List<Integer> values) {
            addCriterion("hand_add_status in", values, "hand_add_status");
            return (Criteria) this;
        }

        public Criteria andHand_add_statusNotIn(List<Integer> values) {
            addCriterion("hand_add_status not in", values, "hand_add_status");
            return (Criteria) this;
        }

        public Criteria andHand_add_statusBetween(Integer value1, Integer value2) {
            addCriterion("hand_add_status between", value1, value2, "hand_add_status");
            return (Criteria) this;
        }

        public Criteria andHand_add_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("hand_add_status not between", value1, value2, "hand_add_status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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