package com.ustglobal.exception.first;

public class PVR {

	void book() {
		System.out.println("Booking  started...");

		try {
			System.out.println(10/0);
			System.out.println("logic for booking");
			System.out.println("Booking Confirmed...");
		}
		catch(ArithmeticException ae) {
			System.out.println("booking failed...");
			throw ae;
		}
	}		


}
