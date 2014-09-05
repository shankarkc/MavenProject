package com.ariba.maven2example;

public class Math {
	public int add(int a, int b)
	{ 
		   try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return a+b;
	}

	public int subtract(int a, int b)
	{ 
		   try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return a-b;
	}
	public int multiply(int a, int b)
	{ 
		   try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return a*b;
	}
}
