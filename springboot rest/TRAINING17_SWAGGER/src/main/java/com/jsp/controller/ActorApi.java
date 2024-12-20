package com.jsp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.entity.Actor;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/actor")
public class ActorApi {
	@GetMapping("/get")
	public Actor getActor()
	{
		Actor a=new Actor();
		a.setId(1);
		a.setName("rahul");
		a.setSalary(10000.5);
		return a;
	}
	@DeleteMapping("/delete")
	public String removeActor(@RequestBody Actor ac)
	{
		return ac.toString();
	}
	@DeleteMapping("/delete2/{id}")
	public String removeActor(@PathVariable Integer id)
	{
		return id+10+"";
	}
}
