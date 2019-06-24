package com.xworkz.project.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.project.dao.UploadAssignmentDAO;
import com.xworkz.project.dto.UploadAssignmentDTO;
import com.xworkz.project.entity.UploadAssignmentEntity;
import com.xworkz.project.exception.DAOException;
import com.xworkz.project.exception.ServiceException;

@Service
public class UploadAssignmentService {

	Transaction transaction = null;
	Session session = null;

	@Autowired
	private UploadAssignmentDAO uploadAssignmentDAO;

	public UploadAssignmentService() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public void UploadAssignmentServiceSave(UploadAssignmentDTO uploadAssignmentDTO, String fileName)
			throws ServiceException {

		System.out.println("UploadAssignmentServiceSave method start");

		long contactNo = uploadAssignmentDTO.getContactNo();
		String emailId = uploadAssignmentDTO.getEmailId();
		MultipartFile file = uploadAssignmentDTO.getFile();
		int pin = uploadAssignmentDTO.getPin();
		String url = uploadAssignmentDTO.getUrl();

		UploadAssignmentEntity uploadAssignmentEntity = new UploadAssignmentEntity();
		uploadAssignmentEntity.setContactNo(contactNo);
		uploadAssignmentEntity.setEmail(emailId);
		uploadAssignmentEntity.setFileName(fileName);
		uploadAssignmentEntity.setPin(pin);
		uploadAssignmentEntity.setUrl(url);
		try {
			uploadAssignmentDAO.UploadAssignmentDAOSave(uploadAssignmentEntity);
		}

		catch (DAOException e) {

			System.out.println("Exception raised in UploadAssignmentService: " + e.getMessage());
			throw new ServiceException("EXception occurred in UploadAssignmentService: " + e.getMessage());

		}

		

	}

}
