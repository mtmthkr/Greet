package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.demo.annotation.Evening;

@Component(value = "evening")
@Evening
public class GoodEveningService implements IGreetService {
	private final String name;

	public GoodEveningService(@Value(value = "${greet.name:hoge}") String name) {
		this.name = name;
	}

	@Override
	public String say() {
		return "Good evening " + name + ".";
	}
}
