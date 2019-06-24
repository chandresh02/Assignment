package com.xworkz.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.xworkz.project.dao.AssignAssignmentDAO;
import com.xworkz.project.entity.CreateAssignmentEntity;
import com.xworkz.project.exception.DAOException;
import com.xworkz.project.exception.ServiceException;
import com.xworkz.project.util.MailRealted;

@Service
public class AssignAssignmentService {

	@Autowired
	private AssignAssignmentDAO assignAssignmentDAO;

	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	private MailRealted mailRelated;

	public AssignAssignmentService() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public void assignAssignmentOnMail(long pin, String[] emailIds) throws ServiceException

	{
		System.out.println("assignAssignmentOnMail method start");

		CreateAssignmentEntity createAssignEntity;
		try {
			createAssignEntity = assignAssignmentDAO.assignAssignmentDAOOnMail(pin, emailIds);
			System.out.println("Return entity from DB in AssignAssignmentService::" + createAssignEntity);
			mailRelated.mailAssign(createAssignEntity, emailIds);

		} catch (DAOException e) {
			System.out.println("Exception raised in AssignAssignmentService: " + e.getMessage());
			throw new ServiceException("EXcetion occurred in AsignAssignmentService: " + e.getMessage());

		}

		// System.out.println("Return entity from DB in
		// AssignAssignmentService::"+createAssignEntity);
		// mailRelated.mailAssign(createAssignEntity,emailIds);

		System.out.println("assignAssignmentOnMail method end");

	}

}
