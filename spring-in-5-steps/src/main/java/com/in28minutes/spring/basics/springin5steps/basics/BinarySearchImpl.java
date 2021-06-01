package com.in28minutes.spring.basics.springin5steps.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl 
{
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	
	
	public int binarySearch(int[] numbers, int numberToSearch)
	{		
		int sortedArray[] = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// Logic for Search in Binary Search
		return 3;
	}
	
}
