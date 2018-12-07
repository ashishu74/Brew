package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.pages.BuyerSignInPage;
import com.pages.CreateQuoteSupplierPage;
import utility.BrowserFactory;

public class VerifyCreateQuoteFromSupplier {
	
	WebDriver driver;
	@Test
	public void createQuotebySupplier() throws Exception
	{
	
	//Start the browser.
	driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
	//driver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);
	
	/*====================================================login BrewBroker Buyer ===================================================================*/
	
	//Created Page Object using Page Factory for Login.
	BuyerSignInPage signin=PageFactory.initElements(driver, BuyerSignInPage.class);
	
	/*===========================Supplier Login====================================================*/
	signin.clickonLoginhomepage();	
	
	signin.enterEmail("ashishsupplieruser@yopmail.com");
	signin.enterPassword("@Test1234");
	signin.clickLoginButton();		
	Thread.sleep(3000);
	Reporter.log("Supplier member logged in to account");
	
	CreateQuoteSupplierPage quote=PageFactory.initElements(driver, CreateQuoteSupplierPage.class);
	/*======================================= Step One ==============================================================*/
	
	Reporter.log("Supplier member moved to dashboard page");
	Thread.sleep(3000); quote.toreview_tender(); Thread.sleep(3000);
	/* ================================================ Step Two ==================================================== */
	Thread.sleep(3000); quote.createquote_allrequirement(); Thread.sleep(3000);
	
	/*quote.selectCountry(); Thread.sleep(4000);
	quote.bankName(); Thread.sleep(4000);
	quote.shortCode(); Thread.sleep(4000);
	quote.accountNumber(); Thread.sleep(4000);
	quote.legalNameCompany(); Thread.sleep(4000);
	quote.companyRegistrationNumber(); Thread.sleep(4000);
	quote.addressLineOne(); Thread.sleep(4000);
	quote.addressLineTwo(); Thread.sleep(4000);
	quote.addressLineThree(); Thread.sleep(4000);
	quote.townCity(); Thread.sleep(4000);
	quote.postalCode(); Thread.sleep(4000);
	quote.businessOwnerFname(); Thread.sleep(4000);
	quote.businessOwnerLname(); Thread.sleep(4000);
	quote.DOB(); Thread.sleep(4000);
	quote.businessAddressLineOne(); Thread.sleep(4000);
	quote.businessAddressLineTwo(); Thread.sleep(4000);
	quote.businessAddressLineThree(); Thread.sleep(4000);
	quote.businessCity(); Thread.sleep(4000);
	quote.postCode(); Thread.sleep(5000);
	//quote.save(); Thread.sleep(4000);
	*/
	/*============================================ Step Three ===========================================================*/
	
	Thread.sleep(3000); quote.Price_unit(); Thread.sleep(3000); 
	Thread.sleep(3000); quote.Estimated_total_cost(); Thread.sleep(3000); 
	Thread.sleep(3000); quote.warehousing_cost(); Thread.sleep(2000);
	Reporter.log("Supplier added warehousing cost");
	Thread.sleep(3000); quote.comments_to_buyer(); Thread.sleep(2000);
	Reporter.log("Supplier added comments ");
	Thread.sleep(2000); quote.submit_quote(); Thread.sleep(3000);
	Reporter.log("Supplier created quote successfully");
	
}
	@AfterClass
	public void teardown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
}

