package com.jabacode.spring.basics.springin5steps.xml;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

public class XmlJdbcConnection {

    public XmlJdbcConnection() {
        System.out.printf("XML JDBC Connection");
    }
}