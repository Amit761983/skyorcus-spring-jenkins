package com.org.skyorcusspringjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SkyorcusSpringJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SkyorcusSpringJenkinsApplication.class);

	@PostConstruct
	public void init()
	{
		logger.info("Applicaiton Started....");
	}


	public static void main(String[] args) {
		SpringApplication.run(SkyorcusSpringJenkinsApplication.class, args);
	}

}
