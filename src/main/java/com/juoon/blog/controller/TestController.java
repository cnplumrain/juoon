package com.juoon.blog.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/test")
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
