	package com.pages;
	
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
	
	public CreateBuyerOnboarding(WebDriver driver){
        this.driver = driver; 
        wait = new WebDriverWait(driver,30);
    }

	//------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"signup-form\"]/div[1]/label[1]/span")
	@CacheLookup
	WebElement buyer;
	public void buyerRadio() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"signup-form\"]/div[1]/label[1]/span")));
		Assert.assertFalse(buyer.isSelected());
		buyer.click();
	}
	//------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"firstname\"]")
	@CacheLookup 
	WebElement fname; 
	public void FirstName() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"firstname\"]")));
		Assert.assertTrue(fname.isDisplayed());
		fname.sendKeys("Testing");
	}  
	//---------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"lastname\"]")
	@CacheLookup
	WebElement lname;
	public void LastName() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"lastname\"]")));
		Assert.assertTrue(lname.isDisplayed());
		lname.sendKeys("SQA");
	}
	//--------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"brewery\"]")
	@CacheLookup
	WebElement companyname;
	public void CompanyName() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"brewery\"]")));
		Assert.assertTrue(companyname.isDisplayed());
		companyname.sendKeys("ucreate");
	}
	//------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"emailId\"]")
	@CacheLookup
	WebElement email;
	public void Emailid() {
		Random randomGenerator = new Random(); 
		int randomInt = randomGenerator.nextInt(1000);  
		email.sendKeys("buyeruser"+ randomInt +"@mailinator.com"); 
	}
	//----------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"password\"]")
	@CacheLookup
	WebElement password;
	public void Password() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"password\"]")));
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("@Test1234");
	}
	//---------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"telephone\"]")
	@CacheLookup
	WebElement telephon;
	public void telephoneNumber() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"telephone\"]")));
		Assert.assertTrue(telephon.isDisplayed());
		telephon.sendKeys("09876028861");
	}
	//--------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"signup-form\"]/div[9]/input")
	@CacheLookup
	WebElement continueone;
	public void ContinueOne() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"signup-form\"]/div[9]/input")));
		Assert.assertTrue(continueone.isEnabled());
		continueone.click();
	} 
	//-----------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div/label/span")
	@CacheLookup
	WebElement puborrestruant;
	public void PubOrRestruant() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div/label/span")));
		Assert.assertFalse(puborrestruant.isSelected());
		puborrestruant.click();
	}
	//---------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div/div[8]/input")
	@CacheLookup
	WebElement continuetwo;
	public void ContinueTwo() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div/div[8]/input")));
		Assert.assertTrue(continuetwo.isEnabled());
		continuetwo.click();
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"logo-image\"]")
	@CacheLookup
	WebElement logobuyer;
	public void profilePictureBuyer() throws IOException, Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"logo-image\"]")));
		logobuyer.click(); 
		Runtime.getRuntime().exec("C:\\Autoit\\logofile.exe");
	}
	//----------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH,using="//*[@id=\"PlacesAutocomplete__root\"]/input")
	@CacheLookup
	WebElement location;
	public void LocationBuyer() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"PlacesAutocomplete__root\"]/input")));
		location.sendKeys("123");
		Thread.sleep(1000);location.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);location.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);location.sendKeys(Keys.ENTER);
	}
	//-------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/textarea")
	@CacheLookup
	WebElement summary;
	public void SummaryBuyer() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/textarea")));
		Assert.assertTrue(summary.isDisplayed());
		summary.sendKeys("Similique sit et. Congue, exercitationem. Reiciendis. scelerisque vehicula, sapiente maiores iste leo, nam ");
	}
	//-----------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div/div[4]/input")
	@CacheLookup
	WebElement continuethree;
	public void ContinueThree() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/div/div[4]/input")));
		Assert.assertTrue(continuethree.isEnabled());
		continuethree.click();	
	}
	
	}
