package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.paperUI;

public class paperObject extends paperUI {
	public static WebDriver driver;
	public paperObject(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement search()
	{
		return driver.findElement(search);
	}
	public WebElement input()
	{
		return driver.findElement(input);
	}
	public WebElement searchbutton()
	{
		return driver.findElement(sbutton);
	}
	public WebElement verifytext()
	{
		return driver.findElement(verify);
}

}
