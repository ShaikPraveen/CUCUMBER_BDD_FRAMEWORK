package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver 
{
	private static SeleniumDriver seleniumDriver;
	
	
	private static WebDriver driver;
	private static WebDriverWait wait;
	public final static int TIMEOUT=40;
	public final static int PAGELOAD_TIMEOUT=60;
	
	
	private SeleniumDriver()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TIMEOUT, TimeUnit.SECONDS);
	}
	
	
	public static void openPage(String url)
	{
		driver.get(url);
	}
	
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	
	public static void setUp()
	{
		if (seleniumDriver==null) 
		{
		    seleniumDriver=new SeleniumDriver();	
		}
	}
	
	
	public static void tearDown()
	{
		if (driver !=null)
		{
		    driver.close();
		    driver.quit();
		}
		
		seleniumDriver=null;
	}
}
