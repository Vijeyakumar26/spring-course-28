package com.junit.test;

public class MyMath {
	
	int sum(int[] nums)
	{
		int sum = 0;
		for(int i :nums)
			sum += i;
		return sum;
	}
}
