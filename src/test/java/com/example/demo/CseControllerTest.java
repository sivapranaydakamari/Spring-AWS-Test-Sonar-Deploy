package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CseControllerTest {
	@Autowired
	CseController c;
	@Test
	void test() {
		int result = c.addCSE(2, 3);
		assertEquals(5, result);
	}
	@Test
	void test2() {
		String sen = c.getRoll("23MH1A05F5");
		assertEquals("Hi!!!...This is done through Spring Boot by Siva(23MH1A05F5)", sen);
	}
}
