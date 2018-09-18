package Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Chrometest {
	@Test
	public void register()
	{
		WebDriver driver = Driverutility.getDriver("Chrome");	
		driver.manage().window().maximize();
		//driver.get("http://newtours.demoaut.com/");
		//driver.findElement(By.linkText("REGISTER")).click();
		
	}
}
