package com.jabacode.spring.basics.componentscan.componentscan;

import com.jabacode.spring.basics.springin5steps.scope.JdbcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

    @Autowired
    ComponentJdbcConnection jdbcConnection;

    public ComponentJdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(ComponentJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
