	package com.pages;
	import java.util.Random;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;

	public class CreateSupplierOnboarding {
	WebDriver driver;

	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/section[2]/div/a")
	@CacheLookup
	WebElement joinnow;
	public void joinNow() {
		joinnow.click();
	}
	//------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"firstname\"]")
	@CacheLookup
	WebElement fname;
	
	public void FirstName() {
		fname.sendKeys("Ashish");
	}
	
	//----------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"lastname\"]")
	@CacheLookup
	WebElement lname;
	
	public void SurName() {
		lname.sendKeys("Kumar");
		
	}
	
	//-----------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"brewery\"]")
	@CacheLookup
	WebElement company;
	
	public void Company() {
		company.sendKeys("ucreate.it");
	}
	
	//-------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"emailId\"]")
	@CacheLookup
	WebElement emailid;
	
	public void EmailAddress() {
		Random randomGenerator = new Random(); 
		int randomInt = randomGenerator.nextInt(1000);  
		emailid.sendKeys("username"+ randomInt +"@mailinator.com"); 
		
	}
	//------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"signup-form\"]/div[1]/label[2]/span")
	@CacheLookup
	WebElement sup;
	
	public void supplierRadio() {
		sup.click();
	}
	//------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"telephone\"]")
	@CacheLookup
	WebElement tel;
	public void telephoneNumber() {
		tel.sendKeys("09876028861");
	}
	
	//---------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"password\"]")
	@CacheLookup
	WebElement password; 
	public void Password() {
	password.sendKeys("@Test1234");	
	}
	
	//-----------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"service3\"]")
	@CacheLookup
	WebElement contractbrewer; 
	public void ContractBrewer() {
	contractbrewer.click();	
	}
	//-----------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"confirm\"]")
	@CacheLookup
	WebElement brewinglicence;  
	
	public void BrewingLicenceConfirm() {
		brewinglicence.click();
	}
	//-----------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"signup-form\"]/div[9]/input")
	@CacheLookup
	WebElement continueone; 
	public void ContinueOne() {
		continueone.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]/div[3]/a[1]")
	@CacheLookup
	WebElement continue2;
	public void continu() {
		continue2.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"address\"]")
	@CacheLookup
	WebElement address;
	@FindBy(how=How.XPATH, using="//*[@id=\"PlacesAutocomplete__autocomplete-container\"]")
	@CacheLookup
	WebElement address1;
	
	public void CompanyAddress() throws Exception {
	address.sendKeys("Glasgow, UK");
	
	}
	//----------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div[1]/div[3]/div/button[2]")
	@CacheLookup
	WebElement continuetwo;
	
	public void ContinueTwo() {
		continuetwo.click();
	}
	// ------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[1]/label")
	@CacheLookup
	WebElement serviceone;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[2]/label")
	@CacheLookup
	WebElement servicetwo;
	public void BrewingServices() {
		serviceone.click();
		servicetwo.click();
	} 
	//-----------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[3]/label")
	@CacheLookup
	WebElement brew1;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[4]/label")
	@CacheLookup
	WebElement brew2;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[5]/label")
	@CacheLookup
	WebElement brew3;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[6]/label")
	@CacheLookup
	WebElement brew4;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[7]/label")
	@CacheLookup
	WebElement brew5;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[8]/label")
	@CacheLookup
	WebElement brew6;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[9]/label")
	@CacheLookup
	WebElement brew7;
	
	public void StylesBrewing() {
		brew1.click(); brew2.click();
		brew3.click(); brew4.click();
		brew5.click(); brew6.click();
		brew7.click(); 
	}
	//----------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[10]/label")
	@CacheLookup
	WebElement brewvisit;
	public void BreweryVisit() {
		brewvisit.click();
	}
	//----------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[12]/div/input")
	@CacheLookup
	WebElement continuethree;
	public void ContinueThree() {
		continuethree.click();
	}
	//------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/input")
	@CacheLookup
	WebElement annualcapacity;
	public void AnnualCapacity() {
		annualcapacity.sendKeys("550");
	}
	//----------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"minCapacity\"]")
	@CacheLookup
	WebElement minbrewlength;
	public void MinimumBrewLength() {
		minbrewlength.sendKeys("2500");
	}
	//---------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"maxCapacity\"]")
	@CacheLookup
	WebElement maxbrewlength;
	public void MaximumBrewLength() {
		maxbrewlength.sendKeys("4000");
	}
	//----------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[3]/label")
	@CacheLookup
	WebElement contractbuyers;
	public void ContractBuyers() {
		contractbuyers.click();
	}
	
	//------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[5]/label")
	@CacheLookup
	WebElement faciltatebrews;
	public void FaciltateBrews() {
		faciltatebrews.click();
	}
	//------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[7]/div/input")
	@CacheLookup
	WebElement continuefour;
	public void ContinueFour() {
		continuefour.click();
	}
	//---------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[1]/table/tbody/tr[1]/td[2]/label/span")
	@CacheLookup
	WebElement bottleingonsite1;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[1]/table/tbody/tr[2]/td[2]/label/span")
	@CacheLookup
	WebElement bottleingonsite2;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[1]/table/tbody/tr[3]/td[2]/label/span")
	@CacheLookup
	WebElement bottleingonsite3;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[1]/table/tbody/tr[4]/td[2]/label/span")
	@CacheLookup
	WebElement bottleingonsite4;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[1]/table/tbody/tr[5]/td[2]/label/span")
	@CacheLookup
	WebElement bottleingonsite5;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[1]/table/tbody/tr[1]/td[3]/label/span")
	@CacheLookup
	WebElement bottle3rdparty1;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[1]/table/tbody/tr[2]/td[3]/label/span")
	@CacheLookup
	WebElement bottle3rdparty2;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[1]/table/tbody/tr[3]/td[3]/label/span")
	@CacheLookup
	WebElement bottle3rdparty3;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[1]/table/tbody/tr[4]/td[3]/label/span")
	@CacheLookup
	WebElement bottle3rdparty4;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[1]/table/tbody/tr[5]/td[3]/label/span")
	@CacheLookup
	WebElement bottle3rdparty5;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"supplier-0\"]")
	@CacheLookup
	WebElement bottlingSupplier;
	@FindBy(how=How.XPATH, using="//*[@id=\"quantity-0\"]")
	@CacheLookup
	WebElement orderquantitybottle;
	
	public void OnsiteBottling() {
		bottleingonsite1.click();  bottleingonsite2.click();  
		bottleingonsite3.click();  bottleingonsite4.click();  
		bottleingonsite5.click();  
	}
	
	public void BottleThirdParty() {
		bottle3rdparty1.click(); bottle3rdparty2.click(); 
		bottle3rdparty3.click(); bottle3rdparty4.click(); 
		bottle3rdparty5.click(); 
	}
	
	public void detailsbottle() {
		bottlingSupplier.sendKeys("Testing QA");
		orderquantitybottle.sendKeys("1400");
	}
	//----------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[2]/table/tbody/tr[1]/td[2]/label/span")
	@CacheLookup
	WebElement canningonsite1;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[2]/table/tbody/tr[2]/td[2]/label/span")
	@CacheLookup
	WebElement canningonsite2;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[2]/table/tbody/tr[3]/td[2]/label/span")
	@CacheLookup
	WebElement canningonsite3;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[2]/table/tbody/tr[4]/td[2]/label/span")
	@CacheLookup
	WebElement canningonsite4;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[2]/table/tbody/tr[5]/td[2]/label/span")
	@CacheLookup
	WebElement canningonsite5;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[2]/table/tbody/tr[6]/td[2]/label/span")
	@CacheLookup
	WebElement canningonsite6;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[2]/table/tbody/tr[1]/td[3]/label/span")
	@CacheLookup
	WebElement canning3rdparty1;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[2]/table/tbody/tr[2]/td[3]/label/span")
	@CacheLookup
	WebElement canning3rdparty2;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[2]/table/tbody/tr[3]/td[3]/label/span")
	@CacheLookup
	WebElement canning3rdparty3;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[2]/table/tbody/tr[4]/td[3]/label/span")
	@CacheLookup
	WebElement canning3rdparty4;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[2]/table/tbody/tr[5]/td[3]/label/span")
	@CacheLookup
	WebElement canning3rdparty5;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[2]/table/tbody/tr[6]/td[3]/label/span")
	@CacheLookup
	WebElement canning3rdparty6;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"supplier-1\"]")
	@CacheLookup
	WebElement canningSupplier;
	@FindBy(how=How.XPATH, using="//*[@id=\"quantity-1\"]")
	@CacheLookup
	WebElement orderquantitycanning;
	
	public void CanningOnSite() {
		canningonsite1.click(); canningonsite2.click();
		canningonsite3.click(); canningonsite4.click();
		canningonsite5.click(); canningonsite6.click();
	}
	
	public void CanningThirdParty() {
		canning3rdparty1.click(); canning3rdparty2.click();
		canning3rdparty3.click(); canning3rdparty4.click();
		canning3rdparty5.click(); canning3rdparty6.click();
	}
	
	public void detailCanning() {
		canningSupplier.sendKeys("Testing QA");
		orderquantitycanning.sendKeys("1400");
	}
	//-------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[3]/table/tbody/tr[1]/td[2]/label/span")
	@CacheLookup
	WebElement kegsonsite1;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[3]/table/tbody/tr[2]/td[2]/label/span")
	@CacheLookup
	WebElement kegsonsite2;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[3]/table/tbody/tr[3]/td[2]/label/span")
	@CacheLookup
	WebElement kegsonsite3;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[3]/table/tbody/tr[1]/td[3]/label/span")
	@CacheLookup
	WebElement kegs3rdparty1;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[3]/table/tbody/tr[2]/td[3]/label/span")
	@CacheLookup
	WebElement kegs3rdparty2;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[3]/table/tbody/tr[3]/td[3]/label/span")
	@CacheLookup
	WebElement kegs3rdparty3;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"supplier-2\"]")
	@CacheLookup
	WebElement kegsSupplier;
	@FindBy(how=How.XPATH, using="//*[@id=\"quantity-2\"]")
	@CacheLookup
	WebElement orderquantitykegs;
	
	public void KegsOnsite() {
		kegsonsite1.click(); kegsonsite2.click();
		kegsonsite3.click();
	}
	
	public void KegsThirdParty() {
		kegs3rdparty1.click(); kegs3rdparty2.click(); kegs3rdparty3.click(); 
	}
	
	public void detailsKegs() {
		kegsSupplier.sendKeys("Testing Website");
		orderquantitykegs.sendKeys("1400");
	}
	//-------------------------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[4]/table/tbody/tr[1]/td[2]/label/span")
	@CacheLookup
	WebElement Casksonsite1;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[4]/table/tbody/tr[2]/td[2]/label/span")
	@CacheLookup
	WebElement Casksonsite2;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[4]/table/tbody/tr[1]/td[3]/label/span")
	@CacheLookup
	WebElement Casks3rdparty1;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[4]/table/tbody/tr[2]/td[3]/label/span")
	@CacheLookup
	WebElement Casks3rdparty2;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"supplier-3\"]")
	@CacheLookup
	WebElement casksSupplier;
	@FindBy(how=How.XPATH, using="//*[@id=\"quantity-3\"]")
	@CacheLookup
	WebElement orderquantitycasks;
	
	public void CasksOnSite() {
		Casksonsite1.click(); Casksonsite2.click();
	}
	
	public void CasksThirdParty() {
		Casks3rdparty1.click(); Casks3rdparty2.click();
		
	}
	
	public void detailscasks() {
		casksSupplier.sendKeys("Testing Brewery");
		orderquantitycasks.sendKeys("1400");
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[5]/table/tbody/tr/td[2]/label/span")
	@CacheLookup
	WebElement bulkcontaineronsite;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[1]/div[5]/table/tbody/tr/td[3]/label/span")
	@CacheLookup
	WebElement bulkcontainer3rdparty;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"supplier-4\"]")
	@CacheLookup
	WebElement bulkcontainerSupplier;
	@FindBy(how=How.XPATH, using="//*[@id=\"quantity-4\"]")
	@CacheLookup
	WebElement orderquantitybulk;
	
	
	public void BulkContainer() {
		
		bulkcontaineronsite.click(); bulkcontainer3rdparty.click();
	}
	
	public void detailsBulkcontainer() {
		bulkcontainerSupplier.sendKeys("Testing Website");
		orderquantitybulk.sendKeys("1400");
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div/form/div[2]/div/input")
	@CacheLookup
	WebElement continuefive;
	
	public void continueFive() {
		continuefive.click();
	}
	//-----------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div[1]/label")
	@CacheLookup
	WebElement offerdelivery;
	
	public void OfferDelivery() {
		offerdelivery.click();
	}
	
	//---------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div[4]/div[1]/label")
	@CacheLookup
	WebElement servicewarehousing;
	
	public void WarehousingServices() {
		servicewarehousing.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div[5]/label")
	@CacheLookup
	WebElement bondedstorage;
	
	public void BondedStorage() {
		bondedstorage.click();
	}
	//-------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div[7]/div/input")
	@CacheLookup
	WebElement continuesix;
	
	public void ContinueSix() {
		continuesix.click();
	}
	//--------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[1]/input")
	@CacheLookup
	WebElement HMRCregnumber;
	
	public void HMRCRegisterationNumber() {
		HMRCregnumber.sendKeys("KJDHF32KJHAS34");
	}
	
	//------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[2]/label")
	@CacheLookup
	WebElement classa;
	
	public void ClassABulkBeer() {
		classa.click();
		
	}
	//---------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[6]/div/input")
	@CacheLookup
	WebElement continueseven;
	
	public void ContinueSeven() {
		continueseven.click();
	}
	//-----------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div[1]/label")
	@CacheLookup
	WebElement salsa;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div[2]/label")
	@CacheLookup
	WebElement brc;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div[3]/label")
	@CacheLookup
	WebElement sibassfq;
	
	public void Standard() {
		salsa.click(); brc.click(); sibassfq.click();
	}
	//-------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div[4]/label/span")
	@CacheLookup
	WebElement qualione;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div[5]/label/span")
	@CacheLookup
	WebElement qualitwo;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div[6]/label/span")
	@CacheLookup
	WebElement qualithree;
	public void Qualifications() {
		qualione.click(); qualitwo.click(); qualithree.click();
	}
	//-----------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"award1\"]")
	@CacheLookup
	WebElement awardone;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/button")
	@CacheLookup
	WebElement addmore;
	@FindBy(how=How.XPATH, using="//*[@id=\"award2\"]")
	@CacheLookup
	WebElement awardtwo;
	public void Awards() {
		awardone.sendKeys("ASDFAS3423DHMJ"); addmore.click(); awardtwo.sendKeys("ASDF234EFDF");
	}
	//----------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/div[9]/div/input")
	@CacheLookup
	WebElement continueeight;
	
	public void ContinueEight() {
		continueeight.click();
	}
	//---------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[1]/textarea")
	@CacheLookup
	WebElement summarybusiness;
	
	public void SummaryBusiness() {
		summarybusiness.sendKeys("Testing supplier onboarding, this is the test summary");
	}
	//----------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[3]/div/div/form/div[2]/div/input")
	@CacheLookup
	WebElement continuenine;
	
	public void ContinueNine() {
		continuenine.click();
	}
	//-------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH,using="//*[@id=\"logo-image\"]")
	@CacheLookup 
	WebElement logoprofile; 
	
	public void LogoProfile() throws Exception { 
		logoprofile.sendKeys("/home/ucreate-73/Desktop/2nd.jpg");
		//Runtime.getRuntime().exec("C:\\Autoit\\logofile.exe"); 
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/button") 
	@CacheLookup
	WebElement done;
	
	public void DonelogoUpload() {
		done.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"imgupload_1\"]") 
	@CacheLookup
	WebElement uploadfile;
	public void UploadFile1() throws Exception {
		uploadfile.click(); Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Autoit\\logofile.exe"); Thread.sleep(4000);	
	}
	
	public void UploadFile2() throws Exception {
		uploadfile.click(); Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Autoit\\uploadone.exe"); Thread.sleep(4000); 	
	}
	
	public void UploadFile3() throws Exception {
		uploadfile.click(); Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Autoit\\uploadtwo.exe"); Thread.sleep(4000); 	
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"brewing_images\"]/div[4]/input") 
	@CacheLookup
	WebElement finish;
	
	public void onboardingFinish() {
		finish.click();
	}
	









}

