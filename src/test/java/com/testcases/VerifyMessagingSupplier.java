	package com.testcases;	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;
	import com.pages.BuyerSignInPage;
	import com.pages.CreateMessagingSupplier;
	import utility.BrowserFactory;
	
	public class VerifyMessagingSupplier {
	WebDriver driver;
	
	@Test(priority=2)
	public void messagingSupplier() throws Exception {
		
		driver=BrowserFactory.startBrowser("chrome","http://brewbroker-react.herokuapp.com");
		Reporter.log("Browser launched");
		
		BuyerSignInPage signin=PageFactory.initElements(driver, BuyerSignInPage.class);
		
		signin.clickonLoginhomepage();	
		Reporter.log("Login form opened");
		signin.enterEmail("vineeshbehl@yopmail.com");
		signin.enterPassword("@Test1234");
		signin.clickLoginButton();		
		Reporter.log("Supplier logged in to brewbroker");
		
		CreateMessagingSupplier message = PageFactory.initElements(driver, CreateMessagingSupplier.class);
		
		message.messagingSupplier(); 
		
	}	
		@AfterClass
		public void tearDown() throws Exception {
			Thread.sleep(2000); driver.close();
		}
}
