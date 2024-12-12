package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Company;

@SpringBootApplication

public class DemoYmlProject01Application {

	public static void main(String[] args) {
	  ApplicationContext ctx=	SpringApplication.run(DemoYmlProject01Application.class, args);
	  Company company= ctx.getBean("com",Company.class);
	  System.out.println(company);
	  ConfigurableApplicationContext ctx2=(ConfigurableApplicationContext)ctx;
	  ctx2.close();
	}

}
