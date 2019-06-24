package com.xworkz.project.dao;

import com.xworkz.project.entity.CreateAssignmentEntity;
import com.xworkz.project.exception.DAOException;

public interface ISearchAssignmentDAO {
	
	public CreateAssignmentEntity searchAssignmentDAOSave(long pin) throws DAOException;


}
