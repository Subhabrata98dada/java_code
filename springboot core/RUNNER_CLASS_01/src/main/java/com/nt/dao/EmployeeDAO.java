package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface EmployeeDAO {
	
	public List<Employee> showEmployeeByDesignation(String designation1,String Designation2,String designation3) throws Exception;
	

}
