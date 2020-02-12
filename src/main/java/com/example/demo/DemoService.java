package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    private static String SOME_STRING = "random string";

    public String getString() {
        return SOME_STRING;
    }
}
