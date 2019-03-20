package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateMessagingBuyer {
	WebDriver driver;
	WebDriverWait wait;
	
	public CreateMessagingBuyer(WebDriver driver){
        this.driver = driver; 
        wait = new WebDriverWait(driver,30);
    }


	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement tender;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[1]/table/tbody/tr/td[2]")
	@CacheLookup
	WebElement quote;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[3]/div/article")
	@CacheLookup
	WebElement messaging; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[3]/button")
	@CacheLookup
	WebElement send;
	
	public void messagingBuyer() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[1]")));
		tender.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[1]/table/tbody/tr/td[2]")));
		quote.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[3]/div/article")));
		messaging.click();
		messaging.sendKeys("Test message for testing messaging functionality.");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[3]/button")));
		send.click();
	}
}
