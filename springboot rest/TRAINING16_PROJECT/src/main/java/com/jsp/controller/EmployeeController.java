package com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.dto.ResponseStructure;
import com.jsp.entity.Employee;
import com.jsp.exception.IdDoesNotExistException;
import com.jsp.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Employee>> saveEmployee(@RequestBody Employee employee)
	{
		return empService.saveEmployee(employee);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<ResponseStructure<Employee>> findEmployeeById(@PathVariable Integer id) throws IdDoesNotExistException
	{
		return empService.getEmployeeById(id);
	}
	
}
