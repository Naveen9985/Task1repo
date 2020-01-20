package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.utility.BaseClass;

public class Amazon extends BaseClass{
   public static int Aprice;
public static Integer amazonPrice ;

public static void openAmazon() throws Exception{
	
	driver.get("https://www.amazon.in/");
	 System.out.println("Opened Amazon");
	 Reporter.log("Opened Amazon");
	 driver.manage().window().maximize();
	//Waiting for the page to be loaded completely
	 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 
	 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone XR (64GB) - Yellow");
	 //Mouse Hover To click on search 
	 Actions action = new Actions(driver);
	 WebElement ele = driver.findElement(By.xpath("//input[@type = 'submit']"));
	 action.moveToElement(ele).click().build().perform();
	 System.out.println("Clicked on search");
	 Reporter.log("Clicked on search");
	 String ele1 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/div/a/span[1]/span[2]/span[2]")).getText();
	 Thread.sleep(5000);
	 
	 System.out.println("The price of the selected product in Amazon is : " + ele1);
	 Reporter.log("The price of the selected product in Amazon is : " + ele1);
	ele1 =ele1.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(ele1);
	 amazonPrice = new Integer(ele1);
	 Aprice= amazonPrice.intValue();
	System.out.println("Iphone Price in Amazon is :" + Aprice);
    Reporter.log("Iphone Price in Amazon is :" + Aprice);
}
}