package com.xworkz.project.dao;

import com.xworkz.project.entity.SignUpEntity;
import com.xworkz.project.exception.DAOException;

public interface ISignUpDAO {
	public String signUpDAOSave(SignUpEntity entity) throws DAOException;
}
