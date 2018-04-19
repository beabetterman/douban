package ssm.douban.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
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
	
	@RequestMapping("/getcomment")
	public String getAllComments(@RequestParam Integer id,ModelMap model) {
		
		CommentMovie cm = commentMovieService.selectById(id);
		model.put("cm", cm);
		return "comment_view";
		
	}

}
