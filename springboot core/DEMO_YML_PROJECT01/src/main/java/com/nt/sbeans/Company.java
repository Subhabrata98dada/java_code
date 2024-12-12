package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("com")

@ConfigurationProperties(prefix = "com.nt")
public class Company {
	private String name;
	private String address;
	private int size;
	private String email;
	private long pincode;
	
	private String nicknames[];
	private List<Integer> phones;
	private Set<String> colors;
	private Map<String, Integer> iddetails;
	
	
	private Location location;

}
