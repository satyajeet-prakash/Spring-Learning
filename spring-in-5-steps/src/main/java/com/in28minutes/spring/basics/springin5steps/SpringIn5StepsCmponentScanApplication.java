package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.componentScan.ComponentDAO;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
@ComponentScan("com.in28minutes.spring.basics.componentScan")
public class SpringIn5StepsCmponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCmponentScanApplication.class);
			
	public static void main(String[] args) 
	{
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsCmponentScanApplication.class))
		{
			
			ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
			
			LOGGER.info("{}", componentDAO);
		}
	}
	
}
