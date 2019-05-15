<<<<<<< HEAD
package com.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
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
	Clipboard clip, clip1, clip2, clip3;

	public CreateSupplierOnboarding(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
	}

	// ................................................................................................................

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[3]")
	@CacheLookup
	WebElement packagaingcapacity;

	public void packagingCapacity() {
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[3]")));
		Assert.assertTrue(packagaingcapacity.isDisplayed());
		packagaingcapacity.click();
=======
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
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	}

	@FindBy(how = How.CSS, using = "#app > div > div > div.mainwrap > div.contentWrap > div.c011 > div > div.c019 > div > div:nth-child(3)")
	@CacheLookup
	WebElement iambrewer;

	public void iAmBrewer() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
				"#app > div > div > div.mainwrap > div.contentWrap > div.c011 > div > div.c019 > div > div:nth-child(3)")));
		Assert.assertTrue(iambrewer.isDisplayed());
		iambrewer.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[3]/div[5]")
	@CacheLookup
	WebElement countrynewzeland;

	public void countryNewZeland() {
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[3]/div[5]")));
		Assert.assertTrue(countrynewzeland.isDisplayed());
		countrynewzeland.click();
	}

	// ....................................................................................................................
	// ------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@name=\"first_name\"]")
	@CacheLookup
	WebElement fname;

	public void FirstName() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name=\"first_name\"]")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"firstname\"]")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertTrue(fname.isDisplayed());
		fname.sendKeys("Ashish");
	}

	// ----------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@name=\"last_name\"]")
	@CacheLookup
	WebElement lname;

	public void SurName() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name=\"last_name\"]")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"lastname\"]")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertTrue(lname.isDisplayed());
		lname.sendKeys("Kumar");

	}

	// -----------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@name=\"brewery_name\"]")
	@CacheLookup
	WebElement company;

	public void Company() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name=\"brewery_name\"]")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"brewery\"]")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertTrue(company.isDisplayed());
		company.sendKeys("ucreate.it");
	}

	// -------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@name=\"email\"]")
	@CacheLookup
	WebElement emailid;

	public void EmailAddress() {
<<<<<<< HEAD
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		emailid.sendKeys("user" + randomInt + "@mailinator.com");

=======
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
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	}

	// ------------------------------------------------------------------------------------------------------------------

	// ------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@name=\"phone\"]")
	@CacheLookup
	WebElement tel;

	public void telephoneNumber() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name=\"phone\"]")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"telephone\"]")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertTrue(tel.isDisplayed());
		tel.sendKeys("09876028861");
	}

	// ---------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@name=\"password\"]")
	@CacheLookup
	WebElement password;

	public void Password() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name=\"password\"]")));
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("@Test1234");
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"payment_term_condition\"]")
	@CacheLookup
	WebElement termsconditions;

	public void termsConditions() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"payment_term_condition\"]")));
		Assert.assertTrue(termsconditions.isEnabled());
		termsconditions.click();
=======
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"password\"]")));
	Assert.assertTrue(password.isDisplayed());
	password.sendKeys("@Test1234");	
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[3]/form/div[9]/button")
	@CacheLookup
	WebElement continueaccount;

	public void continueAccount() {
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[3]/form/div[9]/button")));
		Assert.assertTrue(continueaccount.isDisplayed());
		continueaccount.click();
	}

	// -----------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"service3\"]")
	@CacheLookup
	WebElement contractbrewer;

	public void ContractBrewer() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"service3\"]")));
		Assert.assertTrue(contractbrewer.isDisplayed());
		contractbrewer.click();
=======
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"service3\"]")));
	Assert.assertTrue(contractbrewer.isDisplayed());
	contractbrewer.click();	
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	}

	// -----------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"confirm\"]")
	@CacheLookup
	WebElement brewinglicence;

	public void BrewingLicenceConfirm() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"confirm\"]")));
		Assert.assertTrue(brewinglicence.isDisplayed());
		brewinglicence.click();
	}
<<<<<<< HEAD

	// -----------------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/a[1]")
=======
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
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement continue2;

	public void continu() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/a[1]")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/a[1]")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertTrue(continue2.isDisplayed());
		continue2.click();
	}

	// ----------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	@CacheLookup
	WebElement address;
<<<<<<< HEAD
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div[2]/div/p[1]")
	@CacheLookup
	WebElement addressinfo;

	public void CompanyAddress() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"address\"]")));
		address.sendKeys("Glasgow, UK");
		Thread.sleep(1000);
		address.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		address.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		address.sendKeys(Keys.ENTER);

	}

	// ----------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div[3]/div/button[2]")
=======
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
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement continuetwo;

	public void ContinueTwo() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div[3]/div/button[2]")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div[3]/div/button[2]")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertTrue(continuetwo.isDisplayed());
		continuetwo.click();
	}

	// ------------------------------------------------------------------------------------------------------------------------
<<<<<<< HEAD
	@FindBy(how = How.XPATH, using = "//*[@id=\"service1\"]")
	@CacheLookup
	WebElement serviceone;
	@FindBy(how = How.XPATH, using = "//*[@id=\"service2\"]")
=======
	@FindBy(how=How.XPATH, using="//*[@id=\"service1\"]")
	@CacheLookup
	WebElement serviceone;
	@FindBy(how=How.XPATH, using="//*[@id=\"service2\"]")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement servicetwo;

	public void BrewingServices() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"service1\"]")));
		Assert.assertFalse(serviceone.isSelected());
		serviceone.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"service1\"]")));
		Assert.assertFalse(servicetwo.isSelected());
		servicetwo.click();
<<<<<<< HEAD
	}

	// -----------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"brew1\"]")
	@CacheLookup
	WebElement brew1;

	@FindBy(how = How.XPATH, using = "//*[@id=\"brew2\"]")
	@CacheLookup
	WebElement brew2;

	@FindBy(how = How.XPATH, using = "//*[@id=\"brew3\"]")
	@CacheLookup
	WebElement brew3;

	@FindBy(how = How.XPATH, using = "//*[@id=\"brew4\"]")
	@CacheLookup
	WebElement brew4;

	@FindBy(how = How.XPATH, using = "//*[@id=\"brew5\"]")
	@CacheLookup
	WebElement brew5;

	@FindBy(how = How.XPATH, using = "//*[@id=\"brew6\"]")
	@CacheLookup
	WebElement brew6;

	@FindBy(how = How.XPATH, using = "//*[@id=\"brew7\"]")
=======
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
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement brew7;

	public void StylesBrewing() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"brew1\"]")));
		Assert.assertFalse(brew1.isSelected());
<<<<<<< HEAD
		brew1.click();
=======
		brew1.click(); 
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
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
<<<<<<< HEAD
		brew5.click();
=======
		brew5.click(); 
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"brew6\"]")));
		Assert.assertFalse(brew6.isSelected());
		brew6.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"brew7\"]")));
		Assert.assertFalse(brew7.isSelected());
<<<<<<< HEAD
		brew7.click();
	}

	// ----------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[10]/label/span")
=======
		brew7.click(); 
	}
	//----------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[10]/label/span")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement brewvisit;

	public void BreweryVisit() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[10]/label/span")));
		Assert.assertFalse(brewvisit.isSelected());
		brewvisit.click();
	}

	// ----------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[12]/div/input")
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[10]/label/span")));
		Assert.assertFalse(brewvisit.isSelected());
		brewvisit.click();
	}
	//----------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[12]/div/input")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement continuethree;

	public void ContinueThree() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[12]/div/input")));
		Assert.assertTrue(continuethree.isEnabled());
		continuethree.click();
	}

	// ------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/input")
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[12]/div/input")));
		Assert.assertTrue(continuethree.isEnabled());
		continuethree.click();
	}
	//------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/input")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement annualcapacity;

	public void AnnualCapacity() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/input")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/input")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertTrue(annualcapacity.isDisplayed());
		annualcapacity.sendKeys("50000");
	}

	// ----------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"minCapacity\"]")
	@CacheLookup
	WebElement minbrewlength;

	public void MinimumBrewLength() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"minCapacity\"]")));
		Assert.assertTrue(minbrewlength.isDisplayed());
		minbrewlength.sendKeys("100");
	}

	// ---------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"maxCapacity\"]")
	@CacheLookup
	WebElement maxbrewlength;

	public void MaximumBrewLength() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"maxCapacity\"]")));
		Assert.assertTrue(maxbrewlength.isDisplayed());
		maxbrewlength.sendKeys("10000");
	}
<<<<<<< HEAD

	// ----------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[3]/label/span")
=======
	//----------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[3]/label/span")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement contractbuyers;

	public void ContractBuyers() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[3]/label/span")));
		Assert.assertFalse(contractbuyers.isSelected());
		contractbuyers.click();
	}

	// ------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[5]/label/span")
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[3]/label/span")));
		Assert.assertFalse(contractbuyers.isSelected());
		contractbuyers.click();
	}
	
	//------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[5]/label/span")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement faciltatebrews;

	public void FaciltateBrews() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[5]/label/span")));
		Assert.assertFalse(faciltatebrews.isSelected());
		faciltatebrews.click();
	}

	// ------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[7]/div/input")
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[5]/label/span")));
		Assert.assertFalse(faciltatebrews.isSelected());
		faciltatebrews.click();
	}
	//------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[7]/div/input")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement continuefour;

	public void ContinueFour() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[7]/div/input")));
		Assert.assertTrue(continuefour.isEnabled());
		continuefour.click();
	}

	// ---------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[1]/td[2]/label/span")
	@CacheLookup
	WebElement bottleingonsite1;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[2]/td[2]/label/span")
	@CacheLookup
	WebElement bottleingonsite2;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[3]/td[2]/label/span")
	@CacheLookup
	WebElement bottleingonsite3;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[4]/td[2]/label/span")
	@CacheLookup
	WebElement bottleingonsite4;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[5]/td[2]/label/span")
	@CacheLookup
	WebElement bottleingonsite5;

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[1]/td[3]/label/span")
	@CacheLookup
	WebElement bottle3rdparty1;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[2]/td[3]/label/span")
	@CacheLookup
	WebElement bottle3rdparty2;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[3]/td[3]/label/span")
	@CacheLookup
	WebElement bottle3rdparty3;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[4]/td[3]/label/span")
	@CacheLookup
	WebElement bottle3rdparty4;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[5]/td[3]/label/span")
=======
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
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement bottle3rdparty5;

	@FindBy(how = How.XPATH, using = "//*[@id=\"supplier-0\"]")
	@CacheLookup
	WebElement bottlingSupplier;
	@FindBy(how = How.XPATH, using = "//*[@id=\"quantity-0\"]")
	@CacheLookup
	WebElement orderquantitybottle;

	public void OnsiteBottling() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[1]/td[2]/label/span")));
		Assert.assertFalse(bottleingonsite1.isSelected());
		bottleingonsite1.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[2]/td[2]/label/span")));
		Assert.assertFalse(bottleingonsite2.isSelected());
		bottleingonsite2.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[3]/td[2]/label/span")));
		Assert.assertFalse(bottleingonsite3.isSelected());
		bottleingonsite3.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[4]/td[2]/label/span")));
		Assert.assertFalse(bottleingonsite4.isSelected());
		bottleingonsite4.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[5]/td[2]/label/span")));
		Assert.assertFalse(bottleingonsite5.isSelected());
		bottleingonsite5.click();
=======
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
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	}

	public void BottleThirdParty() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[1]/td[3]/label/span")));
		Assert.assertFalse(bottle3rdparty1.isSelected());
		bottle3rdparty1.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[2]/td[3]/label/span")));
		Assert.assertFalse(bottle3rdparty2.isSelected());
		bottle3rdparty2.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[3]/td[3]/label/span")));
		Assert.assertFalse(bottle3rdparty3.isSelected());
		bottle3rdparty3.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[4]/td[3]/label/span")));
		Assert.assertFalse(bottle3rdparty4.isSelected());
		bottle3rdparty4.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[1]/table/tbody/tr[5]/td[3]/label/span")));
		Assert.assertFalse(bottle3rdparty5.isSelected());
		bottle3rdparty5.click();
=======
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
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	}

	public void detailsbottle() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"supplier-0\"]")));
		Assert.assertTrue(bottlingSupplier.isDisplayed());
		bottlingSupplier.sendKeys("Testing QA");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"quantity-0\"]")));
		Assert.assertTrue(orderquantitybottle.isDisplayed());
		orderquantitybottle.sendKeys("1400");
	}
<<<<<<< HEAD

	// ----------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[1]/td[2]/label/span")
	@CacheLookup
	WebElement canningonsite1;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[2]/td[2]/label/span")
	@CacheLookup
	WebElement canningonsite2;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[3]/td[2]/label/span")
	@CacheLookup
	WebElement canningonsite3;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[4]/td[2]/label/span")
	@CacheLookup
	WebElement canningonsite4;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[5]/td[2]/label/span")
	@CacheLookup
	WebElement canningonsite5;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[6]/td[2]/label/span")
	@CacheLookup
	WebElement canningonsite6;

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[1]/td[3]/label/span")
	@CacheLookup
	WebElement canning3rdparty1;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[2]/td[3]/label/span")
	@CacheLookup
	WebElement canning3rdparty2;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[3]/td[3]/label/span")
	@CacheLookup
	WebElement canning3rdparty3;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[4]/td[3]/label/span")
	@CacheLookup
	WebElement canning3rdparty4;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[5]/td[3]/label/span")
	@CacheLookup
	WebElement canning3rdparty5;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[6]/td[3]/label/span")
=======
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
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement canning3rdparty6;

	@FindBy(how = How.XPATH, using = "//*[@id=\"supplier-1\"]")
	@CacheLookup
	WebElement canningSupplier;
	@FindBy(how = How.XPATH, using = "//*[@id=\"quantity-1\"]")
	@CacheLookup
	WebElement orderquantitycanning;

	public void CanningOnSite() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[1]/td[2]/label/span")));
		Assert.assertFalse(canningonsite1.isSelected());
		canningonsite1.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[2]/td[2]/label/span")));
		Assert.assertFalse(canningonsite2.isSelected());
		canningonsite2.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[3]/td[2]/label/span")));
		Assert.assertFalse(canningonsite3.isSelected());
		canningonsite3.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[4]/td[2]/label/span")));
		Assert.assertFalse(canningonsite4.isSelected());
		canningonsite4.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[5]/td[2]/label/span")));
		Assert.assertFalse(canningonsite5.isSelected());
		canningonsite5.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[6]/td[2]/label/span")));
=======
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
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertFalse(canningonsite6.isSelected());
		canningonsite6.click();
	}

	public void CanningThirdParty() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[1]/td[3]/label/span")));
		Assert.assertFalse(canning3rdparty1.isSelected());
		canning3rdparty1.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[2]/td[3]/label/span")));
		Assert.assertFalse(canning3rdparty2.isSelected());
		canning3rdparty2.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[3]/td[3]/label/span")));
		Assert.assertFalse(canning3rdparty3.isSelected());
		canning3rdparty3.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[4]/td[3]/label/span")));
		Assert.assertFalse(canning3rdparty4.isSelected());
		canning3rdparty4.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[5]/td[3]/label/span")));
		Assert.assertFalse(canning3rdparty5.isSelected());
		canning3rdparty5.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[2]/table/tbody/tr[6]/td[3]/label/span")));
=======
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
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
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
<<<<<<< HEAD
	// -------------------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[1]/td[2]/label/span")
	@CacheLookup
	WebElement kegsonsite1;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[2]/td[2]/label/span")
	@CacheLookup
	WebElement kegsonsite2;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[3]/td[2]/label/span")
	@CacheLookup
	WebElement kegsonsite3;

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[1]/td[3]/label/span")
	@CacheLookup
	WebElement kegs3rdparty1;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[2]/td[3]/label/span")
	@CacheLookup
	WebElement kegs3rdparty2;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[3]/td[3]/label/span")
=======
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
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement kegs3rdparty3;

	@FindBy(how = How.XPATH, using = "//*[@id=\"supplier-2\"]")
	@CacheLookup
	WebElement kegsSupplier;
	@FindBy(how = How.XPATH, using = "//*[@id=\"quantity-2\"]")
	@CacheLookup
	WebElement orderquantitykegs;

	public void KegsOnsite() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[1]/td[2]/label/span")));
		Assert.assertFalse(kegsonsite1.isSelected());
		kegsonsite1.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[2]/td[2]/label/span")));
		Assert.assertFalse(kegsonsite2.isSelected());
		kegsonsite2.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[3]/td[2]/label/span")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[1]/td[2]/label/span")));
		Assert.assertFalse(kegsonsite1.isSelected());
		kegsonsite1.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[2]/td[2]/label/span")));
		Assert.assertFalse(kegsonsite2.isSelected());
		kegsonsite2.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[3]/td[2]/label/span")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertFalse(kegsonsite3.isSelected());
		kegsonsite3.click();
	}

	public void KegsThirdParty() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[1]/td[3]/label/span")));
		Assert.assertFalse(kegs3rdparty1.isSelected());
		kegs3rdparty1.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[2]/td[3]/label/span")));
		Assert.assertFalse(kegs3rdparty2.isSelected());
		kegs3rdparty2.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[3]/td[3]/label/span")));
		Assert.assertFalse(kegs3rdparty3.isSelected());
		kegs3rdparty3.click();
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[1]/td[3]/label/span")));
		Assert.assertFalse(kegs3rdparty1.isSelected());
		kegs3rdparty1.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[2]/td[3]/label/span")));
		Assert.assertFalse(kegs3rdparty2.isSelected());
		kegs3rdparty2.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[3]/table/tbody/tr[3]/td[3]/label/span")));
		Assert.assertFalse(kegs3rdparty3.isSelected());
		kegs3rdparty3.click(); 
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	}

	public void detailsKegs() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"supplier-2\"]")));
		Assert.assertTrue(kegsSupplier.isDisplayed());
		kegsSupplier.sendKeys("Testing Website");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"quantity-2\"]")));
		Assert.assertTrue(orderquantitykegs.isDisplayed());
		orderquantitykegs.sendKeys("1400");
	}
<<<<<<< HEAD
	// -------------------------------------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[1]/td[2]/label/span")
	@CacheLookup
	WebElement Casksonsite1;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[2]/td[2]/label/span")
	@CacheLookup
	WebElement Casksonsite2;

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[1]/td[3]/label/span")
	@CacheLookup
	WebElement Casks3rdparty1;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[2]/td[3]/label/span")
=======
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
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement Casks3rdparty2;

	@FindBy(how = How.XPATH, using = "//*[@id=\"supplier-3\"]")
	@CacheLookup
	WebElement casksSupplier;
	@FindBy(how = How.XPATH, using = "//*[@id=\"quantity-3\"]")
	@CacheLookup
	WebElement orderquantitycasks;

	public void CasksOnSite() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[1]/td[2]/label/span")));
		Assert.assertFalse(Casksonsite1.isSelected());
		Casksonsite1.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[2]/td[2]/label/span")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[1]/td[2]/label/span")));
		Assert.assertFalse(Casksonsite1.isSelected());
		Casksonsite1.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[2]/td[2]/label/span")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertFalse(Casksonsite2.isSelected());
		Casksonsite2.click();
	}

	public void CasksThirdParty() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[1]/td[3]/label/span")));
		Assert.assertFalse(Casks3rdparty1.isSelected());
		Casks3rdparty1.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[2]/td[3]/label/span")));
		Assert.assertFalse(Casks3rdparty2.isSelected());
		Casks3rdparty2.click();

=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[1]/td[3]/label/span")));
		Assert.assertFalse(Casks3rdparty1.isSelected());
		Casks3rdparty1.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[4]/table/tbody/tr[2]/td[3]/label/span")));
		Assert.assertFalse(Casks3rdparty2.isSelected());
		Casks3rdparty2.click();
		
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	}

	public void detailscasks() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"supplier-3\"]")));
		Assert.assertTrue(casksSupplier.isDisplayed());
		casksSupplier.sendKeys("Testing Brewery");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"quantity-3\"]")));
		Assert.assertTrue(orderquantitycasks.isDisplayed());
		orderquantitycasks.sendKeys("1400");
	}
<<<<<<< HEAD
	// --------------------------------------------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[5]/table/tbody/tr/td[2]/label/span")
	@CacheLookup
	WebElement bulkcontaineronsite;

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[5]/table/tbody/tr/td[3]/label/span")
=======
	//--------------------------------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[5]/table/tbody/tr/td[2]/label/span")
	@CacheLookup
	WebElement bulkcontaineronsite;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[5]/table/tbody/tr/td[3]/label/span")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement bulkcontainer3rdparty;

	@FindBy(how = How.XPATH, using = "//*[@id=\"supplier-4\"]")
	@CacheLookup
	WebElement bulkcontainerSupplier;
	@FindBy(how = How.XPATH, using = "//*[@id=\"quantity-4\"]")
	@CacheLookup
	WebElement orderquantitybulk;

	public void BulkContainer() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[5]/table/tbody/tr/td[2]/label/span")));
		Assert.assertFalse(bulkcontaineronsite.isSelected());
		bulkcontaineronsite.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[5]/table/tbody/tr/td[3]/label/span")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[5]/table/tbody/tr/td[2]/label/span")));
		Assert.assertFalse(bulkcontaineronsite.isSelected());
		bulkcontaineronsite.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div[5]/table/tbody/tr/td[3]/label/span")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
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
<<<<<<< HEAD

	// ---------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[2]/div/input")
=======
	
	//---------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[2]/div/input")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement continuefive;

	public void continueFive() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[2]/div/input")));
		Assert.assertTrue(continuefive.isEnabled());
		continuefive.click();
	}
	// -----------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/label/span")
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/form/div[2]/div/input")));
		Assert.assertTrue(continuefive.isEnabled());
		continuefive.click();
	}
	//-----------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/label/span")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement offerdelivery;

	public void OfferDelivery() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/label/span")));
		Assert.assertFalse(offerdelivery.isSelected());
		offerdelivery.click();
	}

	// ---------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/label/span")
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/label/span")));
		Assert.assertFalse(offerdelivery.isSelected());
		offerdelivery.click();
	}
	
	//---------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/label/span")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement servicewarehousing;

	public void WarehousingServices() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/label/span")));
		Assert.assertFalse(servicewarehousing.isSelected());
		servicewarehousing.click();
	}

	// ----------------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"subOption1\"]")
	@CacheLookup
	WebElement ambient;

=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/label/span")));
		Assert.assertFalse(servicewarehousing.isSelected());
		servicewarehousing.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"subOption1\"]")
	@CacheLookup
	WebElement ambient;
	
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	public void Ambient() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"subOption1\"]")));
		Assert.assertFalse(ambient.isSelected());
		ambient.click();
	}
<<<<<<< HEAD

	// ----------------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"subOption2\"]")
	@CacheLookup
	WebElement coldstorage;

=======
	
	//----------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"subOption2\"]")
	@CacheLookup
	WebElement coldstorage;
	
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	public void ColdStorage() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"subOption2\"]")));
		Assert.assertFalse(coldstorage.isSelected());
		coldstorage.click();
	}
<<<<<<< HEAD

	// ----------------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[5]/label/span")
=======
	
	//----------------------------------------------------------------------------------------------------------------------------
	
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[5]/label/span")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement bondedstorage;

	public void BondedStorage() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[5]/label/span")));
		Assert.assertFalse(bondedstorage.isSelected());
		bondedstorage.click();
	}

	// -------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[7]/div/input")
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[5]/label/span")));
		Assert.assertFalse(bondedstorage.isSelected());
		bondedstorage.click();
	}
	//-------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[7]/div/input")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement continuesix;

	public void ContinueSix() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[7]/div/input")));
		Assert.assertTrue(continuesix.isEnabled());
		continuesix.click();
	}

	// --------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[1]/input")
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[7]/div/input")));
		Assert.assertTrue(continuesix.isEnabled());
		continuesix.click();
	}
	//--------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[1]/input")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement HMRCregnumber;

	public void HMRCRegisterationNumber() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[1]/input")));
		Assert.assertTrue(HMRCregnumber.isDisplayed());
		HMRCregnumber.sendKeys("KJDHF32KJHAS34");
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"hrmcClasses1\"]")
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[1]/input")));
		Assert.assertTrue(HMRCregnumber.isDisplayed());
		HMRCregnumber.sendKeys("KJDHF32KJHAS34");
	}
	
	//------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"hrmcClasses1\"]")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement classa;

	public void ClassABulkBeer() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"hrmcClasses1\"]")));
		Assert.assertFalse(classa.isSelected());
		classa.click();

	}
<<<<<<< HEAD

	// ---------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[6]/div/input")
=======
	//---------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[6]/div/input")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement continueseven;

	public void ContinueSeven() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[6]/div/input")));
		Assert.assertTrue(continueseven.isEnabled());
		continueseven.click();
	}

	// -----------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"option1\"]")
	@CacheLookup
	WebElement salsa;
	@FindBy(how = How.XPATH, using = "//*[@id=\"option2\"]")
	@CacheLookup
	WebElement brc;
	@FindBy(how = How.XPATH, using = "//*[@id=\"option3\"]")
=======
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
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement sibassfq;

	public void Standard() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"option1\"]")));
		Assert.assertFalse(salsa.isSelected());
<<<<<<< HEAD
		salsa.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"option2\"]")));
		Assert.assertFalse(brc.isSelected());
		brc.click();
=======
		salsa.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"option2\"]")));
		Assert.assertFalse(brc.isSelected());
		brc.click(); 
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"option3\"]")));
		Assert.assertFalse(sibassfq.isSelected());
		sibassfq.click();
	}
<<<<<<< HEAD
	// -------------------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"qualification1\"]")
	@CacheLookup
	WebElement qualione;
	@FindBy(how = How.XPATH, using = "//*[@id=\"qualification2\"]")
	@CacheLookup
	WebElement qualitwo;
	@FindBy(how = How.XPATH, using = "//*[@id=\"qualification3\"]")
=======
	//-------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"qualification1\"]")
	@CacheLookup
	WebElement qualione;
	@FindBy(how=How.XPATH, using="//*[@id=\"qualification2\"]")
	@CacheLookup
	WebElement qualitwo;
	@FindBy(how=How.XPATH, using="//*[@id=\"qualification3\"]")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement qualithree;

	public void Qualifications() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"qualification1\"]")));
		Assert.assertFalse(qualione.isSelected());
<<<<<<< HEAD
		qualione.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"qualification2\"]")));
		Assert.assertFalse(qualitwo.isSelected());
		qualitwo.click();
=======
		qualione.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"qualification2\"]")));
		Assert.assertFalse(qualitwo.isSelected());
		qualitwo.click(); 
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"qualification3\"]")));
		Assert.assertFalse(qualithree.isSelected());
		qualithree.click();
	}

	// -----------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"award1\"]")
	@CacheLookup
	WebElement awardone;
<<<<<<< HEAD
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/button")
=======
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/button")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement addmore;
	@FindBy(how = How.XPATH, using = "//*[@id=\"award2\"]")
	@CacheLookup
	WebElement awardtwo;

	public void Awards() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"award1\"]")));
		Assert.assertTrue(awardone.isDisplayed());
<<<<<<< HEAD
		awardone.sendKeys("ASDFAS3423DHMJ");
	}

	// ----------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[8]/div/input")
=======
		awardone.sendKeys("ASDFAS3423DHMJ"); 
	}
	//----------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[8]/div/input")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement continueeight;

	public void ContinueEight() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[8]/div/input")));
		Assert.assertTrue(continueeight.isEnabled());
		continueeight.click();
	}

	// ---------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[1]/textarea")
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[8]/div/input")));
		Assert.assertTrue(continueeight.isEnabled());
		continueeight.click();
	}
	//---------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[1]/textarea")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement summarybusiness;

	public void SummaryBusiness() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[1]/textarea")));
		Assert.assertTrue(summarybusiness.isDisplayed());
		summarybusiness.sendKeys("Testing supplier onboarding, this is the test summary");
	}
	// ----------------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/input")
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[1]/textarea")));
		Assert.assertTrue(summarybusiness.isDisplayed());
		summarybusiness.sendKeys("Testing supplier onboarding, this is the test summary");
	}
	//----------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/input")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement continuenine;

	public void ContinueNine() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/input")));
		Assert.assertTrue(continuenine.isEnabled());
		continuenine.click();
	}

	// .......................................................................................................................................

	@FindBy(how = How.XPATH, using = "//*[@id=\"logo-image\"]")
	@CacheLookup
	WebElement logosupplier;

	public void profilePictureBuyer() throws IOException, Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"logo-image\"]")));
		logosupplier.click();
		StringSelection ss1 = new StringSelection("/home/ucreate-66/eclipse-workspace/brew/Uploadfiles/test.png");
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(ss1, null);
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyRelease(KeyEvent.VK_V);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);

	}

	@FindBy(how = How.CSS, using = "body > div:nth-child(13) > div > div > div > button")
	@CacheLookup
	WebElement done;

	public void doneLogoSupplier() {
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.cssSelector("body > div:nth-child(13) > div > div > div > button")));
		done.click();
	}

	@FindBy(how = How.XPATH, using = "//input[contains(@id,'imgupload_1')]")
	@CacheLookup
	WebElement fileupload;

	public void fileUploadOne() throws IOException, Exception {
		String file1 = "/home/ucreate-66/eclipse-workspace/brew/Uploadfiles/Brewery2.png";
		String file2 = "/home/ucreate-66/eclipse-workspace/brew/Uploadfiles/Brewery3.png";
		String file3 = "/home/ucreate-66/eclipse-workspace/brew/Uploadfiles/Brewery4.png";
		String file5 = "/home/ucreate-66/eclipse-workspace/brew/Uploadfiles/Brewery.png";
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@id,'imgupload_1')]")));
		fileupload.sendKeys(file1 + "\n" + file2 + "\n" + file3 + "\n" + file5);

	}

	// -----------------------------------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"brewing_images\"]/div[4]/div/input")
	@CacheLookup
	WebElement finish;

	public void finishSupplierOnboarding() {
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"brewing_images\"]/div[4]/div/input")));
		Assert.assertTrue(finish.isDisplayed());
		finish.click();
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------
=======
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
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1

}
