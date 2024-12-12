package com.nt.service;

import java.util.List;

import com.nt.entity.Employee;

public interface EmployeeManagementsServiceInterface {
	
	public String registerEmployee(Employee emp);
	List<Employee> findAllEmployee();
	Float findAgeById(Integer id);

}
