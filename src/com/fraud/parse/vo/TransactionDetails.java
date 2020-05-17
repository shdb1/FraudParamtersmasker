package com.fraud.parse.vo;

public class TransactionDetails {
	private String originatingSystemName;

	private TransactionPrice transactionPrice;

	private ReservationDetails reservationDetails;

	public String getOriginatingSystemName() {
		return originatingSystemName;
	}

	public void setOriginatingSystemName(String originatingSystemName) {
		this.originatingSystemName = originatingSystemName;
	}

	public TransactionPrice getTransactionPrice() {
		return transactionPrice;
	}

	public void setTransactionPrice(TransactionPrice transactionPrice) {
		this.transactionPrice = transactionPrice;
	}

	public ReservationDetails getReservationDetails() {
		return reservationDetails;
	}

	public void setReservationDetails(ReservationDetails reservationDetails) {
		this.reservationDetails = reservationDetails;
	}

	@Override
	public String toString() {
		return "ClassPojo [originatingSystemName = " + originatingSystemName + ", transactionPrice = "
				+ transactionPrice + ", reservationDetails = " + reservationDetails + "]";
	}
}
