package com.jabacode.spring.springaop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class BeforeAspect {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.jabacode.spring.springaop.businesslogic*.* .* (..))")
    public void before(JoinPoint joinPoint) {
        LOGGER.info("Intercepted {}", joinPoint);
    }
}
