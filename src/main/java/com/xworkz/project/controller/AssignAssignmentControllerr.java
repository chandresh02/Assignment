package com.xworkz.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.project.exception.ControllerException;
import com.xworkz.project.exception.ServiceException;
import com.xworkz.project.service.AssignAssignmentService;

@Controller
public class AssignAssignmentControllerr {

	@Autowired
	private AssignAssignmentService assignAssignmentService;

	public AssignAssignmentControllerr() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/assignAssignment.ams", method = RequestMethod.POST)
	public ModelAndView assignAsssignmentController(@RequestParam long pin, @RequestParam String emailId)
			throws ControllerException {
		System.out.println("assignAsignmentController method start");

		System.out.println("pin we get is::" + pin);
		String[] emailIds = emailId.split(",");
		for (int i = 0; i < emailIds.length; i++) {
			System.out.println("respective email id is::" + emailIds[i]);
		}

		try {
			assignAssignmentService.assignAssignmentOnMail(pin, emailIds);
		} catch (ServiceException e) {
			System.out.println("Exception raised in AsignAssignmentController: " + e.getMessage());
			throw new ControllerException("EXcetion occurred in AssignAssignmentController: " + e.getMessage());

		}
		System.out.println("assignAsignmentController method end");
		return new ModelAndView("AssignAssignment.jsp", "msg", "sussessfully mail send");

	}

}
