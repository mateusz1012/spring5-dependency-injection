package com.example.spring5dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PL")
@Service("in18Service")
public class I18nPolishService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Witojcie, witojcie - PL";
    }
}
