package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.demo.annotation.Evening;

@Component(value = "evening")
@Evening
public class GoodEvening implements IGreet {
	private final String name;

	public GoodEvening(@Value(value = "${greet.name:hoge}") String name) {
		this.name = name;
	}

	@Override
	public String say() {
		return "Good evening " + name + ".";
	}
}
