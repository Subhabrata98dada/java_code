package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.beans.Flipkart;

@SpringBootApplication
@ImportResource("com/nt/appconfig/applicationContext.xml")
public class VehicleEngineLooselyCoupledApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(VehicleEngineLooselyCoupledApplication.class, args);
		Flipkart flipkart=ctx.getBean("flipkart",Flipkart.class);
		String []products= {"shirt","pants","tye"};
		double []prices= {3000.45,5000.34,8912.67};
		String msg=flipkart.shopping(products, prices);
		System.out.println(msg);
		ConfigurableApplicationContext ctx1=(ConfigurableApplicationContext)ctx;
		ctx1.close();
		
	}

}
