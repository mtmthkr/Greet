package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.demo.annotation.Morning;

@Component(value = "morning")
@Morning
public class GoodMorningService implements IGreetService {
	private final String name;

	@Autowired
	public GoodMorningService(@Value(value = "${greet.name:hoge}") String name) {
		this.name = name;
	}

	@Override
	public String say() {
		return "Good morning " + name + ".";
	}
}
