package com.nt.models;

import org.hibernate.annotations.SQLRestriction;
import org.hibernate.annotations.Where;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "employee")
@Data
@NoArgsConstructor
@SQLRestriction("status!='inactive'")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Long mobile;
    private String email;
    private String job;
    private Integer deptno;
    private Double salary;
    private String status="active";
}
