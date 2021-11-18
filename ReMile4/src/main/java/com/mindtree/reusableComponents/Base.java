package com.mindtree.reusableComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	public static Properties prop;
	public static WebDriver driver;
	

	public WebDriver initializer() throws Exception
	{
		prop=new Properties();
		FileInputStream fi=new FileInputStream(".\\src\\main\\resources\\data.properties");
		prop.load(fi);
		String name=prop.getProperty("browser");
		if(name.equalsIgnoreCase("google"))
		{
			System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disable-notifications");
			 driver=new ChromeDriver(opt);
			
			
			
		}
		else
		{
			
		}
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		return driver;
		
		
	}
}
