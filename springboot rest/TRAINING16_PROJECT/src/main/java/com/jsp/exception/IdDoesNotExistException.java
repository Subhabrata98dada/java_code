package com.jsp.exception;


public class IdDoesNotExistException extends Exception {
	private String message="id not present";
	public IdDoesNotExistException() {}
	public IdDoesNotExistException(String message)
	{
		super();
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		
		return message;
	}
}
