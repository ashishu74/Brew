package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CreateLoginscenarios {

	WebDriver driver;
	WebDriverWait wait;
	
	public CreateLoginscenarios(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver,20);
		
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/div/form/div[1]/input")
	WebElement email;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/div/form/div[2]/input")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/div/form/div[3]/input")
	WebElement login;
	
	@FindBy(how=How.CSS,using="body > div:nth-child(13) > div > div > svg")
	WebElement close;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div[1]/button")
	WebElement signin;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/div/form/div[1]/span")
	WebElement emailval;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/div/form/div[2]/span")
	WebElement passwordval;

	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/div/form/span")
	WebElement incorrectcredentials;
	
	
	public void noEmailPassword() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div[1]/button")));
		signin.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/form/div[3]/input")));
		login.click();
		VerifyRequiredEmailValidation();
		VerifyRequiredPasswordValidation();
		close.click();
	}
	
	public void onlyEmail() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div[1]/button")));
		signin.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/form/div[1]/input")));
		email.sendKeys("ashishkumar@ucreate.co.in");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/form/div[3]/input")));
		login.click();
		VerifyRequiredPasswordValidation();
		close.click();
		
	}
	
	public void onlypassword() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div[1]/button")));
		signin.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/form/div[2]/input")));
		password.sendKeys("@Test12");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/form/div[3]/input")));
		login.click();
		VerifyRequiredEmailValidation();
		close.click();
	}
	 
	public void invalidEmail() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div[1]/button")));
		signin.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/form/div[1]/input")));
		email.sendKeys("ashishbuyeruser@");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/form/div[3]/input")));
		login.click();
		VerifyInvalidEmailValidation();
		VerifyRequiredPasswordValidation();
		close.click();
	}
	
	public void incorrectcredentials() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div[1]/button")));
		signin.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/form/div[1]/input")));
		email.sendKeys("ashishbuy@yopmail.com");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/form/div[3]/input")));
		password.sendKeys("@Test123");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/form/div[3]/input")));
		login.click();
		VerifyInvalidCredentialsValidation();
		close.click();
	}
	
	public void correctcredentials() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div[1]/button")));
		signin.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/form/div[1]/input")));
		email.sendKeys("ashishbuyer01@yopmail.com");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/form/div[2]/input")));
		password.sendKeys("@Test1234");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/form/div[3]/input")));
		login.click();	
	}
	
	public void VerifyRequiredEmailValidation() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/form/div[1]/span")));
		String actualeemail = emailval.getText(); 
		String expectedemail= "Please enter email address";
		Assert.assertEquals(expectedemail, actualeemail);		
	}
	
	public void VerifyRequiredPasswordValidation() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/form/div[2]/span")));
		String actualpasswordVal = passwordval.getText(); 
		String expectedpasswordval= "Please enter Password";
		Assert.assertEquals(expectedpasswordval, actualpasswordVal);		
	}
	
	public void VerifyInvalidEmailValidation() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/form/div[1]/span")));
		String actualeemail = emailval.getText(); 
		String expectedemail= "Please enter valid email address";
		Assert.assertEquals(expectedemail, actualeemail);		
	}
	
	public void VerifyInvalidCredentialsValidation() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/form/span")));
		String actualerror = incorrectcredentials.getText(); 
		String expectederror= "Sorry, your username and password do not match our records, please try again or click forgot password";
		Assert.assertEquals(expectederror, actualerror); Thread.sleep(1000);		
	}   
}
