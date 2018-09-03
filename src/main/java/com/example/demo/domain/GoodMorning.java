package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.demo.annotation.Morning;

@Component(value = "morning")
@Morning
public class GoodMorning implements IGreet {
	private final String name;

	@Autowired
	public GoodMorning(@Value(value = "${greet.name:hoge}") String name) {
		this.name = name;
	}

	@Override
	public String say() {
		return "Good morning " + name + ".";
	}
}
