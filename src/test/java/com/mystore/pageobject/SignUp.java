package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {

WebDriver ldriver;
	
	
	public SignUp (WebDriver rdriver) {
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this );
		
	}

	//Identify WebElements
	@FindBy(name= "name")
	WebElement name;
	@FindBy(xpath = "//input[@type='email' and @data-qa='signup-email']")
	WebElement email;
	
	@FindBy(xpath = "//button[@type='submit' and @data-qa='signup-button']")
     WebElement signUpButton;
	
	@FindBy(xpath = "//input[@type='email' and @data-qa='login-email']")
	WebElement regemail;	
	@FindBy(xpath = "//input[@type='password' and @data-qa='login-password']")
	WebElement password;	
	@FindBy(xpath = "//button[@type='submit' and @data-qa='login-button']")
	WebElement loginbutton;
	
	
	//identify action on web element
	public void enterName(String entername)
	{
		name.sendKeys(entername);
	}
	
	public void enterEmailAddress(String emailAdd)
	{
		email.sendKeys(emailAdd);
	}
	
	public void clickOnSignup()
	{
		signUpButton.click();
	}
	
	public void enterEmailAdd_Login(String emailadd)
	{
		regemail.sendKeys(emailadd);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickOnLogin()
	{
		loginbutton.click();
	}
	
	
}
