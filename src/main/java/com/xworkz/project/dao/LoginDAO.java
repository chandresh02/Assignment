package com.xworkz.project.dao;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.project.entity.LoginEntity;
import com.xworkz.project.entity.SignUpEntity;
import com.xworkz.project.exception.DAOException;

@Repository
public class LoginDAO implements ILoginDAO {

	@Autowired
	private SessionFactory factory;
	Transaction transaction = null;
	Session session = null;

	public SignUpEntity loginDAOSave(LoginEntity loginEntity) throws DAOException {
		System.out.println("User data In DAO:" + loginEntity);
		try {
			String hql = "from SignUpEntity where emailId=:email";
			Session session = factory.openSession();
			Query query = session.createQuery(hql);
			query.setParameter("email", loginEntity.getEmailId());
			SignUpEntity entityFromDb = (SignUpEntity) query.uniqueResult();
		      System.out.println("Entity From DB:"+entityFromDb.toString());
			return entityFromDb;
		} catch (HibernateException e) {
			transaction.rollback();
			System.out.println("Exception raised in LoginDAO: " + e.getMessage());
			throw new DAOException("EXcetion occurred LoginDAO: " + e.getMessage());
		}

	}

	public void updateLastLoginAndFailCountDAO(String emailId, Date date, int failCount, boolean newUser) {
		String hql = "update SignUpEntity set lastLogin=:lastlogin,failCount=:failcount,newUser=:newuser where emailId=:emailid";
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(hql);
		query.setParameter("lastlogin", date);
		query.setParameter("failcount", failCount);
		query.setParameter("newuser", newUser);
		query.setParameter("emailid", emailId);
		query.executeUpdate();
		transaction.commit();
	}

	public void failedLoginDAO(SignUpEntity entityFromDB) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(entityFromDB);
		transaction.commit();
	}

}
