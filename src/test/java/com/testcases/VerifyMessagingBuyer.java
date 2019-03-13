	package com.testcases;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;
	import com.pages.BuyerSignInPage;
	import com.pages.CreateMessagingBuyer;
	import utility.BrowserFactory;
	
	public class VerifyMessagingBuyer {
	WebDriver driver;
	
	@Test(priority=2)
	public void messagingBuyer() throws Exception {
		
		driver=BrowserFactory.startBrowser("chrome","http://brewbroker-react.herokuapp.com");
		Reporter.log("Browser launched");
		
		BuyerSignInPage signin=PageFactory.initElements(driver, BuyerSignInPage.class);
		
		signin.clickonLoginhomepage();	
		Reporter.log("Login form opened");
		signin.enterEmail("deepakkumar@yopmail.com");
		signin.enterPassword("@Test1234");
		signin.clickLoginButton();		
		Reporter.log("Buyer logged in to brewbroker");
		
		
		CreateMessagingBuyer message = PageFactory.initElements(driver, CreateMessagingBuyer.class);
		
		message.messagingBuyer(); 
		
	}	
		@AfterClass
		public void tearDown() {
			driver.close();
		}
	}
