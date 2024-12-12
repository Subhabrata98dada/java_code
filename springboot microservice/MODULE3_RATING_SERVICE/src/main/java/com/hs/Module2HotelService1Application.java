package com.hs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Module2HotelService1Application {

	public static void main(String[] args) {
		SpringApplication.run(Module2HotelService1Application.class, args);
	}

}
