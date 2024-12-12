package com.jsp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.model.Student;


@RestController
public class DemoController {
	@PostMapping("/info")
	public String readObject(@RequestBody Student student)
	{
		
		return student.toString();
	}
}
