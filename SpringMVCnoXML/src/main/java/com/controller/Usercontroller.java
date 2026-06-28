package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Usercontroller {

	@RequestMapping("/user")
	@ResponseBody
	public String user(){
		
		return "hi hello ...";
		
	}
}
