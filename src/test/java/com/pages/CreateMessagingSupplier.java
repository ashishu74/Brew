	package com.pages;	
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
	
	public class CreateMessagingSupplier {
	WebDriver driver;
	WebDriverWait wait;
	
	public CreateMessagingSupplier(WebDriver driver){
        this.driver = driver; 
        wait = new WebDriverWait(driver,30);
    }

	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div[1]/div[1]/table/tbody/tr[1]/td[1]/p[1]")
	@CacheLookup
	WebElement tender;   
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[3]/div/article")
	@CacheLookup
	WebElement messagefield; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[3]/button")
	@CacheLookup
	WebElement send; 
	
	public void messagingSupplier() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div[1]/div[1]/table/tbody/tr[1]/td[1]/p[1]")));
		tender.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[3]/div/article")));
		messagefield.click();
		messagefield.sendKeys("Test Message from supplier.");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[3]/button")));
		send.click();
	}
}
