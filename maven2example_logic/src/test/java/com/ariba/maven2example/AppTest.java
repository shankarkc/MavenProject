package com.ariba.maven2example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	Logger logger = LoggingFactory.getLogger();
	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);

	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		
		logger.debug("Starting the test testApp");
		assertTrue( App.now().length() > 0 );
		logger.info("ending the test testApp");
	}

}
