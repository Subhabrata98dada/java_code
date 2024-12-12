package com.nt.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Artist {
	@Id
	private String id;
	private String name;
	private String address;
	private Double fees;
}
