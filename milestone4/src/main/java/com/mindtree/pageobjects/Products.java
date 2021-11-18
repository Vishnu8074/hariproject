package com.mindtree.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.shopproductelement;

public class Products extends shopproductelement  {
	public static WebDriver driver;
	public Products(WebDriver driver){
		this.driver=driver;
	
	}
	
	public WebElement shopproduct()
	{
		
		return driver.findElement(shop);
	}
	public WebElement powder()
	{
		return driver.findElement(powder);
	}
	public WebElement detergent()
	{
		return driver.findElement(detergent);
	}
	

}
