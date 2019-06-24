package com.xworkz.project.dto;

public class AssignAssignmentDTO {
	
	private long pin;
	private String emailId;
	
	
	public AssignAssignmentDTO()
	{
		System.out.println(this.getClass().getSimpleName() + " object created");
	}


	public long getPin() {
		return pin;
	}


	public void setPin(long pin) {
		this.pin = pin;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return "AssignAssignmentDTO [pin=" + pin + ", emailId=" + emailId + "]";
	}

}
