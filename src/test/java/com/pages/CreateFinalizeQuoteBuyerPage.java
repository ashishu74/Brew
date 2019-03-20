	package com.pages;	
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	public class CreateFinalizeQuoteBuyerPage {
	WebDriver driver;
	WebDriverWait wait;
		
	public CreateFinalizeQuoteBuyerPage(WebDriver driver){
	this.driver = driver; 
	wait = new WebDriverWait(driver,20);
	}

	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[2]/span")
	@CacheLookup
	WebElement clickfinalizing;
	
	public void ClickFinalizing() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[2]/span")));
		clickfinalizing.click();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[1]/table/tbody/tr/td[2]")
	@CacheLookup
	WebElement clicktofinalize; 
	
	public void ClickFinalize() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[1]/table/tbody/tr/td[2]")));
		clicktofinalize.click();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[3]/div/div/div[4]/div/a[2]")
	@CacheLookup
	WebElement acceptandfinalize;
	
	public void AcceptFinalize() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[3]/div/div/div[4]/div/a[2]")));
		acceptandfinalize.click();
	} 
	
	//-------------------------------------------------------------------------------------------------------------------------------------
	
}
