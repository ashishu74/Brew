<<<<<<< HEAD
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

	public CreateRecipeFinalCostSupplierPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	}

	// -----------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div[1]/div[1]/div/table/tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement activetender;

	public void ActiveTender() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div[1]/div[1]/div/table/tbody/tr[1]/td[1]")));
		activetender.click();
	}

	// -----------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[4]/div/div[2]/textarea")
	@CacheLookup
	WebElement gencomments;

	public void General_Comments() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[4]/div/div[2]/textarea")));
		gencomments.sendKeys("Test comments for final payment page");
	}
	// -----------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[6]/div/div[2]/div[2]")
	@CacheLookup
	WebElement totalcost;
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[6]/div/div[1]/div[2]/input")
	@CacheLookup
	WebElement amountpaymentmilestone;

	public void TotalCost() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[6]/div/div[2]/div[2]")));
		String value = totalcost.getText();
		System.out.println("Value total cost is:" + value);
		value = value.replaceFirst("£", "");
		System.out.println("Value total cost is:" + value);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[6]/div/div[1]/div[2]/input")));
		amountpaymentmilestone.sendKeys(value);

	}

	// ----------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[7]/a[2]")
	@CacheLookup
	WebElement sendtobuyer;

	public void SendToBuyer() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[7]/a[2]")));
		sendtobuyer.click();
	}
=======
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
	
	//-----------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div[1]/div[1]/div/table/tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement activetender;
	 public void ActiveTender() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div[1]/div[1]/div/table/tbody/tr[1]/td[1]")));
		activetender.click();
	 }
		 //-----------------------------------------------------------------------------------------------------------------
		@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[4]/div/div[2]/textarea")
		@CacheLookup
		WebElement gencomments;
		public void General_Comments() throws Exception {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[4]/div/div[2]/textarea")));
			gencomments.sendKeys("Test comments for final payment page");
		 }
		//-----------------------------------------------------------------------------------------------------------------
		 
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[6]/div/div[2]/div[2]")
	 @CacheLookup  
	 WebElement totalcost;
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[6]/div/div[1]/div[2]/input")
	 @CacheLookup
	 WebElement amountpaymentmilestone;
	 public void TotalCost() throws Exception {
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[6]/div/div[2]/div[2]")));
		 String value = totalcost.getText();
		 System.out.println("Value total cost is:" +value);
		 value = value.replaceFirst("£", "");
		 System.out.println("Value total cost is:" +value); 
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[6]/div/div[1]/div[2]/input")));
		 amountpaymentmilestone.sendKeys(value);
		 
	 }
	 //----------------------------------------------------------------------------------------------------------------------
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[7]/a[2]")
	 @CacheLookup
	 WebElement sendtobuyer;
	 public void SendToBuyer() {
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[7]/a[2]")));
		 sendtobuyer.click();
	 }
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
}
