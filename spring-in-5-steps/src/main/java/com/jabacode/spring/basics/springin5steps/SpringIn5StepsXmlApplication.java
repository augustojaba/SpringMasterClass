package com.jabacode.spring.basics.springin5steps;

import com.jabacode.spring.basics.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIn5StepsXmlApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlApplication.class);

	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {

			XmlPersonDAO bean = applicationContext.getBean(XmlPersonDAO.class);

			LOGGER.info("Beans: {}", (Object) applicationContext.getBeanDefinitionNames());

			LOGGER.info("{} - Connection {}", bean, bean.getXmlJdbcConnection());
		}
	}
}
