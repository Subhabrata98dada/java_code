package com.jsp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoMapping1 {
	
	@GetMapping("/get")
	public String getRequest()
	{
		return "this is get mapping trigger";
	}
	
	@PostMapping("/post")
	public String postRequest()
	{
		return "this is post mapping  request";
	}
	
	@PutMapping("/put")
	public String putMapping()
	{
		return "this is put mapping request";
	}
	
	@DeleteMapping("/delete")
	public String deleteMapp()
	{
		return "this is delete mapping request";
	}

}
