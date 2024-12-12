package com.jsp.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.jsp.dto.ResponseStructure;


@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(IdDoesNotExistException.class)
	public ResponseEntity<ResponseStructure<String>> catchIdDoesNotPresent(IdDoesNotExistException exception)
	{
		ResponseStructure<String> response=new ResponseStructure<String>();
		response.setStatuscode(HttpStatus.NOT_FOUND.value());
		response.setMessage("ID not found");
		response.setData(exception.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(response,HttpStatus.NOT_FOUND);
	}
}
