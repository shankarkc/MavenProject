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
	static final Logger logger = Logger.getLogger(AppTest.class);
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
		BasicConfigurator.configure();
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
	
	public void testMathAdd() 
	{
		Math math = new Math();
		logger.debug("Starting the test testMathAdd");
		assertTrue( 2 == (math.add(1, 1)));
		logger.debug("ending the test testMathAdd");
	}
	
	public void testMathSub() 
	{
		logger.debug("Starting the test testMathSub");
		Math math = new Math();
		assertTrue( 1 == (math.subtract(2, 1)));
		logger.debug("ending the test testMathSub");
	}
	
	public void testMathMultiply() 
	{
		logger.debug("Starting the test testMathMultiply");
		Math math = new Math();
		assertTrue( 4 == (math.multiply(2, 2)));
		logger.debug("ending the test testMathMultiply");
	}
}
