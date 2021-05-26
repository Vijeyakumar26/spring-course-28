package com.springboot;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.buisness.Buisness1;
import com.springboot.buisness.Buisness2;

@SpringBootApplication
public class SpringbootAopApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Buisness1 buisness1;
	
	@Autowired
	private Buisness2 buisness2;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info(buisness1.calculate());
		logger.info(buisness2.calculate());
	}

}
