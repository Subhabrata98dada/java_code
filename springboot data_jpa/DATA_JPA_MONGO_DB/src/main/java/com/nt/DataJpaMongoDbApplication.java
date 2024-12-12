package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DataJpaMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataJpaMongoDbApplication.class, args);
	}

}
