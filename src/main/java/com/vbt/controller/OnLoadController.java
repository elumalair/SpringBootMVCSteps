package com.vbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.vbt.service.LoginService;

@Controller
@SessionAttributes({"username","password"})
/*
 * Here @SessionAttributes annotation is used for storing model attribute on the
 * session and this will be maintained for all the handler methods of this
 * class.
 */
public class OnLoadController {

	@Autowired
	LoginService loginService;

	@RequestMapping("/")
	public @ResponseBody String onLoadApp() {
		return "Welcome to Spring MVC using Spring Boot";
	}

	@RequestMapping("/login")
	public String loggedinUser() {
		return "login";
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loggedinUser(ModelMap map, @RequestParam String username, @RequestParam String password) {
		System.out.println(" Username : "+ username);
		System.out.println(" Password : "+ password);
	 
		//to Retrive on JSP
		map.put("username", username);
	  
		if(loginService.validateLoggedinUser(username, password)) {
			return "welcome";
		} else {
			map.put("errorMessage", "Invalid Credentials !!");
			return "login";
		}
	}
}
