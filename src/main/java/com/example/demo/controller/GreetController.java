package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.GreetService;

@RestController
@RequestMapping(value = "/")
public class GreetController {
	private final GreetService greetService;
	
	@Autowired
	public GreetController(GreetService greetService) {
		this.greetService = greetService;
	}
	
	@GetMapping
	public String greet() {
		return greetService.greet();
	}
}
