package com.brs.exceptions;

public class ReservationNotFoundException extends Exception {
	public ReservationNotFoundException(){
		System.out.println("Reservation not found for given id");
	}
}
	