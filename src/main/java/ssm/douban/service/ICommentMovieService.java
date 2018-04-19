package ssm.douban.service;

import java.util.List;

import ssm.douban.pojo.CommentMovie;

public interface ICommentMovieService {

	CommentMovie selectById(int id);
	List<CommentMovie> getAllCommentMovie();
}
