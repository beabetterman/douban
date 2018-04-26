package ssm.douban.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.douban.dao.CommentMovieMapper;
import ssm.douban.pojo.CommentMovie;
import ssm.douban.pojo.CommentMovieExample;
import ssm.douban.service.ICommentMovieService;

@Service("commentMoiveService")
public class CommentMovieServiceImpl implements ICommentMovieService {

	@Autowired//(required=false)
	private CommentMovieMapper commentMovieMapper;
	
	
	public CommentMovie selectById(int id) {
		// TODO Auto-generated method stub
		System.out.println("In CommentMovieServiceImpl, selectById");
		return this.commentMovieMapper.selectByPrimaryKey(id);
	}


	public List<CommentMovie> getAllCommentMovie(int offset, int rows) {
		CommentMovieExample queryInstance = new CommentMovieExample();
		//queryInstance.setOrderByClause(" id limit " + offset + "," + rows + " ");
		queryInstance.setOffset(offset);
		queryInstance.setLimit(rows);
		//queryInstance.createCriteria();
		return this.commentMovieMapper.selectByExample(queryInstance);
	}

}
