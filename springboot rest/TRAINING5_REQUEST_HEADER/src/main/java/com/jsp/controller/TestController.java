package com.jsp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/info")
	public String headerHead(@RequestHeader String token) {
		return "header token : "+ token;
	}
}
