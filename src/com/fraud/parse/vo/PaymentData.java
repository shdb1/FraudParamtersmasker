package com.fraud.parse.vo;

public class PaymentData {
	private TransactionDetails transactionDetails;

	private Payments payments;

	public void setPayments(Payments payments) {
		this.payments = payments;
	}

	public Payments getPayments() {
		return payments;
	}

	public TransactionDetails getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(TransactionDetails transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	@Override
	public String toString() {
		return "ClassPojo [transactionDetails = " + transactionDetails + ", payments = " + payments + "]";
	}
}
