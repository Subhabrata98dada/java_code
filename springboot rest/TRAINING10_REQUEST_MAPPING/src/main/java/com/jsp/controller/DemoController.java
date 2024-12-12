package com.jsp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class DemoController {
	@GetMapping("/get")
	public String getEmployee()
	{
		return "get employee object";
	}
	@PutMapping("/put")
	public String putEmployee()
	{
		return "put employee object";
	}
	@PostMapping("/post")
	public String postEmployee()
	{
		return "post employee object";
	}
	@DeleteMapping("/delete")
	public String deleteEmployee()
	{
		return "post employee object";
	}
}
