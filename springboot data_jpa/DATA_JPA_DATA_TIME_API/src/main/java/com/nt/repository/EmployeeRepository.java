package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Query(value = "SELECT DATE_FORMAT(FROM_DAYS(DATEDIFF(NOW(),DOB)) ,'%Y') from employee_details where EID=:id", nativeQuery = true)
	public float getEmployeeAge(int id);

}
