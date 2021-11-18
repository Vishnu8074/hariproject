package com.mindtree.testobject;

import org.testng.annotations.AfterClass;


import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;


import com.mindtree.pageobject.Books;
import com.mindtree.reusablecomponents.WebdriverHelper;

public class Bookstest extends WebdriverHelper {
	public static Logger log=LogManager.getLogger(WebdriverHelper.class.getName());
	@BeforeTest
	public void start() throws Exception
	{
		driver=initializer();
		log.info("driver initialized");
	}
  @Test
  public void btest() {
	  driver.get(prop.getProperty("url"));
	  Books bk=new Books(driver);
	  Actions a=new Actions(driver);
	  a.moveToElement(bk.book()).build().perform();
	  
	  a.moveToElement(bk.bookcombo()).click().build().perform();
	  log.info("btest done");
	  
	  
  }
  
  @AfterClass
  public void end()
  {
	  driver.close();
  }
}
