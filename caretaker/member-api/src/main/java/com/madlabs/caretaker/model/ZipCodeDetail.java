package com.madlabs.caretaker.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ZipCodeDetail {

	private String message;

	private List<PostOffice> postOffice;

	private String stauts;

	@JsonProperty("Message")
	public String getMessage() {
		return message;
	}

	@JsonProperty("PostOffice")
	public List<PostOffice> getPostOffice() {
		return postOffice;
	}

	@JsonProperty("Status")
	public String getStauts() {
		return stauts;
	}

	@JsonProperty("Message")
	public void setMessage(String message) {
		this.message = message;
	}

	@JsonProperty("PostOffice")
	public void setPostOffice(List<PostOffice> postOffice) {
		this.postOffice = postOffice;
	}

	@JsonProperty("Status")
	public void setStauts(String stauts) {
		this.stauts = stauts;
	}

}
