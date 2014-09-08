package com.ariba.maven2example;

public class Math2 {

	public int multiply(int a, int b)
	{ 
		int sum = 0;
		for(int i=1; i<=b; i++)
		{
			   try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			sum += a;
		}
		return sum;
	}
}
