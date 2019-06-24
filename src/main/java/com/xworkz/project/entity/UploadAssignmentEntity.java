package com.xworkz.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.mysql.jdbc.Blob;

@Entity
@Table(name = "uploadassignment_table")
public class UploadAssignmentEntity implements Serializable {


	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "ID")
	private int id;
	@Column(name = "PIN")
	private int pin;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "CONTACT_NO")
	private long contactNo;
	@Column(name = "FILE")
	private String file;
	@Column(name = "URL")
	private String url;

	public UploadAssignmentEntity() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getFileName() {
		return file;
	}

	public void setFileName(String file) {
		this.file = file;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "UploadAssignmentEntity [id=" + id + ", pin=" + pin + ", email=" + email + ", contactNo=" + contactNo
				+ ", fileName=" + file + ", url=" + url + "]";
	}

}
