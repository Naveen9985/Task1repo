package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.utility.BaseClass;

public class Flipkart extends BaseClass{
 public static int Fprice;
public static Integer FlipkartPrice;

public static void openFlipkart() throws Exception {
	 driver.navigate().to("https://www.flipkart.com/");
	 System.out.println("opened flipkart");
	 Reporter.log("Opened Filpkart");
	 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 
	 System.out.println("opened flipkart");
	 Reporter.log("Page completely loaded");
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	 System.out.println("clicked on thecross button");
	 Reporter.log("Clicked on teh cross button");
	 
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iPhone XR (64GB) - Yellow");
	 // Mouse Hover action
	 System.out.println("entered product details");
	 Reporter.log("entered product details");
	 Actions action = new Actions(driver);
	 WebElement ele = driver.findElement(By.xpath("//button[@class='vh79eN'][@type='submit']"));
	 action.moveToElement(ele).click().build().perform();
	 Thread.sleep(5000);
	 System.out.println("clicked on the search button");
     Reporter.log("clicked on the search button");
	 String  ele2 = driver.findElement(By.xpath("//div[contains(@class,'_1vC4OE _2rQ-NK')]")).getText();
	 System.out.println("The price of the selected product in FlipKart is : " + ele2);
	 Reporter.log("The price of the selected product in FlipKart is : "+ ele2);
	 ele2 =ele2.replaceAll("[^a-zA-Z0-9]", "");
	  FlipkartPrice = Integer.parseInt(ele2);
	  Fprice = FlipkartPrice.intValue();
	 System.out.println(Fprice);
	 Reporter.log("Iphone price in Flipkart is:" + Fprice);
 }
}
