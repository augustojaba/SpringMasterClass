package com.jabacode.spring.springaop.businesslogic2;

import org.springframework.stereotype.Service;

@Service
public class Business2 {

  private Dao2 dao2;

  public Business2(Dao2 dao2) {
    this.dao2 = dao2;
  }

  public String calculateSomething() {
    return dao2.retrieveSomething();
  }
}
