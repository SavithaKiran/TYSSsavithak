package tyssfeb1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bluestone2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void testmain() throws Exception {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Actions act = new Actions(driver);//vcf
		JavascriptExecutor js = (JavascriptExecutor)driver;
		act.moveToElement(driver.findElement(By.xpath("//div[@class='bottom-header']/div/nav/ul/li/a[text()='All Jewellery ']"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='bottom-header']/div/nav/ul/li/a[text()='All Jewellery ']/following-sibling::div/span/following-sibling::ul/li/div/div/following-sibling::ul/li/a[text()='Kadas']")).click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='mainContent']/div/div[@id='content-column']/div[@id='product-display']/section/div/div/ul/li/div/div[@class='pr-i lazy-bg']")).click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//div[@id='attributes']/label/following-sibling::div/select[@id='ringselect']"));
	    element.click();
	    //Select select = new Select(element);
	    String sizetext = driver.findElement(By.xpath("//div[@class='select-size']/select/option[@value='02']")).getText();
	    System.out.println(sizetext);
	  driver.findElement(By.xpath("//div[@class='select-size']/select/option[@value='02']")).click();
	 driver.findElement(By.xpath("//div[@class='buynow-block col-xs-6']/input")).click();
			String selsize = driver.findElement(By.xpath("//div[@id='shopping-bag']/div/div/div[@class='col-xs-12 nopadding item-block']/div/div/div/following::div/descendant::div/div/div[contains(.,'Size')]/following-sibling::div")).getText();
		System.out.println(selsize);
		Assert.assertEquals(sizetext, selsize);
		Thread.sleep(3000);
		driver.close();
	}

}
