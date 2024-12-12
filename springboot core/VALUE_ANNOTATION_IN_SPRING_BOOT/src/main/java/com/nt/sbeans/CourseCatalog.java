package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;



@Component("catalog")
@Data
public class CourseCatalog {
	{
		System.out.println(this.getClass());
	}
	@Value("${java.fees}")
	private double javacoursefees;
	
	@Value("${donet.fees}")
	private double dotnetcoursefees;
	
	@Value("${python.fees}")
	private double pythoncoursefees;
	
	@Value("${andriod.fees}")
	private double androidcoursefees;
	
	@Value("${ui.fees}")
	private double uicoursefee;
	
    
	
	
}
