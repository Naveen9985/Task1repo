
package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.utility.BaseClass;

public class TripAdvisor extends BaseClass{
    public static void 	openTripAdvisor() throws Exception {
    	driver.get("https://www.tripadvisor.in");
    	System.out.println("Opened TripAdvisor");
    	Reporter.log("Opened TripAdvisor");
    	
    	driver.manage().window().maximize();
    	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
   	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
   	     
   	   // driver.findElement(By.xpath("//*[@id=\"mainSearch\"]")).sendKeys("Club Mahindra");
   	 Actions action = new Actions(driver);
   	        try {
   	    
   	    //Mouse Hover to click on the search button
   	   
   	WebElement ele1 = driver.findElement(By.xpath("//span[@class='ui_icon search brand-global-nav-action-search-Search__icon--2DVjd']"));
   	action.moveToElement(ele1).click().build().perform();
   	WebElement ele2 = driver.findElement(By.xpath("//input[@id='mainSearch']"));
	ele2.sendKeys("Club Mahindra");
	WebElement ele3 = driver.findElement(By.xpath("//*[@id=\"SEARCH_BUTTON_CONTENT\"]"));
   	action.moveToElement(ele3).click().build().perform();
	 System.out.println("Clicked on search");
	 Reporter.log("Clicked on search");
   	    
   	        }  catch(Exception e){
   	    	WebElement ele4 = driver.findElement(By.xpath("//input[@type='search'][@name='q']"));
   	        ele4.sendKeys("Club Mahindra");
   	        WebElement ele5= driver.findElement(By.xpath("//button[@type='submit'][@title='Search']"));
   	        ele5.click();
   	    
   	    
   	    }
	 //Handling Windows
	    String parent = driver.getWindowHandle();
	    System.out.println("Parent Window id is :" + parent);
	 
	 driver.findElement(By.xpath("//div[@class='result-title']")).click();
	 System.out.println("Clicked on the first searched link");
	 Reporter.log("Clicked on the first searched link");
	 Thread.sleep(5000);
	 System.out.println("The title of the Parent window is : " + driver.getTitle());
	 Reporter.log("The title of the Parent window is : " + driver.getTitle());
	 //To iterate to next window
	 Thread.sleep(5000);
	 for(String childTab: driver.getWindowHandles()) {
		 
		 driver.switchTo().window(childTab);
	 }
	 
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 System.out.println("The title of the child window is : " + driver.getTitle());
     Reporter.log("The title of the child window is : " + driver.getTitle());
	 //Scrolling down to search for the write review 
	 
	 //WebElement ele= driver.findElement(By.xpath("//a[@class='ui_button primary']"));
	//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView().click()", ele);
	 
    /* try {
     WebElement TakeSurvey =driver.findElement(By.xpath("//div[@class='sbx_close']"));
	 action.moveToElement(TakeSurvey).click();
     }catch(Exception e) {
    	 e.printStackTrace();
     }
	 */
	 driver.findElement(By.xpath("//a[@class='ui_button primary']")).click();
	 
	 
			 /*WebElement ele6= driver.findElement(By.linkText("Write a review"));
             action.moveToElement(ele6).click();*/
	
	 System.out.println("clicked on the WriteReview");
	 Reporter.log("Cicked on the write review option");
	 
		Thread.sleep(5000);
	 	
		for(String childTab1: driver.getWindowHandles()) {
			 
			 driver.switchTo().window(childTab1);
		 }
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		System.out.println("The title of the child1 window is :" + driver.getTitle() );
		Reporter.log("The title of the child1 window is :" + driver.getTitle());
		
		//Mouse Hover to click on the ratings
		
     WebElement ele6= driver.findElement(By.xpath("//span[@id='bubble_rating']"));
     action.moveToElement(ele6).click().build().perform();
     
     System.out.println("Clicked on the review rating ");
     Reporter.log("Clicked on the review rating");
     driver.findElement(By.xpath("//input[@id='ReviewTitle']")).sendKeys("Naveen's Review");
     driver.findElement(By.xpath("//textarea[@id = 'ReviewText']")).sendKeys("Trip advisor is excellent and fantastic and very gud to compare prices and very reasonable price and the eminities provided by the hotel management is very gud and the atmosphere in the hotel premises is very good.");
     
     System.out.println("gave review");
     Reporter.log("gave review");
     
     //Scrolling and giving ratings 
    	 
    	 WebElement ele7 = driver.findElement(By.xpath("//span[@id='qid12_bubbles']"));
    	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele7);
    	 action.moveToElement(ele7).click();
    	 
    	 WebElement ele8 = driver.findElement(By.xpath("//span[@id='qid14_bubbles']"));
    	 action.moveToElement(ele8).click();
    	 Thread.sleep(3000);
    	 WebElement ele9 = driver.findElement(By.xpath("//span[@id='qid11_bubbles']"));
    	 action.moveToElement(ele9).click();
    	 Thread.sleep(3000);
     System.out.println("Gave Hotel Ratings");
     Reporter.log("Gave Hotel Ratings");
     //}
     
     //click oon chwque box
     
     WebElement ele10= driver.findElement(By.xpath("//input[@id='noFraud']"));
     action.moveToElement(ele10).click();
     System.out.println("Clicked on cheque box");
     
     Reporter.log("Clicked on cheque box I aagree");
     
     WebElement ele11= driver.findElement(By.xpath("//div[@id='SUBMIT']"));
     action.moveToElement(ele11).click();
     
     System.out.println("Submitted review");
     
     Reporter.log("Submitted Review");
    }
}

