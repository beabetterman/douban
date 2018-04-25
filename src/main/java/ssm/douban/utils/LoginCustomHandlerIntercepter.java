package ssm.douban.utils;

import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginCustomHandlerIntercepter implements HandlerInterceptor {
	private static Logger logger = Logger.getLogger(LoginCustomHandlerIntercepter.class);
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.US);  
	
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("I'm in custom interceptor, method: afterCompletion");
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("I'm in custom interceptor, method: postHandle");

	}

	public boolean preHandle(HttpServletRequest req, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		logger.info("I'm in custom interceptor, method: preHandle");
		System.out.println("I'm in custom interceptor, method: preHandle");
		
		HttpSession session = req.getSession();
		
		if( session == null) {
			// Initialize session.
			// Process cookie settings.
			logger.info("Session is null.");
		} else {
			if(session.getId() == null) {
				// Check the reason, 
				// Process cookie settings
				logger.info("Session ID is null.");
			}
		}

		logger.info("Session process Work. session id:" + session.getId());
	
		
		// This is test case, need process to the intercepter chain.
		return true;
	}

}
