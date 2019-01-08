	package com.pages;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.testng.Assert;
	
	public class CreateQuoteSupplierPage {
		
	/*************************************** Step one add bank details locators **************************************/ 	
		//-------------------------------------------------------------------------------------------------------------------------------------
		public WebDriver driver; 
		@FindBy(how=How.ID,using="react-select-3--value")
		@CacheLookup
		WebElement selectcountry; 
		
		@FindBy(how=How.ID,using="react-select-3--option-5")
		@CacheLookup
		WebElement country;
		
		public void selectCountry() {
			selectcountry.click();
			country.click();
		}
		
		//------------------------------------------------------------------------------
		@FindBy(how=How.XPATH,using="//*[@id=\"bankname\"]")
		@CacheLookup
		WebElement bankname;
		public void bankName() {
			bankname.sendKeys("Test Bank");
		}
		
		//--------------------------------------------------------------------------	
		@FindBy(how=How.XPATH,using="//*[@id=\"sortcode\"]")
		@CacheLookup
		WebElement shortcode;
		public void shortCode() {
			shortcode.sendKeys("100000");
		}
		
		//------------------------------------------------------------------------------
		@FindBy(how=How.XPATH,using="//*[@id=\"accountNo\"]")
		@CacheLookup
		WebElement accountnumber;
		
		public void accountNumber() {
			accountnumber.sendKeys("00012345");
		}
		
		//---------------------------------------------------------------------------------------	
		@FindBy(how=How.XPATH,using="//*[@id=\"companyName\"]")
		@CacheLookup
		WebElement legalnamecompany;
		
		public void legalNameCompany() {
			legalnamecompany.sendKeys("Test Company PVT");
		}
		
		//-----------------------------------------------------------------------------------------	
		@FindBy(how=How.XPATH,using="//*[@id=\"companyRegNo\"]")
		@CacheLookup
		WebElement companyregisnumber; 
		
		public void companyRegistrationNumber() {
			companyregisnumber.sendKeys("XX00098OOP009");
		}
		
		//----------------------------------------------------------------------------------------
		@FindBy(how=How.XPATH,using="//*[@id=\"businessAddress1\"]")
		@CacheLookup
		WebElement addresslineone; 
		
		public void addressLineOne() {
			addresslineone.sendKeys("W QAS PQ");
		}
		
		//-------------------------------------------------------------------------------------
		@FindBy(how=How.XPATH,using="//*[@id=\"businessAddress2\"]")
		@CacheLookup
		WebElement addresslinetwo;
		
		public void addressLineTwo() {
			addresslinetwo.sendKeys("W QAS PQ");
		}
		
		//------------------------------------------------------------------------------------
		@FindBy(how=How.XPATH,using="//*[@id=\"businessAddress3\"]")
		@CacheLookup
		WebElement addresslinethree;  
		
		public void addressLineThree() {
			addresslinethree.sendKeys("W QAS PQ");
		}
		
		//-----------------------------------------------------------------------------------------
		@FindBy(how=How.XPATH,using="//*[@id=\"businessCity\"]")
		@CacheLookup
		WebElement towncity;
		
		public void townCity() {
			towncity.sendKeys("Testing City");
		}
		
		//---------------------------------------------------------------------------------------
		@FindBy(how=How.XPATH,using="//*[@id=\"businessPostcode\"]")
		@CacheLookup
		WebElement postcode;
		
		public void postalCode() {
			postcode.sendKeys("WC2N 5DU");
		}
		
		//-------------------------------------------------------------------------------------
		@FindBy(how=How.XPATH,using="//*[@id=\"firstname1\"]")
		@CacheLookup
		WebElement businessownerfname; 
		
		public void businessOwnerFname() {
			businessownerfname.sendKeys("Ashish");
		}
		
		//-----------------------------------------------------------------------------------------
		
		@FindBy(how=How.XPATH,using="//*[@id=\"lastname1\"]")
		@CacheLookup
		WebElement businessownerlname;
		
		public void businessOwnerLname() {
			businessownerlname.sendKeys("Kumar");
		}	

		//------------------------------------------------------------------------------------
		
		@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[15]/div[3]/div/div/div/div/a")
		@CacheLookup
		WebElement dateofbirth; 
		
		@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[15]/div[3]/div/div/div[2]/div/div[2]/div[1]/div[2]/div[2]")
		@CacheLookup
		WebElement year; 
		
		@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[15]/div[3]/div/div/div[2]/div/div[2]/div[1]/div[2]/div[2]/select/option[87]")
		@CacheLookup
		WebElement year1; 
		
		@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[15]/div[3]/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]")
		@CacheLookup
		WebElement dob1; 
		public void DOB() {
			dateofbirth.click();
			year.click();
			year1.click();
			dob1.click();
		}
		
		//-------------------------------------------------------------------------------------------------
		
		@FindBy(how=How.XPATH,using="//*[@id=\"ownerAddress1\"]")
		@CacheLookup
		WebElement businessaddresslineone;
	
		public void businessAddressLineOne() {
			businessaddresslineone.sendKeys("H.No 314 ");
		}

		//------------------------------------------------------------------------------------
		@FindBy(how=How.XPATH,using="//*[@id=\"ownerAddress2\"]")
		@CacheLookup
		WebElement businessaddresslinetwo;
		
		public void businessAddressLineTwo() {
			businessaddresslinetwo.sendKeys("Street Division 7th cross");
		}
		
		//------------------------------------------------------------------------------------
		@FindBy(how=How.XPATH,using="//*[@id=\"ownerAddress3\"]")
		@CacheLookup
		WebElement businessaddresslinethree;  
		
		public void businessAddressLineThree() {
			businessaddresslinethree.sendKeys("Main City Mohali");
		}
		
		//--------------------------------------------------------------------------------
		@FindBy(how=How.XPATH,using="//*[@id=\"ownerCity\"]")
		@CacheLookup
		WebElement businesscity; 
		
		public void businessCity() {
			businesscity.sendKeys("XYZ CITY");	
		}
		
		//-------------------------------------------------------------------------------------
		@FindBy(how=How.XPATH,using="//*[@id=\"ownerPostcode\"]")
		@CacheLookup
		WebElement postalcode; 

		public void postCode() {
			postalcode.sendKeys("WC2N 5DU");	
		}

		
		//--------------------------------------------------------------------------------------
		@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[4]/a")
		@CacheLookup
		WebElement save; 

		public void save() {	
			save.click();
		}
		
    /************************************** Step two fill price locators **************************************************************/
	@FindBy(how=How.XPATH,using="//div[@id='app']/div/div/div[2]/div/div[2]/div[2]/div/div/button") 
	@CacheLookup
	WebElement login;
	public void login_link() {
		login.click();
	}
	
	//---------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//input[@name='loginemail']")
	@CacheLookup
	WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@name='loginpassword']")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH,using="/html/body/div[4]/div/div/div/div/div[4]/input")
	@CacheLookup
	WebElement loginbutton;
	public void loginsupplier(String username, String pass) {
		Assert.assertTrue(email.isDisplayed());
		email.sendKeys(username);
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys(pass);
		loginbutton.click();	
	}
	
	//------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[1]/div/div[2]/div[2]/div/a/span")
	@CacheLookup
	WebElement supplierlogo; 
	public void supplier_logo() { 
		Assert.assertTrue(supplierlogo.isDisplayed());
		supplierlogo.click();
	}
	//----------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[1]/div/div[2]/div[2]/div/div/ul/li[2]/a")
	@CacheLookup
	WebElement dashboard;
	public void dashboard_supplier() {
		Assert.assertTrue(dashboard.isDisplayed());
		dashboard.click();
	}
	
	//-------------------------------------------------------------------------------------------------------
		@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]/ul/li[2]/a")
		@CacheLookup
		WebElement receivedtender; 
		public void receivedTender() {
			Assert.assertTrue(receivedtender.isDisplayed());
			receivedtender.click();
		}
	
	//-------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/table[2]/tbody/tr[1]/td[2]/span")
	@CacheLookup 
	WebElement toreview; 
	public void toreview_tender() {
		Assert.assertTrue(toreview.isDisplayed());
		toreview.click();
	}
	
	//--------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[3]/div/a[3]")
	@CacheLookup
	WebElement createquoteallreq;
	public void createquote_allrequirement() {
		Assert.assertTrue(createquoteallreq.isDisplayed());
		createquoteallreq.click();
	}
	
	//------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[1]/div[1]/div/input")
	@CacheLookup
	WebElement priceperunit; 
	public void Price_unit() {
		Assert.assertTrue(priceperunit.isDisplayed());
		priceperunit.sendKeys("1.00");
	}
	
	//-------------------------------------------------------------------------------------------------------------------	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div[3]/div[3]/div[2]/div[1]/div[1]/div[2]/input")
	@CacheLookup
	WebElement estimatedtotalcost;
	public void Estimated_total_cost() {
		Assert.assertTrue(estimatedtotalcost.isDisplayed());
		estimatedtotalcost.sendKeys("5.00");
	}
	
	//-------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div[6]/div/div/input")
	@CacheLookup
	WebElement warehousingcost;

	public void warehousing_cost() {
		Assert.assertTrue(warehousingcost.isDisplayed());
		warehousingcost.sendKeys("2.00");
	}
	
	//-----------------------------------------------------------------------------------	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[22]/div/div/input")
	@CacheLookup
	WebElement dutycost;
	public void duty_cost() {
		Assert.assertTrue(dutycost.isDisplayed());
		dutycost.sendKeys("55.00");	
	}
	
	//---------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[3]/div[2]/textarea")
	@CacheLookup
	WebElement commentBuyer;
	public void comments_to_buyer() {
		Assert.assertTrue(commentBuyer.isDisplayed());
		commentBuyer.sendKeys("Per facilisi itaque dapibus, ullam soluta at repellat pede nullam, lacinia! Ultricies sed ut minim quibusdam ac, sit tincidunt consequat sint laoreet, cumque facilis ratione platea ad reiciendis, fusce.");
	}
	
	//--------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[4]/a")
	@CacheLookup
	WebElement submitquote;
	public void submit_quote() {
		Assert.assertTrue(submitquote.isDisplayed());
		submitquote.click();	
	}
	
		
	
}

