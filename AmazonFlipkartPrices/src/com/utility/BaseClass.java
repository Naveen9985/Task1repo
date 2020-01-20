package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.pages.Amazon;
import com.pages.Flipkart;

public class BaseClass {
   public static WebDriver driver;
   
	public static void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Student_SW\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	System.out.println("lauched browser");
}
	public static void closeApp() {
		driver.close();
		System.out.println("Application closed");
		Reporter.log("Application closed");
	}
	public static void compare() {
		if(Amazon.Aprice < Flipkart.Fprice) {
			System.out.println("The price of the product is less in Amazon");
			Reporter.log("The price of the product is less in Amazon");
		}else
		{
			System.out.println("The price of the product is less in Flipkart");
			Reporter.log("The price of the product is less in Flipkart");
		}
	}
}
