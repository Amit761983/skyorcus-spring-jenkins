package com.org.skyorcusspringjenkins;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
class SkyorcusSpringJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SkyorcusSpringJenkinsApplication.class);

	@Test
	contextLoads() {

		logger.info("Test case Executing");
		logger.info("Test case Executing second log statement");
		assertEquals(true,true);
	}

}
