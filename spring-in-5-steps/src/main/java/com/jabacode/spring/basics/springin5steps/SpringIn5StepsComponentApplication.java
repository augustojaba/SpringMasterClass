package com.jabacode.spring.basics.springin5steps;

import com.jabacode.spring.basics.springin5steps.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.jabacode.spring.basics.componentscan")
public class SpringIn5StepsComponentApplication {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(SpringIn5StepsComponentApplication.class);

  public static void main(final String[] args) {

    try (final AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(SpringIn5StepsComponentApplication.class)) {

      final ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

      LOGGER.info("{}", componentDAO);
    }
  }
}
