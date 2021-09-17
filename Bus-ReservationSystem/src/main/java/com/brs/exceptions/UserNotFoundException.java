package com.brs.exceptions;

public class UserNotFoundException extends Exception{
	public UserNotFoundException() {
		String msg="Bus not found for given id";
		System.out.println(msg);
	}
}
