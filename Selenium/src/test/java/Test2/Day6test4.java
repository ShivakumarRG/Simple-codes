package Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.page.Loginpage;

public class Day6test4 
{
	WebDriver driver;
	Loginpage loginpage;
	@BeforeTest
	public void beforeTest()
	{
		driver = Driverutility.getDriver("chrome");
		loginpage=PageFactory.initElements(driver,Loginpage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}
	
	@Test
	public void testLogin()
	{
		String title = loginpage.clicksignin();
		Assert.assertTrue(title.contains("Flight"));
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.close();
		loginpage=null;
	}
	
	
		
}
