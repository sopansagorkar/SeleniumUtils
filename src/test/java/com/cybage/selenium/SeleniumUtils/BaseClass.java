package com.cybage.selenium.SeleniumUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static WebDriver driver;

	@BeforeSuite
	public void setDriver() {
		System.setProperty("webdriver.opera.driver", "src/main/resources/operadriver.exe");
		driver=new OperaDriver();
	}
	
	@AfterSuite
	public void closeDriver() {
		driver.quit();
	}

}
