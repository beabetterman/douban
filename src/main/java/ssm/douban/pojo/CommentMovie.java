package ssm.douban.pojo;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class CommentMovie implements Serializable {
    private Integer id;

    /**
    * 用户名
    **/
    private String user_name;

    /**
    * 用户ID
    **/
    private String user_id;

    /**
    * 电影名
    **/
    private String movie_name;

    /**
    * 电影ID
    **/
    private String movie_id;

    /**
    * rating 10,20,30,40,50. 0 means not rated
    **/
    private Integer rating;

    /**
    * rating的说明
    **/
    private String rating_desc;

    /**
    * 被点击有用次数
    **/
    private Integer votes_num;

    /**
    * 1 短评，2 长评
    **/
    private Integer comment_type;

    /**
    * 评论内容
    **/
    private String comment;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public CommentMovie withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public CommentMovie withUser_name(String user_name) {
        this.setUser_name(user_name);
        return this;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getUser_id() {
        return user_id;
    }

    public CommentMovie withUser_id(String user_id) {
        this.setUser_id(user_id);
        return this;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id == null ? null : user_id.trim();
    }

    public String getMovie_name() {
        return movie_name;
    }

    public CommentMovie withMovie_name(String movie_name) {
        this.setMovie_name(movie_name);
        return this;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name == null ? null : movie_name.trim();
    }

    public String getMovie_id() {
        return movie_id;
    }

    public CommentMovie withMovie_id(String movie_id) {
        this.setMovie_id(movie_id);
        return this;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id == null ? null : movie_id.trim();
    }

    public Integer getRating() {
        return rating;
    }

    public CommentMovie withRating(Integer rating) {
        this.setRating(rating);
        return this;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getRating_desc() {
        return rating_desc;
    }

    public CommentMovie withRating_desc(String rating_desc) {
        this.setRating_desc(rating_desc);
        return this;
    }

    public void setRating_desc(String rating_desc) {
        this.rating_desc = rating_desc == null ? null : rating_desc.trim();
    }

    public Integer getVotes_num() {
        return votes_num;
    }

    public CommentMovie withVotes_num(Integer votes_num) {
        this.setVotes_num(votes_num);
        return this;
    }

    public void setVotes_num(Integer votes_num) {
        this.votes_num = votes_num;
    }

    public Integer getComment_type() {
        return comment_type;
    }

    public CommentMovie withComment_type(Integer comment_type) {
        this.setComment_type(comment_type);
        return this;
    }

    public void setComment_type(Integer comment_type) {
        this.comment_type = comment_type;
    }

    public String getComment() {
        return comment;
    }

    public CommentMovie withComment(String comment) {
        this.setComment(comment);
        return this;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user_name=").append(user_name);
        sb.append(", user_id=").append(user_id);
        sb.append(", movie_name=").append(movie_name);
        sb.append(", movie_id=").append(movie_id);
        sb.append(", rating=").append(rating);
        sb.append(", rating_desc=").append(rating_desc);
        sb.append(", votes_num=").append(votes_num);
        sb.append(", comment_type=").append(comment_type);
        sb.append(", comment=").append(comment);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CommentMovie other = (CommentMovie) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_name() == null ? other.getUser_name() == null : this.getUser_name().equals(other.getUser_name()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getMovie_name() == null ? other.getMovie_name() == null : this.getMovie_name().equals(other.getMovie_name()))
            && (this.getMovie_id() == null ? other.getMovie_id() == null : this.getMovie_id().equals(other.getMovie_id()))
            && (this.getRating() == null ? other.getRating() == null : this.getRating().equals(other.getRating()))
            && (this.getRating_desc() == null ? other.getRating_desc() == null : this.getRating_desc().equals(other.getRating_desc()))
            && (this.getVotes_num() == null ? other.getVotes_num() == null : this.getVotes_num().equals(other.getVotes_num()))
            && (this.getComment_type() == null ? other.getComment_type() == null : this.getComment_type().equals(other.getComment_type()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_name() == null) ? 0 : getUser_name().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getMovie_name() == null) ? 0 : getMovie_name().hashCode());
        result = prime * result + ((getMovie_id() == null) ? 0 : getMovie_id().hashCode());
        result = prime * result + ((getRating() == null) ? 0 : getRating().hashCode());
        result = prime * result + ((getRating_desc() == null) ? 0 : getRating_desc().hashCode());
        result = prime * result + ((getVotes_num() == null) ? 0 : getVotes_num().hashCode());
        result = prime * result + ((getComment_type() == null) ? 0 : getComment_type().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        return result;
    }
}