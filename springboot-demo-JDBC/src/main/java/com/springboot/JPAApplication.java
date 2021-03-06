package com.springboot;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.jdbc.Person;
import com.springboot.jpa.PersonJPARepository;

@SpringBootApplication
public class JPAApplication implements CommandLineRunner{

	@Autowired
	PersonJPARepository repository;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(JPAApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("All users -> {}", repository.findById(10002));

		logger.info("Persons by ID -> {}", repository.findAll());
		
		repository.deletePersonById(10001);

		logger.info("Inserting 10004 -> {}", 
				repository.insertPerson(new Person( "Tara", "Berlin", new Date())));

		logger.info("Update 10003 -> {}", 
				repository.updatePerson(new Person(10003, "Pieter", "Utrecht", new Date())));

	}
}
