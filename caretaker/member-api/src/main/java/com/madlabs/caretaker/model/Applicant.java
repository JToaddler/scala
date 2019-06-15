package com.madlabs.caretaker.model;

public class Applicant {

	private Address address;
	private String email;
	private String firstName;
	private String lastName;

	private MaritalStatusEnum maritalStatus;

	private OccupationEnum occupation;

	private Long phoneNumber;

	private String stayReason;

	public Address getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		
		CreateAccResponse res = new CreateAccResponse();
		res.setCode("");
		
		return "Applicant [firstName=" + firstName + ", lastName=" + lastName + ", occupation=" + occupation + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public MaritalStatusEnum getMaritalStatus() {
		return maritalStatus;
	}

	public OccupationEnum getOccupation() {
		return occupation;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public String getStayReason() {
		return stayReason;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMaritalStatus(MaritalStatusEnum maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public void setOccupation(OccupationEnum occupation) {
		this.occupation = occupation;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setStayReason(String stayReason) {
		this.stayReason = stayReason;
	}

}
