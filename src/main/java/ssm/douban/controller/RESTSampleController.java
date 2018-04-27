package ssm.douban.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

/*
 * This is for RESTful API function check.
 * REST 的核心是资源。 在某些场合，以资源为中心设计系统，会让业务处理变得简单。
 * 后期需要添加JWT JSON web token功能，实现鉴权或者部分状态处理的功能。
 */
@Controller
@RequestMapping(value = "rest")
public class RESTSampleController {

	
	Logger logger = Logger.getLogger(RESTSampleController.class);
	
	@RequestMapping(value = "/rest_post_api", produces = "application/json; encoding=UTF-8;charset=UTF-8")
	@ResponseBody
	public Object rest_post_api(HttpServletRequest request) {
		
	
		String return_value = "This is the form Information:";
		String response_str = "Hi," + request.getParameter("user_name")+"!";
		System.out.println(response_str);
		return_value += response_str;
//		Enumeration<String> attrs = request.getAttributeNames();
//		while(attrs.hasMoreElements()) {
//			String attr_name = attrs.nextElement();
//			if(attr_name != null) {
//				// TODO process the Unknown type...
//				System.out.println(attr_name);
//				item = "Key:" + attr_name + ", value:" + (String) request.getAttribute(attr_name);
//				logger.info(item);
//				System.out.println(item);
//				return_value += item + ",";
//			}
//			
//		}

		return JSON.toJSONString(return_value);
	}
	
	
	@RequestMapping(value = "/rest_get_api", produces = "application/json; encoding=UTF-8;charset=UTF-8")
	@ResponseBody
	public Object rest_get_api(@RequestParam String infor, HttpServletRequest request) {
		
		logger.info("Get the param infor : "+infor);
		return JSON.toJSONString("Get Client send information: "+infor);
	}

}
