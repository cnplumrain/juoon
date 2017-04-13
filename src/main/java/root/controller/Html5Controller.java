package root.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Html5Controller {
	@RequestMapping("/")
	public String clock(){
		return "html5/clock";
	}
}
