package ssm.douban.serviceImpl;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.util.StringUtils;

import ssm.douban.dao.CommentMovieMapper;
import ssm.douban.pojo.CommentMovie;
import ssm.douban.pojo.CommentMovieExample;
import ssm.douban.service.ICommentMovieService;

@Service("commentMoiveService")
public class CommentMovieServiceImpl implements ICommentMovieService {

	Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	private DataSourceTransactionManager transactionManager;
	
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
	
	public List<CommentMovie> getCommentMovieByIds(List<Integer> ids){
		CommentMovieExample cme = new CommentMovieExample();
		cme.createCriteria().andIdIn(ids);
		String idstring = "";
		for(Integer i : ids) {
			idstring += i+",";
		}
		logger.info(String.format("Query ids list is %s ", idstring));
		return this.commentMovieMapper.selectByExample(cme);
	}
	
	// TODO add more condition to CommentMovie instance.
	public List<CommentMovie> getCommentMovieByInstance(CommentMovie cm){
		CommentMovieExample cme = new CommentMovieExample();
		cme.setOffset(0);
		cme.setLimit(200);
		CommentMovieExample.Criteria criteria = cme.createCriteria();
		if(cm.getRating() != null) {
			criteria.andRatingEqualTo(cm.getRating());
		}
		
		if( ! StringUtils.isEmpty(cm.getMovie_name()) ) {
			criteria.andMovie_nameLike("%"+cm.getMovie_name()+"%");
		}
		
		logger.info(String.format("Query condition: id like %d , name like %s", cm.getId(), cm.getMovie_name()));
		return this.commentMovieMapper.selectByExample(cme);
	}
	
	
	public boolean updateMultiItems(List<CommentMovie> cmList) {
		
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			for(CommentMovie cm : cmList) {
				this.commentMovieMapper.updateByPrimaryKeySelective(cm);
			}
		} catch (Exception e) {
			
			transactionManager.rollback(status);
			logger.error(e.getMessage());
			return false;
		} 
		
		transactionManager.commit(status);
		
		return true;
		
	}

}
