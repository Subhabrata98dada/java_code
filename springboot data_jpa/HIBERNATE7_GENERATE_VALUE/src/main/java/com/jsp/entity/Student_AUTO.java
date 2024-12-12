package com.jsp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Student_AUTO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator ="studentrollreq")
	@SequenceGenerator(name ="studentrollreq",initialValue = 99,allocationSize = 23,sequenceName = "seq")
	private Integer id;
	@NonNull
	private String name;
	@NonNull
	private Double fees;
}
