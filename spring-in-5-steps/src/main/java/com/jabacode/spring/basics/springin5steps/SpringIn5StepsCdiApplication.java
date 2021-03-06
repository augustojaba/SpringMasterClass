package com.jabacode.spring.basics.springin5steps;

import com.jabacode.spring.basics.springin5steps.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {

  private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

  public static void main(final String[] args) {

    final ApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class);

    final SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);

    LOGGER.info("{} - dao {}", someCDIBusiness, someCDIBusiness.getSomeCDIDAO());
  }
}
