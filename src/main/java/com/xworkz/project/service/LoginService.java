package com.xworkz.project.service;

import java.util.Base64;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.project.dao.LoginDAO;
import com.xworkz.project.dto.LoginDTO;
import com.xworkz.project.entity.LoginEntity;
import com.xworkz.project.entity.SignUpEntity;
import com.xworkz.project.exception.DAOException;
import com.xworkz.project.exception.ServiceException;

@Service
public class LoginService {

	@Autowired
	private LoginDAO loginDAO;

	public SignUpEntity loginServiceSave(LoginDTO loginDTO) throws ServiceException {

		System.out.println("loginservice start");
		String emailId = loginDTO.getEmailId();
		System.out.println("emailid is::" + emailId);

		String password = loginDTO.getPassword();
		System.out.println("password is::" + password);
		System.out.println("loginDTO IS::" + loginDTO);

		String decPass = Base64.getEncoder().encodeToString(password.getBytes());

		LoginEntity loginEntity = new LoginEntity();
		loginEntity.setEmailId(emailId);
		loginEntity.setPassword(decPass);

		System.out.println("password is::" + password);
		System.out.println("loginDTO IS::" + loginDTO);

		System.out.println("loginEntity is::" + loginEntity);

		SignUpEntity entity;
		try {
			entity = loginDAO.loginDAOSave(loginEntity);
			return entity;
		} catch (DAOException e) {
			System.out.println("Exception raised in LoginService: " + e.getMessage());
			throw new ServiceException("EXcetion occurred in LoginService: " + e.getMessage());

		}

		// return entity;
	}

	public void updateLastLoginAndFailCountService(SignUpEntity entityFromDB) {

		String emailId = entityFromDB.getEmailId();
		Date date = new Date();
		int failCount = 0;
		boolean newUser = false;
		System.out.println("emailId is::" + emailId);
		System.out.println("date is ::" + date);
		System.out.println("failcount is::" + failCount);
		System.out.println("new user is::" + newUser);
		loginDAO.updateLastLoginAndFailCountDAO(emailId, date, failCount, newUser);
	}

	public void failedLoginService(SignUpEntity entityFromDB) {

		loginDAO.failedLoginDAO(entityFromDB);

	}

}
