package com.nt.runners;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.service.EmployeeManagementsServiceInterface;


@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeManagementsServiceInterface service;
	
	@Override
	public void run(String... args) throws Exception {
//		LocalDateTime datetime= LocalDateTime.of(1998, 06, 12, 4, 30);
//		LocalTime time=LocalTime.of(10, 30);
//		LocalDate date= LocalDate.of(2024, 5, 15);
//		Employee emp=new Employee("raja", "hydrabd",  datetime, date, time);
//		String msg=service.registerEmployee(emp);
//		System.out.println(msg);
		
//		service.findAllEmployee().forEach(i->System.out.println(i));
		Float age=service.findAgeById(1);
		System.out.println(" age is "+age);

	}

}
