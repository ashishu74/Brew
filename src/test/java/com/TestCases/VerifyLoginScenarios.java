	package com.testcases;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;
	import com.pages.CreateLoginscenarios;
	import utility.BrowserFactory;
	
	public class VerifyLoginScenarios {
	WebDriver driver;

	@Test
	public void loginScenarios() throws Exception {
		driver = BrowserFactory.startBrowser("chrome", "https://brewbroker-react.herokuapp.com");
		
		CreateLoginscenarios log = PageFactory.initElements(driver, CreateLoginscenarios.class);
		
		log.noEmailPassword(); 
		
		Thread.sleep(1000); log.onlyEmail(); 
		
		Thread.sleep(1000); log.onlypassword();
		
		Thread.sleep(1000); log.invalidEmail();	
		
		// log.incorrectcredentials();
		
		Thread.sleep(1000); log.correctcredentials(); 
			
	}
	
	@AfterClass
	public void tearDown() throws Exception {
	Thread.sleep(2000);
	driver.quit();
	}
	}
