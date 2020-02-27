package com.jabacode.spring.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

  // Value from properties file
  @Value("${external.service.url}")
  private String url;

  public String returnServiceURl() {
    return url;
  }
}
