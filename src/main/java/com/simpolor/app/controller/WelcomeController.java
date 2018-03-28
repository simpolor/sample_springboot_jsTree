package com.simpolor.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@ResponseBody
	@RequestMapping({"/", "/index"})
	public String welcome() {
		return "welcome";
	}
}
