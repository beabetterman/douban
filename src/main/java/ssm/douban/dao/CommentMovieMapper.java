package ssm.douban.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import ssm.douban.pojo.CommentMovie;
import ssm.douban.pojo.CommentMovieExample;

@Repository
public class CommentMovieMapper implements ICommentMovieMapper {

	@Override
	public long countByExample(CommentMovieExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(CommentMovieExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(CommentMovie record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(CommentMovie record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CommentMovie> selectByExample(CommentMovieExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommentMovie selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(CommentMovie record, CommentMovieExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(CommentMovie record, CommentMovieExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(CommentMovie record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(CommentMovie record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
