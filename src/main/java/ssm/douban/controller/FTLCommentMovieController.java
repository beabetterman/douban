package ssm.douban.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ssm.douban.pojo.CommentMovie;
import ssm.douban.service.ICommentMovieService;

@Controller
@RequestMapping("/ftlcomment")
public class FTLCommentMovieController {
	@Resource
	ICommentMovieService commentMovieService;
	
	@RequestMapping("/showComment")
	public String showComment(HttpServletRequest request,Model model) {
		System.out.println("In CommentMovieController, showComment method.");
		int userId = Integer.parseInt(request.getParameter("id"));  
        CommentMovie cm = commentMovieService.selectById(userId);  
        model.addAttribute("cm", cm);  
		// CommentMovie cm = commentMoiveService.selectById(id);
		
		// return JsonUtils.getUtils().toJson(cm);
		return "comment_view_ftl";
	}
	
	@RequestMapping("/showAllComment")
	public String showAllComments(@RequestParam Integer id,ModelMap model) {
		
		CommentMovie cm = commentMovieService.selectById(id);
		model.put("cm", cm);
		
		String[] testList = {"Str0", "Str1", "Str2"};
		model.put("testList", testList);
		
		Date curTime = new Date();
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(curTime));
		model.put("curTime", curTime);
		
		return "comment_view_ftl";
		
	}

}
