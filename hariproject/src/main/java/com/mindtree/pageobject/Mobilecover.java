package com.mindtree.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.Mobilecelements;

public class Mobilecover extends Mobilecelements {
	private WebDriver driver;
	public Mobilecover(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement mcover() {
		return driver.findElement(mcover);
	}
	
	public WebElement oneplus()
	{
		
		return driver.findElement(oneplus);
	}


}
