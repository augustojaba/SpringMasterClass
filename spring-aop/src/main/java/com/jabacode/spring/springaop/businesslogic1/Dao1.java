package com.jabacode.spring.springaop.businesslogic1;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

  public String retrieveSomething() {
    return "Dao1";
  }
}
