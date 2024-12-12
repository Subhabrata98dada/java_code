package com.jsp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
	@Id
	Integer roll;
	String name;
	String email;
	Double height;
}
