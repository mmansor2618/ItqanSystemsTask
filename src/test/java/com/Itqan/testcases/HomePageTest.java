package com.Itqan.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Itqan.base.TestBase;
import com.Itqan.pages.HomePage;



public class HomePageTest extends TestBase {

	public HomePageTest() throws IOException {
		super();
		
	}
	
	 HomePage Home;
	 
	 
	 // TestCase of Getting No of Questions
	 
	 @Test (priority = 1)
	 
	 public void NavigatingToSignupPage() throws InterruptedException, IOException, AWTException {
		 

			/*SignupPage SearchPageTest = new SignupPage();
			SearchPageTest.NavigateToHome();*/
		 
			  
			// calling navigate function to navigate to Signup Page
			  
		  String actualResult = String.valueOf(Home.navigateToSignupPage());
				
			
			/* assert steps to assert that
		  the title of the page is matching expected result*/
		  
		  
			String expectedResult = "Create New Customer Account";
		Assert.assertEquals(actualResult, expectedResult,"Title is not the same");
			
			
			
	 }
	
	
		
	 @Parameters({"browser"})
	 @BeforeMethod
	 
	 //Before method and intialize browser 
	 	
	 	public void beforeSetup(String browser) throws IOException, InterruptedException {
	 		
	 		intial(browser);
	 		

	 		
	 		
	 	Home = new HomePage();
	 	}
	 	
	    @AfterMethod
	    
	    // after method to close browser
	 	
	    public void tearDown() throws IOException {
	 	   
			  driver.quit();
			  
			   
		 }
	 	

}
