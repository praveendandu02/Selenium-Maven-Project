package com.wordpress.pages;


import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.wordpress.utility.Helper;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class LoginPage extends BaseClass{
	
	final static Logger log = Logger.getLogger("LoginPage");
	
	public String username = "//input[@name='usernameOrEmail']";
	
	public String usernamecontinue_button = "//button[contains(text(),'Continue')]";
	
	public String password = "//input[@name='password']";
	
	public String login = "//button[contains(text(),'Log In')]";
		
	public String loginPageTitle = "Log In — WordPress.com";
	
	public String readerPageTitle = "Following ‹ Reader — WordPress.com";
	

	
	public void loginOperation(String username, String password) throws InterruptedException
	{
		typeUserName(username);
		clickUserNameContinueButton();
		typePassword(password);
	}
	
	public void verifyLoginPageTitle()
	{
		
		log.info("Login page title is verifying");
		Helper.verifyTitleContains(driver, loginPageTitle);
		Assert.assertEquals(getTitle(), loginPageTitle);
		log.info("Login page title is verified");
	}
	
	public void verifyReaderPageTitle()
	{
		log.info("Reader page title is verifying");
		Helper.verifyTitleContains(driver, readerPageTitle);
		Assert.assertEquals(getTitle(), readerPageTitle);
		log.info("Reader page title is verifying");
	}
	
	public void typeUserName(String uname)
	{
		log.info("Enter the username");
		setTextByXpath(username,uname);
		log.info("Entered the username");
	}
	
	public void clickUserNameContinueButton()
	{
		log.info("Username continue button is clicking");
		clickByXpath(usernamecontinue_button);
		log.info("Username continue button is clicked");
	}
	
	public void typePassword(String pword)
	{
		log.info("Enter the password");
		setTextByXpath(password,pword);
		log.info("Entered the password");
	}
	
	public void clickLoginButton()
	{
		log.info("Login button is clicking");
		clickByXpath(login);
		log.info("Login button is clicked");
	}

}
