package com.example.demo.controller;

import com.example.demo.annotation.Morning;
import com.example.demo.annotation.Noon;
import com.example.demo.service.CountService;
import com.example.demo.service.IGreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class GreetController {
    private final IGreetService greetService;

    @Autowired
    public GreetController(@Noon IGreetService greetService) {
        this.greetService = greetService;
    }

    @GetMapping
    public String greet() {
        return greetService.say();
    }

    @GetMapping(value = "count")
    public int count() {
        return lookup().increment();
    }

    @Lookup
    public CountService lookup() {
        return  null;
    }
}
