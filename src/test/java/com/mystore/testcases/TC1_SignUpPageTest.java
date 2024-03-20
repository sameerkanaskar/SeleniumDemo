package com.mystore.testcases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.*;

import com.mystore.pageobject.AccountCreationDetails;
import com.mystore.pageobject.CreatedAccount;
import com.mystore.pageobject.IndexLoginPage;
import com.mystore.pageobject.SignUp;

//import junit.framework.Assert;

public class TC1_SignUpPageTest extends BaseClass{
	
	@Test(enabled=false)
	public void verifyRegistrationLogin()
	{
		
		driver.get(url);
		logger.info("url opened");
		
		IndexLoginPage ilp=new IndexLoginPage(driver);
		ilp.clickOnSignup_login();
		logger.info("Clicked on signup/login ");
		SignUp signup=new SignUp(driver);
		
		signup.enterName("sam4560");
		logger.info("Name entered ");
		signup.enterEmailAddress("sspgfm@gmafiu10.com");
		logger.info("Mail entered ");
		signup.clickOnSignup();
		logger.info("Clicked on signup button ");
		
		AccountCreationDetails acd=new  AccountCreationDetails(driver);
		
		acd.selectTitle();
		/*String  enteredName=acd.getEnteredName();
		String enteredMail=acd.getEnteredMail();
		//Assert.assertEquals("sam4560", enteredName);
		//Assert.assertEquals("sam@gmai23001.com", enteredMail);
		logger.info("Entered Name is "+enteredName+"Entered mail is "+enteredMail);
		System.out.println("Entered Name is "+enteredName+"Entered mail is "+enteredMail);*/
		acd.enterPassword("aa12345");
		acd.enterDay("14");
		acd.enterMonth("July");
		acd.enterYear("2020");
		acd.selectChkbox1();
		acd.selectChkbox2();
		acd.enterName("Don");
		acd.enterLastName("Surya");
		acd.enterCompanyName("AE");
		acd.enterAddress("Balewadi");
		acd.enterAddress2("Pune 410456");
		acd.enterCountry("Israel");
		acd.enterState("Hattta");
		acd.enterCity("KKK");
		acd.enterZipcode("897654");
		acd.enterMobNo("9098765567");
		logger.info("Mob no  entered ");
		acd.selectCreateAccount();
		logger.info("Clicked on Create Account button ");
		
		CreatedAccount crt=new CreatedAccount(driver);
		String msg=crt.checkAccountCreated();
		crt.clickOnContinue();
		/* After submitting the form
		Alert alert = driver.switchTo().alert();

		// Get the text of the alert
		String alertText = alert.getText();

		// Perform actions on the alert (accept, dismiss, etc.)
		//alert.accept();
		 
		 alert.dismiss();*/

		
		Assert.assertEquals("ACCOUNT CREATED!",msg);
		logger.info("Successfully Account Created ");
		
		
	}
	
	@Test 
	public void verifyLogin() throws IOException
	{
		driver.get(url);
		logger.info("url opened");
		
		logger.info("verifyLogin TC execution started");
		IndexLoginPage ilp=new IndexLoginPage(driver);
		ilp.clickOnSignup_login();
		logger.info("Clicked on signup/login ");
		SignUp login=new SignUp(driver);
		
		 login.enterEmailAdd_Login("spgfm@gmafiu10.com");
		 logger.info("Email entered ");
		 login.enterPassword("12345");
		 logger.info("Password entered ");
		 login.clickOnLogin();
		 
		 CreatedAccount crtt=new CreatedAccount(driver);
			String userName=crtt.checkUserName();
			logger.info(" UserName"+userName);
			 if(userName.equals("sam4560"))
			 {
				 
			logger.info(" verifyLogin---Passed ");
			Assert.assertTrue(true);
			
			 }
			 
			 else {
				 logger.info(" verifyLogin---Failed ");
				 captureScreenShot(driver,"verifyLogin");
				 Assert.assertTrue(false);
			 }
	}

}
