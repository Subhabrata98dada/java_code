package com.jsp.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class Profile {
	@EmbeddedId
	AccountID id;
	String name;
	Integer age;
	String gender;

}
