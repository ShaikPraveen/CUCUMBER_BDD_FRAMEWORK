package com.pageActions;

import org.openqa.selenium.support.PageFactory;

import com.pageLocators.AutomationPracticeHomePageLocators;
import com.utility.SeleniumDriver;

//java -Dhudson.model.DirectoryBrowserSupport.CSP="" -jar jenkins.war -> This will generate HTML Reports

public class AutomationPracticePageActions 
{
	AutomationPracticeHomePageLocators automationPracticeHomePageLocators=null;
	
	
	 public  AutomationPracticePageActions()
	 {
		 this.automationPracticeHomePageLocators=new AutomationPracticeHomePageLocators();
		 PageFactory.initElements(SeleniumDriver.getDriver(), automationPracticeHomePageLocators);
	 } 
	 
	 public void clickMyAccountLink()
	 {
		 automationPracticeHomePageLocators.myaccountlink.click(); 
	 }
	 
	 public void enterUserName(String uname)
	 {
		 automationPracticeHomePageLocators.enterusername.sendKeys(uname);
	 }
	
     public void enterPassword(String pwd)
     {
    	 automationPracticeHomePageLocators.enterpassword.sendKeys(pwd);
     }
     
     
     public void clickLogInBtn()
     {
    	 automationPracticeHomePageLocators.clickloginbtn.click(); 
     }	 
}
