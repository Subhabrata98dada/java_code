package com.jsp.responsestructure;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponseStructure<T> {
	private Integer statusCode;
	private String message;
	private T data;
}
