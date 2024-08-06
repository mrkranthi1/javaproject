package com.deployment.dummy.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	// private Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	@GetMapping("/")
	public String welcomPage()
	{
		// logger.info("welcomPage");
		return "hello World";
	}
	
	@GetMapping("/hello")
	public String helloWorld()
	{
		// logger.info("helloWorld");
		return "welcome to kani solution";
	}
}

