package com.nt.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="jpa_lob_marriage_seeker")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class MarriageSeeker implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer sid;
	@NonNull
	@Column(length = 30)
	private String name;
	@NonNull
	@Column(length = 30)
	private String address;
	@NonNull
	@Column(length = 30)
	private Boolean indian;
	
	@Lob
	@NonNull
	private byte photo[];
	@Lob
	@NonNull
	private char[] resume;

}
