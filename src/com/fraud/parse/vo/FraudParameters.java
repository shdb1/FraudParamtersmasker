package com.fraud.parse.vo;

public class FraudParameters {
	private String parameterGroupName;

	private Parameters[] parameters;

	public String getParameterGroupName() {
		return parameterGroupName;
	}

	public void setParameterGroupName(String parameterGroupName) {
		this.parameterGroupName = parameterGroupName;
	}

	public Parameters[] getParameters() {
		return parameters;
	}

	public void setParameters(Parameters[] parameters) {
		this.parameters = parameters;
	}

	@Override
	public String toString() {
		return "ClassPojo [parameterGroupName = " + parameterGroupName + ", parameters = " + parameters + "]";
	}
}