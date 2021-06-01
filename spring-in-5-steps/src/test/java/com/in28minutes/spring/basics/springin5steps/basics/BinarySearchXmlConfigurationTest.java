package com.in28minutes.spring.basics.springin5steps.basics;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsBasicApplication;

//Load the context
@RunWith(SpringRunner.class)
//@ContextConfiguration(locations="/ApplicationContext.xml")
@ContextConfiguration(locations="/testContext.xml")
public class BinarySearchXmlConfigurationTest {

	//Get the Bean from the Context
	@Autowired
	BinarySearchImpl binarySearch;
	
	@Test
	public void testBasicScenario() 
	{
		int actualResult = binarySearch.binarySearch(new int[] {}, 5);
		
		assertEquals(3, actualResult);
	}

}
 