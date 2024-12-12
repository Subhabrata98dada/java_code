package com.nt;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.controller.EmployeeController;
import com.nt.model.Employee;

@SpringBootApplication
public class SpringbootProfileProject01Application {

	public static void main(String[] args) {
		try {
			//SpringApplication object creation and profile setup
			SpringApplication application=new  SpringApplication(SpringbootProfileProject01Application.class);
			application.setAdditionalProfiles("prod");
			
			//get the ioc container
			ApplicationContext ctx=application.run(args);
			
			
			EmployeeController controller=ctx.getBean("controller",EmployeeController.class);
			List<Employee> listEmployee=controller.getEmployeeByDesignation("manager", "hello2", "hello3");
			listEmployee.forEach(emp->System.out.println(emp));
			Environment env= ctx.getEnvironment();
			System.out.println("current active profile "+Arrays.toString(env.getActiveProfiles()));
			ConfigurableApplicationContext cfaxt=(ConfigurableApplicationContext)ctx; //typecast to so we can close the container
			
			cfaxt.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
