package com.fraud.parse.vo;

public class Metadata {
	private Id id;

	private Source source;

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "ClassPojo [id = " + id + ", source = " + source + "]";
	}
}
