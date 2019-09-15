package com.tl.springexamples.application;

import com.tl.springexamples.application.config.AppConfig;
import com.tl.springexamples.config_lib.DemoConfig;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;

public class Application {
  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(AppConfig.class, DemoConfig.class);
    app.setBannerMode(Mode.OFF);
    app.run(args);
  }
}
