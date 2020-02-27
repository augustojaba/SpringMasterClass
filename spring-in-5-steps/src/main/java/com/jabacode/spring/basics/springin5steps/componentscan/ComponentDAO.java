package com.jabacode.spring.basics.springin5steps.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentDAO {

  @Autowired ComponentJdbcConnection jdbcConnection;

  public ComponentJdbcConnection getJdbcConnection() {
    return jdbcConnection;
  }

  public void setJdbcConnection(final ComponentJdbcConnection jdbcConnection) {
    this.jdbcConnection = jdbcConnection;
  }
}
