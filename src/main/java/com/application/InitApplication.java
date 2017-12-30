package com.application;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Launcher for spring boot application 
 * @author ssachin579
 *
 */

@SpringBootApplication
public class InitApplication {
	
	private static Logger LOGGER = Logger.getLogger(InitApplication.class);

	public static void main(String[] args) {
		try{
			LOGGER.debug("Launching spring boot application");
			SpringApplication.run(InitApplication.class, args);
		}
		catch(Exception exp){
			LOGGER.error("Error launching spring boot application");
			LOGGER.error("Exiting with error code 1");
			System.exit(1);
		}

	}

}
