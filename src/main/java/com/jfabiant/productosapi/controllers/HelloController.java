package com.jfabiant.productosapi.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@GetMapping("/hello")
	public String index() {
		logger.info("call index");
		return "Hello World!";
	}
	
}
