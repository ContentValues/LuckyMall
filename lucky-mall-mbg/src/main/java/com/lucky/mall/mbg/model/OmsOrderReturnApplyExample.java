package com.lucky.mall.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmsOrderReturnApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsOrderReturnApplyExample() {
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

        public Criteria andCompany_address_idIsNull() {
            addCriterion("company_address_id is null");
            return (Criteria) this;
        }

        public Criteria andCompany_address_idIsNotNull() {
            addCriterion("company_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompany_address_idEqualTo(Long value) {
            addCriterion("company_address_id =", value, "company_address_id");
            return (Criteria) this;
        }

        public Criteria andCompany_address_idNotEqualTo(Long value) {
            addCriterion("company_address_id <>", value, "company_address_id");
            return (Criteria) this;
        }

        public Criteria andCompany_address_idGreaterThan(Long value) {
            addCriterion("company_address_id >", value, "company_address_id");
            return (Criteria) this;
        }

        public Criteria andCompany_address_idGreaterThanOrEqualTo(Long value) {
            addCriterion("company_address_id >=", value, "company_address_id");
            return (Criteria) this;
        }

        public Criteria andCompany_address_idLessThan(Long value) {
            addCriterion("company_address_id <", value, "company_address_id");
            return (Criteria) this;
        }

        public Criteria andCompany_address_idLessThanOrEqualTo(Long value) {
            addCriterion("company_address_id <=", value, "company_address_id");
            return (Criteria) this;
        }

        public Criteria andCompany_address_idIn(List<Long> values) {
            addCriterion("company_address_id in", values, "company_address_id");
            return (Criteria) this;
        }

        public Criteria andCompany_address_idNotIn(List<Long> values) {
            addCriterion("company_address_id not in", values, "company_address_id");
            return (Criteria) this;
        }

        public Criteria andCompany_address_idBetween(Long value1, Long value2) {
            addCriterion("company_address_id between", value1, value2, "company_address_id");
            return (Criteria) this;
        }

        public Criteria andCompany_address_idNotBetween(Long value1, Long value2) {
            addCriterion("company_address_id not between", value1, value2, "company_address_id");
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

        public Criteria andReturn_amountIsNull() {
            addCriterion("return_amount is null");
            return (Criteria) this;
        }

        public Criteria andReturn_amountIsNotNull() {
            addCriterion("return_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReturn_amountEqualTo(BigDecimal value) {
            addCriterion("return_amount =", value, "return_amount");
            return (Criteria) this;
        }

        public Criteria andReturn_amountNotEqualTo(BigDecimal value) {
            addCriterion("return_amount <>", value, "return_amount");
            return (Criteria) this;
        }

        public Criteria andReturn_amountGreaterThan(BigDecimal value) {
            addCriterion("return_amount >", value, "return_amount");
            return (Criteria) this;
        }

        public Criteria andReturn_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("return_amount >=", value, "return_amount");
            return (Criteria) this;
        }

        public Criteria andReturn_amountLessThan(BigDecimal value) {
            addCriterion("return_amount <", value, "return_amount");
            return (Criteria) this;
        }

        public Criteria andReturn_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("return_amount <=", value, "return_amount");
            return (Criteria) this;
        }

        public Criteria andReturn_amountIn(List<BigDecimal> values) {
            addCriterion("return_amount in", values, "return_amount");
            return (Criteria) this;
        }

        public Criteria andReturn_amountNotIn(List<BigDecimal> values) {
            addCriterion("return_amount not in", values, "return_amount");
            return (Criteria) this;
        }

        public Criteria andReturn_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_amount between", value1, value2, "return_amount");
            return (Criteria) this;
        }

        public Criteria andReturn_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_amount not between", value1, value2, "return_amount");
            return (Criteria) this;
        }

        public Criteria andReturn_nameIsNull() {
            addCriterion("return_name is null");
            return (Criteria) this;
        }

        public Criteria andReturn_nameIsNotNull() {
            addCriterion("return_name is not null");
            return (Criteria) this;
        }

        public Criteria andReturn_nameEqualTo(String value) {
            addCriterion("return_name =", value, "return_name");
            return (Criteria) this;
        }

        public Criteria andReturn_nameNotEqualTo(String value) {
            addCriterion("return_name <>", value, "return_name");
            return (Criteria) this;
        }

        public Criteria andReturn_nameGreaterThan(String value) {
            addCriterion("return_name >", value, "return_name");
            return (Criteria) this;
        }

        public Criteria andReturn_nameGreaterThanOrEqualTo(String value) {
            addCriterion("return_name >=", value, "return_name");
            return (Criteria) this;
        }

        public Criteria andReturn_nameLessThan(String value) {
            addCriterion("return_name <", value, "return_name");
            return (Criteria) this;
        }

        public Criteria andReturn_nameLessThanOrEqualTo(String value) {
            addCriterion("return_name <=", value, "return_name");
            return (Criteria) this;
        }

        public Criteria andReturn_nameLike(String value) {
            addCriterion("return_name like", value, "return_name");
            return (Criteria) this;
        }

        public Criteria andReturn_nameNotLike(String value) {
            addCriterion("return_name not like", value, "return_name");
            return (Criteria) this;
        }

        public Criteria andReturn_nameIn(List<String> values) {
            addCriterion("return_name in", values, "return_name");
            return (Criteria) this;
        }

        public Criteria andReturn_nameNotIn(List<String> values) {
            addCriterion("return_name not in", values, "return_name");
            return (Criteria) this;
        }

        public Criteria andReturn_nameBetween(String value1, String value2) {
            addCriterion("return_name between", value1, value2, "return_name");
            return (Criteria) this;
        }

        public Criteria andReturn_nameNotBetween(String value1, String value2) {
            addCriterion("return_name not between", value1, value2, "return_name");
            return (Criteria) this;
        }

        public Criteria andReturn_phoneIsNull() {
            addCriterion("return_phone is null");
            return (Criteria) this;
        }

        public Criteria andReturn_phoneIsNotNull() {
            addCriterion("return_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReturn_phoneEqualTo(String value) {
            addCriterion("return_phone =", value, "return_phone");
            return (Criteria) this;
        }

        public Criteria andReturn_phoneNotEqualTo(String value) {
            addCriterion("return_phone <>", value, "return_phone");
            return (Criteria) this;
        }

        public Criteria andReturn_phoneGreaterThan(String value) {
            addCriterion("return_phone >", value, "return_phone");
            return (Criteria) this;
        }

        public Criteria andReturn_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("return_phone >=", value, "return_phone");
            return (Criteria) this;
        }

        public Criteria andReturn_phoneLessThan(String value) {
            addCriterion("return_phone <", value, "return_phone");
            return (Criteria) this;
        }

        public Criteria andReturn_phoneLessThanOrEqualTo(String value) {
            addCriterion("return_phone <=", value, "return_phone");
            return (Criteria) this;
        }

        public Criteria andReturn_phoneLike(String value) {
            addCriterion("return_phone like", value, "return_phone");
            return (Criteria) this;
        }

        public Criteria andReturn_phoneNotLike(String value) {
            addCriterion("return_phone not like", value, "return_phone");
            return (Criteria) this;
        }

        public Criteria andReturn_phoneIn(List<String> values) {
            addCriterion("return_phone in", values, "return_phone");
            return (Criteria) this;
        }

        public Criteria andReturn_phoneNotIn(List<String> values) {
            addCriterion("return_phone not in", values, "return_phone");
            return (Criteria) this;
        }

        public Criteria andReturn_phoneBetween(String value1, String value2) {
            addCriterion("return_phone between", value1, value2, "return_phone");
            return (Criteria) this;
        }

        public Criteria andReturn_phoneNotBetween(String value1, String value2) {
            addCriterion("return_phone not between", value1, value2, "return_phone");
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

        public Criteria andHandle_timeIsNull() {
            addCriterion("handle_time is null");
            return (Criteria) this;
        }

        public Criteria andHandle_timeIsNotNull() {
            addCriterion("handle_time is not null");
            return (Criteria) this;
        }

        public Criteria andHandle_timeEqualTo(Date value) {
            addCriterion("handle_time =", value, "handle_time");
            return (Criteria) this;
        }

        public Criteria andHandle_timeNotEqualTo(Date value) {
            addCriterion("handle_time <>", value, "handle_time");
            return (Criteria) this;
        }

        public Criteria andHandle_timeGreaterThan(Date value) {
            addCriterion("handle_time >", value, "handle_time");
            return (Criteria) this;
        }

        public Criteria andHandle_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("handle_time >=", value, "handle_time");
            return (Criteria) this;
        }

        public Criteria andHandle_timeLessThan(Date value) {
            addCriterion("handle_time <", value, "handle_time");
            return (Criteria) this;
        }

        public Criteria andHandle_timeLessThanOrEqualTo(Date value) {
            addCriterion("handle_time <=", value, "handle_time");
            return (Criteria) this;
        }

        public Criteria andHandle_timeIn(List<Date> values) {
            addCriterion("handle_time in", values, "handle_time");
            return (Criteria) this;
        }

        public Criteria andHandle_timeNotIn(List<Date> values) {
            addCriterion("handle_time not in", values, "handle_time");
            return (Criteria) this;
        }

        public Criteria andHandle_timeBetween(Date value1, Date value2) {
            addCriterion("handle_time between", value1, value2, "handle_time");
            return (Criteria) this;
        }

        public Criteria andHandle_timeNotBetween(Date value1, Date value2) {
            addCriterion("handle_time not between", value1, value2, "handle_time");
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

        public Criteria andProduct_countIsNull() {
            addCriterion("product_count is null");
            return (Criteria) this;
        }

        public Criteria andProduct_countIsNotNull() {
            addCriterion("product_count is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_countEqualTo(Integer value) {
            addCriterion("product_count =", value, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_countNotEqualTo(Integer value) {
            addCriterion("product_count <>", value, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_countGreaterThan(Integer value) {
            addCriterion("product_count >", value, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_count >=", value, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_countLessThan(Integer value) {
            addCriterion("product_count <", value, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_countLessThanOrEqualTo(Integer value) {
            addCriterion("product_count <=", value, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_countIn(List<Integer> values) {
            addCriterion("product_count in", values, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_countNotIn(List<Integer> values) {
            addCriterion("product_count not in", values, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_countBetween(Integer value1, Integer value2) {
            addCriterion("product_count between", value1, value2, "product_count");
            return (Criteria) this;
        }

        public Criteria andProduct_countNotBetween(Integer value1, Integer value2) {
            addCriterion("product_count not between", value1, value2, "product_count");
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

        public Criteria andProduct_real_priceIsNull() {
            addCriterion("product_real_price is null");
            return (Criteria) this;
        }

        public Criteria andProduct_real_priceIsNotNull() {
            addCriterion("product_real_price is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_real_priceEqualTo(BigDecimal value) {
            addCriterion("product_real_price =", value, "product_real_price");
            return (Criteria) this;
        }

        public Criteria andProduct_real_priceNotEqualTo(BigDecimal value) {
            addCriterion("product_real_price <>", value, "product_real_price");
            return (Criteria) this;
        }

        public Criteria andProduct_real_priceGreaterThan(BigDecimal value) {
            addCriterion("product_real_price >", value, "product_real_price");
            return (Criteria) this;
        }

        public Criteria andProduct_real_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("product_real_price >=", value, "product_real_price");
            return (Criteria) this;
        }

        public Criteria andProduct_real_priceLessThan(BigDecimal value) {
            addCriterion("product_real_price <", value, "product_real_price");
            return (Criteria) this;
        }

        public Criteria andProduct_real_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("product_real_price <=", value, "product_real_price");
            return (Criteria) this;
        }

        public Criteria andProduct_real_priceIn(List<BigDecimal> values) {
            addCriterion("product_real_price in", values, "product_real_price");
            return (Criteria) this;
        }

        public Criteria andProduct_real_priceNotIn(List<BigDecimal> values) {
            addCriterion("product_real_price not in", values, "product_real_price");
            return (Criteria) this;
        }

        public Criteria andProduct_real_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_real_price between", value1, value2, "product_real_price");
            return (Criteria) this;
        }

        public Criteria andProduct_real_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_real_price not between", value1, value2, "product_real_price");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andProof_picsIsNull() {
            addCriterion("proof_pics is null");
            return (Criteria) this;
        }

        public Criteria andProof_picsIsNotNull() {
            addCriterion("proof_pics is not null");
            return (Criteria) this;
        }

        public Criteria andProof_picsEqualTo(String value) {
            addCriterion("proof_pics =", value, "proof_pics");
            return (Criteria) this;
        }

        public Criteria andProof_picsNotEqualTo(String value) {
            addCriterion("proof_pics <>", value, "proof_pics");
            return (Criteria) this;
        }

        public Criteria andProof_picsGreaterThan(String value) {
            addCriterion("proof_pics >", value, "proof_pics");
            return (Criteria) this;
        }

        public Criteria andProof_picsGreaterThanOrEqualTo(String value) {
            addCriterion("proof_pics >=", value, "proof_pics");
            return (Criteria) this;
        }

        public Criteria andProof_picsLessThan(String value) {
            addCriterion("proof_pics <", value, "proof_pics");
            return (Criteria) this;
        }

        public Criteria andProof_picsLessThanOrEqualTo(String value) {
            addCriterion("proof_pics <=", value, "proof_pics");
            return (Criteria) this;
        }

        public Criteria andProof_picsLike(String value) {
            addCriterion("proof_pics like", value, "proof_pics");
            return (Criteria) this;
        }

        public Criteria andProof_picsNotLike(String value) {
            addCriterion("proof_pics not like", value, "proof_pics");
            return (Criteria) this;
        }

        public Criteria andProof_picsIn(List<String> values) {
            addCriterion("proof_pics in", values, "proof_pics");
            return (Criteria) this;
        }

        public Criteria andProof_picsNotIn(List<String> values) {
            addCriterion("proof_pics not in", values, "proof_pics");
            return (Criteria) this;
        }

        public Criteria andProof_picsBetween(String value1, String value2) {
            addCriterion("proof_pics between", value1, value2, "proof_pics");
            return (Criteria) this;
        }

        public Criteria andProof_picsNotBetween(String value1, String value2) {
            addCriterion("proof_pics not between", value1, value2, "proof_pics");
            return (Criteria) this;
        }

        public Criteria andHandle_noteIsNull() {
            addCriterion("handle_note is null");
            return (Criteria) this;
        }

        public Criteria andHandle_noteIsNotNull() {
            addCriterion("handle_note is not null");
            return (Criteria) this;
        }

        public Criteria andHandle_noteEqualTo(String value) {
            addCriterion("handle_note =", value, "handle_note");
            return (Criteria) this;
        }

        public Criteria andHandle_noteNotEqualTo(String value) {
            addCriterion("handle_note <>", value, "handle_note");
            return (Criteria) this;
        }

        public Criteria andHandle_noteGreaterThan(String value) {
            addCriterion("handle_note >", value, "handle_note");
            return (Criteria) this;
        }

        public Criteria andHandle_noteGreaterThanOrEqualTo(String value) {
            addCriterion("handle_note >=", value, "handle_note");
            return (Criteria) this;
        }

        public Criteria andHandle_noteLessThan(String value) {
            addCriterion("handle_note <", value, "handle_note");
            return (Criteria) this;
        }

        public Criteria andHandle_noteLessThanOrEqualTo(String value) {
            addCriterion("handle_note <=", value, "handle_note");
            return (Criteria) this;
        }

        public Criteria andHandle_noteLike(String value) {
            addCriterion("handle_note like", value, "handle_note");
            return (Criteria) this;
        }

        public Criteria andHandle_noteNotLike(String value) {
            addCriterion("handle_note not like", value, "handle_note");
            return (Criteria) this;
        }

        public Criteria andHandle_noteIn(List<String> values) {
            addCriterion("handle_note in", values, "handle_note");
            return (Criteria) this;
        }

        public Criteria andHandle_noteNotIn(List<String> values) {
            addCriterion("handle_note not in", values, "handle_note");
            return (Criteria) this;
        }

        public Criteria andHandle_noteBetween(String value1, String value2) {
            addCriterion("handle_note between", value1, value2, "handle_note");
            return (Criteria) this;
        }

        public Criteria andHandle_noteNotBetween(String value1, String value2) {
            addCriterion("handle_note not between", value1, value2, "handle_note");
            return (Criteria) this;
        }

        public Criteria andHandle_manIsNull() {
            addCriterion("handle_man is null");
            return (Criteria) this;
        }

        public Criteria andHandle_manIsNotNull() {
            addCriterion("handle_man is not null");
            return (Criteria) this;
        }

        public Criteria andHandle_manEqualTo(String value) {
            addCriterion("handle_man =", value, "handle_man");
            return (Criteria) this;
        }

        public Criteria andHandle_manNotEqualTo(String value) {
            addCriterion("handle_man <>", value, "handle_man");
            return (Criteria) this;
        }

        public Criteria andHandle_manGreaterThan(String value) {
            addCriterion("handle_man >", value, "handle_man");
            return (Criteria) this;
        }

        public Criteria andHandle_manGreaterThanOrEqualTo(String value) {
            addCriterion("handle_man >=", value, "handle_man");
            return (Criteria) this;
        }

        public Criteria andHandle_manLessThan(String value) {
            addCriterion("handle_man <", value, "handle_man");
            return (Criteria) this;
        }

        public Criteria andHandle_manLessThanOrEqualTo(String value) {
            addCriterion("handle_man <=", value, "handle_man");
            return (Criteria) this;
        }

        public Criteria andHandle_manLike(String value) {
            addCriterion("handle_man like", value, "handle_man");
            return (Criteria) this;
        }

        public Criteria andHandle_manNotLike(String value) {
            addCriterion("handle_man not like", value, "handle_man");
            return (Criteria) this;
        }

        public Criteria andHandle_manIn(List<String> values) {
            addCriterion("handle_man in", values, "handle_man");
            return (Criteria) this;
        }

        public Criteria andHandle_manNotIn(List<String> values) {
            addCriterion("handle_man not in", values, "handle_man");
            return (Criteria) this;
        }

        public Criteria andHandle_manBetween(String value1, String value2) {
            addCriterion("handle_man between", value1, value2, "handle_man");
            return (Criteria) this;
        }

        public Criteria andHandle_manNotBetween(String value1, String value2) {
            addCriterion("handle_man not between", value1, value2, "handle_man");
            return (Criteria) this;
        }

        public Criteria andReceive_manIsNull() {
            addCriterion("receive_man is null");
            return (Criteria) this;
        }

        public Criteria andReceive_manIsNotNull() {
            addCriterion("receive_man is not null");
            return (Criteria) this;
        }

        public Criteria andReceive_manEqualTo(String value) {
            addCriterion("receive_man =", value, "receive_man");
            return (Criteria) this;
        }

        public Criteria andReceive_manNotEqualTo(String value) {
            addCriterion("receive_man <>", value, "receive_man");
            return (Criteria) this;
        }

        public Criteria andReceive_manGreaterThan(String value) {
            addCriterion("receive_man >", value, "receive_man");
            return (Criteria) this;
        }

        public Criteria andReceive_manGreaterThanOrEqualTo(String value) {
            addCriterion("receive_man >=", value, "receive_man");
            return (Criteria) this;
        }

        public Criteria andReceive_manLessThan(String value) {
            addCriterion("receive_man <", value, "receive_man");
            return (Criteria) this;
        }

        public Criteria andReceive_manLessThanOrEqualTo(String value) {
            addCriterion("receive_man <=", value, "receive_man");
            return (Criteria) this;
        }

        public Criteria andReceive_manLike(String value) {
            addCriterion("receive_man like", value, "receive_man");
            return (Criteria) this;
        }

        public Criteria andReceive_manNotLike(String value) {
            addCriterion("receive_man not like", value, "receive_man");
            return (Criteria) this;
        }

        public Criteria andReceive_manIn(List<String> values) {
            addCriterion("receive_man in", values, "receive_man");
            return (Criteria) this;
        }

        public Criteria andReceive_manNotIn(List<String> values) {
            addCriterion("receive_man not in", values, "receive_man");
            return (Criteria) this;
        }

        public Criteria andReceive_manBetween(String value1, String value2) {
            addCriterion("receive_man between", value1, value2, "receive_man");
            return (Criteria) this;
        }

        public Criteria andReceive_manNotBetween(String value1, String value2) {
            addCriterion("receive_man not between", value1, value2, "receive_man");
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

        public Criteria andReceive_noteIsNull() {
            addCriterion("receive_note is null");
            return (Criteria) this;
        }

        public Criteria andReceive_noteIsNotNull() {
            addCriterion("receive_note is not null");
            return (Criteria) this;
        }

        public Criteria andReceive_noteEqualTo(String value) {
            addCriterion("receive_note =", value, "receive_note");
            return (Criteria) this;
        }

        public Criteria andReceive_noteNotEqualTo(String value) {
            addCriterion("receive_note <>", value, "receive_note");
            return (Criteria) this;
        }

        public Criteria andReceive_noteGreaterThan(String value) {
            addCriterion("receive_note >", value, "receive_note");
            return (Criteria) this;
        }

        public Criteria andReceive_noteGreaterThanOrEqualTo(String value) {
            addCriterion("receive_note >=", value, "receive_note");
            return (Criteria) this;
        }

        public Criteria andReceive_noteLessThan(String value) {
            addCriterion("receive_note <", value, "receive_note");
            return (Criteria) this;
        }

        public Criteria andReceive_noteLessThanOrEqualTo(String value) {
            addCriterion("receive_note <=", value, "receive_note");
            return (Criteria) this;
        }

        public Criteria andReceive_noteLike(String value) {
            addCriterion("receive_note like", value, "receive_note");
            return (Criteria) this;
        }

        public Criteria andReceive_noteNotLike(String value) {
            addCriterion("receive_note not like", value, "receive_note");
            return (Criteria) this;
        }

        public Criteria andReceive_noteIn(List<String> values) {
            addCriterion("receive_note in", values, "receive_note");
            return (Criteria) this;
        }

        public Criteria andReceive_noteNotIn(List<String> values) {
            addCriterion("receive_note not in", values, "receive_note");
            return (Criteria) this;
        }

        public Criteria andReceive_noteBetween(String value1, String value2) {
            addCriterion("receive_note between", value1, value2, "receive_note");
            return (Criteria) this;
        }

        public Criteria andReceive_noteNotBetween(String value1, String value2) {
            addCriterion("receive_note not between", value1, value2, "receive_note");
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