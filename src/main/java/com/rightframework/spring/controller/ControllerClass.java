package com.rightframework.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@Value("${app.env}")
	String propertyValues;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Good work" + propertyValues;
	}

}
