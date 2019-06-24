package com.xworkz.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "assignAssignment_table")
public class AssignAssignmentEntity implements Serializable {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "ASSIGNMENT_ID")
	private int assignmentId;
	@Column(name = "EMAIL_ID")
	private String emailId;
	/*@Column(name="PIN")
	private long pin;*/

	@ManyToOne
	@JoinColumn(name = "PIN")
	private CreateAssignmentEntity createAssignmentEntity;

	public AssignAssignmentEntity()

	{
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public int getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(int assignmentId) {
		this.assignmentId = assignmentId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public CreateAssignmentEntity getCreateAssignmentEntity() {
		return createAssignmentEntity;
	}

	public void setCreateAssignmentEntity(CreateAssignmentEntity createAssignmentEntity) {
		this.createAssignmentEntity = createAssignmentEntity;
	}

/*	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}*/
	
	@Override
	public String toString() {
		return "" + emailId + "";
	}

	/*@Override
	public String toString() {
		return "AssignAssignmentEntity [assignmentId=" + assignmentId + ", emailId=" + emailId
				+ ", createAssignmentEntity=" + createAssignmentEntity + "]";
	}*/

}
