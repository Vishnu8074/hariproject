
package com.mindtree.reusablecomponent;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	
		// TODO Auto-generated method stub
		public static Properties prop;
		public static WebDriver driver;
		
			
			public WebDriver initializer() throws Exception
			{
				
			
			prop=new Properties();
			FileInputStream fi=new FileInputStream("E:\\selenium\\selenium_programs\\milestone4\\src\\main\\resources\\data.properties");
			prop.load(fi);
			String name=prop.getProperty("browser");
			if(name.equalsIgnoreCase("google"))
			{
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\selenium_programs\\milestone4\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			
			}
			else
			{
				
			}
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
			
		return driver;
		}


	}



