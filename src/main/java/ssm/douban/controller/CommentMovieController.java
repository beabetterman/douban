package ssm.douban.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import ssm.douban.pojo.CommentMovie;
import ssm.douban.service.ICommentMovieService;

@Controller
@RequestMapping("/comment")
public class CommentMovieController {
	
	@Autowired
	private ICommentMovieService commentMoiveService;
	
	
	@RequestMapping("/showComment")
	public String showComment(HttpServletRequest request,Model model) {
		System.out.println("In CommentMovieController, showComment method.");
		int userId = Integer.parseInt(request.getParameter("id"));  
        CommentMovie cm = this.commentMoiveService.selectById(userId);  
        model.addAttribute("cm", cm);  
		// CommentMovie cm = commentMoiveService.selectById(id);
		
		// return JsonUtils.getUtils().toJson(cm);
		return "comment_view";
	}
	
	@RequestMapping("/showAllComment")
	public String showAllComment(HttpServletRequest request,Model model) {
		int offset = 190;
		int rows = 20;
        List<CommentMovie> commentMovieList = this.commentMoiveService.getAllCommentMovie(offset, rows);
        model.addAttribute("commentMovieList", commentMovieList);  
        System.out.println("showAllComment list size:" + commentMovieList.size());
		return "comment_list";
	}

	/*
	 * Check the Spring Session & Redis framework work or not.
	 * Show the server ip&port information and the session ID. 
	 */
	@RequestMapping("/showIndex")
	public String showIndex(HttpServletRequest request,Model model) {
		InetAddress addr;
		String server_ip = null;
		try {
			addr = InetAddress.getLocalHost();
			server_ip=addr.getHostAddress();//获得本机IP      
			
			String address=addr.getHostName();//获得本机名称
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       

		if( server_ip == null) {
			server_ip = "Unknown";
		}
		server_ip = server_ip + ":" + request.getLocalPort();
		
		String proxy_ip = request.getRemoteAddr();
		proxy_ip = proxy_ip + ":" + request.getRemotePort();
		
		// Need Nginx configuration support.
		String client_ip = request.getHeader("X-Real-IP"); 
		client_ip = client_ip + ":" + "Unknown";
  
		
		request.setAttribute("server_ip", server_ip);
		request.setAttribute("proxy_ip", proxy_ip);
		request.setAttribute("client_ip", client_ip);
		
		return "session_check";
	}
	
	
	@RequestMapping(value = "/showCommentJson",
            produces = "application/json; encoding=UTF-8;charset=UTF-8")
	@ResponseBody
	public Object showCommentJson(@RequestParam int id) {
		CommentMovie cm = commentMoiveService.selectById(id);
		
		// return JsonUtils.getUtils().toJson(cm);
		return JSON.toJSONString(cm);
	}

}
