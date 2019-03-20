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
	
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
		
		BuyerSignInPage signin=PageFactory.initElements(driver, BuyerSignInPage.class);
		
		signin.clickonLoginhomepage();	
		signin.enterEmail("deepakkumar@yopmail.com");
		signin.enterPassword("@Test1234");
		signin.clickLoginButton();		
		
		Reporter.log("Buyer logged in to his account");
		
		CreateFinalizeQuoteBuyerPage finz = PageFactory.initElements(driver, CreateFinalizeQuoteBuyerPage.class);
		
		 finz.ClickFinalizing(); 
		 finz.ClickFinalize(); 
		Reporter.log("Buyer accepted the terms and conditions");
		
		 finz.AcceptFinalize(); 
		Reporter.log("Buyer accepted and finalized the payement successfully");
		
	}
	
	@AfterClass
	public void teardown() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}
}
