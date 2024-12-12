package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



@SpringBootApplication
@EnableEurekaServer
public class Microservice9IntroductionApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservice9IntroductionApplication.class, args);
	}

}
