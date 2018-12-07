/**
 * 
 */
package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.pages.BuyerSignInPage;
import com.pages.CreateTenderfromBuyerPage;

import utility.BrowserFactory;

public class VerifyCreateTenderfromBuyer 
{
	
	WebDriver driver;
	
	@Test
	public void createTenderbyBuyer() throws Exception
	{
		
		//Start the browser.
		driver=BrowserFactory.startBrowser("chrome","http://brewbroker-react.herokuapp.com");
		Reporter.log("Browser launched");
		
		/*====================================================login BrewBroker Buyer ===================================================================*/
		
		//Created Page Object using Page Factory for Login.
		BuyerSignInPage signin=PageFactory.initElements(driver, BuyerSignInPage.class);
		
		/*===========================Buyer Login====================================================*/
		signin.clickonLoginhomepage();	
		Reporter.log("Login form opened");
		signin.enterEmail("ashishbuyeruser@yopmail.com");
		signin.enterPassword("@Test1234");
		signin.clickLoginButton();		
		Thread.sleep(3000);
		Reporter.log("Buyer logged in to brewbroker");
		CreateTenderfromBuyerPage tender=PageFactory.initElements(driver, CreateTenderfromBuyerPage.class);
		
		/*===========================Step One ====================================================*/
		Thread.sleep(2000); tender.newTender(); Thread.sleep(2000);
		Thread.sleep(2000); tender.nameOfTender(); Thread.sleep(1000);
		Thread.sleep(2000); tender.descriptionTender(); Thread.sleep(1000);
		Thread.sleep(2000); tender.tellUsMore(); Thread.sleep(1000);
		Thread.sleep(2000); tender.supplierCommunication(); Thread.sleep(1000);
		Thread.sleep(2000); tender.contractTypeQuarterly(); Thread.sleep(1000);
		Thread.sleep(2000); tender.submitQuoteBy(); Thread.sleep(1000);
		Thread.sleep(2000); tender.deliverContractBy(); Thread.sleep(1000);
		Reporter.log("Step one tender details are filled");
		Thread.sleep(1000); tender.nextForm();  Thread.sleep(3000);
		
		/*============================================ Step Two ==============================================*/
		Reporter.log("Buyer moved to step two create tender");
		tender.Ales(); Thread.sleep(1000);
		tender.beerStyle(); Thread.sleep(1000);
		tender.Brandname(); Thread.sleep(1000);
		tender.descripTion(); Thread.sleep(1000);
		tender.ABV(); Thread.sleep(1000);
		tender.spRequirement(); Thread.sleep(1000);
		tender.finish(); Thread.sleep(1000);
		tender.volume_ales(); Thread.sleep(1000);
		tender.container_type(); Thread.sleep(1000);
		tender.size_type(); Thread.sleep(1000); 
		tender.color_type(); Thread.sleep(1000);
		tender.shelflife_type(); Thread.sleep(1000);
		tender.labelling_type(); Thread.sleep(1000);
		tender.case_type(); Thread.sleep(1000);
		tender.case_size(); Thread.sleep(1000);
		tender.Necklabel(); Thread.sleep(1000);
		tender.continue_step_three(); Thread.sleep(1000);
		
		/*=================================Step Four=========================================================================*/
		Reporter.log("Create tender step four buyer moved");
		Thread.sleep(2000); tender.duty(); Thread.sleep(2000);
		tender.duty_continue(); Thread.sleep(2000);
		Reporter.log("Buyer completed create tender step four");
	
		
		/*====================================Step Five========================================================================*/
		tender.arrange_collection(); Thread.sleep(1000); 
		tender.storage_click(); Thread.sleep(1000); 
		tender.ambient_click(); Thread.sleep(1000); 
		tender.duration_click(); Thread.sleep(1000); 
		tender.stepfive_sontinue(); Thread.sleep(2000);
		Reporter.log("create tender step five complted");
		
		/*===============================================Step Six==================================================================*/
		Reporter.log("Buyer moved create tender step six");
		tender.standards(); Thread.sleep(1000); 
		tender.qualifications(); Thread.sleep(1000); 
		tender.stepsix_continue(); Thread.sleep(1000); 
		Reporter.log("Create tender step six completed");
		
		/*================================================Step Seven=====================================================*/		
		Thread.sleep(2000); tender.continue_step_seven();Thread.sleep(2000);
		Reporter.log("create tender step seven completed");
		
		/*================================================Step Eight=====================================================*/	
		Thread.sleep(2000); tender.Select_all(); Thread.sleep(1000); 
		tender.submitTender();Thread.sleep(4000);
		Reporter.log("Buyer created the tender successfully");
	}
	@AfterClass
	public void teardown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
}
