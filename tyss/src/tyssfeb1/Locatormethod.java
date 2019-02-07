package tyssfeb1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locatormethod {
		public WebElement findelement(String locater , String value, WebDriver driver)
		{
			WebElement webel = null;
			if(locater.equals("id"))
				webel=driver.findElement(By.id(value));
			else if(locater.equals("xpath"))
				webel=driver.findElement(By.xpath(value));
			else if(locater.equals("className"))
				webel=driver.findElement(By.className(value));
			else if(locater.equals("name"))
				webel=driver.findElement(By.name(value));
			else if(locater.equals("cssSelector"))
				webel=driver.findElement(By.cssSelector(value));
			else if(locater.equals("linkText"))
				webel=driver.findElement(By.linkText(value));
			else if(locater.equals("partialLinkText"))
				webel=driver.findElement(By.partialLinkText(value));
			else if(locater.equals("tagName"))
				webel=driver.findElement(By.tagName(value));
			
			return webel;
			
		}
	
}
