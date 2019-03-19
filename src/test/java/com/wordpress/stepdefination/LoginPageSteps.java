package com.wordpress.stepdefination;


import com.wordpress.pages.BaseClass;
import com.wordpress.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends BaseClass{
	
	
	LoginPage loginPage = new LoginPage();
	
	@Given("^I want to open the wordpress application$")
	public void i_want_to_open_the_wordpress_application() {
	   System.out.println("Application opened successfully");
	   
	}

	@Given("^verify the application name$")
	public void verify_the_application_name() {
		loginPage.verifyLoginPageTitle();
	}

	@When("^I enter the login credintials$")
	public void i_enter_the_login_credintials()  throws InterruptedException{
	    loginPage.loginOperation("praveen1423", "wordpress");
	}

	@When("^click on login button$")
	public void click_on_login_button() {
	    loginPage.clickLoginButton();
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() {
	  loginPage.verifyReaderPageTitle();
	}


}
