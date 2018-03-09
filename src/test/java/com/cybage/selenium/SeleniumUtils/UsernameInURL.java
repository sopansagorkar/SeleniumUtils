package com.cybage.selenium.SeleniumUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class UsernameInURL {
	public static void main(String a[]) {
		System.setProperty("webdriver.opera.driver", "src/main/resources/operadriver.exe");
		OperaOptions operaOptions=new OperaOptions();
		operaOptions.setBinary("C:\\Program Files (x86)\\Opera\\launcher.exe");
		WebDriver driver = new OperaDriver(operaOptions);
		driver.get("http://sopansa:rider@007@cybagemis.cybage.com/Framework/Iframe.aspx");
	}

}
