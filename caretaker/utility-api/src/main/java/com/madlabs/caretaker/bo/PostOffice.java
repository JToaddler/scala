package com.madlabs.caretaker.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostOffice {

	private String name;
	private String description;
	private String branchType;
	private String deliveryStatus;
	private String taluk;
	private String circle;
	private String district;
	private String division;
	private String state;
	private String county;

	@JsonProperty("Name")
	public String getName() {
		return name;
	}

	@JsonProperty("Name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("Description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("Description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("BranchType")
	public String getBranchType() {
		return branchType;
	}

	@JsonProperty("BranchType")
	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}

	@JsonProperty("DeliveryStatus")
	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	@JsonProperty("DeliveryStatus")
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	@JsonProperty("Taluk")
	public String getTaluk() {
		return taluk;
	}

	@JsonProperty("Taluk")
	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}

	@JsonProperty("Circle")
	public String getCircle() {
		return circle;
	}

	@JsonProperty("Circle")
	public void setCircle(String circle) {
		this.circle = circle;
	}

	@JsonProperty("District")
	public String getDistrict() {
		return district;
	}

	@JsonProperty("District")
	public void setDistrict(String district) {
		this.district = district;
	}

	@JsonProperty("Division")
	public String getDivision() {
		return division;
	}

	@JsonProperty("Division")
	public void setDivision(String division) {
		this.division = division;
	}

	@JsonProperty("State")
	public String getState() {
		return state;
	}

	@JsonProperty("State")
	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("India")
	public String getCounty() {
		return county;
	}

	@JsonProperty("India")
	public void setCounty(String county) {
		this.county = county;
	}
}