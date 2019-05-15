package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.pages.BuyerSignInPage;
import com.pages.CreateQuoteSupplierPage;
import utility.BrowserFactory;

public class VerifyCreateQuoteFromSupplierStepTwo {
	WebDriver driver;

	@Test(priority = 1)
	public void createQuotebySupplier() throws Exception {

		driver = BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
		BuyerSignInPage signin = PageFactory.initElements(driver, BuyerSignInPage.class);

		signin.clickonLoginhomepage();

		signin.enterEmail("vineeshbehl@yopmail.com");
		signin.enterPassword("@Test1234");
		signin.clickLoginButton();

		Reporter.log("Supplier member logged in to account");

		CreateQuoteSupplierPage quote = PageFactory.initElements(driver, CreateQuoteSupplierPage.class);

		Reporter.log("Supplier member moved to dashboard page");
		quote.TenderToreview();
		quote.createquote_allrequirement();

		quote.Price_unit();
		quote.comments_to_buyer_perunit();
		quote.warehousing_cost();
		quote.comments_to_buyer_warehousing();
		Reporter.log("Supplier added warehousing cost");
		quote.comments_to_buyer();

		Reporter.log("Supplier added comments ");
		quote.submit_quote();
		Reporter.log("Supplier created quote successfully");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("create quote script execution completed");

	}

	@Test(priority = 2)
	public void scriptPassedorFailedCreateQuote() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div[1]")));
		boolean status = element.isDisplayed();
		if (status) {
			System.out.println("===== create Quote script passed ======");
			System.out.println("--------------------------------------------------------------------------");
		} else {
			System.out.println("===== Create Quote script failed ======");
			System.out.println("--------------------------------------------------------------------------");
		}

	}

	@AfterClass
	public void teardown() throws Exception {
		driver.close();
	}

}
