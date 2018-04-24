package ssm.douban.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
	
	@Resource
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
	
	
	
	@RequestMapping(value = "/showCommentJson",
            produces = "application/json; encoding=UTF-8;charset=UTF-8")
	@ResponseBody
	public Object showCommentJson(@RequestParam int id) {
		CommentMovie cm = commentMoiveService.selectById(id);
		
		// return JsonUtils.getUtils().toJson(cm);
		return JSON.toJSONString(cm);
	}

}
