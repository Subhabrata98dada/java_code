package com.jsp.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.entity.Employee;
import com.jsp.repository.EmployeeRepository;

@Repository
public class EmployeeDAO {
	@Autowired
	private EmployeeRepository empRepo;
	public Employee saveEmplyeeData(Employee e)
	{
		return empRepo.save(e);
	}
	public Employee getEmployeeByiId(Integer id) {
		Optional<Employee> opt=empRepo.findById(id);
		if(opt.isPresent()) return opt.get();
		else return null;
	}
}
