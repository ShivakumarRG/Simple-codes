package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage 
{
	//constructor
	
	public Loginpage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	//data--->Web elements
	WebDriver driver;
	
	@FindBy(how=How.NAME,using="userName")
	WebElement userName;
	@FindBy(how=How.NAME,using="password")
	WebElement password;
	@FindBy(how=How.NAME,using="login")
	WebElement signIn;
	
	//method--->Function(login)
public String clicksignin()
{
	userName.sendKeys("mercury");
	password.sendKeys("mercury");
	signIn.click();
	return driver.getTitle();
	
}
	
	
}
