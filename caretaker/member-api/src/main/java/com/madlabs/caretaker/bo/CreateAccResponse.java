package com.madlabs.caretaker.bo;

public class CreateAccResponse extends BaseResponse {
	private String message;
	private String code;
	
	public String getMessage() {
		return message;
	}

	public CreateAccResponse(String message, String code) {
		super();
		this.message = message;
		this.code = code;
	}

	public CreateAccResponse() {
		super();
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}