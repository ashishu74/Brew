<<<<<<< HEAD
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CreateEditSupplierPage {

	WebDriver driver;
	WebDriverWait wait;

	public CreateEditSupplierPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
	}

	// --------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[1]/div/a")
=======
	package com.pages;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	
	public class CreateEditSupplierPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public CreateEditSupplierPage(WebDriver driver){
        this.driver = driver; 
        wait = new WebDriverWait(driver,30);
    }
	//--------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[1]/div/a")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement supplierprofile;

	public void SupplierProfile() {
<<<<<<< HEAD
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[1]/div/a")));
		Assert.assertTrue(supplierprofile.isDisplayed());
		supplierprofile.click();
	}

	// --------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/button")
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[1]/div/a")));
		Assert.assertTrue(supplierprofile.isDisplayed());
		supplierprofile.click();
	}
	//--------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/button")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement summaryeditbutton;

	public void SummaryEdit() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/button")));
		Assert.assertTrue(summaryeditbutton.isDisplayed());
		summaryeditbutton.click();
	}

	// --------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div[1]/div/div/textarea")
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/button")));
		Assert.assertTrue(summaryeditbutton.isDisplayed());
		summaryeditbutton.click();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/textarea")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement summarytextfield;

	public void SummaryEditTextField() {
<<<<<<< HEAD
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/textarea")));
		summarytextfield.clear();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/textarea")));
		summarytextfield.sendKeys("Testing New content and updateing the existing text with new text");
	}

	// --------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.CSS, using = "body > div:nth-child(13) > div > div > div > div.edit-profile-modal_btn-row > button.btn.btn-primary.editProfile-saveButton")
	@CacheLookup
	WebElement savebuttonsummary;

	public void saveUpdatedSummary() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
				"body > div:nth-child(13) > div > div > div > div.edit-profile-modal_btn-row > button.btn.btn-primary.editProfile-saveButton")));
		Assert.assertTrue(savebuttonsummary.isDisplayed());
		Actions act = new Actions(driver);
		act.moveToElement(savebuttonsummary).build().perform();
		savebuttonsummary.click();
		Thread.sleep(1000);
	}

	// --------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[4]/div[1]/div[1]/div/button")
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/textarea")));
		summarytextfield.clear();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/textarea")));
		summarytextfield.sendKeys("Testing New content and updateing the existing text with new text");
	}
	//--------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.CSS, using="body > div:nth-child(13) > div > div > div > div.edit-profile-modal_btn-row > button.btn.btn-primary.editProfile-saveButton")
	@CacheLookup
	WebElement savebuttonsummary;
	
	public void saveUpdatedSummary() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div:nth-child(13) > div > div > div > div.edit-profile-modal_btn-row > button.btn.btn-primary.editProfile-saveButton")));
		Assert.assertTrue(savebuttonsummary.isDisplayed());
		Actions act = new Actions(driver);
		act.moveToElement(savebuttonsummary).build().perform();
        savebuttonsummary.click(); Thread.sleep(1000); 
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[4]/div[1]/div[1]/div/button")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement editstandard;

	public void EditStandard() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[4]/div[1]/div[1]/div/button")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[4]/div[1]/div[1]/div/button")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertTrue(editstandard.isDisplayed());
		editstandard.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"standard1\"]")
	@CacheLookup
	WebElement SALSA;

	@FindBy(how = How.XPATH, using = "//*[@id=\"standard2\"]")
	@CacheLookup
	WebElement BRC;

	@FindBy(how = How.XPATH, using = "//*[@id=\"standard3\"]")
	@CacheLookup
	WebElement SibaSSFQ;

	@FindBy(how = How.XPATH, using = "//*[@id=\"qualification1\"]")
	@CacheLookup
	WebElement gencerti;

	@FindBy(how = How.XPATH, using = "//*[@id=\"qualification2\"]")
	@CacheLookup
	WebElement diplomabrew;

	@FindBy(how = How.XPATH, using = "//*[@id=\"qualification3\"]")
	@CacheLookup
	WebElement masterbrew;

	public void Standard() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"standard1\"]")));
		SALSA.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"standard2\"]")));
		BRC.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"standard3\"]")));
		SibaSSFQ.click();
	}

	public void Qualification() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"qualification1\"]")));
		gencerti.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"qualification2\"]")));
		diplomabrew.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"qualification3\"]")));
		masterbrew.click();
	}
<<<<<<< HEAD

	@FindBy(how = How.CSS, using = "body > div:nth-child(13) > div > div > div > div.edit-profile-modal_btn-row > button.btn.btn-primary.editProfile-saveButton")
	@CacheLookup
	WebElement savestandquali;

	public void SaveStandardQualification() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
				"body > div:nth-child(13) > div > div > div > div.edit-profile-modal_btn-row > button.btn.btn-primary.editProfile-saveButton")));
		savestandquali.click();
		Thread.sleep(1000);
	}

	// -----------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[4]/div[2]/div[1]/div/button")
	@CacheLookup
	WebElement editawards;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div[1]/div/div/div/a")
=======
	
	@FindBy(how=How.CSS, using="body > div:nth-child(13) > div > div > div > div.edit-profile-modal_btn-row > button.btn.btn-primary.editProfile-saveButton")
	@CacheLookup
	WebElement savestandquali;
	
	public void SaveStandardQualification() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > div:nth-child(13) > div > div > div > div.edit-profile-modal_btn-row > button.btn.btn-primary.editProfile-saveButton")));
		savestandquali.click(); Thread.sleep(1000); 
	}
	//-----------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[4]/div[2]/div[1]/div/button")
	@CacheLookup
	WebElement editawards;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/div/a")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement delete;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div[1]/div/div/button")
	@CacheLookup
<<<<<<< HEAD
	WebElement addawards;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div[1]/div/div/div/input")
=======
	WebElement addawards; 
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/div/input")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement writeawardname;

	public void EditAwards() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[4]/div[2]/div[1]/div/button")));
		Assert.assertTrue(editawards.isDisplayed());
		editawards.click();
	}

	public void deleteAward() {
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/a")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[4]/div[2]/div[1]/div/button")));
		Assert.assertTrue(editawards.isDisplayed());
		editawards.click();
	}
		public void deleteAward() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/a")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		delete.click();
	}

	public void addAward() {
<<<<<<< HEAD
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/button")));
		addawards.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/input")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/button")));
		addawards.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/input")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		writeawardname.sendKeys("DKFJGHK345TKFDH");
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
<<<<<<< HEAD
	WebElement saveawards;

	public void SaveAward() throws Exception {
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
		Assert.assertTrue(saveawards.isDisplayed());
		saveawards.click();
		Thread.sleep(1000);
	}

	// ----------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[5]/div[1]/div/div[1]/div/button")
=======
	WebElement saveawards; 
	public void SaveAward() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
		Assert.assertTrue(saveawards.isDisplayed());
		saveawards.click(); Thread.sleep(1000);
	}
	
	//----------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[5]/div[1]/div/div[1]/div/button")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement editServices;
	@FindBy(how = How.XPATH, using = "//*[@id=\"service_list0\"]")
	@CacheLookup
	WebElement servicesone;
	@FindBy(how = How.XPATH, using = "//*[@id=\"service_list1\"]")
	@CacheLookup
	WebElement servicetwo;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement saveService;

	public void EditServices() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[5]/div[1]/div/div[1]/div/button")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[5]/div[1]/div/div[1]/div/button")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertTrue(editServices.isDisplayed());
		editServices.click();

	}

	public void ChooseServices() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"service_list0\"]")));
		servicesone.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"service_list1\"]")));
<<<<<<< HEAD
		servicetwo.click();
	}

	public void saveService() throws Exception {
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
		saveService.click();
		Thread.sleep(1000);
	}
	// ----------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[5]/div[2]/div[1]/div/button")
=======
		servicetwo.click();	
	}
	public void saveService() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
		saveService.click(); Thread.sleep(1000);
	}
	//----------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[5]/div[2]/div[1]/div/button")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement editlogistics;
	@FindBy(how = How.XPATH, using = "//*[@id=\"delivery\"]")
	@CacheLookup
	WebElement deliverycheckbox;
	@FindBy(how = How.XPATH, using = "//*[@id=\"warehousing\"]")
	@CacheLookup
	WebElement warehousingcheckbox;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement savelogistics;
	@FindBy(how = How.XPATH, using = "//*[@id=\"warehousingType1\"]")
	@CacheLookup
	WebElement ambient;

	public void EditLogistics() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[5]/div[2]/div[1]/div/button")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[5]/div[2]/div[1]/div/button")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		editlogistics.click();
	}

	public void ChooseLogistics() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"delivery\"]")));
		deliverycheckbox.click();
		// warehousingcheckbox.click();
		// ambient.click();
	}
<<<<<<< HEAD

	public void saveLogistics() throws Exception {
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
		savelogistics.click();
		Thread.sleep(1000);
	}
	// ---------------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/div[3]/button")
=======
	public void saveLogistics() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
		savelogistics.click(); Thread.sleep(1000);
	}
	//---------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/div[3]/button")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement profileedit;

	public void ProfileEdit() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/div[3]/button")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/div[3]/button")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		profileedit.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"edit_companyName\"]")
	@CacheLookup
	WebElement company;

	public void CompanyProfile() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"edit_companyName\"]")));
		company.clear();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"edit_companyName\"]")));
		company.sendKeys("ucreate.it");
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement saveprofile;
<<<<<<< HEAD

	public void SaveProfile() throws Exception {
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
		saveprofile.click();
		Thread.sleep(1000);
	}
	// --------------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[6]/div[1]/div[1]/div/button")
=======
	public void SaveProfile() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
		saveprofile.click(); Thread.sleep(1000);
	}
	//--------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[6]/div[1]/div[1]/div/button")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement editcapacity;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div[1]/div/div/div/input")
	@CacheLookup
	WebElement editcapacityfield;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement savecapacity;
<<<<<<< HEAD

	public void AnnualCapacityEdit() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[6]/div[1]/div[1]/div/button")));
		editcapacity.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/input")));
		editcapacityfield.clear();
		editcapacityfield.sendKeys("50000");
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
		savecapacity.click();
		Thread.sleep(1000);
	}

	// -------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[6]/div[2]/div[1]/div/button")
=======
	
	public void AnnualCapacityEdit() throws Exception {
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[6]/div[1]/div[1]/div/button")));
	editcapacity.click();
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/input")));
	editcapacityfield.clear();
	editcapacityfield.sendKeys("50000");
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
	savecapacity.click(); Thread.sleep(1000);
	}
	//-------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[6]/div[2]/div[1]/div/button")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement editordervolume;
	@FindBy(how = How.XPATH, using = "//*[@id=\"minCapacity\"]")
	@CacheLookup
	WebElement minbrewlength;
	@FindBy(how = How.XPATH, using = "//*[@id=\"maxCapacity\"]")
	@CacheLookup
	WebElement maxbrewlength;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement saveordervolume;

	public void EditOrderVolume() throws Exception {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[6]/div[2]/div[1]/div/button")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[6]/div[2]/div[1]/div/button")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		editordervolume.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"minCapacity\"]")));
		minbrewlength.clear();
		minbrewlength.sendKeys("10000");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"maxCapacity\"]")));
		maxbrewlength.clear();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"maxCapacity\"]")));
		maxbrewlength.sendKeys("40000");
<<<<<<< HEAD
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
		saveordervolume.click();
		Thread.sleep(1000);
	}

	// ----------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[7]/div[1]/div[1]/div/button")
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
		saveordervolume.click(); Thread.sleep(1000);
	}
	//----------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[7]/div[1]/div[1]/div/button")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement editstyle;
	@FindBy(how = How.XPATH, using = "//*[@id=\"style7\"]")
	@CacheLookup
	WebElement style7;
<<<<<<< HEAD
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement savestyle;

	public void EditStyles() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[7]/div[1]/div[1]/div/button")));
		editstyle.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"style7\"]")));
		style7.click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
		Actions act = new Actions(driver);
		act.moveToElement(savestyle).build().perform();
		savestyle.click();
		Thread.sleep(1000);
	}

	// ------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[7]/div[2]/div[1]/div/button")
=======
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement savestyle;
	
	public void EditStyles() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[7]/div[1]/div[1]/div/button")));
		editstyle.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"style7\"]")));
		style7.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
		Actions act = new Actions(driver);
		act.moveToElement(savestyle).build().perform();
		savestyle.click(); Thread.sleep(1000);
	}
	//------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[7]/div[2]/div[1]/div/button")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement editonsite;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/label")
	@CacheLookup
	WebElement bottleing0;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[2]/label")
	@CacheLookup
	WebElement bottleing1;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div[1]/div/div/div/div[2]/div[2]/div[1]/label")
	@CacheLookup
	WebElement canning0;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[2]/label")
	@CacheLookup
	WebElement canning1;
	@FindBy(how = How.XPATH, using = "//*[@id=\"Bottling-3\"]")
	@CacheLookup
	WebElement minqualtitybottleing;
	@FindBy(how = How.XPATH, using = "//*[@id=\"Canning-4\"]")
	@CacheLookup
	WebElement minqualtitycanning;
	@FindBy(how = How.XPATH, using = "//*[@id=\"signup-submit-btn\"]")
	@CacheLookup
	WebElement saveonsite;

	public void EditOnsitePackaging() throws Exception {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[7]/div[2]/div[1]/div/button")));
		editonsite.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/label")));
		bottleing0.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[2]/label")));
		bottleing1.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/div[2]/div[2]/div[1]/label")));
		canning0.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[2]/label")));
		canning1.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"Bottling-3\"]")));
		minqualtitybottleing.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"Canning-4\"]")));
		minqualtitycanning.sendKeys("1000");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"signup-submit-btn\"]")));
		saveonsite.click();
		Thread.sleep(1000);
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[7]/div[2]/div[1]/div/button")));
		editonsite.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/label")));
		bottleing0.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[2]/label")));
		bottleing1.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/div[2]/div[2]/div[1]/label")));
		canning0.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[2]/label")));
		canning1.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"Bottling-3\"]")));
		minqualtitybottleing.click(); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"Canning-4\"]")));
		minqualtitycanning.sendKeys("1000");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"signup-submit-btn\"]")));
		saveonsite.click(); Thread.sleep(1000);
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	}
}