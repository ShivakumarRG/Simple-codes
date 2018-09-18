package Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.dataprovider.LoginDataprovider;

public class Importingdatafrompackage 
{
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void beforeMethod(String V1)
	{
		driver = Driverutility.getDriver(V1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}
	
	@AfterTest
	public void aftermethod()
	{
		driver.close();
	}
	
	@Test(dataProvider="dp1",dataProviderClass=LoginDataprovider.class)
	public void TestnewTour(String userID,String password)
	{
		
		driver.findElement(By.name("userName")).sendKeys(userID);		
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Assert.assertTrue(driver.getTitle().contains("Flight"));
		if(driver.getTitle().contains("Flight"))
		{
			driver.findElement(By.linkText("SIGN-OFF")).click();
		}
		
	}
	
	
}
