package com.xworkz.project.dao;

import com.xworkz.project.exception.DAOException;

public interface IChangePasswordDAO {
	
	public void changePasswordDAOSave(String encryptpassword, String emailId)throws DAOException;

}
