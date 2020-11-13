package com.example.spring5dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
