package com.jsp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.entity.Student;
import com.jsp.responsestructure.ResponseStructure;

@RestController
public class DemoController {
	
	@PostMapping("/save")
	public ResponseStructure<Student> saveStudent(@RequestBody Student student)
	{
		ResponseStructure<Student> rs=new ResponseStructure<Student>();
		rs.setStatusCode(200);
		rs.setMessage("sucess");
		rs.setData(student);
		return rs;
	}
}
