package com.jabacode.spring.basics.springin5steps;

import com.jabacode.spring.basics.springin5steps.properties.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
// app.properties
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

  private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlApplication.class);

  public static void main(final String[] args) {

    try (final AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)) {
      final SomeExternalService service = applicationContext.getBean(SomeExternalService.class);

      final String result = service.returnServiceURl();
      LOGGER.info("Service: {}; Result: {}", service, result);
    }
  }
}
