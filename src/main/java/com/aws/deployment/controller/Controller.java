package com.aws.deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/home")
	private String getTest() {
		return "Rajput Online Classes Project is under development, please be patient.";
	}
}
