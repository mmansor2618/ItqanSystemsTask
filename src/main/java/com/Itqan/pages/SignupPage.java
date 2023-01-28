package com.Itqan.pages;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Itqan.base.TestBase;




public class SignupPage extends TestBase {


public SignupPage() throws IOException {
		
	PageFactory.initElements(driver, this);
	
	
	
	
		
	}



// inspecting elements of Signup page

@FindBy (id = "firstname")
WebElement Firstname;

@FindBy (id = "lastname")
WebElement Lastname;

@FindBy (id = "email_address")
WebElement Emailaddress;

@FindBy (id = "password")

WebElement password;

@FindBy (id = "confirmation")

WebElement Confirmpassword;

@FindBy(xpath ="//span[text()='Register']")

WebElement Register;


public String  CreatAccount() throws AWTException, InterruptedException {
	
	
	/* sending value at the textboxes field
	using data behavior development by getting values from configuration file */
	
	Firstname.sendKeys(prop.getProperty("firstname"));
	
	Lastname.sendKeys(prop.getProperty("lastname"));
	
	Emailaddress.sendKeys(prop.getProperty("emailaddress"));
	
	password.sendKeys(prop.getProperty("password"));
	
	Confirmpassword.sendKeys(prop.getProperty("confirmpassword"));
	
	Register.click();
	return driver.getTitle();
	
	
	
	
	
	
		
	
  
	
 	
}
}





