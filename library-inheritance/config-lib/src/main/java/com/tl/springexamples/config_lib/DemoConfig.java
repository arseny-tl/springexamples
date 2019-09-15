package com.tl.springexamples.config_lib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {
  @Bean
  @Conditional(value = RestTemplateCondition.class)
  public CustomBeanPostProcessor customBean() {
    return new CustomBeanPostProcessor();
  }
}
