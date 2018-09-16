package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.demo.annotation.Noon;

@Component(value = "noon")
@Noon
public class GoodAfternoonService implements IGreetService {
    private final String name;

    public GoodAfternoonService(@Value(value = "${greet.name:hoge}") String name) {
        this.name = name;
    }

    @Override
    public String say() {
        return "Good afternoon " + name + ".";
    }
}
