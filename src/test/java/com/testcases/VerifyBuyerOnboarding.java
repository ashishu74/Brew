package com.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.pages.CreateBuyerOnboarding;
import utility.BrowserFactory;

public class VerifyBuyerOnboarding {
	WebDriver driver;

	@Test
	public void createBuyer() throws Exception {

		driver = BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com/register");
		driver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);
		CreateBuyerOnboarding buyer = PageFactory.initElements(driver, CreateBuyerOnboarding.class);
		Thread.sleep(2000);
		buyer.beerProduction();
		Thread.sleep(2000);
		buyer.ownBeerBrand();
		Thread.sleep(2000);
		buyer.countryNewZealand();
		buyer.FirstName();
		Reporter.log("Buyer added first name");

		buyer.LastName();
		Reporter.log("Buyer added last name");

		buyer.CompanyName();
		Reporter.log("Buyer added company name");

		buyer.Emailid();
		Reporter.log("Buyer added email address");

		buyer.telephoneNumber();
		buyer.Password();
		Reporter.log("Buyer added general information");
		buyer.termsConditions();
		buyer.continueCreateAccount();

		buyer.PubOrRestruant();
		buyer.ContinueTwo();
		
		buyer.profilePictureBuyer();
		buyer.LocationBuyer();
		Reporter.log("Buyer added his location");

		buyer.SummaryBuyer();
		Reporter.log("Buyer added summary");

		buyer.finishBuyerOnboarding();
		Reporter.log("Buyer account created successfully");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}