package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Entity
@Table(name = "employee_details")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eid;
	@NonNull
	private String ename;
	@NonNull
	private String address;
	@NonNull
	private LocalDateTime dob;
	@NonNull
	private LocalDate doj;
	@NonNull
	private LocalTime toj;
	

}
