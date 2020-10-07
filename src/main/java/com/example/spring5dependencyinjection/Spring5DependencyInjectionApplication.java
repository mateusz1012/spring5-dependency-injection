package com.example.spring5dependencyinjection;

import com.example.spring5dependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5DependencyInjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String geeting = myController.sayHello();

		System.out.println(geeting);
	}

}
