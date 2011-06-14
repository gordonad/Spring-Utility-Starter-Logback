package com.chariot.simpleutil;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@ContextConfiguration(locations = "/META-INF/spring/app-context.xml")
@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class ExampleServiceTests {
	private static final Logger logger = LoggerFactory
			.getLogger(ExampleServiceTests.class);

	@Autowired
	private ExampleService service;

	@Test
	public void testReadOnce() throws Exception {
		String msg = service.getMessage();
		logger.debug("Received the following Message from MyService: {}", msg);
		assertEquals("Hello world!", msg);
	}

}
