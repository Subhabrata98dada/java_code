package com.nt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletResponse;


@Controller
public class ShowHomeController {
	
	@RequestMapping("/")
	public String showHomePage(Model model)
	{
		System.out.println(model.getClass());
		
		// add model attribute to request scope
//		map.put("attr1","value 1");
//		map.put("date", new Date()); or
		model.addAttribute("attr1","value 1");
		model.addAttribute("date", new Date());
		return "welcome"; // return logical view name
	}
	
	@RequestMapping("/render")
	public Model showRender()
	{
		Model model=new BindingAwareModelMap();
		
		// add model attribute to request scope
//		map.put("attr1","value 1");
//		map.put("date", new Date()); or
		model.addAttribute("attr1","value 1");
		model.addAttribute("date", new Date());
		return model; // return logical view name
	}
	
	@RequestMapping("/process")
	public String process() {
		return "redirect:report";
	}
	@RequestMapping("/report")
	public void report(HttpServletResponse res) throws IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
//		res.setHeader("content-disposition", "attachement;filename=abc.html");
		pw.println("<h1>Direct from handler method</h1>");
	}

}
