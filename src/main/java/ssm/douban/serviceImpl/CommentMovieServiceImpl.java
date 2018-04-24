package ssm.douban.serviceImpl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ssm.douban.dao.ICommentMovieDao;
import ssm.douban.pojo.CommentMovie;
import ssm.douban.pojo.CommentMovieExample;
import ssm.douban.service.ICommentMovieService;

@Service("commentMoiveService")
public class CommentMovieServiceImpl implements ICommentMovieService {

	@Resource
	private ICommentMovieDao commentMovieDao;
	
	
	public CommentMovie selectById(int id) {
		// TODO Auto-generated method stub
		System.out.println("In CommentMovieServiceImpl, selectById");
		return this.commentMovieDao.selectByPrimaryKey(id);
	}


	public List<CommentMovie> getAllCommentMovie(int offset, int rows) {
		CommentMovieExample queryInstance = new CommentMovieExample();
		queryInstance.setOrderByClause(" id limit " + offset + "," + rows + " ");
		//queryInstance.createCriteria();
		return this.commentMovieDao.selectByExample(queryInstance);
	}

}
