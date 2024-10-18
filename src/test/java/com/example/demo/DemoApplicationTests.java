package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Value("${spring.application.name}")
	private String appName;

	@Test
	void contextLoads() {
		assertThat(appName).isEqualTo("demo");
	}

}
