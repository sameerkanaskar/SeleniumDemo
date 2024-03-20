package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexLoginPage {
	
	WebDriver ldriver;
	
	
	public IndexLoginPage (WebDriver rdriver) {
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this );
		
	}

	//Identify WebElements
	@FindBy(linkText= "Signup / Login")
	WebElement login;
	
	//identify action on web element
	public void clickOnSignup_login()
	{
		login.click();
	}
	
}
