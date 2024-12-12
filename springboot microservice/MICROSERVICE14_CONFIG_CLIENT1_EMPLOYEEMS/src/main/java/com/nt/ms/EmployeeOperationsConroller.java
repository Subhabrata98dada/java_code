package com.nt.ms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeOperationsConroller {
	@Value("${dbuser}")
	private String username;
	@Value("&{dbpassword}")
	private String password;
	
	@GetMapping("/data")
	public ResponseEntity<String> showData()
	{
		return new ResponseEntity<String>("Report data "+username+" "+password,HttpStatus.OK);
	}
}
