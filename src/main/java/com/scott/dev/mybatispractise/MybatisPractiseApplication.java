package com.scott.dev.mybatispractise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisPractiseApplication {

	private static Logger logger = LogManager.getLogger(MybatisPractiseApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MybatisPractiseApplication.class, args);

		logger.info("log test");
	}

}
