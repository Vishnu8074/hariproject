package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.reviewUI;
import com.mindtree.uistore.tipsUI;

public class tipsObject extends tipsUI {
	public static WebDriver driver;
	public tipsObject(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement tipsbuuton()
	{
		return driver.findElement(tip);
		}
	public WebElement validate()
	{
		return driver.findElement(verify);
	}

}
