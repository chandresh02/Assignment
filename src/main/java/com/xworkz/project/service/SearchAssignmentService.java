package com.xworkz.project.service;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.project.dao.SearchAssignmentDAO;
import com.xworkz.project.entity.CreateAssignmentEntity;
import com.xworkz.project.exception.DAOException;
import com.xworkz.project.exception.ServiceException;

@Service
public class SearchAssignmentService {

	Session session = null;

	@Autowired
	private SearchAssignmentDAO searchAssignmentDAO;

	public SearchAssignmentService() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public CreateAssignmentEntity searchAssignmentServiceSave(long pin) throws ServiceException {

		System.out.println("searchAssignmentServiceSave method start");

		CreateAssignmentEntity entity;

		CreateAssignmentEntity createAssignmentFromDB;
		try {
			createAssignmentFromDB = searchAssignmentDAO.searchAssignmentDAOSave(pin);
			System.out.println("value of entity in service layer is::" + createAssignmentFromDB);
			return createAssignmentFromDB;
		}

		catch (DAOException e) {

			System.out.println("Exception raised in SearchAssignmentService: " + e.getMessage());
			throw new ServiceException("EXception occurred in SearchAssignmentService: " + e.getMessage());

		}


		// System.out.println("value of entity in service layer is::" +
		// createAssignmentFromDB);
		// return createAssignmentFromDB;

		// System.out.println("searchAssignmentServiceSave method end");

	}

}
