package Test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day6test3 {

	WebDriver driver;
	@BeforeTest
	public void beforeTest()
	{
		driver = Driverutility.getDriver("chrome");
		driver.manage().window().maximize();
					
	}
	
	@Test(priority=1)
	public void launchApps()
	{
		
		/*for(WebElement e:list)
		{driver.get("http://newtours.demoaut.com/");
		//List<WebElement> list = driver.findElement(By.tagName("a")); Need to enquire this
		driver.findElement(By.name("userName")).sendKeys("mercury");		
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		WebElement tbody= driver.findElement(By.xpath("//td[@bgcolor='#FFC455']"));
		WebElement list =tbody.findElement(By.tagName("tr"));
		
			System.out.println(e.getText());
		}*/
		
		
		
	}
}
