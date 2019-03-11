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
	
	public class CreateQuoteSupplierPage {
    WebDriver driver; 
	WebDriverWait wait;
		
	public CreateQuoteSupplierPage(WebDriver driver) {
		this.driver = driver; 
		wait = new WebDriverWait(driver,10);
	
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div[3]/div[1]/table/tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement tendertoreview;
	public void TenderToreview() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div[3]/div[1]/table/tbody/tr[1]/td[1]")));
		tendertoreview.click();
	}
	
	//--------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[3]/div/a[3]/span")
	@CacheLookup
	WebElement createquoteallreq;
	public void createquote_allrequirement() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[3]/div/a[3]/span")));
		Assert.assertTrue(createquoteallreq.isDisplayed());
		createquoteallreq.click();
	}
	
	//------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[1]/div[3]/div[3]/div[2]/div[1]/div[1]/div[1]/div/input")
	@CacheLookup
	WebElement priceperunit; 
	public void Price_unit() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[1]/div[3]/div[3]/div[2]/div[1]/div[1]/div[1]/div/input")));
		Assert.assertTrue(priceperunit.isDisplayed());
		Thread.sleep(1000); priceperunit.sendKeys("1.00");
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/textarea")
	@CacheLookup
	WebElement commentBuyerpriceperunit;
	public void comments_to_buyer_perunit() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/textarea")));
		Assert.assertTrue(commentBuyerpriceperunit.isDisplayed());
		commentBuyerpriceperunit.sendKeys("Per facilisi itaque dapibus, ullam soluta at repellat pede nullam, lacinia! Ultricies sed ut minim quibusdam ac, sit tincidunt consequat sint laoreet, cumque facilis ratione platea ad reiciendis, fusce.");
	}
	//-------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[1]/div[7]/div[1]/div[1]/div/div/input")
	@CacheLookup
	WebElement warehousingcost;
	public void warehousing_cost() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[1]/div[7]/div[1]/div[1]/div/div/input")));
		Assert.assertTrue(warehousingcost.isDisplayed());
		warehousingcost.sendKeys("2.00");
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[1]/div[7]/div[1]/div[2]/div[1]/textarea")
	@CacheLookup
	WebElement commentBuyerwarehousingcost;
	public void comments_to_buyer_warehousing() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[1]/div[7]/div[1]/div[2]/div[1]/textarea")));
		Assert.assertTrue(commentBuyerwarehousingcost.isDisplayed());
		commentBuyerwarehousingcost.sendKeys("Per facilisi itaque dapibus, ullam soluta at repellat pede nullam, lacinia! Ultricies sed ut minim quibusdam ac, sit tincidunt consequat sint laoreet, cumque facilis ratione platea ad reiciendis, fusce.");
	}
	//---------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[2]/div/div[2]/textarea")
	@CacheLookup
	WebElement commentBuyer;
	public void comments_to_buyer() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[2]/div/div[2]/textarea")));
		Assert.assertTrue(commentBuyer.isDisplayed());
		commentBuyer.sendKeys("Per facilisi itaque dapibus, ullam soluta at repellat pede nullam, lacinia! Ultricies sed ut minim quibusdam ac, sit tincidunt consequat sint laoreet, cumque facilis ratione platea ad reiciendis, fusce.");
	}
	
	//--------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[3]/a")
	@CacheLookup
	WebElement submitquote;
	public void submit_quote() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div[3]/a")));
		Assert.assertTrue(submitquote.isDisplayed());
		submitquote.click();	
	}
	 
}


