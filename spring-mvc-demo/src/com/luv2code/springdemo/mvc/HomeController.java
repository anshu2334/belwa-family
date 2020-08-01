package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//controller method
	@RequestMapping("/")
	public String showPage() {
		//returning view 
		return "main-menu";
	}

}
