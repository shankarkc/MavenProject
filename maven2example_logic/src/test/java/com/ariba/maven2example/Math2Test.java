package com.ariba.maven2example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
/**
 * Unit test for simple App.
 */
public class Math2Test extends TestCase {
	static final Logger logger = Logger.getLogger(Math2Test.class);
	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public Math2Test(String testName) {
		super(testName);

	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		BasicConfigurator.configure();
		return new TestSuite(Math2Test.class);
	}

	/**
	 * Rigourous Test :-)
	 */
		
	public void testMath2Multiply() 
	{
		logger.debug("Starting the test testMath2Multiply");
		Math2 math2 = new Math2();
		assertTrue( 4 == (math2.multiply(2, 2)));
		logger.debug("ending the test testMath2Multiply");
	}
}
