package com.jsp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControlller {

	@GetMapping("/path1/{id}")
	public String pathVariable1(@PathVariable Integer id)
	{
		return id+10+"";
	}
	@GetMapping("/path2/{id}/path3/{n}")
	public String pathVariable2(@PathVariable Integer id,@PathVariable Integer n)
	{
		return id+n+"";
	}
}
