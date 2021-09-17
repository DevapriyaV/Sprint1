package com.brs.exceptions;

public class BusNotFoundException extends Exception{
	public BusNotFoundException() {
		String msg="Bus not found for given id";
		System.out.println(msg);
	}
}