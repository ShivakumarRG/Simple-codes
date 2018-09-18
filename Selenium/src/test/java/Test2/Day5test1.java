package Test2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day5test1 {
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
		driver=Driverutility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://localhost:8083/TestMeApp/");
	}
	
	@Test
	public void testmeapp() {
		Actions act = new Actions(driver);
		WebElement e1=driver.findElement(By.xpath("//span[contains(text(),'AboutUS')]"));
		act.moveToElement(e1).perform();
		WebElement e2=driver.findElement(By.xpath("//span[contains(text(),'Our Offices')]"));
		act.moveToElement(e2).perform();
		WebElement e3= driver.findElement(By.xpath("//span[contains(text(),'chennai')]"));
		act.moveToElement(e3).click().perform();
		Set<String> set= driver.getWindowHandles();
		System.out.println(set.size());
		for(String w:set)
		{
			driver.switchTo().window(w);
		}
		
		WebElement f=driver.findElement(By.name("main_page"));
		driver.switchTo().frame(f);
		String addr=driver.findElement(By.id("demo")).getText();
		System.out.println(addr);
		
	}
	
	@AfterTest
	public void aftertest ()
	{
		driver.close();//will close window pointed by web driver
		//driver.quit(); will close all the windows
	}
}
