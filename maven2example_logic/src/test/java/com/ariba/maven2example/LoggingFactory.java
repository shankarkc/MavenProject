package com.ariba.maven2example;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LoggingFactory {
	private static  Logger testLogger = null;
	public static Logger getLogger( )
	{
		if (testLogger == null) 
		{
			testLogger =  Logger.getLogger("MyTestLogger");
			BasicConfigurator.configure();
		}
		
		return testLogger;
	}
}
