package com.cybage.selenium.SeleniumUtils;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuite2 extends BaseClass {
	@Test
	public void titleVerifyTest() {
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Sopan");
	}

}
