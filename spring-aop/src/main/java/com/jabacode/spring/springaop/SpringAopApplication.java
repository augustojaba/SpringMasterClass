package com.jabacode.spring.springaop;

import com.jabacode.spring.springaop.businesslogic1.Business1;
import com.jabacode.spring.springaop.businesslogic2.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

  private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

  @Autowired private Business1 business1;

  @Autowired private Business2 business2;

  public static void main(String[] args) {
    SpringApplication.run(SpringAopApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    LOGGER.info(business1.calculateSomething());
    LOGGER.info(business2.calculateSomething());
  }
}
