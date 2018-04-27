package ssm.douban.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
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
	
	@RequestMapping(value="update_multi_items")
	public String update_multi_items(ItemsQueryVo  itemsList, CommentMovie queryItem, HttpServletRequest request,Model model) {
		logger.info("QueryItem is :"+queryItem+", itemsList is:"+itemsList.getItemsList());
		List<Integer> ids = new ArrayList<Integer>();
		for(CommentMovie cm : itemsList.getItemsList()) {
			
			ids.add(cm.getId());
		}
		
		// TODO Query all the items from 
		String idstring = "";
		for(Integer i : ids) {
			idstring += i+",";
		}
		logger.info(String.format("ID List : %s", idstring));
		boolean updateDone = this.commentMoiveService.updateMultiItems(itemsList.getItemsList());
		if(updateDone) {
			logger.info("Update has been done.");
		} else {
			logger.error("Update error occurs.");
		}
		List<CommentMovie> cmList = this.commentMoiveService.getCommentMovieByIds(ids);
		
		model.addAttribute("itemsList", cmList);
		model.addAttribute("queryItem", queryItem);
		logger.info(String.format("ItemsList size is %d", cmList.size()));
		
		return "crud_test";
	}
	
	@RequestMapping(value="update_item")
	@ResponseBody
	public String update_item(HttpServletRequest request,Model model) {
	//public String update_item(@RequestParam int id, @RequestParam int rating) {
		
		// Get the item information and update by ajax.
		// TODO
		
		//logger.info(String.format("Item has been updated. idx:%d , rating:%d", id, rating));
		
		return "crud_test";
	}
	
	
	@RequestMapping(value="query_items")
	public String query_items(CommentMovie queryItem, HttpServletRequest request,Model model) {
		
		if(queryItem == null) {
			logger.info("queryItem is null");
		} else {
			logger.info(String.format("queryItem information : rating: %d, movie name: %s", queryItem.getRating(), queryItem.getMovie_name()));
		}
		
		request.setAttribute("queryItem", queryItem);
		// TODO the query work.
		// FIXME This is for temp test.
		List<CommentMovie> cmList = this.commentMoiveService.getCommentMovieByInstance(queryItem);
		logger.info(String.format("Item List size is %d", cmList.size()));
		
		model.addAttribute("itemsList", cmList);
		
		return "crud_test";
	}
	
	
	@RequestMapping(value="crud_test")
	public String crud_test(HttpServletRequest request,Model model) {
		int offset = 190;
		int rows = 20;
		CommentMovie queryItem_inter = new CommentMovie();
		model.addAttribute("queryItem", queryItem_inter);
		
        List<CommentMovie> commentMovieList = this.commentMoiveService.getAllCommentMovie(offset, rows);
        model.addAttribute("itemsList", commentMovieList);
        
		return "crud_test";
	}

	

}
