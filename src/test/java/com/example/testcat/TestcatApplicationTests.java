package com.example.testcat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TestcatApplicationTests {
	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void simpleTest_success() {
		Assertions.assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/test",
				String.class)).contains("Hello, World");
	}

	@Test
	void simpleTest_fail()  {
		Assertions.assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/test",
				String.class)).doesNotContain("Неверный ответ");
	}
}
