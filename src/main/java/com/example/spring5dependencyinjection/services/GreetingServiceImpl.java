package com.example.spring5dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_MATI = "Hello Guys!!! - Original";

    @Override
    public String sayGreeting() {
        return HELLO_MATI;
    }
}
