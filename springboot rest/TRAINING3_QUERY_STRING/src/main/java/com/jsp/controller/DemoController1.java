package com.jsp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController1 {
	
	@GetMapping("/student")
	public String myInfo(@RequestParam Integer myid,@RequestParam String name)
	{
		return "The student id recieved by the url : "+myid+" name length : "+name.length();
	}
	
	@GetMapping("/add")
	public int getSum(@RequestParam(name ="this") Integer n1,@RequestParam Integer n2)
	{
		if(n1 != null && n2 !=null)
			return n1+n2;
		else return 0;
	}

}
