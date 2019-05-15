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
import org.testng.Assert;

public class CreateBuyerOnboarding {
	WebDriver driver;
	WebDriverWait wait;

	public CreateBuyerOnboarding(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
	}
	
	//..............................................................................................................................
		@FindBy (how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]")
		@CacheLookup
		WebElement beerproduction;
		
		public void beerProduction() {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[2]")));
			Assert.assertTrue(beerproduction.isDisplayed());
			beerproduction.click();
		}
		
		//..............................................................................................................................................
		@FindBy (how = How.CSS, using = "#app > div > div > div.mainwrap > div.contentWrap > div.c011 > div > div.c019 > div > div:nth-child(3)")
		@CacheLookup
		WebElement ownbeerbrand;
		
		public void ownBeerBrand() {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div > div > div.mainwrap > div.contentWrap > div.c011 > div > div.c019 > div > div:nth-child(3)")));
			Assert.assertTrue(ownbeerbrand.isDisplayed());
			ownbeerbrand.click();
		}
		
		//............................................................................................................................................................
		
		@FindBy (how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[3]/div[5]")
		@CacheLookup
		WebElement countrynewZealand;
		
		public void countryNewZealand() {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[3]/div[5]")));
			Assert.assertTrue(countrynewZealand.isDisplayed());
			countrynewZealand.click();
		}

	// ------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@name=\"first_name\"]")
	@CacheLookup
	WebElement fname;

	public void FirstName() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name=\"first_name\"]")));
		Assert.assertTrue(fname.isDisplayed());
		fname.sendKeys("Testing");
	}

	// ---------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@name=\"last_name\"]")
	@CacheLookup
	WebElement lname;

	public void LastName() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name=\"last_name\"]")));
		Assert.assertTrue(lname.isDisplayed());
		lname.sendKeys("SQA");
	}

	// --------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@name=\"brewery_name\"]")
	@CacheLookup
	WebElement companyname;

	public void CompanyName() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name=\"brewery_name\"]")));
		Assert.assertTrue(companyname.isDisplayed());
		companyname.sendKeys("ucreate");
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@name=\"email\"]")
	@CacheLookup
	WebElement email;

	public void Emailid() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		email.sendKeys("buyerusr" + randomInt + "@mailinator.com");
	}

	// ----------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@name=\"password\"]")
	@CacheLookup
	WebElement password;

	public void Password() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name=\"password\"]")));
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("@Test1234");
	}

	// ---------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@name=\"phone\"]")
	@CacheLookup
	WebElement telephon;

	public void telephoneNumber() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name=\"phone\"]")));
		Assert.assertTrue(telephon.isDisplayed());
		telephon.sendKeys("09876028861");
	}
	
	//............................................................................................................................
	@FindBy(how = How.XPATH, using = "//*[@id=\"payment_term_condition\"]")
	@CacheLookup
	WebElement checkboxterms;

	public void termsConditions() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"payment_term_condition\"]")));
		Assert.assertTrue(checkboxterms.isEnabled());
		checkboxterms.click();
	}
	
	// --------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[3]/form/div[9]/button")
	@CacheLookup
	WebElement continueaccount;

	public void continueCreateAccount() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div[3]/form/div[9]/button")));
		Assert.assertTrue(continueaccount.isEnabled());
		continueaccount.click();
	}
	
	// -----------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[3]/div/label")
	@CacheLookup
	WebElement puborrestruant;

	public void PubOrRestruant() {
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[3]/div/label")));
		Assert.assertFalse(puborrestruant.isSelected());
		puborrestruant.click();
	}
	
	// ---------------------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[8]/input")
	@CacheLookup
	WebElement continuetwo;

	public void ContinueTwo() {
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[8]/input")));
		Assert.assertTrue(continuetwo.isEnabled());
		continuetwo.click();
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"logo-image\"]")
	@CacheLookup
	WebElement logobuyer;

	public void profilePictureBuyer() throws IOException, Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"logo-image\"]")));
		logobuyer.click();
		StringSelection ss = new StringSelection("/home/ucreate-66/eclipse-workspace/brew/Uploadfiles/test.png");
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(ss, null);
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyRelease(KeyEvent.VK_V);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
	}
	// ----------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"PlacesAutocomplete__root\"]/input")
	@CacheLookup
	WebElement location;

	public void LocationBuyer() throws Exception {
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"PlacesAutocomplete__root\"]/input")));
		location.sendKeys("123");
		Thread.sleep(1000);
		location.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		location.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		location.sendKeys(Keys.ENTER);
	}

	// -------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[3]/textarea")
	@CacheLookup
	WebElement summary;

	public void SummaryBuyer() {
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[3]/textarea")));
		Assert.assertTrue(summary.isDisplayed());
		summary.sendKeys(
				"Similique sit et. Congue, exercitationem. Reiciendis. scelerisque vehicula, sapiente maiores iste leo, nam ");
	}

	// -----------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[4]/input")
	@CacheLookup
	WebElement finish;

	public void finishBuyerOnboarding() {
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[4]/input")));
		Assert.assertTrue(finish.isEnabled());
		finish.click();
	}
	
	
}
