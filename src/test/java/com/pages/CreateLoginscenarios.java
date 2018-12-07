package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class CreateLoginscenarios {

	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/div/form/div[1]/input")
	WebElement email;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/div/form/div[2]/input")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/div/form/div[3]/input")
	WebElement login;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/svg")
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
		signin.click();
		login.click();
	}
	public void onlyEmail() {
		email.sendKeys("ashishkumar@ucreate.co.in");
		login.click();
	}
	
	public void onlypassword() throws InterruptedException {
		email.clear(); Thread.sleep(1000);
		password.sendKeys("@Test12");
		login.click();
	}
	 
	public void invalidEmail() {
		email.sendKeys("ashishbuyeruser@");
		login.click();
	}
	public void incorrectcredentials() {
		email.clear();
		email.sendKeys("ashishbuyeruser@yopmail.com");
		login.click();
	}
	
	public void correctcredentials() {
		password.clear();
		password.sendKeys("@Test1234");
		login.click();	
	}
	
	public void VerifyRequiredEmailValidation() {
		String actualeemail = emailval.getText(); 
		String expectedemail= "Please enter email address";
		Assert.assertEquals(expectedemail, actualeemail);		
	}
	
	public void VerifyRequiredPasswordValidation() {
		String actualpasswordVal = passwordval.getText(); 
		String expectedpasswordval= "Please enter Password";
		Assert.assertEquals(expectedpasswordval, actualpasswordVal);		
	}
	
	public void VerifyInvalidEmailValidation() {
		String actualeemail = emailval.getText(); 
		String expectedemail= "Please enter valid email address";
		Assert.assertEquals(expectedemail, actualeemail);		
	}
	
	public void VerifyInvalidCredentialsValidation() {
		String actualerror = incorrectcredentials.getText(); 
		String expectederror= "Sorry, your username and password do not match our records, please try again or click forgot password";
		Assert.assertEquals(expectederror, actualerror);		
	}
}
