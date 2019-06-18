package com.madlabs.caretaker.bo;

public class Address {

	@Override
	public String toString() {
		return "Address [line1=" + line1 + "]";
	}

	private String line1;
	private String line2;
	private String city;
	private String landMark;
	private int pinCode;

	private String state;

	public String getCity() {
		return city;
	}

	public String getLandMark() {
		return landMark;
	}

	public int getPinCode() {
		return pinCode;
	}

	public String getState() {
		return state;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

}