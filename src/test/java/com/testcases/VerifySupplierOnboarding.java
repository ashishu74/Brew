	package com.testcases;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
	import com.pages.CreateSupplierOnboarding;
	import utility.BrowserFactory;
	
	public class VerifySupplierOnboarding {
	WebDriver driver;
	
	@Test
	public void createSupplier() throws Exception
	{
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com/register");
		CreateSupplierOnboarding supp = PageFactory.initElements(driver, CreateSupplierOnboarding.class);
		supp.supplierRadio();
		supp.FirstName(); 
		supp.SurName(); 
		supp.Company(); 
		supp.EmailAddress(); 
		supp.telephoneNumber();
		supp.Password(); 
		Reporter.log("Supplier filled form one general information");
		supp.ContinueOne(); 
		//-----------------------------------------------Step 2---------------------------------------------//
		supp.continu();
		supp.CompanyAddress();
		
		Reporter.log("Supplier filled form two addess");
		supp.ContinueTwo(); 
		//----------------------------------------------------Step3---------------------------------------//
		supp.BrewingServices(); 
		supp.StylesBrewing(); 
		supp.BreweryVisit(); 
		Reporter.log("Supplier filled Brewing services and brewing styles");
		supp.ContinueThree(); 
		//--------------------------------------------------------Step 4-----------------------------------------//
		supp.AnnualCapacity(); 
		supp.MinimumBrewLength(); 
		supp.MaximumBrewLength(); 
		supp.ContractBuyers();
		supp.FaciltateBrews(); 
		Reporter.log("Supplier filled Annual capacity, min/max brew length");
		supp.ContinueFour(); 
		//------------------------------------------------------------Step 5---------------------------------------//
		supp.OnsiteBottling(); 
		supp.BottleThirdParty(); 
		supp.detailsbottle(); 
		supp.CanningOnSite(); 
		supp.CanningThirdParty(); 
		supp.detailCanning(); 
		supp.KegsOnsite(); 
		supp.KegsThirdParty(); 
		supp.detailsKegs(); 
		supp.CasksOnSite(); 
		supp.CasksThirdParty(); 
		supp.detailscasks(); 
		supp.BulkContainer(); 
		supp.detailsBulkcontainer(); 
		Reporter.log("Supplier has chosen various onsite packaging and 3rd pary supplier");
		supp.continueFive(); 
		//------------------------------------------------------------Step 6-----------------------------------------//
		supp.OfferDelivery(); 
		supp.WarehousingServices(); 
		supp.Ambient();
		supp.ColdStorage();
		supp.BondedStorage(); 
		Reporter.log("Supplier has chosen delivery and warehousing services");
		supp.ContinueSix(); 
		//---------------------------------------------------------Step 7---------------------------------------------//
		supp.HMRCRegisterationNumber(); 
		supp.ClassABulkBeer(); 
		Reporter.log("Supplier has given his registration number and class cerificate");
		supp.ContinueSeven(); 
		//--------------------------------------------------------Step 8-----------------------------------------------//
		supp.Standard(); 
		supp.Qualifications(); 
		supp.Awards(); 
		Reporter.log("Supplier has created standards and qualifications");
		supp.ContinueEight(); 
		
		//-----------------------------------------------------------Step 9----------------------------------------------//
		supp.SummaryBusiness(); 
		Reporter.log("Supplier added summary business");
		supp.ContinueNine(); 
		//---------------------------------------------------------Step 10--------------------------------------------------//
		supp.SkipTen();
		Reporter.log("Supplier account created successfully");
	
	}
	
	@AfterTest
	public void teardown() {
		//driver.close();
	}
}
