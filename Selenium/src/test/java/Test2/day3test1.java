package Test2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day3test1 {

	@Test
	public void OpenGoogle() 
	{
		
		WebDriver driver = Driverutility.getDriver("chrome");		
		//System.setProperty("webdriver.gecko.driver","C:\\Selenium_java\\geckodriver.exe");
		//FirefoxDriver driver1 = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");		
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		//String title = driver.getTitle();
		//Assert.assertEquals(title, "Find a Flight: Mercury Tours:");
		//driver.findElement(By.name("tripType"));
	    //driver.findElement(By.cssSelector("input[value='oneway']")).click();
		
		boolean a = driver.findElement(By.linkText("ITERNARY")).isDisplayed();
		Assert.assertTrue(a);
		driver.findElement(By.cssSelector("input[value='oneway']")).click();
		//driver.findElement(By.name("fromPort")).sendKeys(agr0);
		
		 
		WebElement from = driver.findElement(By.name("fromPort"));
		Select sel = new Select(from);
		List<WebElement> list =sel.getOptions();
		System.out.println(list.size());
		Assert.assertEquals(list.size(),10);
		for(WebElement e:list)
		{
			String city=e.getText();
			if(city.equals("Paris"))
			{
				sel.selectByVisibleText(city);
				break;
			}
		}
		
	}
}
