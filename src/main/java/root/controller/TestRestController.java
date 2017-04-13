package root.controller;

import java.util.Date;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
	@RequestMapping("/rest")
	public String test(){
		return "Hello,juoon！";
	}
	@RequestMapping("/test2")
	public String test2(ModelMap model){
		model.addAttribute("time",new Date());
		model.addAttribute("message","Hello,juoon!");
		return "index";
	}
}
