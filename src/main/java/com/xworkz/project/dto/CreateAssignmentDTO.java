package com.xworkz.project.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

public class CreateAssignmentDTO implements Serializable {

	private int assignmentId;
	private String course;
	private String topic;
	private String description;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	private String uploadType;
	private long pin;

	public CreateAssignmentDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public int getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(int assignmentId) {
		this.assignmentId = assignmentId;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUploadType() {
		return uploadType;
	}

	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "CreateAssignmentDTO [assignmentId=" + assignmentId + ", course=" + course + ", topic=" + topic
				+ ", description=" + description + ", date=" + date + ", uploadType=" + uploadType + ", pin=" + pin
				+ "]";
	}

}
