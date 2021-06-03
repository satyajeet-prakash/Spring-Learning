package com.in28minutes.spring.basics.springin5steps.cdi;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsCdiApplication;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {
	
	//Inject Mock
	@InjectMocks
	SomeCdiBusiness business;
	
	//Create Mock
	@Mock
	SomeCdiDao daoMock;	
	
	@Test
	public void testBasicScenario_Normal() 
	{	
		// when daoMock.getData() method is called then return int[]{2,4,6}
		when(daoMock.getData()).thenReturn(new int[] {5, 89, 102});
		
		int actualResult = business.findGreatest();
		
		assertEquals(102, actualResult);
	}

	@Test
	public void testBasicScenario_NoElements() 
	{	
		when(daoMock.getData()).thenReturn(new int[] {});
		
		assertEquals(Integer.MIN_VALUE, business.findGreatest());
	}
	
	@Test
	public void testBasicScenario_EqualElements() 
	{	
		when(daoMock.getData()).thenReturn(new int[] {56, 202, 202});
		
		assertEquals(202, business.findGreatest());
	}
}
 