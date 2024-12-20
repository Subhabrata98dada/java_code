package com.nt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.nt.models.Employee;
import com.nt.service.EmployeeService;


@Controller("controller")
public class HomeController {
	
	@Autowired
	private EmployeeService empService;
	@GetMapping("/")
	public String showHomePage()
	{
		return "index";
	}
	@GetMapping("/register")
	public String ShowEmployeeRegisterForm() {
		return "employeeform";
	}
	
	@PostMapping("/register")
	public String registerEmployeeInDataBase(@ModelAttribute Employee employee,Map<String, String> map)
	{
		System.out.println(employee);
		String msg=empService.addNewEmployee(employee);
		System.out.println(msg);
		
		map.put("msg", msg);
		return "sucessful";
	}
	
	@PostMapping("/softdelete")
	public String softDeletion(@ModelAttribute Employee employee ,Map<String, String> map)
	{
		String msg=empService.softDeletion(employee.getId());
		map.put("msg", msg);
		return "sucessful";
	}
	
	@GetMapping("/softdelete")
	public String softDeletionInitialzer()
	{
	
		
		return "idinput";
	}
	
	@GetMapping("/getallemployee")
	public String showAllEmployee()
	{
		List<Employee> list=empService.fetchAllEmployee();
		list.forEach(i->System.out.println(i));
		return "sucessful";
	}
	
	@GetMapping("/getallemployeebypage")
	public String getAllDataPageWise(@PageableDefault(page = 1,size = 2) Pageable pageable) {
		Page<Employee> page= empService.getEmployeeByPage(pageable);
		List<Employee> list= page.getContent();
		list.forEach(System.out::println);
		return "sucessful";
	}
	
}
