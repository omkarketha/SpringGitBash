package com.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//from git bash

@RestController
public class ControllerTest {
	
	@GetMapping("/get")
	public String getData() {
		return "Hi";
		
	}

}
