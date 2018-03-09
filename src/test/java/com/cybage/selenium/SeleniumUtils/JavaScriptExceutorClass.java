package com.cybage.selenium.SeleniumUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.testng.annotations.Test;

public class JavaScriptExceutorClass {
	public static WebDriver driver;
	@Test
	public void getTest() {
		System.setProperty("webdriver.opera.driver", "src/main/resources/operadriver.exe");
		OperaOptions operaOptions = new OperaOptions();
		operaOptions.addArguments("--disable-notifications");
		driver = new OperaDriver(operaOptions);
		driver.get("http://newtours.demoaut.com");
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("document.getElementsByName('userName')[0].value='sopan'");
		jsx.executeScript("document.getElementsByName('password')[0].value='sopan'");
		jsx.executeScript("document.getElementsByName('login')[0].click()");
	}

}
