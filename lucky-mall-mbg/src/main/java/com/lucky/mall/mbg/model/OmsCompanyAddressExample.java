package com.lucky.mall.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class OmsCompanyAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsCompanyAddressExample() {
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

        public Criteria andAddress_nameIsNull() {
            addCriterion("address_name is null");
            return (Criteria) this;
        }

        public Criteria andAddress_nameIsNotNull() {
            addCriterion("address_name is not null");
            return (Criteria) this;
        }

        public Criteria andAddress_nameEqualTo(String value) {
            addCriterion("address_name =", value, "address_name");
            return (Criteria) this;
        }

        public Criteria andAddress_nameNotEqualTo(String value) {
            addCriterion("address_name <>", value, "address_name");
            return (Criteria) this;
        }

        public Criteria andAddress_nameGreaterThan(String value) {
            addCriterion("address_name >", value, "address_name");
            return (Criteria) this;
        }

        public Criteria andAddress_nameGreaterThanOrEqualTo(String value) {
            addCriterion("address_name >=", value, "address_name");
            return (Criteria) this;
        }

        public Criteria andAddress_nameLessThan(String value) {
            addCriterion("address_name <", value, "address_name");
            return (Criteria) this;
        }

        public Criteria andAddress_nameLessThanOrEqualTo(String value) {
            addCriterion("address_name <=", value, "address_name");
            return (Criteria) this;
        }

        public Criteria andAddress_nameLike(String value) {
            addCriterion("address_name like", value, "address_name");
            return (Criteria) this;
        }

        public Criteria andAddress_nameNotLike(String value) {
            addCriterion("address_name not like", value, "address_name");
            return (Criteria) this;
        }

        public Criteria andAddress_nameIn(List<String> values) {
            addCriterion("address_name in", values, "address_name");
            return (Criteria) this;
        }

        public Criteria andAddress_nameNotIn(List<String> values) {
            addCriterion("address_name not in", values, "address_name");
            return (Criteria) this;
        }

        public Criteria andAddress_nameBetween(String value1, String value2) {
            addCriterion("address_name between", value1, value2, "address_name");
            return (Criteria) this;
        }

        public Criteria andAddress_nameNotBetween(String value1, String value2) {
            addCriterion("address_name not between", value1, value2, "address_name");
            return (Criteria) this;
        }

        public Criteria andSend_statusIsNull() {
            addCriterion("send_status is null");
            return (Criteria) this;
        }

        public Criteria andSend_statusIsNotNull() {
            addCriterion("send_status is not null");
            return (Criteria) this;
        }

        public Criteria andSend_statusEqualTo(Integer value) {
            addCriterion("send_status =", value, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusNotEqualTo(Integer value) {
            addCriterion("send_status <>", value, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusGreaterThan(Integer value) {
            addCriterion("send_status >", value, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_status >=", value, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusLessThan(Integer value) {
            addCriterion("send_status <", value, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusLessThanOrEqualTo(Integer value) {
            addCriterion("send_status <=", value, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusIn(List<Integer> values) {
            addCriterion("send_status in", values, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusNotIn(List<Integer> values) {
            addCriterion("send_status not in", values, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusBetween(Integer value1, Integer value2) {
            addCriterion("send_status between", value1, value2, "send_status");
            return (Criteria) this;
        }

        public Criteria andSend_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("send_status not between", value1, value2, "send_status");
            return (Criteria) this;
        }

        public Criteria andReceive_statusIsNull() {
            addCriterion("receive_status is null");
            return (Criteria) this;
        }

        public Criteria andReceive_statusIsNotNull() {
            addCriterion("receive_status is not null");
            return (Criteria) this;
        }

        public Criteria andReceive_statusEqualTo(Integer value) {
            addCriterion("receive_status =", value, "receive_status");
            return (Criteria) this;
        }

        public Criteria andReceive_statusNotEqualTo(Integer value) {
            addCriterion("receive_status <>", value, "receive_status");
            return (Criteria) this;
        }

        public Criteria andReceive_statusGreaterThan(Integer value) {
            addCriterion("receive_status >", value, "receive_status");
            return (Criteria) this;
        }

        public Criteria andReceive_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_status >=", value, "receive_status");
            return (Criteria) this;
        }

        public Criteria andReceive_statusLessThan(Integer value) {
            addCriterion("receive_status <", value, "receive_status");
            return (Criteria) this;
        }

        public Criteria andReceive_statusLessThanOrEqualTo(Integer value) {
            addCriterion("receive_status <=", value, "receive_status");
            return (Criteria) this;
        }

        public Criteria andReceive_statusIn(List<Integer> values) {
            addCriterion("receive_status in", values, "receive_status");
            return (Criteria) this;
        }

        public Criteria andReceive_statusNotIn(List<Integer> values) {
            addCriterion("receive_status not in", values, "receive_status");
            return (Criteria) this;
        }

        public Criteria andReceive_statusBetween(Integer value1, Integer value2) {
            addCriterion("receive_status between", value1, value2, "receive_status");
            return (Criteria) this;
        }

        public Criteria andReceive_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_status not between", value1, value2, "receive_status");
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andDetail_addressIsNull() {
            addCriterion("detail_address is null");
            return (Criteria) this;
        }

        public Criteria andDetail_addressIsNotNull() {
            addCriterion("detail_address is not null");
            return (Criteria) this;
        }

        public Criteria andDetail_addressEqualTo(String value) {
            addCriterion("detail_address =", value, "detail_address");
            return (Criteria) this;
        }

        public Criteria andDetail_addressNotEqualTo(String value) {
            addCriterion("detail_address <>", value, "detail_address");
            return (Criteria) this;
        }

        public Criteria andDetail_addressGreaterThan(String value) {
            addCriterion("detail_address >", value, "detail_address");
            return (Criteria) this;
        }

        public Criteria andDetail_addressGreaterThanOrEqualTo(String value) {
            addCriterion("detail_address >=", value, "detail_address");
            return (Criteria) this;
        }

        public Criteria andDetail_addressLessThan(String value) {
            addCriterion("detail_address <", value, "detail_address");
            return (Criteria) this;
        }

        public Criteria andDetail_addressLessThanOrEqualTo(String value) {
            addCriterion("detail_address <=", value, "detail_address");
            return (Criteria) this;
        }

        public Criteria andDetail_addressLike(String value) {
            addCriterion("detail_address like", value, "detail_address");
            return (Criteria) this;
        }

        public Criteria andDetail_addressNotLike(String value) {
            addCriterion("detail_address not like", value, "detail_address");
            return (Criteria) this;
        }

        public Criteria andDetail_addressIn(List<String> values) {
            addCriterion("detail_address in", values, "detail_address");
            return (Criteria) this;
        }

        public Criteria andDetail_addressNotIn(List<String> values) {
            addCriterion("detail_address not in", values, "detail_address");
            return (Criteria) this;
        }

        public Criteria andDetail_addressBetween(String value1, String value2) {
            addCriterion("detail_address between", value1, value2, "detail_address");
            return (Criteria) this;
        }

        public Criteria andDetail_addressNotBetween(String value1, String value2) {
            addCriterion("detail_address not between", value1, value2, "detail_address");
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