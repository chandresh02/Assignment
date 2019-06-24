package com.xworkz.project.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.project.dto.UploadAssignmentDTO;
import com.xworkz.project.exception.ControllerException;
import com.xworkz.project.exception.ServiceException;
import com.xworkz.project.service.UploadAssignmentService;

@Controller
@RequestMapping("/")
public class UploadAssignmentController {
	@Autowired
	private UploadAssignmentService uploadAssignmentService;

	public UploadAssignmentController() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	@RequestMapping(value = "/uploadAssignment.ams", method = RequestMethod.POST)
	public ModelAndView UploadAssignment(UploadAssignmentDTO uploadAssignmentDTO)
			throws IOException, ControllerException {
		System.out.println("UploadAssignmentController method start" + uploadAssignmentDTO);
		MultipartFile file = uploadAssignmentDTO.getFile();
		// System.out.println("File Address:" + file);

		byte[] fileadd = file.getBytes();
		String fileUrl = "D:/" + file.getOriginalFilename();
		BufferedOutputStream bufferedInputStream = new BufferedOutputStream(new FileOutputStream(new File(fileUrl)));
		bufferedInputStream.write(fileadd);
		String fileName = new SimpleDateFormat("yyyy_MM_dd_HH_mm'.zip'").format(new Date());
		System.out.println("File Name:" + fileName);
		System.out.println("File Address:" + fileUrl);
		try {
			uploadAssignmentService.UploadAssignmentServiceSave(uploadAssignmentDTO, fileName);
		} catch (ServiceException e) {
			System.out.println("Exception raised in UploadAssignmentController: " + e.getMessage());
			throw new ControllerException("EXcetion occurred in UploadAssignmentController: " + e.getMessage());
		}

		return new ModelAndView("UploadAssignment.jsp", "msg", "Assignment uploades succsessfully");
	}

}
