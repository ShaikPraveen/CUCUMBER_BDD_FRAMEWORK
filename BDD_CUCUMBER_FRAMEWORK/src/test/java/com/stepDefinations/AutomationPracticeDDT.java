package com.stepDefinations;

import org.testng.Assert;

import com.pageActions.AutomationPracticePageActions;
import com.utility.SeleniumDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutomationPracticeDDT 
{   
	AutomationPracticePageActions automationPracticePageActions=new AutomationPracticePageActions();
	 
	@Given("^i am on the Home page of \"([^\"]*)\" Automation Practice website$")
	public void i_am_on_the_Home_page_of_Automation_Practice_website(String url) throws Throwable {
	  
		SeleniumDriver.openPage(url);
	}

	@When("^click \"([^\"]*)\" link on Automation Practice website$")
	public void click_link_on_Automation_Practice_website(String arg1) throws Throwable
	{
		automationPracticePageActions.clickMyAccountLink();   
	}

	@Then("^verify Page title$")
	public void verify_Page_title() throws Throwable
	{
	     Assert.assertEquals(SeleniumDriver.getDriver().getTitle(), "My Account � Automation Practice Site");
	}

	@And("^enter valid or invalid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_valid_or_invalid_username_and_password(String uname, String pwd) throws Throwable {
	   
		automationPracticePageActions.enterUserName(uname);
		automationPracticePageActions.enterPassword(pwd);
	}

	@And("^click \"([^\"]*)\" Button$")
	public void click_Button(String arg1) throws Throwable
	{
		automationPracticePageActions.clickLogInBtn();   
	}

	@Then("^verify the Login homepage$")
	public void verify_the_Login_homepage() throws Throwable
	{
	   String url=SeleniumDriver.getDriver().getCurrentUrl(); 
	   
	   if (url.contains("my-account/"))
	   {
		  Assert.assertTrue(true);
	} else 
	{
        Assert.assertTrue(false);
	}
	}
}
