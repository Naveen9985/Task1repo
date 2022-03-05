package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase4 {

	public static void main(String[] args) throws InterruptedException {
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
		
		
		WebElement ele2= driver.findElement(By.xpath("//i[@class='icon icon-sidemodal']"));
		
		boolean b = ele2.isDisplayed();
		
		System.out.println(b);
		
		boolean b2= ele2.isEnabled();
		
		System.out.println(b2);
		
		
		 executor.executeScript("arguments[0].click();", ele2);
		 
		 System.out.println("differemce button clicked");
		 
		 
		 Thread.sleep(1000);
		
		
	}

}
