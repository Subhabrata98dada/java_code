package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@GetMapping("/report")
	public ResponseEntity<String> showEmployeeReport()
	{
		return new ResponseEntity<String>("report is ok",HttpStatus.OK);
	}
}
