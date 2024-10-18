package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class CamelRestRouteTest {

  @Autowired
  private TestRestTemplate testRestTemplate;

  @Test
  void testCamelRestRoute() {
    ResponseEntity<String> response = testRestTemplate.getForEntity("/camel/give-me-hello", String.class);
    assertThat(response.getStatusCode()).isEqualTo(HttpStatusCode.valueOf(200));
    assertThat(response.getBody()).isEqualTo("Hello");

  }
}
