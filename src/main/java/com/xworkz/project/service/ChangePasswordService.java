package com.xworkz.project.service;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.xworkz.project.dao.ChangePasswordDAO;
import com.xworkz.project.entity.SignUpEntity;
import com.xworkz.project.exception.DAOException;
import com.xworkz.project.exception.ServiceException;
import com.xworkz.project.util.DataValidation;

@Service
public class ChangePasswordService {

	@Autowired
	private ChangePasswordDAO changePasswordDAO;
	@Autowired
	private DataValidation dataValidation;
	@Autowired
	private JavaMailSender mailSender;

	public ChangePasswordService() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public String changePasswordServiceSave(String newPassword, String emailId)
			throws UnsupportedEncodingException, ServiceException {

		System.out.println("invkode changePassDetails() From Service...");
		boolean check = false;
		check = valid(newPassword);
		if (check) {
			System.out.println("Entered New Password is:" + newPassword);
			// convert in encryption

			String encryptpassword = Base64.getEncoder().encodeToString(newPassword.getBytes("utf-8"));
			System.out.println("encrpted pass in dataBase is::" + encryptpassword);
			try {
				changePasswordDAO.changePasswordDAOSave(encryptpassword, emailId);
			} catch (DAOException e) {
				System.out.println("Exception raised in ChangePasswordService: " + e.getMessage());
				throw new ServiceException("EXcetion occurred in ChangePasswordService: " + e.getMessage());

			}

			SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setTo(emailId);
			mailMessage.setSubject("password change confirmation mail from assignment management");
			mailMessage.setText("your password is changed \n" + "please login by using \n" + "newpwd" + newPassword);
			mailSender.send(mailMessage);
			return "mail send to ::\t" + emailId;

		}
		return "successfully password changed";

	}

	private boolean valid(String newPassword) {
		if (newPassword != null) {
			@SuppressWarnings("unused")
			boolean validNewPass = dataValidation.isValidNewPass(newPassword);
			System.out.println(" new password is valid this will save into database");
			return true;

		} else {
			System.out.println("generated password is invalid");
			return false;
		}

	}

}
