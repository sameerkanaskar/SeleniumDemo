package com.mystore.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
import org.openqa.selenium.support.ui.Select;
 

public class AccountCreationDetails {
	
WebDriver ldriver;
	
	
	public AccountCreationDetails (WebDriver rdriver) {
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this );
		
	}

	//Identify WebElements titile
	@FindBy(id= "id_gender1")
	WebElement title;
	
	@FindBy(xpath="//input[@id='name' and @data-qa='name']")
			WebElement enteredName;
	@FindBy(xpath="//input[@id='email' and @data-qa='email']")
	WebElement enteredMail;
	
	@FindBy(id="password")
	WebElement password;
	//dob
	@FindBy(id="days")
	WebElement day;
	@FindBy(id="months")
	WebElement month;
	@FindBy(id="years")
	WebElement year;
	
	@FindBy(xpath="//input[@type='checkbox' and @id='newsletter']")
	WebElement chkbox1;
	
	@FindBy(xpath="//input[@type='checkbox' and @id='optin']")
	WebElement chkbox2;
	
	//Address information
	@FindBy(id="first_name")
	WebElement first_name;
	@FindBy(id="last_name")
	WebElement last_name;
	@FindBy(id="company")
	WebElement company;
	
	@FindBy(id="address1")
	WebElement address1;
	
	@FindBy(id="address2")
	WebElement address2;
	
	@FindBy(id="country")
	WebElement country;
	
	
	@FindBy(id="state")
	WebElement state;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="zipcode")
	WebElement zipcode;
	

	@FindBy(id="mobile_number")
	WebElement mob_no;
	
	//Create Account
	@FindBy(xpath="//button[@type='submit' and @data-qa='create-account']")
	WebElement create_account;
	
	//public void YourPage(WebDriver driver) {
      //  this.ldriver = driver;}
	//identify action on web element
	   public void selectTitle()
	    {
		   title.click();
		
	    }
	     /*public String getEnteredName()
	     {
	    	
	    	 //String entrdName=enteredName.getText();
	    	 //return entrdName;
	    	 String entrdName;
	    	 //String entrdName=enteredName.getText();
	    	 if (enteredName != null && enteredName.isDisplayed()) {
	    	   entrdName =enteredName.getText(); 
	    	 return entrdName;}
			
	     }*/
	  /* public String getEnteredName() {
		    String entrdName = null;

		    if (enteredName != null && enteredName.isDisplayed()) {
		        entrdName = enteredName.getText();
		    }

		    if (entrdName != null && !entrdName.isEmpty()) {
		        return entrdName;
		    } else {
		        // Handle the case where the entered name couldn't be retrieved
		        throw new NoSuchElementException("Unable to retrieve entered name.");
		    }
		}

	     public String getEnteredMail()
	     {
	    	// WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(20));
	         //WebElement enteredMail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	    	 String entrdMail=enteredMail.getText();
	    	 System.out.println("Mail is "+entrdMail);
	    	 return entrdMail;
	     }*/
	   
	    public void enterPassword(String pass)
	    {
		    password.sendKeys(pass);
		  
	    }
	
	    public void enterDay(String dayval)
	    {
         Select obj =new Select(day);
         obj.selectByVisibleText(dayval);
	    }
	    public void enterMonth(String monthval)
	    {
         Select obj =new Select(month);	
         obj.selectByVisibleText(monthval);
	    }
	    public void enterYear(String yearval)
	    {
         Select obj =new Select(year);	
         obj.selectByVisibleText(yearval);
	    }
	    
	    public void selectChkbox1()
	    {
	    	chkbox1.click();
		
	    }
	    public void selectChkbox2()
	    {
	    	chkbox2.click();
		
	    }
	    
	    public void enterName(String fname)
	    {
	    	first_name.sendKeys(fname);
		  
	    }
	    public void enterLastName(String lname)
	    {
	    	last_name.sendKeys(lname);
		  
	    }
	    public void enterCompanyName(String cmpny)
	    {
	    	company.sendKeys(cmpny);
		  
	    }
	    
	    public void enterAddress(String addr1)
	    {
	    	address1.sendKeys(addr1);
		  
	    }
	    public void enterAddress2(String addr2)
	    {
	    	address2.sendKeys(addr2);
		  
	    }
	    public void enterCountry(String cntry)
	    {
         Select obj =new Select(country);
         obj.selectByVisibleText(cntry);
	    }
	    
	    public void enterState(String stte)
	    {
	    	state.sendKeys(stte);
		  
	    }
	    
	    public void enterCity(String cityy)
	    {
	    	city.sendKeys(cityy);
		  
	    }
	    public void enterZipcode(String zip)
	    {
	    	zipcode.sendKeys(zip);
		  
	    }
	    public void enterMobNo(String mob)
	    {
	    	mob_no.sendKeys(mob);
		  
	    }
	    public void selectCreateAccount()
	    {
	    	create_account.click();
		
	    }
	    
	    
	    
}
