package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatedAccount {
	
	
WebDriver ldriver;
	
	
	public CreatedAccount (WebDriver rdriver) {
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this );
		
	}

	//Identify WebElements
	@FindBy(xpath ="//b[text()='Account Created!']")
	WebElement createdmsg;
	@FindBy(xpath = "//a[@data-qa='continue-button']")
	WebElement clickcontinue;
	
	@FindBy(linkText ="Logout")
	WebElement logout;
	public String checkAccountCreated( )
	{
		String getMsg=createdmsg.getText();
		return getMsg;
	}
	
	public void clickOnContinue()
	{
		clickcontinue.click();
	}
	
	
	// Identify and check username 
	
	@FindBy(xpath="//a/b[text()='sam4560']")
	WebElement username;
	
	public String checkUserName( )
	{
		String usernme=username.getText();
		return usernme;
	}
	public void clickLogout( )
	{
		logout.click();
	}
	

}
