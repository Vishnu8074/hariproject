package com.mindtree.testobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;


import com.mindtree.pageobject.Mobilecover;
import com.mindtree.reusablecomponents.WebdriverHelper;



public class Mobilectest extends WebdriverHelper {
	public static Logger log=LogManager.getLogger(WebdriverHelper.class.getName());
	@BeforeClass
	public void initial() throws Exception
	{
		driver=initializer();
		log.info("driver started for mobilecover test");
	
    }
		
  @Test
  public void mobiletest() {
	  driver.get(prop.getProperty("url"));
	  Mobilecover mc=new Mobilecover(driver);
	  mc.mcover().click();
	  log.info("mobile cover button clicked");
	  
	  mc.oneplus().click();
	  log.info("oneplus button clicked");
  
  }
  @AfterClass
  public void end()
  {
	  driver.close();
  }
}
