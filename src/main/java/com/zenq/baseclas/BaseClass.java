package com.zenq.baseclas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	public static WebDriver driver;
	
	public static void setup() 
	{
		
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumResources\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	
	driver.manage().window().maximize();
	
	}
	
}
