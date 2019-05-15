package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyerSignInPage {

	WebDriver driver;
	WebDriverWait wait;

	public BuyerSignInPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
	}

	// ---------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/button")
	WebElement clicklogin;

	public void clickonLoginhomepage() {
		wait.until(ExpectedConditions.presenceOfElementLocated(
				(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/button"))));
		clicklogin.click();
	}

	// ---------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.NAME, using = "loginemail")
	WebElement email;

	public void enterEmail(String mail) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("loginemail")));
		email.sendKeys(mail);
	}

	// ---------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.NAME, using = "loginpassword")
	WebElement pwd;

	public void enterPassword(String pass) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("loginpassword")));
		pwd.sendKeys(pass);
	}

	// ---------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div/form/div[3]/input")
	WebElement login;

	public void clickLoginButton() {
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/form/div[3]/input")));
		login.click();
	}
	// ---------------------------------------------------------------------------------------------------------------------------
}
