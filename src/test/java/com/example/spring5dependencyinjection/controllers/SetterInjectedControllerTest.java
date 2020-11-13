package com.example.spring5dependencyinjection.controllers;

import com.example.spring5dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @BeforeEach
    public void setUp() {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_MATI, getterInjectedController.sayHello());
    }
}