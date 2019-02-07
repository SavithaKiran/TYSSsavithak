package tyssfeb1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Bluestonechat {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void testmain() throws Exception {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		driver.switchTo().frame("wiz-iframe");
		driver.findElement(By.xpath("//div[@class='CT_Banner']/descendant::span[@class='CT_BannerClose']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("livechat-compact-view");
		Thread.sleep(2000);
		driver.findElement(By.id("full-view-button")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("livechat-full-view");
	    driver.findElement(By.xpath("//div[@class='form']/descendant::div[@id='container_2']/p/input")).sendKeys("Savitha");
	    driver.findElement(By.xpath("//div[@class='form']/descendant::div[@id='container_3']/p/input")).sendKeys("savik@gmail.com");
	    driver.findElement(By.xpath("//div[@class='form']/descendant::div[@id='container_4']/p/input")).sendKeys("6534295098");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='form']/descendant::div[@class='submit']/p/input")).submit();
	    driver.findElement(By.xpath("//table[@id='content']/descendant::span[@id='textarea-wrapper']/textarea[@class='textarea-bg textarea-font']")).sendKeys("Hello");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//table[@id='content']/descendant::span[@id='textarea-wrapper']/textarea[@class='textarea-bg textarea-font']")).sendKeys(Keys.ENTER);
	    
	    driver.close();
	    
	}
}
