package com.xworkz.project.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.project.entity.CreateAssignmentEntity;
import com.xworkz.project.exception.DAOException;

@Repository
public class CreateAssignmentDAO implements ICreateAssignmentDAO {

	@Autowired
	private SessionFactory factory;

	public void createAssignmentDAOSave(CreateAssignmentEntity createAssignmentEntity) throws DAOException {

		Session session = null;
		Transaction transaction = null;
		try {

			session = factory.openSession();

			transaction = session.beginTransaction();
			session.save(createAssignmentEntity);
			transaction.commit();

		}

		catch (HibernateException e) {
			transaction.rollback();
			System.out.println("Exception raised in CreateAssignmentDAO: " + e.getMessage());
			throw new DAOException("EXcetion occurred CreateAssignmentDAO: " + e.getMessage());

		}

		finally {
			session.close();
		}

	}

}
