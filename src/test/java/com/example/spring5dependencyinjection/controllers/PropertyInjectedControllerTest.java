package com.example.spring5dependencyinjection.controllers;

import com.example.spring5dependencyinjection.services.ConstructorGreetingService;
import com.example.spring5dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();

        propertyInjectedController.greetingServiceImpl = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {

        assertEquals(GreetingServiceImpl.HELLO_MATI, propertyInjectedController.sayHello());
    }
}