package com.xworkz.project.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.project.entity.UploadAssignmentEntity;
import com.xworkz.project.exception.DAOException;

@Repository
public class UploadAssignmentDAO implements IUploadAssignmentDAO {

	@Autowired
	private SessionFactory factory;

	Transaction transaction = null;
	Session session = null;

	public UploadAssignmentDAO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public void UploadAssignmentDAOSave(UploadAssignmentEntity uploadAssignmentEntity) throws DAOException {

		System.out.println("UploadAssignmentDAOSave method start");
		System.out.println("Data available in  UploadAssignmentDAO is::" + uploadAssignmentEntity);
		try {

			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(uploadAssignmentEntity);
			transaction.commit();

		}

		catch (HibernateException e) {
			transaction.rollback();
			System.out.println("Exception raised in UploadAssignmentDAO: " + e.getMessage());
			throw new DAOException("EXcetion occurred UploadAssignmentDAO: " + e.getMessage());

		}
	}
}