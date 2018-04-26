package ssm.douban.test;

import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations= {"classpath:spring-mvc.xml" ,"classpath:spring-mybatis.xml"}) // Could separate the config file for mvc test and mybatis test.
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional(transactionManager = "transactionManager")  // 设置事务相关的配置。
//@Rollback(value=false) //指定自动回滚与否。这样做操作的数据会回滚，这个配置不会污染数据库！
public class BaseSpringTestCase extends AbstractJUnit4SpringContextTests{
	
	

}
