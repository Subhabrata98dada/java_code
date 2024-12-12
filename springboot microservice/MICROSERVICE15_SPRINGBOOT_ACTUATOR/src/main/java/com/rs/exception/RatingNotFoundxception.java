package com.rs.exception;

public class RatingNotFoundxception extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public RatingNotFoundxception(String msg)
    {
        super(msg);
    }
    public RatingNotFoundxception()
    {
        super("This is not a valid id");
    }

}
