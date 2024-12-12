package com.jsp.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jsp.responseBody.ResponseStructure;

@ControllerAdvice
public class MyExcetionaHandler {
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<ResponseStructure<String>> nullPointerExceptionHandler(NullPointerException e)
	{
		ResponseStructure<String> rs=new ResponseStructure<String>();
		rs.setStatusCode(HttpStatus.BAD_REQUEST.value());
		rs.setMessage(e.toString());
		rs.setData("dont call api with null value");
		System.out.println("Null pointer exception created ");
		return new ResponseEntity<ResponseStructure<String>>(rs,HttpStatus.BAD_REQUEST);
	}
}
