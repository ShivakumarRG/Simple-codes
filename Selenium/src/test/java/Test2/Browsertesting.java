package Test2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Browsertesting {
	/*@Test
	public void testchrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\r.c.subramani\\Downloads\\WebDriver\\WebDriver\\chromedriver.exe");
		ChromeDriver C1 =new ChromeDriver();
	}*/
	@Test
	public void testfirefox() {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium_java\\geckodriver.exe");
		FirefoxDriver C1 =new FirefoxDriver();
	}
	/*@Test
	public void testie() {
		System.setProperty("webdriver.ie.driver","C:\\Users\\r.c.subramani\\Downloads\\WebDriver\\WebDriver\\IEDriverServer.exe");
		InternetExplorerDriver driver =new InternetExplorerDriver();
	}*/
}
