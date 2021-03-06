package com.basic.A_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans? => No need
	
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(BasicApplication.class, args);

		BinarySearchImpl binarySearch = 
				applicationContext.getBean(BinarySearchImpl.class);

		BinarySearchImpl binarySearch1 = 
				applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch1);

		int result = 
				binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
	}
	
	
}
