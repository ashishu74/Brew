	package com.pages;
	import java.util.Random;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
		
	public class CreateSupplierOnboarding {
	WebDriver driver;
	WebDriverWait wait;
		
	public CreateSupplierOnboarding(WebDriver driver){
	    this.driver = driver; 
	    wait = new WebDriverWait(driver,30);
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/section[2]/div/a")
	@CacheLookup
	WebElement joinnow;
	public void joinNow() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/section[2]/div/a")));
		Assert.assertTrue(joinnow.isDisplayed());
		joinnow.click();
	}
	//------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"firstname\"]")
	@CacheLookup
	WebElement fname;
	
	public void FirstName() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"firstname\"]")));
		Assert.assertTrue(fname.isDisplayed());
		fname.sendKeys("Ashish");
	}
	
	//----------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"lastname\"]")
	@CacheLookup
	WebElement lname;
	
	public void SurName() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"lastname\"]")));
		Assert.assertTrue(lname.isDisplayed());
		lname.sendKeys("Kumar");
		
	}
	
	//-----------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"brewery\"]")
	@CacheLookup
	WebElement company;
	
	public void Company() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"brewery\"]")));
		Assert.assertTrue(company.isDisplayed());
		company.sendKeys("ucreate.it");
	}
	
	//-------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"emailId\"]")
	@CacheLookup
	WebElement emailid;
	
	public void EmailAddress() {
		Random randomGenerator = new Random(); 
		int randomInt = randomGenerator.nextInt(1000);  
		emailid.sendKeys("user"+ randomInt +"@mailinator.com"); 
		
	}
	//------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"signup-form\"]/div[1]/label[2]/span")
	@CacheLookup
	WebElement sup;
	
	public void supplierRadio() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"signup-form\"]/div[1]/label[2]/span")));
		Assert.assertTrue(sup.isEnabled());
		sup.click();
	}
	//------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"telephone\"]")
	@CacheLookup
	WebElement tel;
	public void telephoneNumber() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"telephone\"]")));
		Assert.assertTrue(tel.isDisplayed());
		tel.sendKeys("09876028861");
	}
	
	//---------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"password\"]")
	@CacheLookup
	WebElement password; 
	public void Password() {
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"password\"]")));
	Assert.assertTrue(password.isDisplayed());
	password.sendKeys("@Test1234");	
	}
	
	//-----------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"service3\"]")
	@CacheLookup
	WebElement contractbrewer; 
	public void ContractBrewer() {
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"service3\"]")));
	Assert.assertTrue(contractbrewer.isDisplayed());
	contractbrewer.click();	
	}
	//-----------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"confirm\"]")
	@CacheLookup
	WebElement brewinglicence;  
	
	public void BrewingLicenceConfirm() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"confirm\"]")));
		Assert.assertTrue(brewinglicence.isDisplayed());
		brewinglicence.click();
	}
	//-----------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"signup-form\"]/div[9]/input")
	@CacheLookup
	WebElement continueone; 
	public void ContinueOne() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"signup-form\"]/div[9]/input")));
		Assert.assertTrue(continueone.isDisplayed());
		continueone.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/a[1]")
	@CacheLookup
	WebElement continue2;
	public void continu() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/a[1]")));
		Assert.assertTrue(continue2.isDisplayed());
		continue2.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"address\"]")
	@CacheLookup
	WebElement address;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div[2]/div/p[1]")
	@CacheLookup
	WebElement addressinfo;
	
	public void CompanyAddress() throws Exception {
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"address\"]")));
	address.sendKeys("Glasgow, UK");
	Thread.sleep(1000); address.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000); address.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000); address.sendKeys(Keys.ENTER);
	
	}
	//----------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div[3]/div/button[2]")
	@CacheLookup
	WebElement continuetwo;
	
	public void ContinueTwo() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div[3]/div/button[2]")));
		Assert.assertTrue(continuetwo.isDisplayed());
		continuetwo.click();
	}
	// ------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"service1\"]")
	@CacheLookup
	WebElement serviceone;
	@FindBy(how=How.XPATH, using="//*[@id=\"service2\"]")
	@CacheLookup
	WebElement servicetwo;
	public void BrewingServices() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"service1\"]")));
		Assert.assertFalse(serviceone.isSelected());
		serviceone.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"service1\"]")));
		Assert.assertFalse(servicetwo.isSelected());
		servicetwo.click();
	} 
	//-----------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"brew1\"]")
	@CacheLookup
	WebElement brew1;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"brew2\"]")
	@CacheLookup
	WebElement brew2;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"brew3\"]")
	@CacheLookup
	WebElement brew3;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"brew4\"]")
	@CacheLookup
	WebElement brew4;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"brew5\"]")
	@CacheLookup
	WebElement brew5;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"brew6\"]")
	@CacheLookup
	WebElement brew6;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"brew7\"]")
	@CacheLookup
	WebElement brew7;
	
	public void StylesBrewing() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"brew1\"]")));
		Assert.assertFalse(brew1.isSelected());
		brew1.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"brew2\"]")));
		Assert.assertFalse(brew2.isSelected());
		brew2.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"brew3\"]")));
		Assert.assertFalse(brew3.isSelected());
		brew3.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"brew4\"]")));
		Assert.assertFalse(brew4.isSelected());
		brew4.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"brew5\"]")));
		Assert.assertFalse(brew5.isSelected());
		brew5.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"brew6\"]")));
		Assert.assertFalse(brew6.isSelected());
		brew6.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"brew7\"]")));
		Assert.assertFalse(brew7.isSelected());
		brew7.click(); 
	}
	//----------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[10]/label/span")
	@CacheLookup
	WebElement brewvisit;
	public void BreweryVisit() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[10]/label/span")));
		Assert.assertFalse(brewvisit.isSelected());
		brewvisit.click();
	}
	//----------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[12]/div/input")
	@CacheLookup
	WebElement continuethree;
	public void ContinueThree() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[12]/div/input")));
		Assert.assertTrue(continuethree.isEnabled());
		continuethree.click();
	}
	//------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/input")
	@CacheLookup
	WebElement annualcapacity;
	public void AnnualCapacity() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/input")));
		Assert.assertTrue(annualcapacity.isDisplayed());
		annualcapacity.sendKeys("50000");
	}
	//----------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"minCapacity\"]")
	@CacheLookup
	WebElement minbrewlength;
	public void MinimumBrewLength() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"minCapacity\"]")));
		Assert.assertTrue(minbrewlength.isDisplayed());
		minbrewlength.sendKeys("100");
	}
	//---------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"maxCapacity\"]")
	@CacheLookup
	WebElement maxbrewlength;
	public void MaximumBrewLength() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"maxCapacity\"]")));
		Assert.assertTrue(maxbrewlength.isDisplayed());
		maxbrewlength.sendKeys("10000");
	}
	//----------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[3]/label/span")
	@CacheLookup
	WebElement contractbuyers;
	public void ContractBuyers() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[3]/label/span")));
		Assert.assertFalse(contractbuyers.isSelected());
		contractbuyers.click();
	}
	
	//------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[5]/label/span")
	@CacheLookup
	WebElement faciltatebrews;
	public void FaciltateBrews() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[5]/label/span")));
		Assert.assertFalse(faciltatebrews.isSelected());
		faciltatebrews.click();
	}
	//------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[7]/div/input")
	@CacheLookup
	WebElement continuefour;
	public void ContinueFour() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[7]/div/input")));
		Assert.assertTrue(continuefour.isEnabled());
		continuefour.click();
	}
	//---------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[1]/td[2]/label/span")
	@CacheLookup
	WebElement bottleingonsite1;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[2]/td[2]/label/span")
	@CacheLookup
	WebElement bottleingonsite2;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[3]/td[2]/label/span")
	@CacheLookup
	WebElement bottleingonsite3;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[4]/td[2]/label/span")
	@CacheLookup
	WebElement bottleingonsite4;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[5]/td[2]/label/span")
	@CacheLookup
	WebElement bottleingonsite5;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[1]/td[3]/label/span")
	@CacheLookup
	WebElement bottle3rdparty1;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[2]/td[3]/label/span")
	@CacheLookup
	WebElement bottle3rdparty2;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[3]/td[3]/label/span")
	@CacheLookup
	WebElement bottle3rdparty3;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[4]/td[3]/label/span")
	@CacheLookup
	WebElement bottle3rdparty4;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[5]/td[3]/label/span")
	@CacheLookup
	WebElement bottle3rdparty5;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"supplier-0\"]")
	@CacheLookup
	WebElement bottlingSupplier;
	@FindBy(how=How.XPATH, using="//*[@id=\"quantity-0\"]")
	@CacheLookup
	WebElement orderquantitybottle;
	
	public void OnsiteBottling() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[1]/td[2]/label/span")));
		Assert.assertFalse(bottleingonsite1.isSelected());
		bottleingonsite1.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[2]/td[2]/label/span")));
		Assert.assertFalse(bottleingonsite2.isSelected());
		bottleingonsite2.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[3]/td[2]/label/span")));
		Assert.assertFalse(bottleingonsite3.isSelected());
		bottleingonsite3.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[4]/td[2]/label/span")));
		Assert.assertFalse(bottleingonsite4.isSelected());
		bottleingonsite4.click();  
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[5]/td[2]/label/span")));
		Assert.assertFalse(bottleingonsite5.isSelected());
		bottleingonsite5.click();  
	}
	
	public void BottleThirdParty() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[1]/td[3]/label/span")));
		Assert.assertFalse(bottle3rdparty1.isSelected());
		bottle3rdparty1.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[2]/td[3]/label/span")));
		Assert.assertFalse(bottle3rdparty2.isSelected());
		bottle3rdparty2.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[3]/td[3]/label/span")));
		Assert.assertFalse(bottle3rdparty3.isSelected());
		bottle3rdparty3.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[4]/td[3]/label/span")));
		Assert.assertFalse(bottle3rdparty4.isSelected());
		bottle3rdparty4.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[5]/td[3]/label/span")));
		Assert.assertFalse(bottle3rdparty5.isSelected());
		bottle3rdparty5.click(); 
	}
	
	public void detailsbottle() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"supplier-0\"]")));
		Assert.assertTrue(bottlingSupplier.isDisplayed());
		bottlingSupplier.sendKeys("Testing QA");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"quantity-0\"]")));
		Assert.assertTrue(orderquantitybottle.isDisplayed());
		orderquantitybottle.sendKeys("1400");
	}
	//----------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[1]/td[2]/label/span")
	@CacheLookup
	WebElement canningonsite1;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[2]/td[2]/label/span")
	@CacheLookup
	WebElement canningonsite2;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[3]/td[2]/label/span")
	@CacheLookup
	WebElement canningonsite3;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[4]/td[2]/label/span")
	@CacheLookup
	WebElement canningonsite4;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[5]/td[2]/label/span")
	@CacheLookup
	WebElement canningonsite5;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[6]/td[2]/label/span")
	@CacheLookup
	WebElement canningonsite6;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[1]/td[3]/label/span")
	@CacheLookup
	WebElement canning3rdparty1;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[2]/td[3]/label/span")
	@CacheLookup
	WebElement canning3rdparty2;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[3]/td[3]/label/span")
	@CacheLookup
	WebElement canning3rdparty3;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[4]/td[3]/label/span")
	@CacheLookup
	WebElement canning3rdparty4;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[5]/td[3]/label/span")
	@CacheLookup
	WebElement canning3rdparty5;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[6]/td[3]/label/span")
	@CacheLookup
	WebElement canning3rdparty6;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"supplier-1\"]")
	@CacheLookup
	WebElement canningSupplier;
	@FindBy(how=How.XPATH, using="//*[@id=\"quantity-1\"]")
	@CacheLookup
	WebElement orderquantitycanning;
	
	public void CanningOnSite() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[1]/td[2]/label/span")));
		Assert.assertFalse(canningonsite1.isSelected());
		canningonsite1.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[2]/td[2]/label/span")));
		Assert.assertFalse(canningonsite2.isSelected());
		canningonsite2.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[3]/td[2]/label/span")));
		Assert.assertFalse(canningonsite3.isSelected());
		canningonsite3.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[4]/td[2]/label/span")));
		Assert.assertFalse(canningonsite4.isSelected());
		canningonsite4.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[5]/td[2]/label/span")));
		Assert.assertFalse(canningonsite5.isSelected());
		canningonsite5.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[6]/td[2]/label/span")));
		Assert.assertFalse(canningonsite6.isSelected());
		canningonsite6.click();
	}
	
	public void CanningThirdParty() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[1]/td[3]/label/span")));
		Assert.assertFalse(canning3rdparty1.isSelected());
		canning3rdparty1.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[2]/td[3]/label/span")));
		Assert.assertFalse(canning3rdparty2.isSelected());
		canning3rdparty2.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[3]/td[3]/label/span")));
		Assert.assertFalse(canning3rdparty3.isSelected());
		canning3rdparty3.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[4]/td[3]/label/span")));
		Assert.assertFalse(canning3rdparty4.isSelected());
		canning3rdparty4.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[5]/td[3]/label/span")));
		Assert.assertFalse(canning3rdparty5.isSelected());
		canning3rdparty5.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[6]/td[3]/label/span")));
		Assert.assertFalse(canning3rdparty6.isSelected());
		canning3rdparty6.click();
	}
	
	public void detailCanning() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"supplier-1\"]")));
		Assert.assertTrue(canningSupplier.isDisplayed());
		canningSupplier.sendKeys("Testing QA");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"quantity-1\"]")));
		Assert.assertTrue(orderquantitycanning.isDisplayed());
		orderquantitycanning.sendKeys("1400");
	}
	//-------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[1]/td[2]/label/span")
	@CacheLookup
	WebElement kegsonsite1;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[2]/td[2]/label/span")
	@CacheLookup
	WebElement kegsonsite2;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[3]/td[2]/label/span")
	@CacheLookup
	WebElement kegsonsite3;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[1]/td[3]/label/span")
	@CacheLookup
	WebElement kegs3rdparty1;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[2]/td[3]/label/span")
	@CacheLookup
	WebElement kegs3rdparty2;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[3]/td[3]/label/span")
	@CacheLookup
	WebElement kegs3rdparty3;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"supplier-2\"]")
	@CacheLookup
	WebElement kegsSupplier;
	@FindBy(how=How.XPATH, using="//*[@id=\"quantity-2\"]")
	@CacheLookup
	WebElement orderquantitykegs;
	
	public void KegsOnsite() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[1]/td[2]/label/span")));
		Assert.assertFalse(kegsonsite1.isSelected());
		kegsonsite1.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[2]/td[2]/label/span")));
		Assert.assertFalse(kegsonsite2.isSelected());
		kegsonsite2.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[3]/td[2]/label/span")));
		Assert.assertFalse(kegsonsite3.isSelected());
		kegsonsite3.click();
	}
	
	public void KegsThirdParty() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[1]/td[3]/label/span")));
		Assert.assertFalse(kegs3rdparty1.isSelected());
		kegs3rdparty1.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[2]/td[3]/label/span")));
		Assert.assertFalse(kegs3rdparty2.isSelected());
		kegs3rdparty2.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[3]/td[3]/label/span")));
		Assert.assertFalse(kegs3rdparty3.isSelected());
		kegs3rdparty3.click(); 
	}
	
	public void detailsKegs() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"supplier-2\"]")));
		Assert.assertTrue(kegsSupplier.isDisplayed());
		kegsSupplier.sendKeys("Testing Website");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"quantity-2\"]")));
		Assert.assertTrue(orderquantitykegs.isDisplayed());
		orderquantitykegs.sendKeys("1400");
	}
	//-------------------------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[1]/td[2]/label/span")
	@CacheLookup
	WebElement Casksonsite1;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[2]/td[2]/label/span")
	@CacheLookup
	WebElement Casksonsite2;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[1]/td[3]/label/span")
	@CacheLookup
	WebElement Casks3rdparty1;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[2]/td[3]/label/span")
	@CacheLookup
	WebElement Casks3rdparty2;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"supplier-3\"]")
	@CacheLookup
	WebElement casksSupplier;
	@FindBy(how=How.XPATH, using="//*[@id=\"quantity-3\"]")
	@CacheLookup
	WebElement orderquantitycasks;
	
	public void CasksOnSite() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[1]/td[2]/label/span")));
		Assert.assertFalse(Casksonsite1.isSelected());
		Casksonsite1.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[2]/td[2]/label/span")));
		Assert.assertFalse(Casksonsite2.isSelected());
		Casksonsite2.click();
	}
	
	public void CasksThirdParty() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[1]/td[3]/label/span")));
		Assert.assertFalse(Casks3rdparty1.isSelected());
		Casks3rdparty1.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[2]/td[3]/label/span")));
		Assert.assertFalse(Casks3rdparty2.isSelected());
		Casks3rdparty2.click();
		
	}
	
	public void detailscasks() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"supplier-3\"]")));
		Assert.assertTrue(casksSupplier.isDisplayed());
		casksSupplier.sendKeys("Testing Brewery");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"quantity-3\"]")));
		Assert.assertTrue(orderquantitycasks.isDisplayed());
		orderquantitycasks.sendKeys("1400");
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[5]/table/tbody/tr/td[2]/label/span")
	@CacheLookup
	WebElement bulkcontaineronsite;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[5]/table/tbody/tr/td[3]/label/span")
	@CacheLookup
	WebElement bulkcontainer3rdparty;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"supplier-4\"]")
	@CacheLookup
	WebElement bulkcontainerSupplier;
	@FindBy(how=How.XPATH, using="//*[@id=\"quantity-4\"]")
	@CacheLookup
	WebElement orderquantitybulk;
	
	
	public void BulkContainer() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[5]/table/tbody/tr/td[2]/label/span")));
		Assert.assertFalse(bulkcontaineronsite.isSelected());
		bulkcontaineronsite.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[5]/table/tbody/tr/td[3]/label/span")));
		Assert.assertFalse(bulkcontainer3rdparty.isSelected());
		bulkcontainer3rdparty.click();
	}
	
	public void detailsBulkcontainer() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"supplier-4\"]")));
		Assert.assertTrue(bulkcontainerSupplier.isDisplayed());
		bulkcontainerSupplier.sendKeys("Testing Website");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"quantity-4\"]")));
		Assert.assertTrue(orderquantitybulk.isDisplayed());
		orderquantitybulk.sendKeys("1400");
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[2]/div/input")
	@CacheLookup
	WebElement continuefive;
	
	public void continueFive() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[2]/div/input")));
		Assert.assertTrue(continuefive.isEnabled());
		continuefive.click();
	}
	//-----------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/label/span")
	@CacheLookup
	WebElement offerdelivery;
	
	public void OfferDelivery() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/label/span")));
		Assert.assertFalse(offerdelivery.isSelected());
		offerdelivery.click();
	}
	
	//---------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/label/span")
	@CacheLookup
	WebElement servicewarehousing;
	
	public void WarehousingServices() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/label/span")));
		Assert.assertFalse(servicewarehousing.isSelected());
		servicewarehousing.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"subOption1\"]")
	@CacheLookup
	WebElement ambient;
	
	public void Ambient() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"subOption1\"]")));
		Assert.assertFalse(ambient.isSelected());
		ambient.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"subOption2\"]")
	@CacheLookup
	WebElement coldstorage;
	
	public void ColdStorage() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"subOption2\"]")));
		Assert.assertFalse(coldstorage.isSelected());
		coldstorage.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------
	
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[5]/label/span")
	@CacheLookup
	WebElement bondedstorage;
	
	public void BondedStorage() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[5]/label/span")));
		Assert.assertFalse(bondedstorage.isSelected());
		bondedstorage.click();
	}
	//-------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[7]/div/input")
	@CacheLookup
	WebElement continuesix;
	
	public void ContinueSix() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[7]/div/input")));
		Assert.assertTrue(continuesix.isEnabled());
		continuesix.click();
	}
	//--------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[1]/input")
	@CacheLookup
	WebElement HMRCregnumber;
	
	public void HMRCRegisterationNumber() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[1]/input")));
		Assert.assertTrue(HMRCregnumber.isDisplayed());
		HMRCregnumber.sendKeys("KJDHF32KJHAS34");
	}
	
	//------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"hrmcClasses1\"]")
	@CacheLookup
	WebElement classa;
	
	public void ClassABulkBeer() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"hrmcClasses1\"]")));
		Assert.assertFalse(classa.isSelected());
		classa.click();
		
	}
	//---------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[6]/div/input")
	@CacheLookup
	WebElement continueseven;
	
	public void ContinueSeven() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[6]/div/input")));
		Assert.assertTrue(continueseven.isEnabled());
		continueseven.click();
	}
	//-----------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"option1\"]")
	@CacheLookup
	WebElement salsa;
	@FindBy(how=How.XPATH, using="//*[@id=\"option2\"]")
	@CacheLookup
	WebElement brc;
	@FindBy(how=How.XPATH, using="//*[@id=\"option3\"]")
	@CacheLookup
	WebElement sibassfq;
	
	public void Standard() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"option1\"]")));
		Assert.assertFalse(salsa.isSelected());
		salsa.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"option2\"]")));
		Assert.assertFalse(brc.isSelected());
		brc.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"option3\"]")));
		Assert.assertFalse(sibassfq.isSelected());
		sibassfq.click();
	}
	//-------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"qualification1\"]")
	@CacheLookup
	WebElement qualione;
	@FindBy(how=How.XPATH, using="//*[@id=\"qualification2\"]")
	@CacheLookup
	WebElement qualitwo;
	@FindBy(how=How.XPATH, using="//*[@id=\"qualification3\"]")
	@CacheLookup
	WebElement qualithree;
	public void Qualifications() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"qualification1\"]")));
		Assert.assertFalse(qualione.isSelected());
		qualione.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"qualification2\"]")));
		Assert.assertFalse(qualitwo.isSelected());
		qualitwo.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"qualification3\"]")));
		Assert.assertFalse(qualithree.isSelected());
		qualithree.click();
	}
	//-----------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"award1\"]")
	@CacheLookup
	WebElement awardone;
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/button")
	@CacheLookup
	WebElement addmore;
	@FindBy(how=How.XPATH, using="//*[@id=\"award2\"]")
	@CacheLookup
	WebElement awardtwo;
	public void Awards() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"award1\"]")));
		Assert.assertTrue(awardone.isDisplayed());
		awardone.sendKeys("ASDFAS3423DHMJ"); 
	}
	//----------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[8]/div/input")
	@CacheLookup
	WebElement continueeight;
	
	public void ContinueEight() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[8]/div/input")));
		Assert.assertTrue(continueeight.isEnabled());
		continueeight.click();
	}
	//---------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[1]/textarea")
	@CacheLookup
	WebElement summarybusiness;
	
	public void SummaryBusiness() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[1]/textarea")));
		Assert.assertTrue(summarybusiness.isDisplayed());
		summarybusiness.sendKeys("Testing supplier onboarding, this is the test summary");
	}
	//----------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/input")
	@CacheLookup
	WebElement continuenine;
	
	public void ContinueNine() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/input")));
		Assert.assertTrue(continuenine.isEnabled());
		continuenine.click();
	}
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"brewing_images\"]/div[4]/div/button")
	@CacheLookup
	WebElement skipten;
	
	public void SkipTen() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"brewing_images\"]/div[4]/div/button")));
		Assert.assertTrue(skipten.isDisplayed());
		skipten.click();
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------

}

