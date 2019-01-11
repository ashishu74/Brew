package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.pages.BuyerSignInPage;
import com.pages.CreateFinalizeQuoteBuyerPage;

import utility.BrowserFactory;

public class VerifyFinalizeQuoteBuyer {
 
	WebDriver driver;
	@Test
	public void createRecipebyBuyer() throws Exception
	{
	
	
	//Start the browser.
	driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
	
	
	/*====================================================login BrewBroker Buyer ===================================================================*/
	
	//Created Page Object using Page Factory for Login.
	BuyerSignInPage signin=PageFactory.initElements(driver, BuyerSignInPage.class);
	
	//signup.clickonProfileinfo();
	
	/*===========================Supplier Login====================================================*/
	signin.clickonLoginhomepage();	
	signin.enterEmail("ashishbuyeruser@yopmail.com");
	signin.enterPassword("@Test1234");
	signin.clickLoginButton();		
	Thread.sleep(3000);
	Reporter.log("Buyer logged in to his account");
	
	CreateFinalizeQuoteBuyerPage finz = PageFactory.initElements(driver, CreateFinalizeQuoteBuyerPage.class);
	
	Thread.sleep(2000); finz.ClickFinalizing(); Thread.sleep(1000);
	Thread.sleep(2000); finz.ClickFinalize(); Thread.sleep(1000);
	Thread.sleep(1000); finz.TermsAndConditions(); Thread.sleep(2000);
	Reporter.log("Buyer accepted the terms and conditions");
	
	Thread.sleep(1000); finz.AcceptFinalize(); Thread.sleep(4000);
	Thread.sleep(2000); finz.PayNow(); Thread.sleep(2000); 
	Reporter.log("Buyer accepted and finalized the payement successfully");
	
}
	@AfterClass
	public void teardown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
}
