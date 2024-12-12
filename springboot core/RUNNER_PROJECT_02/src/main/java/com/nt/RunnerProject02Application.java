package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@Order(0)
@SpringBootApplication
public class RunnerProject02Application {

	public static void main(String[] args) {
		SpringApplication.run(RunnerProject02Application.class, args);
	}

}
