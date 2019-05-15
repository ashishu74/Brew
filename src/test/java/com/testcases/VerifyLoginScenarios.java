<<<<<<< HEAD
package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.pages.CreateLoginscenarios;
import utility.BrowserFactory;

public class VerifyLoginScenarios {
=======
	package com.testcases;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;
	import com.pages.CreateLoginscenarios;
	import utility.BrowserFactory;
	
	public class VerifyLoginScenarios {
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	WebDriver driver;

	@Test
	public void loginScenarios() throws Exception {
<<<<<<< HEAD

		driver = BrowserFactory.startBrowser("chrome", "https://brewbroker-react.herokuapp.com");

		CreateLoginscenarios log = PageFactory.initElements(driver, CreateLoginscenarios.class);

		log.noEmailPassword();

		Thread.sleep(1000);
		log.onlyEmail();

		Thread.sleep(1000);
		log.onlypassword();

		Thread.sleep(1000);
		log.invalidEmail();

		// log.incorrectcredentials();

		Thread.sleep(1000);
		log.correctcredentials();

	}

=======
		
		driver = BrowserFactory.startBrowser("chrome", "https://brewbroker-react.herokuapp.com");
		
		CreateLoginscenarios log = PageFactory.initElements(driver, CreateLoginscenarios.class);
		
		log.noEmailPassword(); 
		
		Thread.sleep(1000); log.onlyEmail(); 
		
		Thread.sleep(1000); log.onlypassword();
		
		Thread.sleep(1000); log.invalidEmail();	
		
		//log.incorrectcredentials();
		
		Thread.sleep(1000); log.correctcredentials(); 
			
	}
	
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}
<<<<<<< HEAD
}
=======
	}
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
