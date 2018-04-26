package ssm.douban.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import ssm.douban.dao.CommentMovieMapper;
import ssm.douban.pojo.CommentMovie;
import ssm.douban.service.ICommentMovieService;  

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class TestMybatis {

	private static Logger logger = Logger.getLogger(TestMybatis.class);
	
//	@Autowired
//	private ICommentMovieService commentMoiveService;
	
	@Autowired
	private CommentMovieMapper commentMovieMapper;
	
	@Test
	public void testMapperInject() {
		CommentMovie cm = commentMovieMapper.selectByPrimaryKey(180);
		logger.info(cm.getMovie_name());
	}
	

//	public void test1() {
//		CommentMovie commentMovie = commentMoiveService.selectById(180);
//		logger.info(JSON.toJSONString(commentMovie));
//	}
	
}
