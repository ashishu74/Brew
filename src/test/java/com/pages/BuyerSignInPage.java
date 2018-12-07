/**
 * 
 */
package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuyerSignInPage {
	
	WebDriver driver;
	
	public BuyerSignInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div[1]/button")
	WebElement clicklogin;
	
	public void clickonLoginhomepage()
	{
		clicklogin.click();
	}
	
	//
	@FindBy(how=How.NAME,using="loginemail")
	WebElement email;
	
	public void enterEmail(String mail)
	{
		email.sendKeys(mail);
	}
	
	@FindBy(how=How.NAME,using="loginpassword")
	WebElement pwd;
	
	public void enterPassword(String pass)
	{
		pwd.sendKeys(pass);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/div/form/div[3]/input")
	WebElement login;
	
	public void clickLoginButton()
	{
		login.click();
	}
	
}
