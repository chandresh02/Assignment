package com.xworkz.project.dto;

import org.springframework.web.multipart.MultipartFile;

public class UploadAssignmentDTO {

	private int pin;
	private String emailId;
	private long contactNo;
	private String url;

	private MultipartFile file;

	public UploadAssignmentDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "UploadAssignmentDTO [pin=" + pin + ", emailId=" + emailId + ", contactNo=" + contactNo + ", url=" + url
				+ ", file=" + file + "]";
	}

	

}
