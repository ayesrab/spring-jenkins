package com.ayesrab.spring_jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	@Test
	void contextLoads() {
		Assertions.assertEquals(true,true);
		logger.info("Test executing");
	}

}
