package BasicWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException, IOException, CsvValidationException {
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
		
//		WebElement ele2= driver.findElement(By.xpath("//i [@class = 'icon-down pull-right optionIconDown'] "));
//		
//		action.moveToElement(ele2).click().perform();
		
		
		
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		 WebElement ele2= driver.findElement(By.xpath("//i [@class = 'icon-down pull-right optionIconDown'] "));
			
		 boolean elementdisplayed = ele2.isDisplayed();
		 
		 System.out.println(elementdisplayed);
		 
		 executor.executeScript("arguments[0].click();", ele2);
		 
		 
		 WebElement ele3= driver.findElement(By.xpath("//*[@id=\"compare-module\"]/div/div/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div/ul/li/div/ul/li"));
	
         boolean elementdisplayed2 = ele3.isDisplayed();
		 
		 System.out.println(elementdisplayed2);
		 
		 boolean elementenabled = ele3.isEnabled();
		 
		 System.out.println(elementenabled);
		 
		 WebDriverWait Wait = new WebDriverWait(driver, 10);
		 
		 Wait.until(ExpectedConditions.elementToBeClickable(ele3));
			
		   ele3.click();
			 
			 System.out.println("clicked on the Download CsV");
			 
			 Thread.sleep(3000);
		 
		 System.out.println("CSV Downloaded");
		 
		 String text = driver.findElement(By.xpath("//div[@class = 'pull-left paginationList']")).getText();
		 
		 System.out.println(text);
	
		 String CSV_PATH = "C:\\Users\\v-palnav\\Downloadsexact_match_data_2022-03-05_ (3).csv";
		 
		 CSVReader csvReader;
		 
		 csvReader = new CSVReader(new FileReader(CSV_PATH));
		 
		 String[] csvCell;
		while ((csvCell = csvReader.readNext()) != null) {
			String value1 = csvCell[6];
            String value2 = csvCell[8];
            String Totalvalue = value1 + value2 ;
            System.out.println("Totalvalue");
		 }
		 
		 
		 
	}

}
