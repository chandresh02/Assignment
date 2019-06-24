package com.xworkz.project.controller;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.project.entity.CreateAssignmentEntity;
import com.xworkz.project.exception.ControllerException;
import com.xworkz.project.exception.ServiceException;
import com.xworkz.project.service.SearchAssignmentService;

@Controller
public class SearchAssignmentController {

	Session session = null;

	@Autowired
	private SearchAssignmentService searchAssignmentService;

	public SearchAssignmentController() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	@RequestMapping(value = "/searchAssignment.ams", method = RequestMethod.POST)
	public ModelAndView searchAssignmentController(@RequestParam long pin) throws ControllerException {
		System.out.println("searchAssignmentController method start");

		System.out.println("pin value is ::" + pin);

		CreateAssignmentEntity createAssignmentEntityFromDB;
		try {
			createAssignmentEntityFromDB = searchAssignmentService.searchAssignmentServiceSave(pin);

			if (createAssignmentEntityFromDB != null) {
				System.out.println("value of entity in controller layer is::" + createAssignmentEntityFromDB);
				
				return new ModelAndView("SearchAssignment.jsp", "msg", createAssignmentEntityFromDB);
			} else {
				System.out.println("record not available for pin::" + pin);
				return new ModelAndView("SearchAssignment.jsp", "msg", "record not availble for pin::" + pin);
			}
		}

		catch (ServiceException e) {
			System.out.println("Exception raised in SearchAssignmentController: " + e.getMessage());
			throw new ControllerException("EXcetion occurred in SearchAssignmentController: " + e.getMessage());
		}

	}
}