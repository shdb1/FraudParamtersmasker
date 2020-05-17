package com.fraud.parse.vo;

public class FraudDescriptor {
	private FraudParameters[] fraudParameters;

	public FraudParameters[] getFraudParameters() {
		return fraudParameters;
	}

	public void setFraudParameters(FraudParameters[] fraudParameters) {
		this.fraudParameters = fraudParameters;
	}

	@Override
	public String toString() {
		return "ClassPojo [fraudParameters = " + fraudParameters + "]";
	}
}
