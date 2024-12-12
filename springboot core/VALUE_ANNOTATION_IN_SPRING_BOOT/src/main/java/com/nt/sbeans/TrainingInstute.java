package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;

@Data
@Component("traininginstute")
public class TrainingInstute {
	
	{
		System.out.println(this.getClass());
	}
	
	@Value("1001") //hardcoded value
	private Integer instid;
	
	@Value("${inst.name}")
	private String instname;
	
	
	@Value("${inst.address}")
	private String address;
	
	@Value("${inst.contact}")
	private String mobilrnumber;
	
	@Value("#{catalog.javacoursefees+catalog.dotnetcoursefees+catalog.androidcoursefees}")
	private double totalfees;
    //catalog is the bean id of the coursecatag objct
	
	@Getter
	@Value("#{catalog.javacoursefees>10000}") //expression language
	private boolean isjavacoursehigh;
}
