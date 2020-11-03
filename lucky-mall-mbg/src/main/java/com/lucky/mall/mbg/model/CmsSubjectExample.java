package com.lucky.mall.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsSubjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsSubjectExample() {
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

        public Criteria andCategory_idIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategory_idIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory_idEqualTo(Long value) {
            addCriterion("category_id =", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idNotEqualTo(Long value) {
            addCriterion("category_id <>", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idGreaterThan(Long value) {
            addCriterion("category_id >", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idGreaterThanOrEqualTo(Long value) {
            addCriterion("category_id >=", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idLessThan(Long value) {
            addCriterion("category_id <", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idLessThanOrEqualTo(Long value) {
            addCriterion("category_id <=", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idIn(List<Long> values) {
            addCriterion("category_id in", values, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idNotIn(List<Long> values) {
            addCriterion("category_id not in", values, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idBetween(Long value1, Long value2) {
            addCriterion("category_id between", value1, value2, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idNotBetween(Long value1, Long value2) {
            addCriterion("category_id not between", value1, value2, "category_id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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

        public Criteria andRecommend_statusIsNull() {
            addCriterion("recommend_status is null");
            return (Criteria) this;
        }

        public Criteria andRecommend_statusIsNotNull() {
            addCriterion("recommend_status is not null");
            return (Criteria) this;
        }

        public Criteria andRecommend_statusEqualTo(Integer value) {
            addCriterion("recommend_status =", value, "recommend_status");
            return (Criteria) this;
        }

        public Criteria andRecommend_statusNotEqualTo(Integer value) {
            addCriterion("recommend_status <>", value, "recommend_status");
            return (Criteria) this;
        }

        public Criteria andRecommend_statusGreaterThan(Integer value) {
            addCriterion("recommend_status >", value, "recommend_status");
            return (Criteria) this;
        }

        public Criteria andRecommend_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend_status >=", value, "recommend_status");
            return (Criteria) this;
        }

        public Criteria andRecommend_statusLessThan(Integer value) {
            addCriterion("recommend_status <", value, "recommend_status");
            return (Criteria) this;
        }

        public Criteria andRecommend_statusLessThanOrEqualTo(Integer value) {
            addCriterion("recommend_status <=", value, "recommend_status");
            return (Criteria) this;
        }

        public Criteria andRecommend_statusIn(List<Integer> values) {
            addCriterion("recommend_status in", values, "recommend_status");
            return (Criteria) this;
        }

        public Criteria andRecommend_statusNotIn(List<Integer> values) {
            addCriterion("recommend_status not in", values, "recommend_status");
            return (Criteria) this;
        }

        public Criteria andRecommend_statusBetween(Integer value1, Integer value2) {
            addCriterion("recommend_status between", value1, value2, "recommend_status");
            return (Criteria) this;
        }

        public Criteria andRecommend_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend_status not between", value1, value2, "recommend_status");
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

        public Criteria andCollect_countIsNull() {
            addCriterion("collect_count is null");
            return (Criteria) this;
        }

        public Criteria andCollect_countIsNotNull() {
            addCriterion("collect_count is not null");
            return (Criteria) this;
        }

        public Criteria andCollect_countEqualTo(Integer value) {
            addCriterion("collect_count =", value, "collect_count");
            return (Criteria) this;
        }

        public Criteria andCollect_countNotEqualTo(Integer value) {
            addCriterion("collect_count <>", value, "collect_count");
            return (Criteria) this;
        }

        public Criteria andCollect_countGreaterThan(Integer value) {
            addCriterion("collect_count >", value, "collect_count");
            return (Criteria) this;
        }

        public Criteria andCollect_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_count >=", value, "collect_count");
            return (Criteria) this;
        }

        public Criteria andCollect_countLessThan(Integer value) {
            addCriterion("collect_count <", value, "collect_count");
            return (Criteria) this;
        }

        public Criteria andCollect_countLessThanOrEqualTo(Integer value) {
            addCriterion("collect_count <=", value, "collect_count");
            return (Criteria) this;
        }

        public Criteria andCollect_countIn(List<Integer> values) {
            addCriterion("collect_count in", values, "collect_count");
            return (Criteria) this;
        }

        public Criteria andCollect_countNotIn(List<Integer> values) {
            addCriterion("collect_count not in", values, "collect_count");
            return (Criteria) this;
        }

        public Criteria andCollect_countBetween(Integer value1, Integer value2) {
            addCriterion("collect_count between", value1, value2, "collect_count");
            return (Criteria) this;
        }

        public Criteria andCollect_countNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_count not between", value1, value2, "collect_count");
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

        public Criteria andForward_countIsNull() {
            addCriterion("forward_count is null");
            return (Criteria) this;
        }

        public Criteria andForward_countIsNotNull() {
            addCriterion("forward_count is not null");
            return (Criteria) this;
        }

        public Criteria andForward_countEqualTo(Integer value) {
            addCriterion("forward_count =", value, "forward_count");
            return (Criteria) this;
        }

        public Criteria andForward_countNotEqualTo(Integer value) {
            addCriterion("forward_count <>", value, "forward_count");
            return (Criteria) this;
        }

        public Criteria andForward_countGreaterThan(Integer value) {
            addCriterion("forward_count >", value, "forward_count");
            return (Criteria) this;
        }

        public Criteria andForward_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("forward_count >=", value, "forward_count");
            return (Criteria) this;
        }

        public Criteria andForward_countLessThan(Integer value) {
            addCriterion("forward_count <", value, "forward_count");
            return (Criteria) this;
        }

        public Criteria andForward_countLessThanOrEqualTo(Integer value) {
            addCriterion("forward_count <=", value, "forward_count");
            return (Criteria) this;
        }

        public Criteria andForward_countIn(List<Integer> values) {
            addCriterion("forward_count in", values, "forward_count");
            return (Criteria) this;
        }

        public Criteria andForward_countNotIn(List<Integer> values) {
            addCriterion("forward_count not in", values, "forward_count");
            return (Criteria) this;
        }

        public Criteria andForward_countBetween(Integer value1, Integer value2) {
            addCriterion("forward_count between", value1, value2, "forward_count");
            return (Criteria) this;
        }

        public Criteria andForward_countNotBetween(Integer value1, Integer value2) {
            addCriterion("forward_count not between", value1, value2, "forward_count");
            return (Criteria) this;
        }

        public Criteria andCategory_nameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategory_nameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategory_nameEqualTo(String value) {
            addCriterion("category_name =", value, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameGreaterThan(String value) {
            addCriterion("category_name >", value, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameLessThan(String value) {
            addCriterion("category_name <", value, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameLike(String value) {
            addCriterion("category_name like", value, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameNotLike(String value) {
            addCriterion("category_name not like", value, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameIn(List<String> values) {
            addCriterion("category_name in", values, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "category_name");
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