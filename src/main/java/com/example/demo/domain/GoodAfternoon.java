package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.demo.annotation.Noon;

@Component(value = "noon")
@Noon
public class GoodAfternoon implements IGreet {
	private final String name;

	public GoodAfternoon(@Value(value = "${greet.name:hoge}") String name) {
		this.name = name;
	}

	@Override
	public String say() {
		return "Good afternonn " + name + ".";
	}
}
