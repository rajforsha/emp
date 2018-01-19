package com.nineleaps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nineleaps")
@EnableAutoConfiguration
public class MainApplication {

	private static final Logger LOG = LoggerFactory.getLogger(MainApplication.class);

	/**
	 * @param args
	 * @throws CustomerInsightsException
	 */
	public static void main(String[] args) {

		try {
			SpringApplication.run(MainApplication.class, args);
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}

	}

}
