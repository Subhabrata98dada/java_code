package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("company")
@Setter
@ToString
@ConfigurationProperties(prefix = "org.nt")
//@PropertySource("com/nt/commons/info.properties")
public class Company {
	private String name;
	private String address;
	private long pin;
	private String email;
	@Value("${com.nt.size}")
	private int size;
	private String description;
	@Value("${com.nt.name}")
	private String owner;

}
