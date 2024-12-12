package com.nt.service;

//import java.sql.SQLException;
import java.util.List;

import com.nt.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployeeByDesignation(String des1,String des2,String des3) throws Exception;

}
