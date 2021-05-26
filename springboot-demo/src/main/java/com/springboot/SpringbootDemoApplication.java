package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//HAL browser for browsing actuator

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringbootDemoApplication.class, args);
		
		for (String name : applicationContext.getBeanDefinitionNames()) { //prints all the beans which where created by Spring boot
			System.out.println(name);
		
		}
	}

}
