package com.jabacode.spring.springaop.businesslogic1;

import org.springframework.stereotype.Service;

@Service
public class Business1 {

  private Dao1 dao1;

  public Business1(Dao1 dao1) {
    this.dao1 = dao1;
  }

  public String calculateSomething() {
    return dao1.retrieveSomething();
  }
}
