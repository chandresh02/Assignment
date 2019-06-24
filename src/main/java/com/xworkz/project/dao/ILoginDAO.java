package com.xworkz.project.dao;

import java.util.Date;

import com.xworkz.project.entity.LoginEntity;
import com.xworkz.project.entity.SignUpEntity;
import com.xworkz.project.exception.DAOException;

public interface ILoginDAO {

	public SignUpEntity loginDAOSave(LoginEntity loginEntity) throws DAOException ;

	public void updateLastLoginAndFailCountDAO(String emailId, Date date, int failCount, boolean newUser);

	public void failedLoginDAO(SignUpEntity entityFromDB);

}
