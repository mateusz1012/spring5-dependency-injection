package com.example.spring5dependencyinjection.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello!";
    }
}
