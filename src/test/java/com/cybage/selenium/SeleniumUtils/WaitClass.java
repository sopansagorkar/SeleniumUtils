package com.cybage.selenium.SeleniumUtils;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitClass {

	public static WebDriver driver;

	@BeforeMethod
	public void setDriver() {
		System.setProperty("webdriver.opera.driver", "src/main/resources/operadriver.exe");
		OperaOptions operaOptions = new OperaOptions();
		operaOptions.addArguments("--disable-notifications");
		driver = new OperaDriver(operaOptions);
	}

	@Test(enabled = false)
	public void testImplicitWait() {
		driver.get("http://redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("icon-profile-new-unsigned")).click();
	}

	@Test
	public void testExplicitWait() {
		driver.get("http://redbus.in");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".selectedBus.site-links")).click();
		WebDriverWait driverWait = new WebDriverWait(driver, 20);
		driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("searchbutton")));

	}

	@Test
	public void fluentWait() {
		driver.get("http://redbus.in");
		driver.manage().window().maximize();
		Wait wait = new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement foo = (WebElement) wait.until(new Function() {

			public WebElement apply(WebDriver driver) {

				return driver.findElement(By.id("foo"));

			}

			public Object apply(Object t) {
				// TODO Auto-generated method stub
				return null;
			}

		});
	}

	@AfterTest
	public void closeDriver() {
		driver.quit();
	}

}
