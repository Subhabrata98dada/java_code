package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Company;

@SpringBootApplication
public class InjectArrayListSetInsideBeanApplication {

	public static void main(String[] args) {
	 ApplicationContext ctx=	SpringApplication.run(InjectArrayListSetInsideBeanApplication.class, args);
	 Company com=ctx.getBean("company",Company.class);
	 System.out.println(com);
	 ConfigurableApplicationContext ctx1=(ConfigurableApplicationContext)ctx;
	 ctx1.close();
	}

}
