package com.ham1142.test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloContoller {

	@RequestMapping(value = "/")
	public String hello() {
		return "hello";
	}
	
}
