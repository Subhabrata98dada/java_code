package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;


import com.nt.controller.EmployeeController;
import com.nt.model.Employee;


@Component
public class MiniProjectRunner implements CommandLineRunner{
	
	@Autowired
	private EmployeeController controller;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("runner method execution");
		try {
			 
			List<Employee> listEmployee=controller.getEmployeeByDesignation("manager", "hello2", "hello3");
			listEmployee.forEach(emp->System.out.println(emp));
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
