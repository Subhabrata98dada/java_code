package com.nt;

//import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.sbeans.TrainingInstute;

@SpringBootApplication
public class ValueAnnotationInSpringBootApplication {

	public static void main(String[] args) {
	ApplicationContext cxt=	SpringApplication.run(ValueAnnotationInSpringBootApplication.class, args);
	
	TrainingInstute t=cxt.getBean("traininginstute",TrainingInstute.class);
	System.out.println(t.getTotalfees());
	System.out.println(t.isIsjavacoursehigh());
	Environment env=cxt.getEnvironment();
	System.out.println("environment object value "+env.getProperty("java.fees"));
	ConfigurableApplicationContext axt=(ConfigurableApplicationContext)cxt;
	axt.close();
	}

}
