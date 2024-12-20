package com.jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Training18RestTemplateConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Training18RestTemplateConsumerApplication.class, args);
	}
	
	@Bean("template")
	public RestTemplate createRestTemplate()
	{
		System.out.println("template object create");
		return new RestTemplate();
	}

}
