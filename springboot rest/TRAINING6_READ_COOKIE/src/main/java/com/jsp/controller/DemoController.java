package com.jsp.controller;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/info")
	public String readCokkie(@CookieValue String cvalue)
	{
		return "the cookie is : "+cvalue;
	}
}
