package com.aws.deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/test/{value}")
	private String getTest(@PathVariable("value") String value) {
		return value;
	}
}
