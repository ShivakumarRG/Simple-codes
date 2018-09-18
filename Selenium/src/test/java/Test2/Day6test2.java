package Test2;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day6test2 {

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("open launch");
	}
	
	@Test(priority=1)
	public void launchApplication()
	{
		System.out.println("app launch");
		Assert.assertEquals(12,13);  
	}
	
	@Test(priority=2,dependsOnMethods="launchApplication")
	public void login()
	{
		System.out.println("Login");
	}
	
	@Test(priority=3,dependsOnMethods="login")
	public void logout()
	{
		System.out.println("logout");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Close browser");
	}
}
