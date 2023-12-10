package com.devsuperior.desafio1.desafio1;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class Desafio1ApplicationTests {

	@Mock
	private Desafio1Application application;

	@Test
	void contextLoads() {
		assertNotNull(application);
	}

}
