package com.example.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRestRoute extends RouteBuilder {

  @Override
  public void configure() throws Exception {
//    rest("/elasticsearch/index/{entity}/{operation}").id("HelloRest")
    rest("/give-me-hello").id("HelloRest")
      .description("Full Index sync from database to elasticsearch (drop index, sync data). Can take a lot of time")
      .get()
      .to("direct:hello");

    from("direct:hello")
      .setBody(simple("Hello"));
  }
}
