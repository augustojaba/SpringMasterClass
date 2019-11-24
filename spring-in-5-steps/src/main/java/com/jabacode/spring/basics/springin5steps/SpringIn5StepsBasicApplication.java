package com.jabacode.spring.basics.springin5steps;

import com.jabacode.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {

		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);
	}
}
