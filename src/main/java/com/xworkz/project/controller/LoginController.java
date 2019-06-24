package com.xworkz.project.controller;

import java.util.Base64;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.project.dto.LoginDTO;
import com.xworkz.project.entity.SignUpEntity;
import com.xworkz.project.exception.ControllerException;
import com.xworkz.project.exception.ServiceException;
import com.xworkz.project.service.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	private LoginService loginService;

	public LoginController() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	@RequestMapping(value = "/login.ams", method = RequestMethod.POST)
	public ModelAndView loginController(LoginDTO loginDTO) throws ControllerException {
		ModelAndView modelAndView = new ModelAndView("Home.jsp");
		System.out.println("logic controller method start");
		
	

		SignUpEntity entityFromDB;
		try {
			entityFromDB = loginService.loginServiceSave(loginDTO);
			System.out.println("Data From DB:" + entityFromDB);
			if (entityFromDB != null) {
				modelAndView.addObject("entity", entityFromDB);

				String pass = loginDTO.getPassword();
				String decPass = Base64.getEncoder().encodeToString(pass.getBytes());
				System.out.println("decrypt pass:" + decPass);
				if (decPass.equals(entityFromDB.getPassword())) {
					System.out.println("login successful");
					loginService.updateLastLoginAndFailCountService(entityFromDB);
					System.out.println("Data DTO is " + entityFromDB);
				
					return modelAndView;
					// return new ModelAndView("Home.jsp", "msg", "Welcome to
					// Home..");
				} else {
					System.out.println("incorrect password");
					int failCount = entityFromDB.getFailCount();
					entityFromDB.setFailCount(failCount + 1);
					loginService.failedLoginService(entityFromDB);

					return new ModelAndView("SignIn.jsp", "msg", "Incorrect password");
				}
			} else {
				return new ModelAndView("SignIn.jsp", "msg", "email id not exist in database");
			}
		
		} 
		
		catch (ServiceException e) {
			System.out.println("Exception raised in LoginController: " + e.getMessage());
			throw new ControllerException("EXcetion occurred in LoginController: " + e.getMessage());
		}
	/*	System.out.println("Data From DB:" + entityFromDB);
		if (entityFromDB != null) {
			modelAndView.addObject("entity", entityFromDB);

			String pass = loginDTO.getPassword();
			String decPass = Base64.getEncoder().encodeToString(pass.getBytes());
			System.out.println("decrypt pass:" + decPass);
			if (decPass.equals(entityFromDB.getPassword())) {
				System.out.println("login successful");
				loginService.updateLastLoginAndFailCountService(entityFromDB);
				System.out.println("Data DTO is " + entityFromDB);
			
				return modelAndView;
				// return new ModelAndView("Home.jsp", "msg", "Welcome to
				// Home..");
			} else {
				System.out.println("incorrect password");
				int failCount = entityFromDB.getFailCount();
				entityFromDB.setFailCount(failCount + 1);
				loginService.failedLoginService(entityFromDB);

				return new ModelAndView("SignIn.jsp", "msg", "Incorrect password");
			}
		} else {
			return new ModelAndView("SignIn.jsp", "msg", "email id not exist in database");
		}
	
		
*/
		// System.out.println("login controller method end");

	}

}
