package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;


	public class BaseClass {
		   public static WebDriver driver;
		   
			public static void openBrowser() {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Student_SW\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
			System.out.println("lauched browser");
			Reporter.log("Lauched browser");
			driver.manage().deleteAllCookies();
			System.out.println("Delete all cookies");
			
		}
			public static void closeApp() {
				driver.quit();
				System.out.println("Application closed");
				Reporter.log("Application Closed");
			}		
}
