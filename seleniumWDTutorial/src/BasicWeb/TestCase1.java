package BasicWeb;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.edge.driver", "C:\\Users\\v-palnav\\Downloads\\edgedriver_win64Zip\\msedgedriver.exe");
				
		WebDriver driver = new EdgeDriver();
		System.out.println("edge launched");
		
		
		// launching the application intelligence node
		driver.get("https://qaportal.intelligencenode.com/?app_key=2244a55adbf218a1c0407fd6e0c995a6#!/compare/new/item/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		Actions action = new Actions (driver);
		
		WebElement ele1 = driver.findElement(By.xpath("//a[@ui-sref= 'app.compare.item({ randomId: 2 })']"));
		
	
		action.moveToElement(ele1).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicked on the items");
		


		Thread.sleep(2000);
		//Scrolling to the end of the page
		
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	     
	     System.out.println("scrolled to the end of the page");
	     
	     
	  String Text = driver.findElement(By.xpath(" //div[@class = 'pull-left paginationList']")).getText();
	   
	  System.out.println(Text);
	  
	  
	  Thread.sleep(3000);
	     //Taking screenshot 
	     
	    File Scrshot = ((TakesScreenshot)driver.findElement
	    		(By.xpath("//div[@class = 'pull-left paginationList']")))
	    		.getScreenshotAs(OutputType.FILE); 
	    
	    FileUtils.copyFile(Scrshot  ,new File("C:\\Users\\v-palnav\\eclipse-workspace\\seleniumWDTutorial\\Screenshot\\screenshot3.png"));
		
	    System.out.println("captured screenshot");
	
	}

}
