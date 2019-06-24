package com.xworkz.project.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.project.entity.SignUpEntity;
import com.xworkz.project.exception.DAOException;

@Repository
public class ChangePasswordDAO {
	Transaction transaction = null;
	Session session = null;

	@Autowired
	private SessionFactory factory;

	public void ChangePasswordDAO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public void changePasswordDAOSave(String encryptpassword, String emailId) throws DAOException {

		System.out.println("changePasswordDAOSave going to start");
		try {
			String hql = "update SignUpEntity set password=:newPwd where emailId=:mailId";
			session = factory.openSession();
			transaction = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setParameter("mailId", emailId);
			query.setParameter("newPwd", encryptpassword);
			query.executeUpdate();
			transaction.commit();

			/*
			 * SignUpEntity signUpEntity = new SignUpEntity();
			 * System.out.println("updated value in database is::" +
			 * signUpEntity);
			 */

		}

		catch (HibernateException e) {
			transaction.rollback();
			System.out.println("Exception raised in ChangePasswordDAO: " + e.getMessage());
			throw new DAOException("EXcetion occurred ChangePaswordDAO: " + e.getMessage());

		} finally {
			session.close();
		}

	}

}
