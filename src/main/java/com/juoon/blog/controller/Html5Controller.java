package com.juoon.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Html5Controller {
	@RequestMapping("/")
	public String clock(){
		return "html5/clock";
	}
}
