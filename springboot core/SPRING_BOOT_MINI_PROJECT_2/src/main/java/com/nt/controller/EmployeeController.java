package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.EmployeeService;

@Controller("controller")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empservice;
	
	public List<Employee> getEmployeeByDesignation(String des1,String des2,String des3) throws Exception
	{
		List<Employee> listemployee=empservice.getEmployeeByDesignation(des1, des2, des3);
		return listemployee;
	}

}
