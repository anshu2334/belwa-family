package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("funny")
public class FunnyControllerMapping {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest httpServletRequest, Model model) {
		String theName  = httpServletRequest.getParameter("studentName");
		theName = theName.toUpperCase();
		String result = "Yo! "+ theName;
		model.addAttribute("message",result);
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDude(@RequestParam String studentName, Model model) {
		//String theName  = httpServletRequest.getParameter("studentName");
		studentName = studentName.toUpperCase();
		String result = "Ho Ho! "+ studentName;
		model.addAttribute("message",result);
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionFour")
	public String letsShoutDude1(@RequestParam("studentName") String theName, Model model) {
		//String theName  = httpServletRequest.getParameter("studentName");
		theName = theName.toUpperCase();
		String result = "Yo! "+ theName;
		model.addAttribute("message",result);
		return "helloworld";
	}

}
