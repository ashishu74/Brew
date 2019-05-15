	package com.testcases;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;
	import com.pages.BuyerSignInPage;
	import com.pages.CreateRecipeFinalCostSupplierPage;
	import utility.BrowserFactory;
	
	public class VerifyRecipeTotalCostFromSupplierStepFour {
	WebDriver driver;
	
	@Test
	public void RecipeTotalCostSupplier() throws Exception
	{
	
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
		
		BuyerSignInPage signin=PageFactory.initElements(driver, BuyerSignInPage.class);
		signin.clickonLoginhomepage();	
		
		signin.enterEmail("vineeshbehl@yopmail.com");
		signin.enterPassword("@Test1234");
		signin.clickLoginButton();		
		
		Reporter.log("Supplier moved to dashboard");
		
		CreateRecipeFinalCostSupplierPage recipe = PageFactory.initElements(driver, CreateRecipeFinalCostSupplierPage.class); 
		recipe.ActiveTender();
		recipe.General_Comments();
		Reporter.log("Supplier added ingredients cost");
		
		recipe.TotalCost(); 
		Reporter.log("Supplier added total cost in milestone");
		
		Reporter.log("Supplier added comments");
		
		recipe.SendToBuyer(); 
		Reporter.log("Supplier sent the recipe back to buyer successfully");
	}

	@AfterClass
	public void teardown() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}

}
