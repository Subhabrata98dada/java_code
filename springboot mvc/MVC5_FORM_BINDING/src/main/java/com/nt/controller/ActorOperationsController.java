package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Actor;

@Controller("controller")

public class ActorOperationsController {
	@GetMapping(value = {"/","/home"})
	public String showHomePage()
	{
		return "welcome";
	}
	@GetMapping("/register")
	public String regiserForm(Map<String, Object> map,@ModelAttribute Actor actor)
	{
		map.put("address", actor.getAddress());
		System.out.println(actor);
		
		return "registerform";
	}
	@PostMapping("/register")
	public String registerAction(Map<String, Object> map,@ModelAttribute Actor actor)
	{
		map.put("id", actor.getAid());
		map.put("name", actor.getName());
		map.put("address", actor.getAddress());
		
		return "sucess";
	}
	@GetMapping("/register2")
	public String regiserForm2(Map<String, Object> map,@ModelAttribute Actor actor)
	{
		map.put("address", actor.getAddress());
		System.out.println(actor);
		
		return "registerform2";
	}
	
	@PostMapping("/register2")
	public String registerAction2(@RequestParam("id") Integer id,
			@RequestParam("name") String name)
	{
		System.out.println(id);
		System.out.println(name);
		return "sucess2";
	}
}
