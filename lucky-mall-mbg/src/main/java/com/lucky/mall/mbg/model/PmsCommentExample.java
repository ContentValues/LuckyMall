package com.lucky.mall.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsCommentExample() {
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

        public Criteria andMember_nick_nameIsNull() {
            addCriterion("member_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameIsNotNull() {
            addCriterion("member_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameEqualTo(String value) {
            addCriterion("member_nick_name =", value, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameNotEqualTo(String value) {
            addCriterion("member_nick_name <>", value, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameGreaterThan(String value) {
            addCriterion("member_nick_name >", value, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameGreaterThanOrEqualTo(String value) {
            addCriterion("member_nick_name >=", value, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameLessThan(String value) {
            addCriterion("member_nick_name <", value, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameLessThanOrEqualTo(String value) {
            addCriterion("member_nick_name <=", value, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameLike(String value) {
            addCriterion("member_nick_name like", value, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameNotLike(String value) {
            addCriterion("member_nick_name not like", value, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameIn(List<String> values) {
            addCriterion("member_nick_name in", values, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameNotIn(List<String> values) {
            addCriterion("member_nick_name not in", values, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameBetween(String value1, String value2) {
            addCriterion("member_nick_name between", value1, value2, "member_nick_name");
            return (Criteria) this;
        }

        public Criteria andMember_nick_nameNotBetween(String value1, String value2) {
            addCriterion("member_nick_name not between", value1, value2, "member_nick_name");
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

        public Criteria andStarIsNull() {
            addCriterion("star is null");
            return (Criteria) this;
        }

        public Criteria andStarIsNotNull() {
            addCriterion("star is not null");
            return (Criteria) this;
        }

        public Criteria andStarEqualTo(Integer value) {
            addCriterion("star =", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotEqualTo(Integer value) {
            addCriterion("star <>", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThan(Integer value) {
            addCriterion("star >", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("star >=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThan(Integer value) {
            addCriterion("star <", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThanOrEqualTo(Integer value) {
            addCriterion("star <=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarIn(List<Integer> values) {
            addCriterion("star in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotIn(List<Integer> values) {
            addCriterion("star not in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarBetween(Integer value1, Integer value2) {
            addCriterion("star between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotBetween(Integer value1, Integer value2) {
            addCriterion("star not between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andMember_ipIsNull() {
            addCriterion("member_ip is null");
            return (Criteria) this;
        }

        public Criteria andMember_ipIsNotNull() {
            addCriterion("member_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMember_ipEqualTo(String value) {
            addCriterion("member_ip =", value, "member_ip");
            return (Criteria) this;
        }

        public Criteria andMember_ipNotEqualTo(String value) {
            addCriterion("member_ip <>", value, "member_ip");
            return (Criteria) this;
        }

        public Criteria andMember_ipGreaterThan(String value) {
            addCriterion("member_ip >", value, "member_ip");
            return (Criteria) this;
        }

        public Criteria andMember_ipGreaterThanOrEqualTo(String value) {
            addCriterion("member_ip >=", value, "member_ip");
            return (Criteria) this;
        }

        public Criteria andMember_ipLessThan(String value) {
            addCriterion("member_ip <", value, "member_ip");
            return (Criteria) this;
        }

        public Criteria andMember_ipLessThanOrEqualTo(String value) {
            addCriterion("member_ip <=", value, "member_ip");
            return (Criteria) this;
        }

        public Criteria andMember_ipLike(String value) {
            addCriterion("member_ip like", value, "member_ip");
            return (Criteria) this;
        }

        public Criteria andMember_ipNotLike(String value) {
            addCriterion("member_ip not like", value, "member_ip");
            return (Criteria) this;
        }

        public Criteria andMember_ipIn(List<String> values) {
            addCriterion("member_ip in", values, "member_ip");
            return (Criteria) this;
        }

        public Criteria andMember_ipNotIn(List<String> values) {
            addCriterion("member_ip not in", values, "member_ip");
            return (Criteria) this;
        }

        public Criteria andMember_ipBetween(String value1, String value2) {
            addCriterion("member_ip between", value1, value2, "member_ip");
            return (Criteria) this;
        }

        public Criteria andMember_ipNotBetween(String value1, String value2) {
            addCriterion("member_ip not between", value1, value2, "member_ip");
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

        public Criteria andShow_statusIsNull() {
            addCriterion("show_status is null");
            return (Criteria) this;
        }

        public Criteria andShow_statusIsNotNull() {
            addCriterion("show_status is not null");
            return (Criteria) this;
        }

        public Criteria andShow_statusEqualTo(Integer value) {
            addCriterion("show_status =", value, "show_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusNotEqualTo(Integer value) {
            addCriterion("show_status <>", value, "show_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusGreaterThan(Integer value) {
            addCriterion("show_status >", value, "show_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_status >=", value, "show_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusLessThan(Integer value) {
            addCriterion("show_status <", value, "show_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusLessThanOrEqualTo(Integer value) {
            addCriterion("show_status <=", value, "show_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusIn(List<Integer> values) {
            addCriterion("show_status in", values, "show_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusNotIn(List<Integer> values) {
            addCriterion("show_status not in", values, "show_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusBetween(Integer value1, Integer value2) {
            addCriterion("show_status between", value1, value2, "show_status");
            return (Criteria) this;
        }

        public Criteria andShow_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("show_status not between", value1, value2, "show_status");
            return (Criteria) this;
        }

        public Criteria andProduct_attributeIsNull() {
            addCriterion("product_attribute is null");
            return (Criteria) this;
        }

        public Criteria andProduct_attributeIsNotNull() {
            addCriterion("product_attribute is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_attributeEqualTo(String value) {
            addCriterion("product_attribute =", value, "product_attribute");
            return (Criteria) this;
        }

        public Criteria andProduct_attributeNotEqualTo(String value) {
            addCriterion("product_attribute <>", value, "product_attribute");
            return (Criteria) this;
        }

        public Criteria andProduct_attributeGreaterThan(String value) {
            addCriterion("product_attribute >", value, "product_attribute");
            return (Criteria) this;
        }

        public Criteria andProduct_attributeGreaterThanOrEqualTo(String value) {
            addCriterion("product_attribute >=", value, "product_attribute");
            return (Criteria) this;
        }

        public Criteria andProduct_attributeLessThan(String value) {
            addCriterion("product_attribute <", value, "product_attribute");
            return (Criteria) this;
        }

        public Criteria andProduct_attributeLessThanOrEqualTo(String value) {
            addCriterion("product_attribute <=", value, "product_attribute");
            return (Criteria) this;
        }

        public Criteria andProduct_attributeLike(String value) {
            addCriterion("product_attribute like", value, "product_attribute");
            return (Criteria) this;
        }

        public Criteria andProduct_attributeNotLike(String value) {
            addCriterion("product_attribute not like", value, "product_attribute");
            return (Criteria) this;
        }

        public Criteria andProduct_attributeIn(List<String> values) {
            addCriterion("product_attribute in", values, "product_attribute");
            return (Criteria) this;
        }

        public Criteria andProduct_attributeNotIn(List<String> values) {
            addCriterion("product_attribute not in", values, "product_attribute");
            return (Criteria) this;
        }

        public Criteria andProduct_attributeBetween(String value1, String value2) {
            addCriterion("product_attribute between", value1, value2, "product_attribute");
            return (Criteria) this;
        }

        public Criteria andProduct_attributeNotBetween(String value1, String value2) {
            addCriterion("product_attribute not between", value1, value2, "product_attribute");
            return (Criteria) this;
        }

        public Criteria andCollect_couontIsNull() {
            addCriterion("collect_couont is null");
            return (Criteria) this;
        }

        public Criteria andCollect_couontIsNotNull() {
            addCriterion("collect_couont is not null");
            return (Criteria) this;
        }

        public Criteria andCollect_couontEqualTo(Integer value) {
            addCriterion("collect_couont =", value, "collect_couont");
            return (Criteria) this;
        }

        public Criteria andCollect_couontNotEqualTo(Integer value) {
            addCriterion("collect_couont <>", value, "collect_couont");
            return (Criteria) this;
        }

        public Criteria andCollect_couontGreaterThan(Integer value) {
            addCriterion("collect_couont >", value, "collect_couont");
            return (Criteria) this;
        }

        public Criteria andCollect_couontGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_couont >=", value, "collect_couont");
            return (Criteria) this;
        }

        public Criteria andCollect_couontLessThan(Integer value) {
            addCriterion("collect_couont <", value, "collect_couont");
            return (Criteria) this;
        }

        public Criteria andCollect_couontLessThanOrEqualTo(Integer value) {
            addCriterion("collect_couont <=", value, "collect_couont");
            return (Criteria) this;
        }

        public Criteria andCollect_couontIn(List<Integer> values) {
            addCriterion("collect_couont in", values, "collect_couont");
            return (Criteria) this;
        }

        public Criteria andCollect_couontNotIn(List<Integer> values) {
            addCriterion("collect_couont not in", values, "collect_couont");
            return (Criteria) this;
        }

        public Criteria andCollect_couontBetween(Integer value1, Integer value2) {
            addCriterion("collect_couont between", value1, value2, "collect_couont");
            return (Criteria) this;
        }

        public Criteria andCollect_couontNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_couont not between", value1, value2, "collect_couont");
            return (Criteria) this;
        }

        public Criteria andRead_countIsNull() {
            addCriterion("read_count is null");
            return (Criteria) this;
        }

        public Criteria andRead_countIsNotNull() {
            addCriterion("read_count is not null");
            return (Criteria) this;
        }

        public Criteria andRead_countEqualTo(Integer value) {
            addCriterion("read_count =", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countNotEqualTo(Integer value) {
            addCriterion("read_count <>", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countGreaterThan(Integer value) {
            addCriterion("read_count >", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_count >=", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countLessThan(Integer value) {
            addCriterion("read_count <", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countLessThanOrEqualTo(Integer value) {
            addCriterion("read_count <=", value, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countIn(List<Integer> values) {
            addCriterion("read_count in", values, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countNotIn(List<Integer> values) {
            addCriterion("read_count not in", values, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countBetween(Integer value1, Integer value2) {
            addCriterion("read_count between", value1, value2, "read_count");
            return (Criteria) this;
        }

        public Criteria andRead_countNotBetween(Integer value1, Integer value2) {
            addCriterion("read_count not between", value1, value2, "read_count");
            return (Criteria) this;
        }

        public Criteria andPicsIsNull() {
            addCriterion("pics is null");
            return (Criteria) this;
        }

        public Criteria andPicsIsNotNull() {
            addCriterion("pics is not null");
            return (Criteria) this;
        }

        public Criteria andPicsEqualTo(String value) {
            addCriterion("pics =", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotEqualTo(String value) {
            addCriterion("pics <>", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsGreaterThan(String value) {
            addCriterion("pics >", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsGreaterThanOrEqualTo(String value) {
            addCriterion("pics >=", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLessThan(String value) {
            addCriterion("pics <", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLessThanOrEqualTo(String value) {
            addCriterion("pics <=", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLike(String value) {
            addCriterion("pics like", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotLike(String value) {
            addCriterion("pics not like", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsIn(List<String> values) {
            addCriterion("pics in", values, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotIn(List<String> values) {
            addCriterion("pics not in", values, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsBetween(String value1, String value2) {
            addCriterion("pics between", value1, value2, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotBetween(String value1, String value2) {
            addCriterion("pics not between", value1, value2, "pics");
            return (Criteria) this;
        }

        public Criteria andMember_iconIsNull() {
            addCriterion("member_icon is null");
            return (Criteria) this;
        }

        public Criteria andMember_iconIsNotNull() {
            addCriterion("member_icon is not null");
            return (Criteria) this;
        }

        public Criteria andMember_iconEqualTo(String value) {
            addCriterion("member_icon =", value, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconNotEqualTo(String value) {
            addCriterion("member_icon <>", value, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconGreaterThan(String value) {
            addCriterion("member_icon >", value, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconGreaterThanOrEqualTo(String value) {
            addCriterion("member_icon >=", value, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconLessThan(String value) {
            addCriterion("member_icon <", value, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconLessThanOrEqualTo(String value) {
            addCriterion("member_icon <=", value, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconLike(String value) {
            addCriterion("member_icon like", value, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconNotLike(String value) {
            addCriterion("member_icon not like", value, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconIn(List<String> values) {
            addCriterion("member_icon in", values, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconNotIn(List<String> values) {
            addCriterion("member_icon not in", values, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconBetween(String value1, String value2) {
            addCriterion("member_icon between", value1, value2, "member_icon");
            return (Criteria) this;
        }

        public Criteria andMember_iconNotBetween(String value1, String value2) {
            addCriterion("member_icon not between", value1, value2, "member_icon");
            return (Criteria) this;
        }

        public Criteria andReplay_countIsNull() {
            addCriterion("replay_count is null");
            return (Criteria) this;
        }

        public Criteria andReplay_countIsNotNull() {
            addCriterion("replay_count is not null");
            return (Criteria) this;
        }

        public Criteria andReplay_countEqualTo(Integer value) {
            addCriterion("replay_count =", value, "replay_count");
            return (Criteria) this;
        }

        public Criteria andReplay_countNotEqualTo(Integer value) {
            addCriterion("replay_count <>", value, "replay_count");
            return (Criteria) this;
        }

        public Criteria andReplay_countGreaterThan(Integer value) {
            addCriterion("replay_count >", value, "replay_count");
            return (Criteria) this;
        }

        public Criteria andReplay_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("replay_count >=", value, "replay_count");
            return (Criteria) this;
        }

        public Criteria andReplay_countLessThan(Integer value) {
            addCriterion("replay_count <", value, "replay_count");
            return (Criteria) this;
        }

        public Criteria andReplay_countLessThanOrEqualTo(Integer value) {
            addCriterion("replay_count <=", value, "replay_count");
            return (Criteria) this;
        }

        public Criteria andReplay_countIn(List<Integer> values) {
            addCriterion("replay_count in", values, "replay_count");
            return (Criteria) this;
        }

        public Criteria andReplay_countNotIn(List<Integer> values) {
            addCriterion("replay_count not in", values, "replay_count");
            return (Criteria) this;
        }

        public Criteria andReplay_countBetween(Integer value1, Integer value2) {
            addCriterion("replay_count between", value1, value2, "replay_count");
            return (Criteria) this;
        }

        public Criteria andReplay_countNotBetween(Integer value1, Integer value2) {
            addCriterion("replay_count not between", value1, value2, "replay_count");
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