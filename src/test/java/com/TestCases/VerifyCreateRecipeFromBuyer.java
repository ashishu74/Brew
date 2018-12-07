package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.pages.BuyerSignInPage;
import com.pages.CreateProvideRecipeBuyerPage;

import utility.BrowserFactory;

public class VerifyCreateRecipeFromBuyer {
	
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
	Reporter.log("Buyer logged in to his account to create recipe");

	//driver.get("http://brewbroker-react.herokuapp.com/create-tender");
	CreateProvideRecipeBuyerPage recipe = PageFactory.initElements(driver, CreateProvideRecipeBuyerPage.class);
	/*======================================= Step One ==============================================================*/
	Thread.sleep(2000); recipe.ClickTender(); Thread.sleep(2000); 
	Thread.sleep(2000); recipe.clickStatus();Thread.sleep(2000); 
	Thread.sleep(2000); recipe.approveAndProvideRecipe(); Thread.sleep(2000); 
	Reporter.log("Buyer clicked on approve and provide recipe");
	/*===========================================Step Two ================================================================*/
	Thread.sleep(2000); recipe.textMethodsInstructions(); Thread.sleep(2000); 
	Reporter.log("Buyer added methods and instructions");
	Thread.sleep(2000); recipe.SendToSupplier(); Thread.sleep(2000); 
	Reporter.log("Buyer sent recipe to supplier successfully");
	
	}
	@AfterClass
	public void teardown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	}
