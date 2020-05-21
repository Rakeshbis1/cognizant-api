package com.cognizant.api.apple.word.exception;

public class PayLoadException extends Exception{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
public static final String ERROR_CODE="Error in the value supplied to the payload, it can be empty or can have special characters or digits !";

public String getMessage() {

return ERROR_CODE;
}




}
