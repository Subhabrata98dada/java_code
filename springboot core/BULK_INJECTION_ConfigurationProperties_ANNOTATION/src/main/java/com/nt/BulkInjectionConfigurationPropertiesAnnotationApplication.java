package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.PropertySource;

import com.nt.sbeans.Company;

@SpringBootApplication
//@PropertySource("com/nt/commons/info.properties")
public class BulkInjectionConfigurationPropertiesAnnotationApplication {

	public static void main(String[] args) {
	  ApplicationContext ctx=	SpringApplication.run(BulkInjectionConfigurationPropertiesAnnotationApplication.class, args);
		
	  Company com=ctx.getBean("company",Company.class);
	  System.out.println(com);
	 ConfigurableApplicationContext ctx2=(ConfigurableApplicationContext)ctx;
	 ctx2.close();
	}

}
