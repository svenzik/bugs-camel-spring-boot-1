package com.example.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRestRoute extends RouteBuilder {

  @Override
  public void configure() throws Exception {
    rest("/give-me-hello").id("HelloRest")
      .get()
      .to("direct:hello");

    from("direct:hello")
      .setBody(simple("Hello"));
  }
}
