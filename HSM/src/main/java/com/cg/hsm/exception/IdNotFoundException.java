package com.cg.hsm.exception;

public class IdNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;
	/**
	 * Create InsufficientExperienceException object without error message
	 */
	public IdNotFoundException() {
		super();
	}
	/**
	 * Create InsufficientExperienceException object with error message
	 */
	public IdNotFoundException(String errMsg){
		super(errMsg);
	}


}
