package com.srccodes.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Abhijit Ghosh
 * @version 1.0
 */

@Controller
public class SpringMVCHelloController {

	/*@RequestMapping("/")
	public String printHelloWorld(Model model) {
		model.addAttribute("message", "Hello World!");

		return "helloWorld";
	}*/
	
	@RequestMapping("/hello")
	public ModelAndView nextHelloWorld(Model model) {
		String message = "Hello World, Spring 3.0!";
		model.addAttribute("message", "Hello World!");
		return new ModelAndView("index", "message", message);
	}
	
	@RequestMapping("/test")
	public ModelAndView jspHelloWorld(Model model) {
		String message = "Hello welcome";
		model.addAttribute("message", "Hello World!");
		return new ModelAndView("test", "message", message);
	}
	
}
