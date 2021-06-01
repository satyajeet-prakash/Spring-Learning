package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.in28minutes.spring.basics.springin5steps.properties.SomeExternalService;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsPropertiesApplication.class);
			
	public static void main(String[] args) 
	{
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)) {
			
			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
			
			LOGGER.info("\n\nservice: {} \nService URL: {}\n", service, service.returnServiceURL());
		}
	}
	
}
