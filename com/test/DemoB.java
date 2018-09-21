package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB {
	
	@Test
	public void run()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.co.in/");
		Reporter.log("browser not opened");
	}

}
