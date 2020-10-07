package com.example.spring5dependencyinjection;

import com.example.spring5dependencyinjection.controllers.ConstructorInjectedController;
import com.example.spring5dependencyinjection.controllers.MyController;
import com.example.spring5dependencyinjection.controllers.PropertyInjectedController;
import com.example.spring5dependencyinjection.controllers.SetterInjectedController;
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

		System.out.println(" -------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println(" -------- Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println(" -------- Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
	}

}
