package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.SeasonFinderService;

@Controller("seasoncontroller")
public class SeasonFinderController {
	@Autowired
	SeasonFinderService service;
	@RequestMapping("/")
	public String showHomePage()
	{
		return "welcome";
	}
	
	@RequestMapping("/season")
	public String showseasonFinder(Map<String, Object> map)
	{
		String msg= service.findSeason();
		map.put("result", msg);
		return "show_result";
	}
}
