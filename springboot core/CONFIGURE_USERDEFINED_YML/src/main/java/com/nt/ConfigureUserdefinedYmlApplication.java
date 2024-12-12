package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Company;

@SpringBootApplication

public class ConfigureUserdefinedYmlApplication {

	public static void main(String[] args) {
	 ApplicationContext ctx=	SpringApplication.run(ConfigureUserdefinedYmlApplication.class, args);
	 Company com=ctx.getBean("company",Company.class);
	 System.out.println(com);
	 ConfigurableApplicationContext ctx2=(ConfigurableApplicationContext)ctx;
	 ctx2.close();
	}

}
