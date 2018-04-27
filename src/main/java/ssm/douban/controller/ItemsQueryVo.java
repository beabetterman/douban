package ssm.douban.controller;

import java.util.List;

import ssm.douban.pojo.CommentMovie;

public class ItemsQueryVo {
    private CommentMovie commentMovie;
    
    private List<CommentMovie> itemsList;
   
	public List<CommentMovie> getItemsList() {
		return itemsList;
	}
	public void setItemsList(List<CommentMovie> itemsList) {
		this.itemsList = itemsList;
	}
	public CommentMovie getCommentMovie() {
		return commentMovie;
	}
	public void setCommentMovie(CommentMovie commentMovie) {
		this.commentMovie = commentMovie;
	}
}
