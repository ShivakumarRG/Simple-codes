package Test2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class TestNGusage {
	WebDriver driver;
  @Test
  public void Google() {
	  driver.get("https://google.com");
	  System.out.println("Google testing");
  }
  
  @Test
  public void toursite() {
	  driver.get("http://newtours.demoaut.com");
	  System.out.println("Tour site testing");
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = Driverutility.getDriver("Chrome");
	  System.out.println("Opening chrome");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  System.out.println("Closing");
  }

}
