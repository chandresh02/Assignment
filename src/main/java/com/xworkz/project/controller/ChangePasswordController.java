package com.xworkz.project.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.project.exception.ControllerException;
import com.xworkz.project.exception.ServiceException;
import com.xworkz.project.service.ChangePasswordService;

@Controller
public class ChangePasswordController {

	@Autowired
	private ChangePasswordService changePasswordService;

	public ChangePasswordController() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	@RequestMapping(value = "/changepassword.ams", method = RequestMethod.POST)
	public ModelAndView changePasswordController(@RequestParam String NewPassword, @RequestParam String EmailId,
			Model model) throws UnsupportedEncodingException, ControllerException {
		System.out.println("changePasswordController method start");

		// model.addAttribute("EmailId", EmailId);

		try {
			changePasswordService.changePasswordServiceSave(NewPassword, EmailId);
		} catch (ServiceException e) {
			System.out.println("Exception raised in ChangePasswordController: " + e.getMessage());
			throw new ControllerException("EXcetion occurred in ChangePasswordController: " + e.getMessage());
		}

		// model.addAttribute("message", "old password successfullly changed");

		return new ModelAndView("ChangePassword.jsp", "message", "password successfully changed");

	}

}
