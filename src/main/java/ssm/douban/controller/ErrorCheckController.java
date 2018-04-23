package ssm.douban.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("error_check")
public class ErrorCheckController {

	@RequestMapping("/io_check")
	public String ioCheck(Model model) throws FileNotFoundException {
		System.out.println("In ErrorCheckController, IOException occur.");
		FileOutputStream file = new FileOutputStream("");
		return "index";
	}
	
	@RequestMapping("/no_page_check")
	public String noPage(Model model) {
		System.out.println("In ErrorCheckController, return unknown page.");
		
		return "no_defined_page";
	}
	
	@RequestMapping("/page_error_check")
	public String pageError(Model model) {
		System.out.println("In ErrorCheckController, return a page that has error.");
		
		return "invoke_exception";
	}
	
}
