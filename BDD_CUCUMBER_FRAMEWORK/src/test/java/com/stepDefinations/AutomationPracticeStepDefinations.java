package com.stepDefinations;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.pageActions.AutomationPracticePageActions;
import com.utility.SeleniumDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutomationPracticeStepDefinations
{
	AutomationPracticePageActions automationPracticePageActions=new AutomationPracticePageActions();
	
	@Given("^i am on the home page of \"([^\"]*)\" Automation Practice website$")
	public void i_am_on_the_home_page_of_Automation_Practice_website(String websiteurl) throws Throwable {
	
		SeleniumDriver.openPage(websiteurl);
	}

	@When("^click \"([^\"]*)\" link on homepage$")
	public void click_link_on_homepage(String arg1) throws Throwable 
	{
		automationPracticePageActions.clickMyAccountLink();    
	}

	@And("^enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_username_and_password(String uname, String pwd) throws Throwable {
	 
		automationPracticePageActions.enterUserName(uname);
		automationPracticePageActions.enterPassword(pwd);
	}

	@And("^click \"([^\"]*)\" button$")
	public void click_button(String arg1) throws Throwable 
	{
		automationPracticePageActions.clickLogInBtn();	
	}

	@Then("^i should see my account name in login page$")
	public void i_should_see_my_account_name_in_login_page() throws Throwable {
	 
String text=SeleniumDriver.getDriver().findElement(By.xpath("//*[@id='page-36']/div/div[1]/div/p[1]")).getText();
		
		if (text.contains("praveen77"))
		{
		   Assert.assertTrue(true);	
		} else
		{
            Assert.assertTrue(false);
		}
	}


	@Then("^verify Page Title$")
	public void verify_Page_Title() throws Throwable 
	{
		 String acttitle=SeleniumDriver.getDriver().getTitle();
	     Assert.assertEquals(acttitle, "My Account � Automation Practice Site");     
	}
}
