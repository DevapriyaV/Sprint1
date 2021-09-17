package com.brs.exceptions;

public class FeedBackNotFoundException extends Exception {
	public  FeedBackNotFoundException() {
		System.out.println("Feedback not found for given id");
	}

}
