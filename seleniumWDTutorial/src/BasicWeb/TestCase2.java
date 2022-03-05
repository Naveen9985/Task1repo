package BasicWeb;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\v-palnav\\Downloads\\edgedriver_win64Zip\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		System.out.println("edge launched");
		
		
		// launching the application intelligence node
		driver.get("https://qaportal.intelligencenode.com/?app_key=2244a55adbf218a1c0407fd6e0c995a6#!/compare/new/item/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		Actions action = new Actions (driver);
		
		WebElement ele1 = driver.findElement(By.xpath("//a[@ui-sref= 'app.compare.item({ randomId: 2 })']"));
		
	
		
		
		
		action.moveToElement(ele1).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicked on the items");
		
		 WebElement ele2= driver.findElement(By.xpath("//strong[@class= 'selected-item']"));
		
		 executor.executeScript("arguments[0].click();", ele2);
		 
		 
		 Thread.sleep(1000);
		 
	//	action.moveToElement(ele2).click();
		
		System.out.println("clicked on the dropdown");
		
		Thread.sleep(2000);
		
		 @SuppressWarnings("deprecation")
		WebDriverWait Wait = new WebDriverWait(driver, 10);
		 
		 WebElement ele3= driver.findElement(By.xpath("//*[@id=\"discount_options\"]/ul/li[3]"));
		
		 boolean elementdisplayed = ele3.isDisplayed();
		 
		 System.out.println(elementdisplayed);
		 
		 boolean elementenabled = ele3.isEnabled();
		 
		 System.out.println(elementenabled);
		 
			/*
			 * JavascriptExecutor executor1 = (JavascriptExecutor)driver;
			 * 
			 * executor1.
			 * executeScript("document.getElementByXpath('//*[@id=\"discount_options\"]/ul/li[3]').st‌​yle.display = 'none';‌​"
			 * );
			 * 
			 * 
			 * // executor.
			 * executeScript("document.querySelector('div.comparing-dd click-container').st‌​yle.display='none';‌​"
			 * );
			 * 
			 * // executor.executeScript(
			 * "document.getElementById('discount_options').st‌​yle.display='block';");
			 * 
			 * executor1.executeScript("arguments[o].click();", ele3);
			 */
		 
		 
		Wait.until(ExpectedConditions.elementToBeClickable(ele3));
			
	   ele3.click();
		 
		 System.out.println("clicked on the OverPriced");
		 
		 Thread.sleep(3000);
	     //Taking screenshot 
	     
	    File Scrshot = ((TakesScreenshot)driver.findElement
	    		(By.xpath("//div[@class = 'pull-left paginationList']")))
	    		.getScreenshotAs(OutputType.FILE); 
	    
	    FileUtils.copyFile(Scrshot  ,new File("C:\\Users\\v-palnav\\eclipse-workspace\\seleniumWDTutorial\\Screenshot\\screenshot2.png"));
		
	    System.out.println("captured screenshot");
		 
		
	}

}
