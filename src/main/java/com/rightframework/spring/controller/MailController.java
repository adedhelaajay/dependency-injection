package com.rightframework.spring.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rightframework.spring.mail.MailSender;

@RestController
public class MailController {

	MailSender mailSender;
	
	@Autowired	
	public MailController(@Qualifier("mock")MailSender mailSender) {

		this.mailSender = mailSender;
	}
	
	@RequestMapping("/mail")
	public String sendMail() {
		mailSender.send("adedhelaajay@gmail.com", "Spring mail sender", "This is good.");
		return "Mail sent!";
	}
}
