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
	
	signin.enterEmail("ashishsupplier01@yopmail.com");
	signin.enterPassword("@Test1234");
	signin.clickLoginButton();		
	
	Reporter.log("Supplier logged in to review recipe");
	
	
	//driver.get("http://brewbroker-react.herokuapp.com/create-tender");
	
	/*======================================= Step One ==============================================================*/
	
	Reporter.log("Supplier moved to dashboard");
	
	CreateRecipeFinalCostSupplierPage recipe = PageFactory.initElements(driver, CreateRecipeFinalCostSupplierPage.class);
	recipe.Received_tender(); 
	recipe.ActiveTender();
	recipe.SubmitFinalCost(); 
	Reporter.log("Supplier added ingredients cost");
	
	recipe.TotalCost(); 
	Reporter.log("Supplier added total cost in milestone");
	
	recipe.AddYourComment(); 
	Reporter.log("Supplier added comments");
	
	recipe.SendToBuyer(); 
	Reporter.log("Supplier sent the recipe back to buyer successfully");
}
	
	@AfterClass
	public void teardown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

}
