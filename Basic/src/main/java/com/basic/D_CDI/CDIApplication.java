package com.basic.D_CDI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.basic.C_componentScan")
public class CDIApplication {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(CDIApplication.class); 
	
	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				SpringApplication.run(CDIApplication.class, args);
		
		SomeCdiBusiness business = 
				applicationContext.getBean(SomeCdiBusiness.class);
		
		LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());
	}

}
