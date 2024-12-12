package com.hs.exception;

public class ResourseNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourseNotFoundException()
	{
		super("resource not found on server");
	}
	
	public ResourseNotFoundException(String msg)
	{
		super(msg);
	}
}
