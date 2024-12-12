package com.jsp.responseBody;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseStructure<T> {
	private int statusCode;
	private String message;
	T data;
}
