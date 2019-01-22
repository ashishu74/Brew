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
	WebDriverWait wait;
	
	public CreateRecipeFinalCostSupplierPage(WebDriver driver){
        this.driver = driver; 
        wait = new WebDriverWait(driver,20);
    }
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]/ul/li[2]/a")
	@CacheLookup
	WebElement receivedtender;
	 public void Received_tender() {
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]/ul/li[2]/a")));
		 receivedtender.click();
	 }
	//-----------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[1]/a[2]")
	@CacheLookup
	WebElement activetender;
	 public void ActiveTender() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[1]/a[2]")));
		 submitfinalcost.click();
	 }
	 //-----------------------------------------------------------------------------------------------------------------
	 
	//-----------------------------------------------------------------------------------------------------------------
		@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[1]")
		@CacheLookup
		WebElement submitfinalcost;
		 public void SubmitFinalCost() {
			// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[1]")));
			 submitfinalcost.click();
		 }
		 //-----------------------------------------------------------------------------------------------------------------
		 
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div[4]/div/div[1]/div[1]/ul[2]/li[1]/span[2]")
	 @CacheLookup  
	 WebElement totalcost;
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div[6]/div/div[1]/div[2]/input")
	 @CacheLookup
	 WebElement amountpaymentmilestone;
	 public void TotalCost() throws Exception {
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div[4]/div/div[1]/div[1]/ul[2]/li[1]/span[2]")));
		 String value = totalcost.getText();
		 System.out.println("Value total cost is:" +value);
		 value = value.replaceFirst("� ", "");
		 System.out.println("Value total cost is:" +value); 
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div[6]/div/div[1]/div[2]/input")));
		 amountpaymentmilestone.sendKeys("9093.00");
		 
	 }
	
	 //--------------------------------------------------------------------------------------------------------------------
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div[5]/textarea")
	 @CacheLookup
	 WebElement addyourcomments;
	 public void AddYourComment() {
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div[5]/textarea")));
		 addyourcomments.sendKeys("This is dummy comment on your add your comment field recipe final cost page");
	 }
	 
	 //----------------------------------------------------------------------------------------------------------------------
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div[6]/input")
	 @CacheLookup
	 WebElement sendtobuyer;
	 public void SendToBuyer() {
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div[6]/input")));
		 sendtobuyer.click();
	 }
}
