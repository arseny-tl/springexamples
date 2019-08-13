package com.tl.springexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringExamples {

  public static void main(String[] args) {
    ConfigurableApplicationContext ctx = SpringApplication.run(SpringExamples.class, args);
  }
}
