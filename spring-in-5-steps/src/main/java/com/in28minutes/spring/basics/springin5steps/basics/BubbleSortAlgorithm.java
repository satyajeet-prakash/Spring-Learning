package com.in28minutes.spring.basics.springin5steps.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm
{
	public int[] sort(int[] numbers)
	{
		for(int i = 0; i < numbers.length; i++) 
		{
			for(int j = i; j < numbers.length; j++) 
			{
				if(numbers[i] > numbers[j]) 
				{
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers;
	}
}
