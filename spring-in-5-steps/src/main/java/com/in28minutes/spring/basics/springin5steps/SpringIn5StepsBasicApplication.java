package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.basics.BinarySearchImpl;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			
		int result = binarySearch.binarySearch(new int[] {12, 3, 8}, 5);
		
		System.out.println(result);
		
		applicationContext.close();
	}
	
}
