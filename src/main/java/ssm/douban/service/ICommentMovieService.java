package ssm.douban.service;

import java.util.List;

import ssm.douban.pojo.CommentMovie;

public interface ICommentMovieService {

	CommentMovie selectById(int id);
	List<CommentMovie> getAllCommentMovie(int offset, int rows);
	List<CommentMovie> getCommentMovieByIds(List<Integer> ids);
	public List<CommentMovie> getCommentMovieByInstance(CommentMovie cm);
	public boolean updateMultiItems(List<CommentMovie> cmList);
}
