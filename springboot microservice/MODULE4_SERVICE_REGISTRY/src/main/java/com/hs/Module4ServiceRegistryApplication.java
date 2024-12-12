package com.hs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Module4ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Module4ServiceRegistryApplication.class, args);
	}

}
