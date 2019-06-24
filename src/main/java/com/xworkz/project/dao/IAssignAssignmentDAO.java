package com.xworkz.project.dao;

import com.xworkz.project.entity.CreateAssignmentEntity;
import com.xworkz.project.exception.DAOException;

public interface IAssignAssignmentDAO {

	
	public CreateAssignmentEntity assignAssignmentDAOOnMail(long pin, String[] emailIds) throws DAOException ;
	
}
