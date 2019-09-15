package com.tl.springexamples.config_lib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class RestTemplateCondition implements Condition {
  private static final Logger logger = LoggerFactory.getLogger(RestTemplateCondition.class);
  private static final String REST_TEMPLATE_NAME = "org.springframework.web.client";

  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    try {
      Class.forName(REST_TEMPLATE_NAME, false, context.getClassLoader());
    } catch (ClassNotFoundException e) {
      logger.warn("RestTemplateBeanPostProcessor was not loaded to context!");
      return false;
    }
    return true;
  }
}
