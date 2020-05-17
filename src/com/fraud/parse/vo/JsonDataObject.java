package com.fraud.parse.vo;

public class JsonDataObject {
	private Metadata metadata;

	private String requestType;

	private RequestDetails requestDetails;

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public RequestDetails getRequestDetails() {
		return requestDetails;
	}

	public void setRequestDetails(RequestDetails requestDetails) {
		this.requestDetails = requestDetails;
	}

	@Override
	public String toString() {
		return "ClassPojo [metadata = " + metadata + ", requestType = " + requestType + ", requestDetails = "
				+ requestDetails + "]";
	}
}
