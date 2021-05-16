package com.learning.springTest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringTestApplicationTests {

	@Test
	void contextLoads() {

		ApplicationContext context=SpringApplication.run(SpringTestApplication.class);

		System.out.println("hello friends");
	}

}
