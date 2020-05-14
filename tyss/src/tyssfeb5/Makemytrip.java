package tyssfeb5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Makemytrip {	
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void testmain() throws Exception
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.id("hp-widget__sTo")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@id='ui-id-2']/li[@aria-label='Top Cities : Goa, India ']")).click();
		String depmonth = driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/div/div/div/a[@class='ui-datepicker-prev ui-corner-all ui-state-disabled']/following-sibling::div/span[@class='ui-datepicker-month']")).getText();
		System.out.println(depmonth);
		String locmnth = LocalDate.now().getMonth().toString();
		String depyear = driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/div/div/div/a[@class='ui-datepicker-prev ui-corner-all ui-state-disabled']/following-sibling::div/span[@class='ui-datepicker-year']")).getText();
		System.out.println(depyear);
		String depdate = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']/a")).getText();
		System.out.println(depdate);
		String lcmn1 = locmnth.substring(0,3);
		String lcmn2 = lcmn1.substring(0,1);
		String lcmn3 = lcmn1.substring(1).toLowerCase();
		 String demonth = lcmn2+lcmn3;
		System.out.println(demonth);
		String dedate = demonth+" "+depdate+","+depyear;
		LocalDate.now();
		LocalDate adate = LocalDate.parse(dedate, DateTimeFormatter.ofPattern("MMM d,yyyy"));
		LocalDate edate = LocalDate.now();
		Assert.assertEquals(adate, edate);
		LocalDate adddate = adate.plusDays(30);
		System.out.println(adddate.getMonth());
		String adtestr = adddate.getMonth().toString();
		int addt = adddate.getDayOfMonth();
		String lastmonth = driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/descendant::div[@class='ui-datepicker-group ui-datepicker-group-last']/descendant::div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText();
		System.out.println(lastmonth);
		if(adtestr.equals(lastmonth))
		{
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/div/div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr/td[@data-handler = 'selectDay']/a[text()='"+addt+"']")).click();
			
		}
		else
		{

			driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/div/div[@class='ui-datepicker-group ui-datepicker-group-last']/div/a[@class='ui-datepicker-next ui-corner-all']/span")).click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='inputM inputHlp disable inputDateFilter']")).click();
		LocalDate ret = adddate.plusDays(30);
		int retdat = ret.getDayOfMonth();
		driver.findElement(By.xpath("//div[@class='dateFilterReturn hasDatepicker']/descendant::a[text()='"+retdat+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("searchBtn")).click();
		driver.close();
		
	}

}
