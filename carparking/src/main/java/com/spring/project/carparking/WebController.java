	package com.spring.project.carparking;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController extends HttpServlet {

	@RequestMapping(value = "/redirect", method = RequestMethod.POST)

	public String redirect(HttpServletRequest request, HttpServletResponse response) {
		String user = request.getParameter("uid");
		String password = request.getParameter("pwd");

		try {
			if (user.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
				return "display";

			} else {
				return "error";

			}
		} finally {
			System.out.println("try block executed");

		}

	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout() { 
		return "logoutprocess";
	}
	
	@RequestMapping(value = "/sam", method = RequestMethod.POST)
	public String sorry() {
		return "sam";
	}
}
