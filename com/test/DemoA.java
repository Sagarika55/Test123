//package com.test;
//
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Reporter;
//import org.testng.annotations.Test;
//
//import DataproviderTest.DataDrivenTest;
////import DataproviderTest.DataDrivenTest;
//import DataproviderTest.TestExcel;
//
//public class DemoA {
//	
//@Test
//public void  run() throws IOException
//{
//	WebDriver driver = new FirefoxDriver();
//	driver.get("https://www.google.co.in/");
//	Reporter.log("browser opened");
//	driver.manage().window().maximize();
//	//DataDrivenTest obj = new DataDrivenTest();
//	String read=DataDrivenTest.readexcel("C:\\Users\\sagarika\\Downloads\\dataTest.xlsx","Sheet1");
//	//TestExcel obj = new TestExcel("C:\\Users\\sagarika\\Downloads\\dataTest.xlsx");
//	//String read=obj.readData(1, 2, 1);
//	driver.findElement(By.id("lst-ib")).sendKeys(read);
//
//}
//
//
//}
//jkhjhlllllllllllllll