package com.ustglobal.exception.customizeduncheckexception;

public class InvalidAgeException extends RuntimeException {

	String message = " Invalid age below 18 ears not allowed";
	
	public  InvalidAgeException() {
	}
	
	public InvalidAgeException(String message) {
		this.message = message;
	}
	
//	@Override
//	public String toString() {
//		return super.toString();
//	}
	@Override
	public String getMessage() {
		return message;
	}
}
