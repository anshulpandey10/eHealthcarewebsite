package com.group1.eHealthCare.entity;

public class AuthenticationResponse {
	private String message;
	private String username;

	public AuthenticationResponse(String message, String username) {
		this.message = message;
		this.username = username;
	}

	// Getters and setters for message and username
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}