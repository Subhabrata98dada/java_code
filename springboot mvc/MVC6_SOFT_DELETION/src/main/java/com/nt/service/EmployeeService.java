package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nt.models.Employee;
import com.nt.repository.EmployeeRepository;

@Service("empservice")
public class EmployeeService {
	@Autowired
    private EmployeeRepository emprepo;
	
	public String addNewEmployee(Employee employee) {
		employee=emprepo.save(employee);
		return "employee saved with id "+employee.getId();
	}
	
	public String softDeletion(Integer id)
	{
		Optional<Employee> opt= emprepo.findById(id);
		if(opt.isEmpty())
			return "the given id is not present in Employy database";
		else
		{
			Employee emp= opt.get();
			emp.setStatus("inactive");
			emprepo.save(emp);
			return "soft deletion completed";
		}
	}
	
	public List<Employee> fetchAllEmployee()
	{
		List<Employee> list=emprepo.findAll();
		return list;
	}
	
	public Page<Employee> getEmployeeByPage(Pageable pagable)
	{
		return emprepo.findAll(pagable);
	}
}
