package com.mindtree.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.Loginpageelements;

public class Loginpage extends Loginpageelements{
	public WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement login() {
		
			return driver.findElement(login);
		
		
	}
	public WebElement email()
	{
		return driver.findElement(email);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement signin()
	{
		return driver.findElement(signin);
	}
	

}
