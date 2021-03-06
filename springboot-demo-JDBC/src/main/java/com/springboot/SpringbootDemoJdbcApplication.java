package com.springboot;



import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.jdbc.Person;
import com.springboot.jdbc.PersonJdbcDAO;

//@SpringBootApplication
public class SpringbootDemoJdbcApplication implements CommandLineRunner{
	
	@Autowired
	PersonJdbcDAO dao;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("All users -> {}", dao.findAll());
		logger.info("Persons by ID -> {}", dao.findById(10001));
		logger.info("Deleted person by id -> {}", dao.deleteById(10001));
		

		logger.info("Inserting 10004 -> {}", 
				dao.insert(new Person(10004, "Tara", "Berlin", new Date())));
		
		logger.info("Update 10003 -> {}", 
				dao.update(new Person(10003, "Pieter", "Utrecht", new Date())));
		
	}
}
