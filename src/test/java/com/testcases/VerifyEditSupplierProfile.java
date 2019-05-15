<<<<<<< HEAD
package com.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.pages.BuyerSignInPage;
import com.pages.CreateEditSupplierPage;
import utility.BrowserFactory;

public class VerifyEditSupplierProfile {
	WebDriver driver;

	@Test
	public void EditSupplierPage() throws Exception {

		driver = BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
		driver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);

		BuyerSignInPage signin = PageFactory.initElements(driver, BuyerSignInPage.class);

		signin.clickonLoginhomepage();

		signin.enterEmail("vineeshbehl@yopmail.com");
		signin.enterPassword("@Test1234");
		signin.clickLoginButton();
		Reporter.log("Supplier logged in to his account");

		CreateEditSupplierPage edit = PageFactory.initElements(driver, CreateEditSupplierPage.class);

		edit.SupplierProfile();
		edit.SummaryEdit();
		edit.SummaryEditTextField();
		edit.saveUpdatedSummary();
		Reporter.log("Supplier profile summary edited");

		edit.EditStandard();
		edit.Standard();
		edit.Qualification();
		edit.Standard();
		edit.Qualification();
		edit.SaveStandardQualification();
		Reporter.log("Supplier profile standards qualification edited");

		edit.EditAwards();
		edit.deleteAward();
		edit.addAward();
		edit.SaveAward();
		Reporter.log("Supplier profile awards edited");

		edit.EditServices();
		edit.ChooseServices();
		edit.ChooseServices();
		edit.saveService();
		Reporter.log("Supplier profile services edited");

		edit.EditLogistics();
		edit.ChooseLogistics();
		edit.saveLogistics();
		Reporter.log("Supplier profile logistics edited");

		edit.ProfileEdit();
		edit.CompanyProfile();
		edit.SaveProfile();
		Reporter.log("Supplier profile company field edited");

		edit.AnnualCapacityEdit();
		Reporter.log("Supplier profile annual brew length edited");

		edit.EditOrderVolume();
		Reporter.log("Supplier profiles min/max brew length edited");

		edit.EditStyles();
=======
	package com.testcases;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;
	import com.pages.BuyerSignInPage;
	import com.pages.CreateEditSupplierPage;
	import utility.BrowserFactory;
	
	public class VerifyEditSupplierProfile {
	WebDriver driver;
	
	@Test
	public void EditSupplierPage() throws Exception {
	
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
		driver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);
		
		BuyerSignInPage signin=PageFactory.initElements(driver, BuyerSignInPage.class);
		
		signin.clickonLoginhomepage();	
		
		signin.enterEmail("vineeshbehl@yopmail.com"); 
		signin.enterPassword("@Test1234"); 
		signin.clickLoginButton(); 
		Reporter.log("Supplier logged in to his account");
		
		CreateEditSupplierPage edit= PageFactory.initElements(driver, CreateEditSupplierPage.class);
		
		edit.SupplierProfile(); 
		edit.SummaryEdit(); 
		edit.SummaryEditTextField(); 
		edit.saveUpdatedSummary(); 
		Reporter.log("Supplier profile summary edited");
		
		edit.EditStandard(); 
		edit.Standard(); 
		edit.Qualification(); 
		edit.Standard(); 
		edit.Qualification(); 
		edit.SaveStandardQualification(); 
		Reporter.log("Supplier profile standards qualification edited");
		
		edit.EditAwards(); 
		edit.deleteAward(); 
		edit.addAward(); 
		edit.SaveAward(); 
		Reporter.log("Supplier profile awards edited");
		
		edit.EditServices(); 
		edit.ChooseServices(); 
		edit.ChooseServices(); 
		edit.saveService(); 
		Reporter.log("Supplier profile services edited");
		
		edit.EditLogistics(); 
		edit.ChooseLogistics(); 
		edit.saveLogistics(); 
		Reporter.log("Supplier profile logistics edited");
		
		edit.ProfileEdit(); 
		edit.CompanyProfile();
		edit.SaveProfile(); 
		Reporter.log("Supplier profile company field edited");
		
		edit.AnnualCapacityEdit(); 
		Reporter.log("Supplier profile annual brew length edited");
		
		edit.EditOrderVolume(); 
		Reporter.log("Supplier profiles min/max brew length edited");
		
		edit.EditStyles(); 
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Reporter.log("Supplier profiles styles edited");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Edit supplier profile script executed");
		System.out.println("------------------------------------------------------------------------------------");
<<<<<<< HEAD

	}

	@AfterClass
	public void teardown() throws Exception {
		//driver.close();
=======
		 
}
	@AfterClass
	public void teardown() throws Exception {
		driver.close();
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	}
}