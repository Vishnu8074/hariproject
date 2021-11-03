package com.mindtree.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.Bookelements;

public class Books extends Bookelements {
	 private WebDriver driver;
		public Books(WebDriver driver)
	     {
	    	 this.driver=driver;
	    	 
	     }
		
		
		public WebElement book()
		{
			return driver.findElement(books);
		}
		
		
		public WebElement bookcombo()
		{
			return driver.findElement(bookcombo);
		}

}

/**
package packageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Books {
    
	
	By books=By.xpath("//*[@id=\"site-header-nav\"]/nav/ul[1]/li[4]/a");
	public WebElement book()
	{
		return driver.findElement(books);
	}
	//navmenu-item navmenu-id-books-combo
	By bookcombo=By.cssSelector(".navmenu-item.navmenu-id-books-combo");
	public WebElement bookcombo()
	{
		return driver.findElement(bookcombo);
	}

}
**/
