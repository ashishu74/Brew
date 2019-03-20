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
	@CacheLookup
	WebElement supplierprofile;
	public void SupplierProfile() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[1]/div/a")));
		Assert.assertTrue(supplierprofile.isDisplayed());
		supplierprofile.click();
	}
	//--------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/button")
	@CacheLookup
	WebElement summaryeditbutton;
	
	public void SummaryEdit() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/button")));
		Assert.assertTrue(summaryeditbutton.isDisplayed());
		summaryeditbutton.click();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/textarea")
	@CacheLookup
	WebElement summarytextfield;
	
	public void SummaryEditTextField() {
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
	@CacheLookup
	WebElement editstandard;
	
	public void EditStandard() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[4]/div[1]/div[1]/div/button")));
		Assert.assertTrue(editstandard.isDisplayed());
		editstandard.click();
	}
	
	@FindBy(how=How.XPATH, using="//*[@id=\"standard1\"]")
	@CacheLookup
	WebElement SALSA;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"standard2\"]")
	@CacheLookup
	WebElement BRC;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"standard3\"]")
	@CacheLookup
	WebElement SibaSSFQ;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"qualification1\"]")
	@CacheLookup
	WebElement gencerti;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"qualification2\"]")
	@CacheLookup
	WebElement diplomabrew;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"qualification3\"]")
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
	@CacheLookup
	WebElement delete;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/button")
	@CacheLookup
	WebElement addawards; 
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/div/input")
	@CacheLookup
	WebElement writeawardname; 
	
	public void EditAwards() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[4]/div[2]/div[1]/div/button")));
		Assert.assertTrue(editawards.isDisplayed());
		editawards.click();
	}
		public void deleteAward() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/a")));
		delete.click();
	}
	public void addAward() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/button")));
		addawards.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/input")));
		writeawardname.sendKeys("DKFJGHK345TKFDH");
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement saveawards; 
	public void SaveAward() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
		Assert.assertTrue(saveawards.isDisplayed());
		saveawards.click(); Thread.sleep(1000);
	}
	
	//----------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[5]/div[1]/div/div[1]/div/button")
	@CacheLookup
	WebElement editServices; 
	@FindBy(how=How.XPATH, using="//*[@id=\"service_list0\"]")
	@CacheLookup
	WebElement servicesone; 
	@FindBy(how=How.XPATH, using="//*[@id=\"service_list1\"]")
	@CacheLookup
	WebElement servicetwo; 
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement saveService; 
	
	public void EditServices() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[5]/div[1]/div/div[1]/div/button")));
		Assert.assertTrue(editServices.isDisplayed());
		editServices.click();
		
	}
	public void ChooseServices() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"service_list0\"]")));
		servicesone.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"service_list1\"]")));
		servicetwo.click();	
	}
	public void saveService() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
		saveService.click(); Thread.sleep(1000);
	}
	//----------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[5]/div[2]/div[1]/div/button")
	@CacheLookup
	WebElement editlogistics; 
	@FindBy(how=How.XPATH, using="//*[@id=\"delivery\"]")
	@CacheLookup
	WebElement deliverycheckbox; 
	@FindBy(how=How.XPATH, using="//*[@id=\"warehousing\"]")
	@CacheLookup
	WebElement warehousingcheckbox;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement savelogistics;
	@FindBy(how=How.XPATH, using="//*[@id=\"warehousingType1\"]")
	@CacheLookup
	WebElement ambient;
	
	public void EditLogistics() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[5]/div[2]/div[1]/div/button")));
		editlogistics.click();
	}
	public void ChooseLogistics() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"delivery\"]")));
		deliverycheckbox.click();
		//warehousingcheckbox.click();
		//ambient.click();
	}
	public void saveLogistics() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
		savelogistics.click(); Thread.sleep(1000);
	}
	//---------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/div[3]/button")
	@CacheLookup
	WebElement profileedit;
	public void ProfileEdit() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/div[3]/button")));
		profileedit.click();
	}
	
	@FindBy(how=How.XPATH, using="//*[@id=\"edit_companyName\"]")
	@CacheLookup
	WebElement company;
	
	public void CompanyProfile() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"edit_companyName\"]")));
		company.clear();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"edit_companyName\"]")));
		company.sendKeys("ucreate.it");
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement saveprofile;
	public void SaveProfile() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
		saveprofile.click(); Thread.sleep(1000);
	}
	//--------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[6]/div[1]/div[1]/div/button")
	@CacheLookup
	WebElement editcapacity;
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/div/input")
	@CacheLookup
	WebElement editcapacityfield;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement savecapacity;
	
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
	@CacheLookup
	WebElement editordervolume;
	@FindBy(how=How.XPATH, using="//*[@id=\"minCapacity\"]")
	@CacheLookup
	WebElement minbrewlength;
	@FindBy(how=How.XPATH, using="//*[@id=\"maxCapacity\"]")
	@CacheLookup
	WebElement maxbrewlength;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[2]/button[1]")
	@CacheLookup
	WebElement saveordervolume;
	
	public void EditOrderVolume() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[6]/div[2]/div[1]/div/button")));
		editordervolume.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"minCapacity\"]")));
		minbrewlength.clear();
		minbrewlength.sendKeys("10000");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"maxCapacity\"]")));
		maxbrewlength.clear();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"maxCapacity\"]")));
		maxbrewlength.sendKeys("40000");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[1]")));
		saveordervolume.click(); Thread.sleep(1000);
	}
	//----------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div[7]/div[1]/div[1]/div/button")
	@CacheLookup
	WebElement editstyle;
	@FindBy(how=How.XPATH, using="//*[@id=\"style7\"]")
	@CacheLookup
	WebElement style7;
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
	@CacheLookup
	WebElement editonsite;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/label")
	@CacheLookup
	WebElement bottleing0;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[2]/label")
	@CacheLookup
	WebElement bottleing1;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/div/div[2]/div[2]/div[1]/label")
	@CacheLookup
	WebElement canning0;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[2]/label")
	@CacheLookup
	WebElement canning1;
	@FindBy(how=How.XPATH, using="//*[@id=\"Bottling-3\"]")
	@CacheLookup
	WebElement minqualtitybottleing;
	@FindBy(how=How.XPATH, using="//*[@id=\"Canning-4\"]")
	@CacheLookup
	WebElement minqualtitycanning;
	@FindBy(how=How.XPATH, using="//*[@id=\"signup-submit-btn\"]")
	@CacheLookup
	WebElement saveonsite;
	
	public void EditOnsitePackaging() throws Exception {
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
	}
}