package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateProvideRecipeBuyerPage {
	WebDriver driver;
	WebDriverWait wait;

	public CreateProvideRecipeBuyerPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	}

	// --------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement openTender;

	public void ClickTender() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[1]")));
		openTender.click();
	}
	// -----------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[2]/table/tbody/tr/td[1]/span[2]")
	@CacheLookup
	WebElement statusToReview;

	public void clickStatus() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[2]/table/tbody/tr/td[1]/span[2]")));
		statusToReview.click();
	}
	// ---------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[3]/div/div/div[5]/div/button[2]")
	@CacheLookup
	WebElement shortlistandprovidenotes;

	public void Shortlistandprovidenotes() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[3]/div/div/div[5]/div/button[2]")));
		shortlistandprovidenotes.click();
	}
	// -----------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"test\"]")
	@CacheLookup
	WebElement notestosupplier;

	public void Notestosupplier() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"test\"]")));
		notestosupplier.sendKeys("QA UI testing methods and instructions");
	}

	// -------------------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"recipeFiles\"]")
	@CacheLookup
	WebElement fileupload;

	public void fileUpload() throws AWTException {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"recipeFiles\"]")));
		fileupload.click();
		StringSelection ss = new StringSelection("/home/ucreate-66/eclipse-workspace/brew/Uploadfiles/sample.pdf");
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(ss, null);
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyRelease(KeyEvent.VK_V);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);

	}

	// -------------------------------------------------------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[3]/div/div/div[3]/button")
	@CacheLookup
	WebElement submittosupplierforreview;

	public void SendToSupplier() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[3]/div/div/div[3]/button")));
		submittosupplierforreview.click();
	}
	// ---------------------------------------------------------------------------------------------------------------------------
}
