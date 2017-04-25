package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexControl {
	@RequestMapping(method = RequestMethod.GET,value = "/index.htm")
	public String welcome(){
		return "index";
	}
}
