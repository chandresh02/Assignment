package com.xworkz.project.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.project.dto.CreateAssignmentDTO;
import com.xworkz.project.exception.ControllerException;
import com.xworkz.project.exception.ServiceException;
import com.xworkz.project.service.CreateAssignmentService;

@Controller
@RequestMapping("/")
public class CreateAssignmentController {

	long pin;

	@Autowired
	private CreateAssignmentService createAssignmentService;

	public CreateAssignmentController() {
		System.out.println(this.getClass().getSimpleName() + " object created ");
	}

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@RequestMapping(value = "/createAssignment.ams", method = RequestMethod.POST)
	public ModelAndView createAssignmentController(CreateAssignmentDTO createAssignmentDTO) throws ControllerException {
		System.out.println("createSssignmentController method start");
		System.out.println("createdAssignmentDTO is ::" + createAssignmentDTO);

		long pin;
		try {
			pin = createAssignmentService.createAssignmentServiceSave(createAssignmentDTO);
			System.out.println("createAssignmentController method end");
			return new ModelAndView("CreateAssignment.jsp", "message", "assignment is created with pin::" + pin);
		} catch (ServiceException e) {
			System.out.println("Exception raised in CreateAssignmentController: " + e.getMessage());
			throw new ControllerException("EXcetion occurred in CreateAssignmentController: " + e.getMessage());

		}

		// System.out.println("createAssignmentController method end");
		// return new ModelAndView("CreateAssignment.jsp","message","assignment
		// is created with pin::"+pin);
	}

}
