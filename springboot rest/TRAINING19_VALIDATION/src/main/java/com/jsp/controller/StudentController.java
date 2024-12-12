package com.jsp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.entity.Student;

import jakarta.validation.Valid;

@Validated
@RestController
public class StudentController {
	
	@GetMapping("/info")
	public ResponseEntity<Student> getStudent( @Valid @RequestBody Student student)
	{
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
}
