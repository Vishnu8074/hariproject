package com.mindtree.testobject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.pageobject.Loginpage;
import com.mindtree.reusablecomponents.WebdriverHelper;



public class Loginpagetest extends WebdriverHelper {
	public static Logger log=LogManager.getLogger(WebdriverHelper.class.getName());
	@BeforeClass
	public void start() throws Exception
	{
		driver=initializer();
		log.info("driver initialized for loginpage ");
		
	}
	@Test(dataProvider="getdata")
	public void logintest(String name,String password)
	{
		driver.get(prop.getProperty("url"));
		  Loginpage lp=new Loginpage(driver);
		  lp.login().click();
		  lp.email().sendKeys(name);
		  lp.password().sendKeys(password);
		  log.info("entering data");
		
		
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] ob=new Object[3][2];
		ob[0][0]="1111@gmail.com";
		ob[0][1]="111111111user";
		ob[1][0]="2222@gmail.com";
		ob[1][1]="2222222user";
		ob[2][0]="3333@gmail.com";
		ob[2][1]="333333user";
		return ob;
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
