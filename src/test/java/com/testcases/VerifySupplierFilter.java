package com.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.pages.CreateSupplierFilter;

import utility.BrowserFactory;

public class VerifySupplierFilter {
	WebDriver driver;

@Test
public void loginScenarios() throws Exception {
	
	driver=BrowserFactory.startBrowser("chrome", "https://brewbroker-react.herokuapp.com/find-brewery-supplier");
	CreateSupplierFilter csf = PageFactory.initElements(driver, CreateSupplierFilter.class);
	csf.SupplierLink();
}
@AfterTest
public void tearDown() {
	driver.close();
}
}
