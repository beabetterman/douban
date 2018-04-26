package ssm.douban.pojo;

import java.util.ArrayList;
import java.util.List;

public class CommentMovieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CommentMovieExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setPageInfo(Integer currentPage, Integer pageSize) {
        if(pageSize<1) throw new IllegalArgumentException("页大小不能小于1！");
        this.limit=pageSize;
        if(currentPage<1) throw new IllegalArgumentException("页数不能小于1！");
        this.offset=(currentPage-1)*pageSize;
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUser_nameEqualTo(String value) {
            addCriterion("user_name =", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThan(String value) {
            addCriterion("user_name >", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThan(String value) {
            addCriterion("user_name <", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLike(String value) {
            addCriterion("user_name like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotLike(String value) {
            addCriterion("user_name not like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameIn(List<String> values) {
            addCriterion("user_name in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(String value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(String value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(String value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(String value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLike(String value) {
            addCriterion("user_id like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotLike(String value) {
            addCriterion("user_id not like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<String> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<String> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andMovie_nameIsNull() {
            addCriterion("movie_name is null");
            return (Criteria) this;
        }

        public Criteria andMovie_nameIsNotNull() {
            addCriterion("movie_name is not null");
            return (Criteria) this;
        }

        public Criteria andMovie_nameEqualTo(String value) {
            addCriterion("movie_name =", value, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameNotEqualTo(String value) {
            addCriterion("movie_name <>", value, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameGreaterThan(String value) {
            addCriterion("movie_name >", value, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameGreaterThanOrEqualTo(String value) {
            addCriterion("movie_name >=", value, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameLessThan(String value) {
            addCriterion("movie_name <", value, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameLessThanOrEqualTo(String value) {
            addCriterion("movie_name <=", value, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameLike(String value) {
            addCriterion("movie_name like", value, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameNotLike(String value) {
            addCriterion("movie_name not like", value, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameIn(List<String> values) {
            addCriterion("movie_name in", values, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameNotIn(List<String> values) {
            addCriterion("movie_name not in", values, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameBetween(String value1, String value2) {
            addCriterion("movie_name between", value1, value2, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameNotBetween(String value1, String value2) {
            addCriterion("movie_name not between", value1, value2, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_idIsNull() {
            addCriterion("movie_id is null");
            return (Criteria) this;
        }

        public Criteria andMovie_idIsNotNull() {
            addCriterion("movie_id is not null");
            return (Criteria) this;
        }

        public Criteria andMovie_idEqualTo(String value) {
            addCriterion("movie_id =", value, "movie_id");
            return (Criteria) this;
        }

        public Criteria andMovie_idNotEqualTo(String value) {
            addCriterion("movie_id <>", value, "movie_id");
            return (Criteria) this;
        }

        public Criteria andMovie_idGreaterThan(String value) {
            addCriterion("movie_id >", value, "movie_id");
            return (Criteria) this;
        }

        public Criteria andMovie_idGreaterThanOrEqualTo(String value) {
            addCriterion("movie_id >=", value, "movie_id");
            return (Criteria) this;
        }

        public Criteria andMovie_idLessThan(String value) {
            addCriterion("movie_id <", value, "movie_id");
            return (Criteria) this;
        }

        public Criteria andMovie_idLessThanOrEqualTo(String value) {
            addCriterion("movie_id <=", value, "movie_id");
            return (Criteria) this;
        }

        public Criteria andMovie_idLike(String value) {
            addCriterion("movie_id like", value, "movie_id");
            return (Criteria) this;
        }

        public Criteria andMovie_idNotLike(String value) {
            addCriterion("movie_id not like", value, "movie_id");
            return (Criteria) this;
        }

        public Criteria andMovie_idIn(List<String> values) {
            addCriterion("movie_id in", values, "movie_id");
            return (Criteria) this;
        }

        public Criteria andMovie_idNotIn(List<String> values) {
            addCriterion("movie_id not in", values, "movie_id");
            return (Criteria) this;
        }

        public Criteria andMovie_idBetween(String value1, String value2) {
            addCriterion("movie_id between", value1, value2, "movie_id");
            return (Criteria) this;
        }

        public Criteria andMovie_idNotBetween(String value1, String value2) {
            addCriterion("movie_id not between", value1, value2, "movie_id");
            return (Criteria) this;
        }

        public Criteria andRatingIsNull() {
            addCriterion("rating is null");
            return (Criteria) this;
        }

        public Criteria andRatingIsNotNull() {
            addCriterion("rating is not null");
            return (Criteria) this;
        }

        public Criteria andRatingEqualTo(Integer value) {
            addCriterion("rating =", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotEqualTo(Integer value) {
            addCriterion("rating <>", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThan(Integer value) {
            addCriterion("rating >", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThanOrEqualTo(Integer value) {
            addCriterion("rating >=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThan(Integer value) {
            addCriterion("rating <", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThanOrEqualTo(Integer value) {
            addCriterion("rating <=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingIn(List<Integer> values) {
            addCriterion("rating in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotIn(List<Integer> values) {
            addCriterion("rating not in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingBetween(Integer value1, Integer value2) {
            addCriterion("rating between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotBetween(Integer value1, Integer value2) {
            addCriterion("rating not between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andRating_descIsNull() {
            addCriterion("rating_desc is null");
            return (Criteria) this;
        }

        public Criteria andRating_descIsNotNull() {
            addCriterion("rating_desc is not null");
            return (Criteria) this;
        }

        public Criteria andRating_descEqualTo(String value) {
            addCriterion("rating_desc =", value, "rating_desc");
            return (Criteria) this;
        }

        public Criteria andRating_descNotEqualTo(String value) {
            addCriterion("rating_desc <>", value, "rating_desc");
            return (Criteria) this;
        }

        public Criteria andRating_descGreaterThan(String value) {
            addCriterion("rating_desc >", value, "rating_desc");
            return (Criteria) this;
        }

        public Criteria andRating_descGreaterThanOrEqualTo(String value) {
            addCriterion("rating_desc >=", value, "rating_desc");
            return (Criteria) this;
        }

        public Criteria andRating_descLessThan(String value) {
            addCriterion("rating_desc <", value, "rating_desc");
            return (Criteria) this;
        }

        public Criteria andRating_descLessThanOrEqualTo(String value) {
            addCriterion("rating_desc <=", value, "rating_desc");
            return (Criteria) this;
        }

        public Criteria andRating_descLike(String value) {
            addCriterion("rating_desc like", value, "rating_desc");
            return (Criteria) this;
        }

        public Criteria andRating_descNotLike(String value) {
            addCriterion("rating_desc not like", value, "rating_desc");
            return (Criteria) this;
        }

        public Criteria andRating_descIn(List<String> values) {
            addCriterion("rating_desc in", values, "rating_desc");
            return (Criteria) this;
        }

        public Criteria andRating_descNotIn(List<String> values) {
            addCriterion("rating_desc not in", values, "rating_desc");
            return (Criteria) this;
        }

        public Criteria andRating_descBetween(String value1, String value2) {
            addCriterion("rating_desc between", value1, value2, "rating_desc");
            return (Criteria) this;
        }

        public Criteria andRating_descNotBetween(String value1, String value2) {
            addCriterion("rating_desc not between", value1, value2, "rating_desc");
            return (Criteria) this;
        }

        public Criteria andVotes_numIsNull() {
            addCriterion("votes_num is null");
            return (Criteria) this;
        }

        public Criteria andVotes_numIsNotNull() {
            addCriterion("votes_num is not null");
            return (Criteria) this;
        }

        public Criteria andVotes_numEqualTo(Integer value) {
            addCriterion("votes_num =", value, "votes_num");
            return (Criteria) this;
        }

        public Criteria andVotes_numNotEqualTo(Integer value) {
            addCriterion("votes_num <>", value, "votes_num");
            return (Criteria) this;
        }

        public Criteria andVotes_numGreaterThan(Integer value) {
            addCriterion("votes_num >", value, "votes_num");
            return (Criteria) this;
        }

        public Criteria andVotes_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("votes_num >=", value, "votes_num");
            return (Criteria) this;
        }

        public Criteria andVotes_numLessThan(Integer value) {
            addCriterion("votes_num <", value, "votes_num");
            return (Criteria) this;
        }

        public Criteria andVotes_numLessThanOrEqualTo(Integer value) {
            addCriterion("votes_num <=", value, "votes_num");
            return (Criteria) this;
        }

        public Criteria andVotes_numIn(List<Integer> values) {
            addCriterion("votes_num in", values, "votes_num");
            return (Criteria) this;
        }

        public Criteria andVotes_numNotIn(List<Integer> values) {
            addCriterion("votes_num not in", values, "votes_num");
            return (Criteria) this;
        }

        public Criteria andVotes_numBetween(Integer value1, Integer value2) {
            addCriterion("votes_num between", value1, value2, "votes_num");
            return (Criteria) this;
        }

        public Criteria andVotes_numNotBetween(Integer value1, Integer value2) {
            addCriterion("votes_num not between", value1, value2, "votes_num");
            return (Criteria) this;
        }

        public Criteria andComment_typeIsNull() {
            addCriterion("comment_type is null");
            return (Criteria) this;
        }

        public Criteria andComment_typeIsNotNull() {
            addCriterion("comment_type is not null");
            return (Criteria) this;
        }

        public Criteria andComment_typeEqualTo(Integer value) {
            addCriterion("comment_type =", value, "comment_type");
            return (Criteria) this;
        }

        public Criteria andComment_typeNotEqualTo(Integer value) {
            addCriterion("comment_type <>", value, "comment_type");
            return (Criteria) this;
        }

        public Criteria andComment_typeGreaterThan(Integer value) {
            addCriterion("comment_type >", value, "comment_type");
            return (Criteria) this;
        }

        public Criteria andComment_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_type >=", value, "comment_type");
            return (Criteria) this;
        }

        public Criteria andComment_typeLessThan(Integer value) {
            addCriterion("comment_type <", value, "comment_type");
            return (Criteria) this;
        }

        public Criteria andComment_typeLessThanOrEqualTo(Integer value) {
            addCriterion("comment_type <=", value, "comment_type");
            return (Criteria) this;
        }

        public Criteria andComment_typeIn(List<Integer> values) {
            addCriterion("comment_type in", values, "comment_type");
            return (Criteria) this;
        }

        public Criteria andComment_typeNotIn(List<Integer> values) {
            addCriterion("comment_type not in", values, "comment_type");
            return (Criteria) this;
        }

        public Criteria andComment_typeBetween(Integer value1, Integer value2) {
            addCriterion("comment_type between", value1, value2, "comment_type");
            return (Criteria) this;
        }

        public Criteria andComment_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_type not between", value1, value2, "comment_type");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andUser_nameLikeInsensitive(String value) {
            addCriterion("upper(user_name) like", value.toUpperCase(), "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_idLikeInsensitive(String value) {
            addCriterion("upper(user_id) like", value.toUpperCase(), "user_id");
            return (Criteria) this;
        }

        public Criteria andMovie_nameLikeInsensitive(String value) {
            addCriterion("upper(movie_name) like", value.toUpperCase(), "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_idLikeInsensitive(String value) {
            addCriterion("upper(movie_id) like", value.toUpperCase(), "movie_id");
            return (Criteria) this;
        }

        public Criteria andRating_descLikeInsensitive(String value) {
            addCriterion("upper(rating_desc) like", value.toUpperCase(), "rating_desc");
            return (Criteria) this;
        }

        public Criteria andCommentLikeInsensitive(String value) {
            addCriterion("upper(comment) like", value.toUpperCase(), "comment");
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