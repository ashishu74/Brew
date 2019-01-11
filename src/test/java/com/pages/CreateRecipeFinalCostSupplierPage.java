package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateRecipeFinalCostSupplierPage {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]/ul/li[2]/a")
	@CacheLookup
	WebElement receivedtender;
	 public void Received_tender() {
		 receivedtender.click();
	 }
	//-----------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement submitfinalcost;
	 public void SubmitFinalCost() {
		 WebDriver drv = null;
		WebDriverWait wait = new WebDriverWait(drv,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) submitfinalcost));
		 submitfinalcost.click();
	 }
	 //-----------------------------------------------------------------------------------------------------------------
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[3]/div[3]/div/div[1]")
	 @CacheLookup  
	 WebElement totalcost;
	 @FindBy(how=How.XPATH,using="//*[@id=\"amount1\"]")
	 @CacheLookup
	 WebElement amountpaymentmilestone;
	 public void TotalCost() {
		 String value = totalcost.getText();
		 System.out.println("Value total cost is:" +value);
		 value = value.replaceFirst("� ", "");
		 System.out.println("Value total cost is:" +value);
		 amountpaymentmilestone.sendKeys(value);
		 
	 }
	
	 //--------------------------------------------------------------------------------------------------------------------
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[5]/textarea")
	 @CacheLookup
	 WebElement addyourcomments;
	 public void AddYourComment() {
		 addyourcomments.sendKeys("This is dummy comment on your add your comment field recipe final cost page");
	 }
	 
	 //----------------------------------------------------------------------------------------------------------------------
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[6]/input")
	 @CacheLookup
	 WebElement sendtobuyer;
	 public void SendToBuyer() {
		 sendtobuyer.sendKeys("This is dummy comment on your add your comment field recipe final cost page");
	 }
}
