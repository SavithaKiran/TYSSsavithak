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

public class Bluestonekadas {
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
		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		act.moveToElement(driver.findElement(By.xpath("//div[@class='bottom-header']/div/nav/ul/li/a[text()='All Jewellery ']"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='bottom-header']/div/nav/ul/li/a[text()='All Jewellery ']/following-sibling::div/span/following-sibling::ul/li/div/div/following-sibling::ul/li/a[text()='Kadas']")).click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='mainContent']/div/div[@id='content-column']/div[@id='product-display']/section/div/div/ul/li/div/div[@class='pr-i lazy-bg']")).click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		Thread.sleep(1000);
		WebElement errmsg = driver.findElement(By.xpath("//div[@class='formErrorContent']"));
		String errtext = errmsg.getText();
		String acttext = "* This field is required";
		Assert.assertEquals(acttext, errtext);
		//Assert.assertNotEquals(acttext, errtext);
		Thread.sleep(4000);
		driver.close();
		
		
	}
}
