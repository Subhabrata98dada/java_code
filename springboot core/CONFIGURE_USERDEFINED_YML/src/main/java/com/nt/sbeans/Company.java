package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "com.nt")
@Component("company")
public class Company {
	private String name;
	private String address;
	private int size;
	private long pin;
}
