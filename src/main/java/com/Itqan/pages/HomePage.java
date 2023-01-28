package com.Itqan.pages;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Itqan.base.TestBase;




public class HomePage extends TestBase {

	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	
	// inspecting elements so the user can navigate to Signup Page
	
	@FindBy(xpath ="//span[text()='Account']")

	WebElement account;
	
	@FindBy(xpath ="//a[contains(text(),'Register')]")

	WebElement signuplink;
	
	
	
	public  void navigateToHomePage(){
		
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
	}
		 
	
public String  navigateToSignupPage() throws AWTException {
	
	
	// navigating to home page using URL defined in properties file
	
	navigateToHomePage();
	
	// navigating to Signup Page
	
	account.click();
	signuplink.click();
	
	return driver.getTitle();
	


}
}
