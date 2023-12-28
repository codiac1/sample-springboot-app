package com.example.javaEase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "home page";
	}
	
	@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable String name) {
		return ("Hi " + name + ", welcome to Java Ease");
	}

}
