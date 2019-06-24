package com.xworkz.project.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.project.entity.CreateAssignmentEntity;
import com.xworkz.project.exception.DAOException;

@Repository
public class SearchAssignmentDAO implements ISearchAssignmentDAO {

	Transaction transaction = null;
	Session session = null;

	@Autowired
	private SessionFactory factory;

	public SearchAssignmentDAO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public CreateAssignmentEntity searchAssignmentDAOSave(long pin) throws DAOException {
		System.out.println("searchAssignmentDAOSave method start");
		try {
			Session session = factory.openSession();
			String hql = "From CreateAssignmentEntity entity where entity.pin=:pinId";
			Query query = session.createQuery(hql);
			query.setParameter("pinId", pin);
			CreateAssignmentEntity createAssignmentEntityFromDB = (CreateAssignmentEntity) query.uniqueResult();
			System.out.println("entity value in dao layer is:" + createAssignmentEntityFromDB);
			return createAssignmentEntityFromDB;
		} catch (HibernateException e) {
			transaction.rollback();
			System.out.println("Exception raised in SearchAssignmentDAO: " + e.getMessage());
			throw new DAOException("EXception occurred SearchAssignmentDAO: " + e.getMessage());
		} 
	}

}
