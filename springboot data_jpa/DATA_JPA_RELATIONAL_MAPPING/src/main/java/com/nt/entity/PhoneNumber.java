package com.nt.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="JAP_OTM_PHONES")
@Getter
@Setter
@RequiredArgsConstructor
public class PhoneNumber {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer regid;
	
	@NonNull
	private Long phone;
	@Column(length = 20)
	@NonNull
	private String type;
	@Column(length = 20)
	@NonNull
	private String provider;
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Person.class)
	@JoinColumn(name="person_id",referencedColumnName = "pid")
	private Person person;
	
	public PhoneNumber()
	{
		System.out.println("0 param parameter");
	}

	@Override
	public String toString() {
		return "PhoneNumber [regid=" + regid + ", phone=" + phone + ", type=" + type + ", provider=" + provider + "]";
	}
	

}
