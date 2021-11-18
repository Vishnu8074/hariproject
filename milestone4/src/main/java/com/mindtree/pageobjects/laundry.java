package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.Laundryelements;

public class laundry extends Laundryelements {
	
public WebDriver driver;
public laundry(WebDriver driver)
{
	this.driver=driver;
	
}
public WebElement hover1()
{
	 return driver.findElement(hover1);
}
public WebElement click1()
{
	return driver.findElement(howlaundry);
}
public WebElement find()
{
	return driver.findElement(learmore);
}
}
