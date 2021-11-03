package com.mindtree.reusablecomponents;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverHelper {
	public static Properties prop;
	public static WebDriver driver;
	
		
		public WebDriver initializer() throws Exception
		{
			
		
		prop=new Properties();
		FileInputStream fi=new FileInputStream("E:\\selenium\\selenium_programs\\hariproject\\testdataentry\\data.properties");
		prop.load(fi);
		String name=prop.getProperty("browser");
		if(name.equalsIgnoreCase("google"))
		{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\selenium_programs\\hariproject\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		}
		else
		{
			
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		
	return driver;
	}

}
