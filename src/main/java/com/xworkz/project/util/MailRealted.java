package com.xworkz.project.util;

import java.security.cert.CRLReason;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.xworkz.project.entity.CreateAssignmentEntity;

@Component
public class MailRealted {

	@Autowired
	private JavaMailSender mailSender;
	
	public void mailAssign(CreateAssignmentEntity createAssignEntity, String[] emailIds) {

	
		System.out.println("invoked mailSending()..."+createAssignEntity.getPin()+createAssignEntity.getCourse()
		+createAssignEntity.getDescription()+createAssignEntity.getAssignmentId()+createAssignEntity.getTopic()+createAssignEntity.getUploadType());
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		for (int i = 0; i < emailIds.length; i++) {
			try {
				mailMessage.setTo(emailIds[i]);
				mailMessage.setSubject("Assignment Management Application" + "\n");
				mailMessage.setText(" Pin:" + createAssignEntity.getPin() + "\n" + " Topic:"+ createAssignEntity.getTopic() + "\n" + " Description:" + createAssignEntity.getDescription()
						+ "\n" + " DeadLine:" + createAssignEntity.getDate() + "\n" + " UploadType :"
						+ createAssignEntity.getUploadType() + "\n" + " Thank You...");
				mailSender.send(mailMessage);
				System.out.println("Mail sent Successfully");
			} catch (MailException e) {

				System.out.println("Exception thrown by MailSender:\t" + e.getMessage());
			}
		}
	}

}
