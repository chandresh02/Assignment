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
public class SignUpDAO implements ISignUpDAO {

	@Autowired
	private SessionFactory factory;

	public String signUpDAOSave(SignUpEntity entity) throws DAOException {

		Session session = null;
		Transaction transaction = null;
		System.out.println("signUpDAO save start");
		try {
			String hql = "from SignUpEntity where  emailId=:email";
			session = factory.openSession();
			transaction = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setParameter("email", entity.getEmailId());
			SignUpEntity entityFromDb = (SignUpEntity) query.uniqueResult();
			if (entityFromDb != null) {
				System.out.println("emailId already exist into database");
				return "emailId already exist into database";
			} else {
				session.save(entity);
				transaction.commit();
				System.out.println("Signup Entity is " + entity);

				return "user created succsessfully";

			}
		} catch (HibernateException e) {
			transaction.rollback();
			System.out.println("Exception raised in SignUpDAO: " + e.getMessage());
			throw new DAOException("EXcetion occurred SignUpDAO: " + e.getMessage());

		} 
		finally {
			session.close();
		}

	}

}
