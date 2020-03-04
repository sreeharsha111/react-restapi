package com.spring.project.carparking;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	
	
	@GetMapping("/welcome")
	public String welcome() {
		return "NewFi";
	
	} 
	@GetMapping("/login")
	public String login() {
		return "homepage";
	
	} 

	@GetMapping("/display")
	public String loginMessage() {
		return "display";
	
	} 
	@GetMapping("/logout")
	public String loginMessage1() {
		return "logoutprocess";
	
	} 
	@GetMapping("/sam")
	public String sorry() {
		return "sam";
	
	}
	
	
	

	
	
}