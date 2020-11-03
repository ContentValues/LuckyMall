package com.lucky.mall.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmsCouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmsCouponExample() {
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

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(Integer value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(Integer value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(Integer value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(Integer value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(Integer value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(Integer value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<Integer> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<Integer> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(Integer value1, Integer value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(Integer value1, Integer value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPer_limitIsNull() {
            addCriterion("per_limit is null");
            return (Criteria) this;
        }

        public Criteria andPer_limitIsNotNull() {
            addCriterion("per_limit is not null");
            return (Criteria) this;
        }

        public Criteria andPer_limitEqualTo(Integer value) {
            addCriterion("per_limit =", value, "per_limit");
            return (Criteria) this;
        }

        public Criteria andPer_limitNotEqualTo(Integer value) {
            addCriterion("per_limit <>", value, "per_limit");
            return (Criteria) this;
        }

        public Criteria andPer_limitGreaterThan(Integer value) {
            addCriterion("per_limit >", value, "per_limit");
            return (Criteria) this;
        }

        public Criteria andPer_limitGreaterThanOrEqualTo(Integer value) {
            addCriterion("per_limit >=", value, "per_limit");
            return (Criteria) this;
        }

        public Criteria andPer_limitLessThan(Integer value) {
            addCriterion("per_limit <", value, "per_limit");
            return (Criteria) this;
        }

        public Criteria andPer_limitLessThanOrEqualTo(Integer value) {
            addCriterion("per_limit <=", value, "per_limit");
            return (Criteria) this;
        }

        public Criteria andPer_limitIn(List<Integer> values) {
            addCriterion("per_limit in", values, "per_limit");
            return (Criteria) this;
        }

        public Criteria andPer_limitNotIn(List<Integer> values) {
            addCriterion("per_limit not in", values, "per_limit");
            return (Criteria) this;
        }

        public Criteria andPer_limitBetween(Integer value1, Integer value2) {
            addCriterion("per_limit between", value1, value2, "per_limit");
            return (Criteria) this;
        }

        public Criteria andPer_limitNotBetween(Integer value1, Integer value2) {
            addCriterion("per_limit not between", value1, value2, "per_limit");
            return (Criteria) this;
        }

        public Criteria andMin_pointIsNull() {
            addCriterion("min_point is null");
            return (Criteria) this;
        }

        public Criteria andMin_pointIsNotNull() {
            addCriterion("min_point is not null");
            return (Criteria) this;
        }

        public Criteria andMin_pointEqualTo(BigDecimal value) {
            addCriterion("min_point =", value, "min_point");
            return (Criteria) this;
        }

        public Criteria andMin_pointNotEqualTo(BigDecimal value) {
            addCriterion("min_point <>", value, "min_point");
            return (Criteria) this;
        }

        public Criteria andMin_pointGreaterThan(BigDecimal value) {
            addCriterion("min_point >", value, "min_point");
            return (Criteria) this;
        }

        public Criteria andMin_pointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_point >=", value, "min_point");
            return (Criteria) this;
        }

        public Criteria andMin_pointLessThan(BigDecimal value) {
            addCriterion("min_point <", value, "min_point");
            return (Criteria) this;
        }

        public Criteria andMin_pointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_point <=", value, "min_point");
            return (Criteria) this;
        }

        public Criteria andMin_pointIn(List<BigDecimal> values) {
            addCriterion("min_point in", values, "min_point");
            return (Criteria) this;
        }

        public Criteria andMin_pointNotIn(List<BigDecimal> values) {
            addCriterion("min_point not in", values, "min_point");
            return (Criteria) this;
        }

        public Criteria andMin_pointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_point between", value1, value2, "min_point");
            return (Criteria) this;
        }

        public Criteria andMin_pointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_point not between", value1, value2, "min_point");
            return (Criteria) this;
        }

        public Criteria andStart_timeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStart_timeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStart_timeEqualTo(Date value) {
            addCriterion("start_time =", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeGreaterThan(Date value) {
            addCriterion("start_time >", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeLessThan(Date value) {
            addCriterion("start_time <", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeIn(List<Date> values) {
            addCriterion("start_time in", values, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "start_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeEqualTo(Date value) {
            addCriterion("end_time =", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThan(Date value) {
            addCriterion("end_time >", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThan(Date value) {
            addCriterion("end_time <", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIn(List<Date> values) {
            addCriterion("end_time in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andUse_typeIsNull() {
            addCriterion("use_type is null");
            return (Criteria) this;
        }

        public Criteria andUse_typeIsNotNull() {
            addCriterion("use_type is not null");
            return (Criteria) this;
        }

        public Criteria andUse_typeEqualTo(Integer value) {
            addCriterion("use_type =", value, "use_type");
            return (Criteria) this;
        }

        public Criteria andUse_typeNotEqualTo(Integer value) {
            addCriterion("use_type <>", value, "use_type");
            return (Criteria) this;
        }

        public Criteria andUse_typeGreaterThan(Integer value) {
            addCriterion("use_type >", value, "use_type");
            return (Criteria) this;
        }

        public Criteria andUse_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_type >=", value, "use_type");
            return (Criteria) this;
        }

        public Criteria andUse_typeLessThan(Integer value) {
            addCriterion("use_type <", value, "use_type");
            return (Criteria) this;
        }

        public Criteria andUse_typeLessThanOrEqualTo(Integer value) {
            addCriterion("use_type <=", value, "use_type");
            return (Criteria) this;
        }

        public Criteria andUse_typeIn(List<Integer> values) {
            addCriterion("use_type in", values, "use_type");
            return (Criteria) this;
        }

        public Criteria andUse_typeNotIn(List<Integer> values) {
            addCriterion("use_type not in", values, "use_type");
            return (Criteria) this;
        }

        public Criteria andUse_typeBetween(Integer value1, Integer value2) {
            addCriterion("use_type between", value1, value2, "use_type");
            return (Criteria) this;
        }

        public Criteria andUse_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("use_type not between", value1, value2, "use_type");
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

        public Criteria andPublish_countIsNull() {
            addCriterion("publish_count is null");
            return (Criteria) this;
        }

        public Criteria andPublish_countIsNotNull() {
            addCriterion("publish_count is not null");
            return (Criteria) this;
        }

        public Criteria andPublish_countEqualTo(Integer value) {
            addCriterion("publish_count =", value, "publish_count");
            return (Criteria) this;
        }

        public Criteria andPublish_countNotEqualTo(Integer value) {
            addCriterion("publish_count <>", value, "publish_count");
            return (Criteria) this;
        }

        public Criteria andPublish_countGreaterThan(Integer value) {
            addCriterion("publish_count >", value, "publish_count");
            return (Criteria) this;
        }

        public Criteria andPublish_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_count >=", value, "publish_count");
            return (Criteria) this;
        }

        public Criteria andPublish_countLessThan(Integer value) {
            addCriterion("publish_count <", value, "publish_count");
            return (Criteria) this;
        }

        public Criteria andPublish_countLessThanOrEqualTo(Integer value) {
            addCriterion("publish_count <=", value, "publish_count");
            return (Criteria) this;
        }

        public Criteria andPublish_countIn(List<Integer> values) {
            addCriterion("publish_count in", values, "publish_count");
            return (Criteria) this;
        }

        public Criteria andPublish_countNotIn(List<Integer> values) {
            addCriterion("publish_count not in", values, "publish_count");
            return (Criteria) this;
        }

        public Criteria andPublish_countBetween(Integer value1, Integer value2) {
            addCriterion("publish_count between", value1, value2, "publish_count");
            return (Criteria) this;
        }

        public Criteria andPublish_countNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_count not between", value1, value2, "publish_count");
            return (Criteria) this;
        }

        public Criteria andUse_countIsNull() {
            addCriterion("use_count is null");
            return (Criteria) this;
        }

        public Criteria andUse_countIsNotNull() {
            addCriterion("use_count is not null");
            return (Criteria) this;
        }

        public Criteria andUse_countEqualTo(Integer value) {
            addCriterion("use_count =", value, "use_count");
            return (Criteria) this;
        }

        public Criteria andUse_countNotEqualTo(Integer value) {
            addCriterion("use_count <>", value, "use_count");
            return (Criteria) this;
        }

        public Criteria andUse_countGreaterThan(Integer value) {
            addCriterion("use_count >", value, "use_count");
            return (Criteria) this;
        }

        public Criteria andUse_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_count >=", value, "use_count");
            return (Criteria) this;
        }

        public Criteria andUse_countLessThan(Integer value) {
            addCriterion("use_count <", value, "use_count");
            return (Criteria) this;
        }

        public Criteria andUse_countLessThanOrEqualTo(Integer value) {
            addCriterion("use_count <=", value, "use_count");
            return (Criteria) this;
        }

        public Criteria andUse_countIn(List<Integer> values) {
            addCriterion("use_count in", values, "use_count");
            return (Criteria) this;
        }

        public Criteria andUse_countNotIn(List<Integer> values) {
            addCriterion("use_count not in", values, "use_count");
            return (Criteria) this;
        }

        public Criteria andUse_countBetween(Integer value1, Integer value2) {
            addCriterion("use_count between", value1, value2, "use_count");
            return (Criteria) this;
        }

        public Criteria andUse_countNotBetween(Integer value1, Integer value2) {
            addCriterion("use_count not between", value1, value2, "use_count");
            return (Criteria) this;
        }

        public Criteria andReceive_countIsNull() {
            addCriterion("receive_count is null");
            return (Criteria) this;
        }

        public Criteria andReceive_countIsNotNull() {
            addCriterion("receive_count is not null");
            return (Criteria) this;
        }

        public Criteria andReceive_countEqualTo(Integer value) {
            addCriterion("receive_count =", value, "receive_count");
            return (Criteria) this;
        }

        public Criteria andReceive_countNotEqualTo(Integer value) {
            addCriterion("receive_count <>", value, "receive_count");
            return (Criteria) this;
        }

        public Criteria andReceive_countGreaterThan(Integer value) {
            addCriterion("receive_count >", value, "receive_count");
            return (Criteria) this;
        }

        public Criteria andReceive_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_count >=", value, "receive_count");
            return (Criteria) this;
        }

        public Criteria andReceive_countLessThan(Integer value) {
            addCriterion("receive_count <", value, "receive_count");
            return (Criteria) this;
        }

        public Criteria andReceive_countLessThanOrEqualTo(Integer value) {
            addCriterion("receive_count <=", value, "receive_count");
            return (Criteria) this;
        }

        public Criteria andReceive_countIn(List<Integer> values) {
            addCriterion("receive_count in", values, "receive_count");
            return (Criteria) this;
        }

        public Criteria andReceive_countNotIn(List<Integer> values) {
            addCriterion("receive_count not in", values, "receive_count");
            return (Criteria) this;
        }

        public Criteria andReceive_countBetween(Integer value1, Integer value2) {
            addCriterion("receive_count between", value1, value2, "receive_count");
            return (Criteria) this;
        }

        public Criteria andReceive_countNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_count not between", value1, value2, "receive_count");
            return (Criteria) this;
        }

        public Criteria andEnable_timeIsNull() {
            addCriterion("enable_time is null");
            return (Criteria) this;
        }

        public Criteria andEnable_timeIsNotNull() {
            addCriterion("enable_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnable_timeEqualTo(Date value) {
            addCriterion("enable_time =", value, "enable_time");
            return (Criteria) this;
        }

        public Criteria andEnable_timeNotEqualTo(Date value) {
            addCriterion("enable_time <>", value, "enable_time");
            return (Criteria) this;
        }

        public Criteria andEnable_timeGreaterThan(Date value) {
            addCriterion("enable_time >", value, "enable_time");
            return (Criteria) this;
        }

        public Criteria andEnable_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("enable_time >=", value, "enable_time");
            return (Criteria) this;
        }

        public Criteria andEnable_timeLessThan(Date value) {
            addCriterion("enable_time <", value, "enable_time");
            return (Criteria) this;
        }

        public Criteria andEnable_timeLessThanOrEqualTo(Date value) {
            addCriterion("enable_time <=", value, "enable_time");
            return (Criteria) this;
        }

        public Criteria andEnable_timeIn(List<Date> values) {
            addCriterion("enable_time in", values, "enable_time");
            return (Criteria) this;
        }

        public Criteria andEnable_timeNotIn(List<Date> values) {
            addCriterion("enable_time not in", values, "enable_time");
            return (Criteria) this;
        }

        public Criteria andEnable_timeBetween(Date value1, Date value2) {
            addCriterion("enable_time between", value1, value2, "enable_time");
            return (Criteria) this;
        }

        public Criteria andEnable_timeNotBetween(Date value1, Date value2) {
            addCriterion("enable_time not between", value1, value2, "enable_time");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andMember_levelIsNull() {
            addCriterion("member_level is null");
            return (Criteria) this;
        }

        public Criteria andMember_levelIsNotNull() {
            addCriterion("member_level is not null");
            return (Criteria) this;
        }

        public Criteria andMember_levelEqualTo(Integer value) {
            addCriterion("member_level =", value, "member_level");
            return (Criteria) this;
        }

        public Criteria andMember_levelNotEqualTo(Integer value) {
            addCriterion("member_level <>", value, "member_level");
            return (Criteria) this;
        }

        public Criteria andMember_levelGreaterThan(Integer value) {
            addCriterion("member_level >", value, "member_level");
            return (Criteria) this;
        }

        public Criteria andMember_levelGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_level >=", value, "member_level");
            return (Criteria) this;
        }

        public Criteria andMember_levelLessThan(Integer value) {
            addCriterion("member_level <", value, "member_level");
            return (Criteria) this;
        }

        public Criteria andMember_levelLessThanOrEqualTo(Integer value) {
            addCriterion("member_level <=", value, "member_level");
            return (Criteria) this;
        }

        public Criteria andMember_levelIn(List<Integer> values) {
            addCriterion("member_level in", values, "member_level");
            return (Criteria) this;
        }

        public Criteria andMember_levelNotIn(List<Integer> values) {
            addCriterion("member_level not in", values, "member_level");
            return (Criteria) this;
        }

        public Criteria andMember_levelBetween(Integer value1, Integer value2) {
            addCriterion("member_level between", value1, value2, "member_level");
            return (Criteria) this;
        }

        public Criteria andMember_levelNotBetween(Integer value1, Integer value2) {
            addCriterion("member_level not between", value1, value2, "member_level");
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