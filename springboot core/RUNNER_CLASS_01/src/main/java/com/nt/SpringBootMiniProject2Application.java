package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.EmployeeController;
import com.nt.model.Employee;

@SpringBootApplication
public class SpringBootMiniProject2Application {

	public static void main(String[] args) {
		try {
			ApplicationContext ctx= SpringApplication.run(SpringBootMiniProject2Application.class, args);
//			EmployeeController controller=ctx.getBean("controller",EmployeeController.class);
//			List<Employee> listEmployee=controller.getEmployeeByDesignation("manager", "hello2", "hello3");
//			listEmployee.forEach(emp->System.out.println(emp));
			ConfigurableApplicationContext cfaxt=(ConfigurableApplicationContext)ctx; //typecast to so we can close the container
			
			cfaxt.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
