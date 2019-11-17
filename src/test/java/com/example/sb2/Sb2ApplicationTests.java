package com.example.sb2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Sb2ApplicationTests {

	Logger log = LoggerFactory.getLogger(getClass());
	@Test
	public void contextLoads() {
		log.trace("trace+++++++++++");
		log.debug("debug+++++++++++++++");
		log.info("info+++++++++++++++++++");
		log.warn("warn+++++++++++++++++++");
		log.error("error+++++++++++++++++++");
	}

}

