package tyssfeb1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bluestoneoffer {
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
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='bottom-header']/div/nav/ul/li/a[(text()='Offers ')]"))).perform();
		Thread.sleep(1000);
		String estate = driver.findElement(By.xpath("//div[@class='bottom-header']/div/nav/ul/li/a[(text()='Offers ')]/following-sibling::div/ul/descendant::span[@data-p='offers-100mc,m']")).getText();
		driver.findElement(By.xpath("//div[@class='bottom-header']/div/nav/ul/li/a[(text()='Offers ')]/following-sibling::div/ul/descendant::span[text()='0% Making Charge']")).click();
		List<WebElement> offers = driver.findElements(By.xpath("//div[@id='content-column']/div[@id='product-display']/descendant::div[@class='inner pd-gray-bg']/descendant::span[@class='offer']/span"));
			System.out.println(offers.get(2).getText());
			String estate1 = estate.toUpperCase();
			System.out.println(estate1);
			Assert.assertEquals(offers.get(2).getText(), estate1);
			Thread.sleep(1000);
		driver.close();
	}
}
