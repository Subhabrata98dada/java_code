package com.jsp.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponseStructure<T> {
	private Integer statuscode;
	private String message;
	private T data;
}
