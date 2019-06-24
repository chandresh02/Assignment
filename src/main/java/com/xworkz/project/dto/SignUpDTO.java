package com.xworkz.project.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class SignUpDTO implements Serializable {

	private String firstName;
	private String lastName;
	private int countryCode;
	private long mobileNo;
	private String emailId;
	private boolean newUser;
	private String password;

	public SignUpDTO()
	{
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public boolean isNewUser() {
		return newUser;
	}

	public void setNewUser(boolean newUser) {
		this.newUser = newUser;
	}

	public String getPassword() { 
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "SignUpDTO [firstName=" + firstName + ", lastName=" + lastName + ", countryCode=" + countryCode
				+ ", mobileNo=" + mobileNo + ", emailId=" + emailId + ", newUser=" + newUser + ", password=" + password
				+ "]";
	}

}
