package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.reviewUI;

public class reviewObject extends reviewUI {
	public static WebDriver driver;
	public reviewObject(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement footer()
	{
		return driver.findElement(footer);
	}
	public WebElement checkr() {
		return driver.findElement(review);
	}

}
