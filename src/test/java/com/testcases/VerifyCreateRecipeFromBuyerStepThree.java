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
import com.pages.CreateProvideRecipeBuyerPage;
import utility.BrowserFactory;

public class VerifyCreateRecipeFromBuyerStepThree {

	WebDriver driver;

	@Test(priority = 1)
	public void createRecipebyBuyer() throws Exception {

		driver = BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
		BuyerSignInPage signin = PageFactory.initElements(driver, BuyerSignInPage.class);

		signin.clickonLoginhomepage();
		signin.enterEmail("deepakkumar@yopmail.com");
		signin.enterPassword("@Test1234");
		signin.clickLoginButton();
		Reporter.log("Buyer logged in to his account to create recipe");
		CreateProvideRecipeBuyerPage recipe = PageFactory.initElements(driver, CreateProvideRecipeBuyerPage.class);

		recipe.ClickTender();
		recipe.clickStatus();
		recipe.Shortlistandprovidenotes();
		Reporter.log("Buyer clicked on approve and provide recipe");

		recipe.Notestosupplier();
		recipe.fileUpload();
		Reporter.log("Buyer added methods and instructions");
		Thread.sleep(2000);
		recipe.SendToSupplier();
		Thread.sleep(2000);
		Reporter.log("Buyer sent recipe to supplier successfully");

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Create recipe done successfully");

	}

	@Test(priority = 2)
	public void scriptPassedorFailedCreateRecipe() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[3]/div/div/div[1]/div/div[1]")));
		boolean status = element.isDisplayed();
		if (status) {
			System.out.println("===== Create recipe script passed ======");
			System.out.println("--------------------------------------------------------------------------");
		} else {
			System.out.println("===== Create recipe script failed ======");
			System.out.println("--------------------------------------------------------------------------");
		}

	}

	@AfterClass
	public void teardown() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}

}
