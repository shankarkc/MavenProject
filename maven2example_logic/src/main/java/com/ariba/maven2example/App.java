package com.ariba.maven2example;

/**
 * Hello world!
 *
 */
public class App 
{


       public static String now()
       {
    	   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
            return new java.util.Date().toString();  
       }
 
}
