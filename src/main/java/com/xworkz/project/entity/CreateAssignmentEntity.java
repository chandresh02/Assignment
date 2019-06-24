package com.xworkz.project.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "assignment_table")
public class CreateAssignmentEntity implements Serializable {

	
	
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name = "ASSIGNMENT_ID")
	private int assignmentId;
	@Column(name = "COURSE")
	private String course;
	@Column(name = "TOPIC")
	private String topic;
	@Column(name = "DESCRIPTION")
	private String description;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "DATE")
	private Date date;
	@Column(name = "UPLOAD_TYPE")
	private String uploadType;
	@Id
	@Column(name = "PIN")
	private long pin;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="PIN")
	private List<AssignAssignmentEntity> emailId;
	

	public CreateAssignmentEntity() {
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
	
	public List<AssignAssignmentEntity> getEmailId() {
		return emailId;
	}
	public void setEmailId(List<AssignAssignmentEntity> emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "assignmentId=" + assignmentId + ", course=" + course + ", topic=" + topic
				+ ", description=" + description + ", date=" + date + ", uploadType=" + uploadType + ", pin=" + pin
				+ ", emailId=" + emailId + "]";
	}
	

	
}
