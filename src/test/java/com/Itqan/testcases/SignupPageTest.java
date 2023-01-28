package com.Itqan.testcases;


import java.awt.AWTException;
import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Itqan.base.TestBase;
import com.Itqan.pages.SignupPage;
import com.Itqan.pages.HomePage;







public class SignupPageTest extends TestBase {
	
	
	
	
	public SignupPageTest() throws IOException {
		super();
	}
	
	

	
	
	SignupPage Signup;
	



	
	
	@Test (priority = 1)
	 
	public void Signup() throws InterruptedException, IOException, AWTException   {
		

		 HomePage homePageTest = new HomePage();
			homePageTest.navigateToSignupPage();
			
			String actualResulttitle = String.valueOf(Signup.CreatAccount());
			
			String TitleexpectedResult = "My Account";
			Assert.assertEquals(actualResulttitle, TitleexpectedResult,"Title is not the same");

		//assertion to compare current URL with expected result
		
		 String expectedResult ="http://magento-demo.lexiconn.com/customer/account/index/";
		 
		 String actualResult = driver.getCurrentUrl();
			
	Assert.assertEquals(actualResult, expectedResult,"it was failure because the expected result is not http://magento-demo.lexiconn.com/customer/account/index/");
	
	/* assert steps to assert that
	  the title of the page is matching expected result*/
	
	
		
		
	}
	
	
	@Parameters({"browser"})
	@BeforeMethod
	
	//Before method and intialize browser 
 	
	
		public void beforeSetup(String browser) throws IOException {
			
			intial(browser);
			

			
			
		 Signup = new SignupPage();
		}


	
		
	

	
   @AfterMethod
	
   public void tearDown() throws IOException {
	   
	   // after method to close browser
	   
		  driver.quit();
		  
		   
	 }
	  
	
	
	

}
