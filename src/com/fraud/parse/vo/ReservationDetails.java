package com.fraud.parse.vo;

public class ReservationDetails {
	private String numberOfNights;

	private String reservationNumber;

	public String getNumberOfNights() {
		return numberOfNights;
	}

	public void setNumberOfNights(String numberOfNights) {
		this.numberOfNights = numberOfNights;
	}

	public String getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(String reservationNumber) {
		this.reservationNumber = reservationNumber;
	}

	@Override
	public String toString() {
		return "ClassPojo [numberOfNights = " + numberOfNights + ", reservationNumber = " + reservationNumber + "]";
	}
}