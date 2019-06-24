package com.xworkz.project.dao;

import com.xworkz.project.entity.CreateAssignmentEntity;
import com.xworkz.project.exception.DAOException;

public interface ICreateAssignmentDAO {
	
	public void createAssignmentDAOSave(CreateAssignmentEntity createAssignmentEntity) throws DAOException;

}
