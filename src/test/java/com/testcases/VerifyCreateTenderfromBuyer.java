	package com.testcases;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;
	import com.pages.BuyerSignInPage;
	import com.pages.CreateTenderfromBuyerPage;	
	import utility.BrowserFactory;
	
	public class VerifyCreateTenderfromBuyer {
	
	WebDriver driver;
	
	@Test(priority=2)
	public void createTenderbyBuyer() throws Exception {
		driver=BrowserFactory.startBrowser("chrome","http://brewbroker-react.herokuapp.com");
		Reporter.log("Browser launched");
		
		BuyerSignInPage signin=PageFactory.initElements(driver, BuyerSignInPage.class);
		
		signin.clickonLoginhomepage();	
		Reporter.log("Login form opened");
		signin.enterEmail("deepakkumar@yopmail.com");
		signin.enterPassword("@Test1234");
		signin.clickLoginButton();		
		Reporter.log("Buyer logged in to brewbroker");
		
		
		CreateTenderfromBuyerPage tender=PageFactory.initElements(driver, CreateTenderfromBuyerPage.class);
		
		tender.newTender(); 
		tender.nextForm(); 
		tender.nameOfTender(); 
		tender.descriptionTender(); 
		tender.tellUsMore();
		tender.supplierCommunication(); 
		tender.contractTypeOneOff(); 
		tender.submitQuoteBy();
		tender.deliverContractBy();
		Reporter.log("Step one tender details are filled");
		tender.nextForm();  
		
		Reporter.log("Buyer moved to step two create tender");
		tender.continue_step_three(); 
		tender.Ales(); 
		tender.beerStyle(); 
		tender.Brandname(); 
		tender.descripTion(); 
		tender.ABV(); 
		tender.spRequirement(); 
		tender.finish(); 
		tender.volume_ales(); 
		tender.container_type(); 
		tender.size_type();  
		tender.color_type(); 
		tender.shelflife_type(); 
		tender.labelling_type(); 
		tender.case_type(); 
		tender.case_size(); 
		tender.Necklabel(); 
		tender.continue_step_three(); 
		
		Reporter.log("Create tender step four buyer moved");
		tender.duty(); 
		tender.duty_continue(); 
		Reporter.log("Buyer completed create tender step four");
	
		tender.arrange_collection();  
		tender.storage_click();  
		tender.ambient_click();  
		tender.duration_click();  
		tender.stepfive_sontinue(); 
		Reporter.log("create tender step five complted");
		
		Reporter.log("Buyer moved create tender step six");
		tender.standards();  
		tender.qualifications();  
		tender.stepsix_continue();  
		Reporter.log("Create tender step six completed");
		
		tender.continue_step_seven();
		Reporter.log("create tender step seven completed");
	 
		tender.submitTender();Thread.sleep(4000);
		Reporter.log("Buyer created the tender successfully");
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Tender created successfully");
	}
	
	@Test (priority=2)
	public void scriptPassedorFailed() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div/input")));
		boolean status = element.isDisplayed();
		if (status) {
			System.out.println("===== Tender create script passed ======");
			System.out.println("--------------------------------------------------------------------------");
		} else {
			System.out.println("===== Tender created script failed ======");
			System.out.println("--------------------------------------------------------------------------");
		}
		
	}

	@AfterClass
	public void teardown() throws Exception {
		driver.close();
	} 
	
}
