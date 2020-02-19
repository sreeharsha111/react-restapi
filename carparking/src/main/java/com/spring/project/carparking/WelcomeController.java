package com.spring.project.carparking;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	
	
	@GetMapping("/welcome")
	public String welcome() {
		return "homepage";
	
	} 

	@GetMapping("/display")
	public String loginMessage() {
		return "display";
	
	} 
	@GetMapping("/logoutprocess.jsp")
	public String loginMessage1() {
		return "logoutprocess";
	
	} 
	
	

	
	
}