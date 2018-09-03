package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.annotation.Evening;
import com.example.demo.domain.IGreet;

@Service
public class GreetService {
	private final IGreet greet;

	@Autowired
	public GreetService(@Evening IGreet greet) {
		this.greet = greet;
	}

	public String greet() {
		return greet.say();
	}
}
