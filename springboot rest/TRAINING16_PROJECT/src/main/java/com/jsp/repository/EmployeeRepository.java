package com.jsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
