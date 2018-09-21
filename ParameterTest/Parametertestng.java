package ParameterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertestng {
	
	@Test
	@Parameters({"name", "name1"})
	//suit and test level parameter in testng.xml file,, test level parameter will get preference than suit level
	
	public void Google(@Optional("abc")String name, @Optional("abc1")String name1)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement text= driver.findElement(By.id("lst-ib"));
		text.sendKeys(name);
		text.sendKeys(name1);
	}

}
