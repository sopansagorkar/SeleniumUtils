package com.cybage.selenium.SeleniumUtils;


import org.testng.annotations.Test;

public class TestSuite  {

/*	@Test(enabled=false)
	public void titleVerifyTest() {
		driver.get("http://www.google.com");
	}*/
	
	@Test()
	@RetryCountIfFailed(10)
	public void testMethod() {
		int i=1/0;
		throw new ArithmeticException("Fail Message test");
	}
	@Test
	public void testMethod1() {
		int i=1/0;
		throw new ArithmeticException("Fail Message test");
	}
	@Test
	public void testMethod2() {
		int i=1/0;
		throw new ArithmeticException("Fail Message test");
	}
	
}
