package com.jsp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.jsp.model.Student;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoController {
	@GetMapping("/path")
	public Student getStudent()
	{
		return new Student(101,"subha", 5.8);
	}
	

}
