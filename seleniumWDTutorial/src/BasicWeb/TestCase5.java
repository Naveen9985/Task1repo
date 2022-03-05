package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\v-palnav\\Downloads\\edgedriver_win64Zip\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		System.out.println("edge launched");
		
		
		// launching the application intelligence node
		driver.get("https://qaportal.intelligencenode.com/?app_key=2244a55adbf218a1c0407fd6e0c995a6#!/compare/new/item/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement realtionship = (driver.findElement(By.xpath("//a [@ng-class= '{activeClass: state.includes(viewStates.RELATIONSHIP_CHART)}']")));
		 
		realtionship.click();
		
		System.out.println("clicked on the relationship chart");
		
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		
		WebElement ele1, ele2, ele3, ele4;
		
		 ele1 = driver.findElement(By.xpath("//div[@ng-if='!(singleSelect && !isArray)']/span[@title='Website']"));
		
		boolean b = ele1.isDisplayed();
		 System.out.println(b);
		
		 ele2 = driver.findElement(By.xpath("//div[@ng-if='!(singleSelect && !isArray)']/span[@title='Category']"));
		
		 boolean b2 = ele1.isDisplayed();
		 System.out.println(b2);
		
		ele3 = driver.findElement(By.className("xAxisSection"));
		
		boolean b3 = ele3.isDisplayed();
		 System.out.println(b3);
		 
		ele4= driver.findElement(By.className("col-sm-12"));
		
		boolean b4 = ele4.isDisplayed();
		 System.out.println(b4);
		 
		
	//	act.dragAndDrop(ele1, ele3).build().perform();
		
		act.clickAndHold(ele1).moveToElement(ele3).build().perform();
		
		Thread.sleep(2000);
		
	//	act.dragAndDrop(ele2, ele4).build().perform();
		
		Actions act1 = new Actions(driver);
		
		act1.clickAndHold(ele2).moveToElement(ele4).release().build().perform();
		
		System.out.println("Successfully dragged and dropped the items on the x and y axis");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"content-container\"]/div[2]/div/div[2]/div[4]/div[4]/button[3]")).click();
		
		System.out.println("Clciked on Apply filter");
		
		Thread.sleep(1000);
		
		driver.findElement(By.className("raphael-group-229-hot")).click();
		
		System.out.println("clicked on the cell");
		
		
	}

}
