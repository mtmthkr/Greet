package com.example.demo.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype")
public class CountService {
    private int count;

    public CountService() {
        count = 0;
    }

    public int increment() {
        return ++count;
    }
}
