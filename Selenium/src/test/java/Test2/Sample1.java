package Test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Sample1 {
	@Test
	public void OpenGoogle() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver","C:\\Selenium_java\\geckodriver.exe");
		//FirefoxDriver driver1 = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
	}
	




}
