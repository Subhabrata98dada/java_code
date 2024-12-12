package com.jsp.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.entity.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class DemoController {
	
	@GetMapping(value = "/get",produces ="application/xml")
    public Student getStudent()
    {
    	return new Student(1,"subha",5.8);
    }
	
	@PostMapping(value = "/post", consumes ="application/xml")
	public String postMethodName(@RequestBody Student student) {
		
		
		return student.toString();
	}
	
}
