package com.xworkz.project.dto;

public class LoginDTO {
	private String emailId;
	private String password;

	public LoginDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDTO [emailId=" + emailId + ", password=" + password + "]";
	}

}
