package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMessageGenerater;

@SpringBootApplication
public class SpringBootIoc1Application {

	public static void main(String[] args) {
		
		//get ioc container
		ApplicationContext cxt= SpringApplication.run(SpringBootIoc1Application.class, args);
		
		//get bean class object
		WishMessageGenerater wish=cxt.getBean("wmg",WishMessageGenerater.class);
		System.out.println(wish.gestWish());
		
		//close the container
		ConfigurableApplicationContext cfaxt=(ConfigurableApplicationContext)cxt; //typecast to so we can close the container
		cfaxt.close();
	}
	
	
	@Bean("localtime")
	LocalDateTime createLocalDataTime()
	{
		System.out.println("bean method to create local date and time object");
		return LocalDateTime.now();
	}

}
