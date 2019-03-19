package com.wordpress.runner;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.wordpress.pages.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
	
	/*@Before
	public void setUpApplication()
	{
		Reporter.log("=====Browser session started=====", true);
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		
		Reporter.log("=====Application started=====", true);
	}
	
	@After
	public void closeApplication()
	{
		driver.quit();
		
		Reporter.log("=====Browser session end=====", true);
	}*/

}
