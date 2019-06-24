package com.xworkz.project.dao;

import com.xworkz.project.entity.UploadAssignmentEntity;
import com.xworkz.project.exception.DAOException;

public interface IUploadAssignmentDAO {

	public void UploadAssignmentDAOSave(UploadAssignmentEntity uploadAssignmentEntity) throws DAOException;

}
