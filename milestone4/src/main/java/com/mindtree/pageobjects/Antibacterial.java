package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.Productelements;

public class Antibacterial extends Productelements {
	
	public WebDriver driver;
	public Antibacterial(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement search()
	{
		return driver.findElement(search);
	}
	public WebElement button()
	{
		return driver.findElement(button);
	}
	public WebElement find()
	{
		return driver.findElement(find);
	}

}
