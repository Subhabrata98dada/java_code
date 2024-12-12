package com.nt.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "JPA_OTM_PERSON")
@Setter
@Getter
@RequiredArgsConstructor
public class Person {

	
	@SequenceGenerator(name = "gen1",sequenceName = "PID_SEQ", initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	@Id
	private Integer pid;
	@Column(length = 20)
	@NonNull
	private String name;
	@Column(length = 20)
	@NonNull
	private String address;
	
	@OneToMany(targetEntity = PhoneNumber.class, cascade = CascadeType.ALL ,mappedBy = "person")
	//@JoinColumn(name = "person_id" , referencedColumnName = "pid")
	private Set<PhoneNumber> phones;
	
	public Person()
	{
		System.out.println("This is o param constructor o fparent");
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
