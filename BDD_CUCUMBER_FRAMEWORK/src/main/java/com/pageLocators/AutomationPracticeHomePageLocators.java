package com.pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutomationPracticeHomePageLocators 
{
	
	   @FindBy(how=How.LINK_TEXT,using="My Account")
	   public WebElement myaccountlink;
	   
	   @FindBy(how=How.XPATH,using="//input[@name='username']")
	   public WebElement enterusername;
	   
	   @FindBy(how=How.XPATH,using="//input[@id='password']")
	   public WebElement enterpassword;
	   
	   @FindBy(how=How.XPATH,using="//input[@value='Login']")
	   public WebElement clickloginbtn;
}
