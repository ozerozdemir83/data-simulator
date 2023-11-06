package com.siemens.spfts.datasimulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * Entry point of the application.
 */
@SpringBootApplication
@ConfigurationPropertiesScan("com.siemens.spfts.datasimulator")
public class DataSimulatorApplication {

	/**
	 * Main function of the application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(DataSimulatorApplication.class, args);
	}

}
