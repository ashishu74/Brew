	package com.pages;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
		
	public class CreateProvideRecipeBuyerPage {
	WebDriver driver;
	WebDriverWait wait;
		
	public CreateProvideRecipeBuyerPage(WebDriver driver) {
	this.driver = driver; 
	wait = new WebDriverWait(driver,20);
	}
		
	//--------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement openTender; 
			
	public void ClickTender() {
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[1]")));
	openTender.click();
	}
	//-----------------------------------------------------------------------------------------------------------------------
		
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr/td[2]/span")
	@CacheLookup 
	WebElement statusToReview;
	public void clickStatus() {
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr/td[2]/span")));
	statusToReview.click(); 
	}
	//---------------------------------------------------------------------------------------------------------------------
		
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div[10]/div/input[2]")
	@CacheLookup
	WebElement approveandproviderecipe;
	public void approveAndProvideRecipe() {
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div[10]/div/input[2]")));
	approveandproviderecipe.click();
	}
	//-----------------------------------------------------------------------------------------------------------------------
		
	@FindBy(how=How.XPATH,using="//*[@id=\"test\"]")
	@CacheLookup
	WebElement textmethodsInstructions;
	public void textMethodsInstructions() {
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"test\"]")));
	textmethodsInstructions.sendKeys("QA UI testing methods and instructions");
	}
		
	//-------------------------------------------------------------------------------------------------------------------------------
		
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div[3]/button")
	@CacheLookup
	WebElement submittosupplier;
	public void SendToSupplier() {
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div[3]/button")));
	submittosupplier.click();
	}
	//---------------------------------------------------------------------------------------------------------------------------
}
		
