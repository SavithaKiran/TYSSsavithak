package tyssfeb1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Bluestone {
	static String path="./data/bluest.xlsx";
	static String sname="Sheet1";
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Exception {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		//Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		act.moveToElement(driver.findElement(By.xpath("//div[@class='bottom-header']/div/nav/ul/li/a[(text()='Rings ')]"))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='bottom-header']/div/nav/ul/li/a[(text()='Rings ')]/following-sibling::div/descendant::div/ul/li/following-sibling::li/a[text()='Diamond']")).click();
		Thread.sleep(2000);
		List<WebElement> lprice = driver.findElements(By.xpath("//a[@class='link-overlay']/following-sibling::span/span/span[@class='new-price']"));
		Thread.sleep(9000);
		int lpsize = lprice.size();
		for(int i=0;i<lpsize;i++)
		{
				String lptext = lprice.get(i).getText();
				System.out.println(lptext);
				setExcelData(path, sname, i, 0,lptext);
		}
		System.out.println(lpsize);
		js.executeScript("window.scrollBy(0,500)");
				act.moveToElement(driver.findElement(By.xpath("//section[@class='block sort-by pull-right']"))).perform();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@id='view-sort-by']/div/a[text()='Price Low to High ']")).click();
		List<WebElement> sortpr = driver.findElements(By.xpath("//a[@class='link-overlay']/following-sibling::span/span/span[@class='new-price']"));
		Thread.sleep(9000);
		int sortsiz = sortpr.size();
		System.out.println(sortsiz);
		for(int i=0;i<sortsiz;i++)
		{
				String sorttext = sortpr.get(i).getText();
				System.out.println(sorttext);
				setExcelData(path, sname, i, 1,sorttext);
		}
		driver.close();
		
	}
	 public static void setExcelData(String  path,String sheetName,int row ,int cell, String value )
		{
			
			Workbook f; 
			try {
				f = WorkbookFactory.create(new FileInputStream(path));
				if(f.getSheet(sheetName).getRow(row)==null)
				f.getSheet(sheetName).createRow(row).createCell(cell);
				else
				f.getSheet(sheetName).getRow(row).createCell(cell);		
				f.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
				f.write(new FileOutputStream(path));
				
			} 
			catch (EncryptedDocumentException  | InvalidFormatException | IOException e  ) {
				
				e.printStackTrace();
			}
		}
			
		}
