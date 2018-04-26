package ssm.douban.test;


import java.text.MessageFormat;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ssm.douban.service.ICommentMovieService;

public class CommentMovieServiceTest extends BaseSpringTestCase {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ICommentMovieService commentMovieService;
	
	@Test
	public void showAllComment() {
		// TODO Should check the static file resource path issue for JUnit4 test case.
		int rows = commentMovieService.getAllCommentMovie(190, 20).size();
		logger.info(String.format("Parameter is offset %d, limit %d, get items number: %d", 190, 20, rows));
		logger.info(MessageFormat.format("Parameter is offset {0}, limit {1}, get items number {2}", 190, 20, rows));
		
	}
	
	
}
