package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	
}
