package ssm.douban.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginCustomHandlerIntercepter implements HandlerInterceptor {
	private static Logger logger = Logger.getLogger(LoginCustomHandlerIntercepter.class);

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("I'm in custom interceptor, method: afterCompletion");
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("I'm in custom interceptor, method: postHandle");

	}

	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		logger.info("I'm in custom interceptor, method: preHandle");
		System.out.println("I'm in custom interceptor, method: preHandle");
		
		// This is test case, need process to the intercepter chain.
		return true;
	}

}
