package com.example.demo;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import junit.framework.*;


@SpringBootTest
class SpringbootDemo2ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void test1() {
	      assertTrue(2+4 == 6);
	}
	
	@Test
	void test2() {
	      assertTrue(1+3 == 4);
	}

}
