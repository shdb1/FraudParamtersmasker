package com.fraud.parse.vo;

public class RequestDetails {
	private FraudDescriptor fraudDescriptor;

	private PaymentData paymentData;

	public FraudDescriptor getFraudDescriptor() {
		return fraudDescriptor;
	}

	public void setFraudDescriptor(FraudDescriptor fraudDescriptor) {
		this.fraudDescriptor = fraudDescriptor;
	}

	public PaymentData getPaymentData() {
		return paymentData;
	}

	public void setPaymentData(PaymentData paymentData) {
		this.paymentData = paymentData;
	}

	@Override
	public String toString() {
		return "ClassPojo [fraudDescriptor = " + fraudDescriptor + ", paymentData = " + paymentData + "]";
	}
}
