package com.hs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Module2HotelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Module2HotelServiceApplication.class, args);
	}

}
