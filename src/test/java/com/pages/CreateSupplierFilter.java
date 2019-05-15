package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CreateSupplierFilter {

	WebDriver driver;
	WebDriverWait wait;

	public CreateSupplierFilter(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"servicesBlock\"]/div[1]/a")
	@CacheLookup
	WebElement supplier;

	public void SupplierLink() {
		wait.until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"servicesBlock\"]/div[1]/a")));
		Assert.assertTrue(supplier.isDisplayed());
		supplier.click();

	}

}
