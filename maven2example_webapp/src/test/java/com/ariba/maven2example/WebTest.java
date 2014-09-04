package com.ariba.maven2example;

import junit.framework.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
/**
 * Unit test for simple App.
 */
public class WebTest extends TestCase {
	static final Logger logger = Logger.getLogger(WebTest.class);
	public static final String MAXIMIZE_BROWSER_WINDOW = "if (window.screen) {window.moveTo(0, 0);window.resizeTo(window.screen.availWidth,window.screen.availHeight);};";

	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public WebTest(String testName) {
		super(testName);

	}

	public static Object maximizeBrowserWindow(WebDriver driver) {
	    return executeJavascript(driver, MAXIMIZE_BROWSER_WINDOW);
	}
	
	private static Object executeJavascript(WebDriver driver, String script){
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	return js.executeScript(script);
	}
	
	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		BasicConfigurator.configure();
		return new TestSuite(WebTest.class);
	}

	/**
	 * UI tests
	 */
	public void testApp() {
		
		logger.debug("Starting the testing webUI test");
		// The Firefox driver supports javascript 
		

        WebDriver driver = new FirefoxDriver();
        
        // Go to the Google Suggest home page
        maximizeBrowserWindow(driver);
        driver.get("http://localhost:8080/MavenProject/index.jsp");
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebElement message = driver.findElement(By.tagName("h2"));
        logger.info("Yey I got text" + message.getText());
        assertTrue( message.getText().toLowerCase().equals("super fancy clock by shankar"));
        
        
        
        
		assertTrue( App.now().length() > 0 );
		logger.info("ending the webui test");
		driver.quit();
	}
	
	}
