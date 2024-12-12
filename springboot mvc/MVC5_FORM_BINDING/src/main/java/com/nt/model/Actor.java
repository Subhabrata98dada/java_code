package com.nt.model;

import lombok.Data;

@Data
public class Actor {
	private Integer aid;
	private String name;
	private String address="hydrabd";
	private Double fees;
	private String catagory;
	@Override
	public String toString() {
		return "Actor [aid=" + aid + ", name=" + name + ", address=" + address + ", fees=" + fees + ", catagory="
				+ catagory + "]";
	}
	
}
