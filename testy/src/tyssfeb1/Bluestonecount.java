package tyssfeb1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Bluestonecount {
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
		driver.findElement(By.xpath("//div[@class='white-header-inner']/descendant::div[@class='search-form-wrapper']/descendant::input[@id='search_query_top_elastic_search']")).sendKeys("rings");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='button']")).submit();
		js.executeScript("window.scrollBy(0,500)");
		act.moveToElement(driver.findElement(By.xpath("//div[@id='mainContent']/descendant::div[@class='top-filter-blocks']/section[@id='Price-form']"))).perform();
		Thread.sleep(1000);
		String count = driver.findElement(By.xpath("//div[@id='mainContent']/descendant::div[@class='top-filter-blocks']/section[@id='Price-form']/descendant::span[contains(.,' Below ')]/span[@class='items-count']")).getText();
		System.out.println("Number of rings that are below 10,000rs are: "+count);
		Thread.sleep(1000);
		driver.close();
}
}