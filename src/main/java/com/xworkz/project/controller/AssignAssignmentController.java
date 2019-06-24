/*package com.xworkz.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.project.service.AssignAssignmentService;

@Controller
public class AssignAssignmentController {

	@Autowired
	private AssignAssignmentService assignAssignmentService;

	public AssignAssignmentController() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	@RequestMapping(value="/assignAssignment.ams", method = RequestMethod.GET)
	public ModelAndView assignAsssignmentController(@RequestParam long pin, @RequestParam String emailId) {
		System.out.println("assignAsignmentController method start");

		System.out.println("pin we get is::" + pin);
		String[] emailIds = emailId.split(",");
		for (int i = 0; i < emailIds.length; i++) {
			System.out.println("respective email id is" + emailIds[i]);
		}

		assignAssignmentService.assignAssignmentOnMail(pin, emailIds);
		System.out.println("assignAsignmentController method end");
		return new ModelAndView("AssignAssignment.jsp", "msg", "sussessfully mail send");

	}
}*/
