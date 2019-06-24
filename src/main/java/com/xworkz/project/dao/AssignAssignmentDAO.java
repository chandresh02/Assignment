package com.xworkz.project.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.project.entity.AssignAssignmentEntity;
import com.xworkz.project.entity.CreateAssignmentEntity;
import com.xworkz.project.exception.DAOException;

@Repository
public class AssignAssignmentDAO {

	@Autowired
	private SessionFactory factory;

	public CreateAssignmentEntity assignAssignmentDAOOnMail(long pin, String[] emailIds) throws DAOException {
		System.out.println("calling  CreateAssignmentDAOOnMail from DAO.. ");
		Session session = null;
		Transaction transaction = null;

		try {
			String hql = "from CreateAssignmentEntity entity where entity.pin=:pinId";
			session = factory.openSession();
			Query query = session.createQuery(hql);
			query.setParameter("pinId", pin);
			CreateAssignmentEntity entityFromCreateAssignmentDB = (CreateAssignmentEntity) query.uniqueResult();
			// entityFromCreateAssignmentDB.setPin(pin);
			transaction = session.beginTransaction();

			for (int i = 0; i < emailIds.length; i++) {
				AssignAssignmentEntity assignAssignmentEntity = new AssignAssignmentEntity();
				assignAssignmentEntity.setCreateAssignmentEntity(entityFromCreateAssignmentDB);
				assignAssignmentEntity.setEmailId(emailIds[i]);

				session.save(assignAssignmentEntity);
				System.out.println("Data Save in AssignAssignmentDAO:" + emailIds[i] + " " + "And pin:" + pin);

			}
			transaction.commit();
			return entityFromCreateAssignmentDB;
		}

		catch (HibernateException e) {
			transaction.rollback();
			System.out.println("Exception raised in SignUpDAO: " + e.getMessage());
			throw new DAOException("EXcetion occurred SignUpDAO: " + e.getMessage());

		} finally {
			session.close();
		}

	}

}
