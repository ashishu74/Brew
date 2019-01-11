package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.pages.BuyerSignInPage;
import com.pages.CreateRecipeFinalCostSupplierPage;
import utility.BrowserFactory;

public class VerifyRecipeTotalCostFromSupplier {
	
	WebDriver driver;
	@Test
	public void RecipeTotalCostSupplier() throws Exception
	{
	
	//Start the browser.
	driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
	
	
	/*====================================================login BrewBroker Buyer ===================================================================*/
	
	//Created Page Object using Page Factory for Login.
	BuyerSignInPage signin=PageFactory.initElements(driver, BuyerSignInPage.class);
	
	//signup.clickonProfileinfo();
	
	/*===========================Supplier Login====================================================*/
	signin.clickonLoginhomepage();	
	
	signin.enterEmail("ashishsupplieruser@yopmail.com");
	signin.enterPassword("@Test1234");
	signin.clickLoginButton();		
	Thread.sleep(3000);
	Reporter.log("Supplier logged in to review recipe");
	
	
	//driver.get("http://brewbroker-react.herokuapp.com/create-tender");
	
	/*======================================= Step One ==============================================================*/
	
	Reporter.log("Supplier moved to dashboard");
	
	CreateRecipeFinalCostSupplierPage recipe = PageFactory.initElements(driver, CreateRecipeFinalCostSupplierPage.class);
	Thread.sleep(1000); recipe.Received_tender(); Thread.sleep(1000);
	Thread.sleep(3000); recipe.SubmitFinalCost(); Thread.sleep(3000);
	Reporter.log("Supplier added ingredients cost");
	
	Thread.sleep(3000); recipe.TotalCost(); Thread.sleep(3000);
	Reporter.log("Supplier added total cost in milestone");
	
	Thread.sleep(3000); recipe.AddYourComment(); Thread.sleep(3000);
	Reporter.log("Supplier added comments");
	
	Thread.sleep(3000); recipe.SendToBuyer(); Thread.sleep(3000);
	Reporter.log("Supplier sent the recipe back to buyer successfully");
}
	@AfterClass
	public void teardown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
}
