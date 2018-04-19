package ssm.douban.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import ssm.douban.pojo.CommentMovie;
import ssm.douban.service.ICommentMovieService;  

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class TestMybatis {

	private static Logger logger = Logger.getLogger(TestMybatis.class);
	
	@Resource
	private ICommentMovieService commentMoiveService;
	
	@Test
	public void test1() {
		CommentMovie commentMovie = commentMoiveService.selectById(180);
		logger.info(JSON.toJSONString(commentMovie));
	}
	
}
