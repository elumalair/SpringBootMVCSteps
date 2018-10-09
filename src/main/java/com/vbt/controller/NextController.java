package com.vbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.vbt.service.LoginService;

@Controller
@SessionAttributes({"username","password"})
public class NextController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/next", method = RequestMethod.GET)
	public String showTodos(ModelMap model){
		String username = (String) model.get("username");
		model.put("todos", loginService.retrieveData(username));
		return "next";
	}
}
