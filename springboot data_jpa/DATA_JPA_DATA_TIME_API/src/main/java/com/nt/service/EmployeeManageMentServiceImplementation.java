package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.EmployeeRepository;

@Service
public class EmployeeManageMentServiceImplementation implements EmployeeManagementsServiceInterface{

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public String registerEmployee(Employee emp) {
		int id= repo.save(emp).getEid();
		return "employee saved with id "+ id;
	}

	@Override
	public List<Employee> findAllEmployee() {
		
		return repo.findAll();
	}

	@Override
	public Float findAgeById(Integer id) {
		// TODO Auto-generated method stub
		return repo.getEmployeeAge(id);
	}

}
