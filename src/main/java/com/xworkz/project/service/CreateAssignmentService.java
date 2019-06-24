package com.xworkz.project.service;

import java.util.Date;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.xworkz.project.dao.CreateAssignmentDAO;
import com.xworkz.project.dto.CreateAssignmentDTO;
import com.xworkz.project.entity.CreateAssignmentEntity;
import com.xworkz.project.exception.DAOException;
import com.xworkz.project.exception.ServiceException;
import com.xworkz.project.util.RandomPasswordGenerator;

@Service
public class CreateAssignmentService {

	@Autowired
	private CreateAssignmentDAO createAssignmentDAO;
	
	@Autowired
	private RandomPasswordGenerator  randomPasswordGenerator;

	public CreateAssignmentService() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public long createAssignmentServiceSave(CreateAssignmentDTO createAssignmentDTO) throws ServiceException {

		System.out.println("createAssignmentService method start");

		int assignmentId = createAssignmentDTO.getAssignmentId();
		String course = createAssignmentDTO.getCourse();
		String topic = createAssignmentDTO.getTopic();
		String description = createAssignmentDTO.getDescription();
		Date deadLine = createAssignmentDTO.getDate();
		String uploadType = createAssignmentDTO.getUploadType();

		CreateAssignmentEntity createAssignmentEntity = new CreateAssignmentEntity();
		createAssignmentEntity.setAssignmentId(assignmentId);
		createAssignmentEntity.setCourse(course);
		createAssignmentEntity.setTopic(topic);
		createAssignmentEntity.setDescription(description);
		createAssignmentEntity.setDate(deadLine);
		createAssignmentEntity.setUploadType(uploadType);
		
		//random pin generation for assignment
	    long pin=randomPasswordGenerator.generateRandomPin();
	    createAssignmentEntity.setPin(pin);

		try {
			createAssignmentDAO.createAssignmentDAOSave(createAssignmentEntity);
		} 
		catch (DAOException e) {

			System.out.println("Exception raised in CreateAssignmentService: " + e.getMessage());
			throw new ServiceException("EXcetion occurred in CreateAssignmentService: " + e.getMessage());

		}
		
		System.out.println("createAssignmentService end");
		return pin;

	}

}
