package com.nt.service;

//import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.EmployeeDAO;
import com.nt.model.Employee;


@Service("empservice")
public class EmployeeServiceImplementation implements EmployeeService{
	
	@Autowired(required = true)
	//@Qualifier("empdaooracle")
	private EmployeeDAO empdao;
	
	public EmployeeServiceImplementation() {
		System.out.println("service class object creation");
	}
	
	public List<Employee> getEmployeeByDesignation(String des1,String des2,String des3) throws Exception
	{
		List<Employee> listofemployee=empdao.showEmployeeByDesignation(des1, des2, des3);
		listofemployee.forEach(emp->{
		 emp.setGrossSalary(emp.getSal()+emp.getSal()*0.4f);
		 emp.setNetSalary(emp.getGrossSalary()-emp.getGrossSalary()*0.2f);
		});
		return listofemployee;
	}

}
