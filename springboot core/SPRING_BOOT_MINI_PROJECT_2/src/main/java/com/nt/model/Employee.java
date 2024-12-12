package com.nt.model;

import lombok.Data;

@Data
public class Employee {
	
	private Integer empno;
	private String name;
	private String job;
	private Integer sal;
	private Integer deptno;
	private Float grossSalary;
	private Float netSalary;

}
