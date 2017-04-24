package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexControl {
	@RequestMapping(method = RequestMethod.GET,value = "/hello")
	public String welcome(){
		System.err.println("hello!");
		return "hello";
	}
}
