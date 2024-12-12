package com.jsp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DemoController1 {
	
	
	@GetMapping("/wish")
	public String wish()
	{
		return "Good Morning";
	}
	
	@GetMapping("/pi")
	public Double getPiValue() {
		return 3.14;
	}
	

}
