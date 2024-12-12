package com.jsp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.entity.Student;
import com.jsp.responseBody.ResponseStructure;

@RestController
public class StudentController {
	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Student>> saveStudent(@RequestBody Student student)
	{
		String sname= student.getName();
		sname = sname+" : "+ sname.length();
		student.setName(sname);
		ResponseStructure<Student> rs=new ResponseStructure<Student>();
		rs.setStatusCode(200);
		rs.setMessage("sucess");
		rs.setData(student);
		return new ResponseEntity<ResponseStructure<Student>>(rs,HttpStatus.OK);
	}
}
