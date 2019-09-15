package com.tl.springexamples.config_lib;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

  @Autowired(required = false)
  public CustomBeanPostProcessor() {}

  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    return bean instanceof RestTemplate ? bean : null;
  }

  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    return null;
  }
}
