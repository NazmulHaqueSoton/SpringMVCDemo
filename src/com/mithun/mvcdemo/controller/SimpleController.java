package com.mithun.mvcdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	public class SimpleController {
	@RequestMapping("/")
	public String getHomePage() {
		return "home-page";
	}
	@RequestMapping("/openForm")
	public String openForm() {
	return "form";
}
	@RequestMapping("/processForm")
	public String processForm() {
	return "student-view";
}
	@RequestMapping("/processFormNew")
	public String processFormNew(HttpServletRequest request, Model model) {
		String name=request.getParameter("stName");
		name=name.toUpperCase();
		
		String result="Your name is: " + name;
		model.addAttribute("message" , result);
		return "student-view";
	}
}
