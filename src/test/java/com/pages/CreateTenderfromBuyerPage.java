<<<<<<< HEAD
package com.pages;

import java.util.UUID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CreateTenderfromBuyerPage {
	WebDriver driver;
	WebDriverWait wait;

	public CreateTenderfromBuyerPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 50);
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/a")
	@CacheLookup
	WebElement newtender;

	public void newTender() {
		wait.until(ExpectedConditions.presenceOfElementLocated(
				(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/a"))));
		Assert.assertTrue(newtender.isDisplayed());
		newtender.click();
	}

	/*
	 * ===============================================Step One
	 * =====================================================
	 */
	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"title\"]")
	@CacheLookup
	WebElement nametender;

=======
	package com.pages;
	
	import java.util.UUID;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	
	public class CreateTenderfromBuyerPage {
	WebDriver driver;
	WebDriverWait wait;
	
	public CreateTenderfromBuyerPage(WebDriver driver){
        this.driver = driver; 
        wait = new WebDriverWait(driver,50);
    }
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/a")
	@CacheLookup
	WebElement newtender;
	
	public void newTender() {
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/a"))));
		Assert.assertTrue(newtender.isDisplayed());
		newtender.click();
	}
	
	/*===============================================Step One =====================================================*/
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"title\"]")
	@CacheLookup
	WebElement nametender; 
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	public void nameOfTender() {
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//*[@id=\"title\"]"))));
		Assert.assertTrue(nametender.isDisplayed());
		String uuid = UUID.randomUUID().toString();
		nametender.sendKeys(uuid);
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//textarea[@id='desc']")
	@CacheLookup
	WebElement description;

	public void descriptionTender() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@id='desc']")));
		Assert.assertTrue(description.isDisplayed());
		description.sendKeys("Testing tender description. Testing tender description.");
	}
<<<<<<< HEAD

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[2]/div[1]/label/span")
=======
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[2]/div[1]/label/span")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement tellus;

	public void tellUsMore() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[2]/div[1]/label/span")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[2]/div[1]/label/span")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		tellus.click();
	}

	// -------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"communication1\"]")
	@CacheLookup
	WebElement suppcomm;

	public void supplierCommunication() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"communication1\"]")));
		suppcomm.click();
	}
<<<<<<< HEAD

	// ------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[4]/div/div[4]/label/span")
	@CacheLookup
	WebElement oneoff;

	public void contractTypeOneOff() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[4]/div/div[4]/label/span")));
=======
	//------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[4]/div/div[4]/label/span")
	@CacheLookup
	WebElement oneoff;
	public void contractTypeOneOff() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[4]/div/div[4]/label/span")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		oneoff.click();
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.CSS, using = "div.half-width:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")
	@CacheLookup
<<<<<<< HEAD
	WebElement dateto;

	@FindBy(how = How.XPATH, using = "//*[@id=\"date-picker\"]/div/div[2]/div/div[2]/div[2]/div[5]/div[6]")
	@CacheLookup
	WebElement date1;

	public void submitQuoteBy() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
				"div.half-width:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")));
		Assert.assertTrue(dateto.isDisplayed());
		dateto.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"date-picker\"]/div/div[2]/div/div[2]/div[2]/div[5]/div[6]")));
=======
	WebElement dateto; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"date-picker\"]/div/div[2]/div/div[2]/div[2]/div[5]/div[6]")
	@CacheLookup
	WebElement date1;
	
	public void submitQuoteBy() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.half-width:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")));
		Assert.assertTrue(dateto.isDisplayed());
		dateto.click();	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"date-picker\"]/div/div[2]/div/div[2]/div[2]/div[5]/div[6]")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertTrue(date1.isDisplayed());
		date1.click();
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.CSS, using = "div.half-width:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")
	@CacheLookup
	WebElement datefrom;
<<<<<<< HEAD

	@FindBy(how = How.XPATH, using = "//*[@id=\"date-picker\"]/div/div[2]/div/div[2]/div[2]/div[5]/div[7]")
=======
	
	@FindBy(how=How.XPATH,using="//*[@id=\"date-picker\"]/div/div[2]/div/div[2]/div[2]/div[5]/div[7]")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement date2;

	public void deliverContractBy() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
				"div.half-width:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")));
		Assert.assertTrue(datefrom.isDisplayed());
		datefrom.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"date-picker\"]/div/div[2]/div/div[2]/div[2]/div[5]/div[7]")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.half-width:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")));
		Assert.assertTrue(datefrom.isDisplayed());
		datefrom.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"date-picker\"]/div/div[2]/div/div[2]/div[2]/div[5]/div[7]")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertTrue(date2.isDisplayed());
		date2.click();
	}
<<<<<<< HEAD

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[6]/div/button")
=======
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[6]/div/button")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement next;

	public void nextForm() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[6]/div/button")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[6]/div/button")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertTrue(next.isDisplayed());
		next.click();
	}

	/*
	 * ==============================================================Step Two
	 * =================================================================
	 */
	@FindBy(how = How.XPATH, using = "//*[@id=\"tender_volume\"]/form/div[1]/div/div[2]/div[1]/div[2]/div[1]/label/span")
	@CacheLookup
	WebElement beertype;

	public void Ales() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"tender_volume\"]/form/div[1]/div/div[2]/div[1]/div[2]/div[1]/label/span")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tender_volume\"]/form/div[1]/div/div[2]/div[1]/div[2]/div[1]/label/span")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertTrue(beertype.isDisplayed());
		beertype.click();
	}

	// ----------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"beer-style-0\"]")
	@CacheLookup
	WebElement beerstyle;

	public void beerStyle() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"beer-style-0\"]")));
		beerstyle.sendKeys("QA Beer");
	}

	// -----------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"brand-name-0\"]")
	@CacheLookup
	WebElement brandname;

	public void Brandname() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"beer-style-0\"]")));
		brandname.sendKeys("Beer QA ");
	}

	// ---------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"description-0\"]")
	@CacheLookup
	WebElement descriptin;

	public void descripTion() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"description-0\"]")));
		descriptin.sendKeys("Lorem ipsum lorem ipsum doloer sit amet loripsum lorem dolor sit lorem amet");
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"abv-value-0\"]")
	@CacheLookup
	WebElement abv;

	public void ABV() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"abv-value-0\"]")));
		abv.sendKeys("10");
	}

	// ----------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"special-requirements-0-1\"]")
	@CacheLookup
	WebElement vegan;

	@FindBy(how = How.XPATH, using = "//*[@id=\"special-requirements-0-2\"]")
	@CacheLookup
	WebElement gluten;

	@FindBy(how = How.XPATH, using = "//*[@id=\"special-requirements-0-3\"]")
	@CacheLookup
	WebElement organic;

	public void spRequirement() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"special-requirements-0-1\"]")));
		vegan.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"special-requirements-0-2\"]")));
		gluten.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"special-requirements-0-3\"]")));
		organic.click();
	}

	// --------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"finish-0-1\"]")
	@CacheLookup
	WebElement unfiltered;
<<<<<<< HEAD

	@FindBy(how = How.XPATH, using = "//*[@id=\"finish-0-3\"]")
=======
	
	@FindBy(how=How.XPATH,using="//*[@id=\"finish-0-3\"]")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement unpasterised;

	public void finish() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"finish-0-1\"]")));
		unfiltered.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"finish-0-3\"]")));
		unpasterised.click();
	}
<<<<<<< HEAD

	@FindBy(how = How.XPATH, using = "//*[@id=\"tender_volume\"]/form/div[1]/div/div[2]/div[9]/section/div[1]/div/div[1]/div/div/input")
=======
	
	@FindBy(how=How.XPATH,using="//*[@id=\"tender_volume\"]/form/div[1]/div/div[2]/div[9]/section/div[1]/div/div[1]/div/div/input")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement volume;

	public void volume_ales() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"tender_volume\"]/form/div[1]/div/div[2]/div[9]/section/div[1]/div/div[1]/div/div/input")));
		Assert.assertTrue(volume.isDisplayed());
		volume.sendKeys("15000");
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"react-select-2--value\"]")
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tender_volume\"]/form/div[1]/div/div[2]/div[9]/section/div[1]/div/div[1]/div/div/input")));
		 Assert.assertTrue(volume.isDisplayed());
		 volume.sendKeys("15000");
	 }
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-2--value\"]")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement container;

	@FindBy(how = How.XPATH, using = "//*[@id='react-select-2--option-1']")
	@CacheLookup
	WebElement containerbottle;

	public void container_type() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-2--value\"]")));
		Assert.assertTrue(container.isDisplayed());
		container.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='react-select-2--option-1']")));
<<<<<<< HEAD
		containerbottle.click();
=======
		containerbottle.click();	
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"react-select-3--value\"]/div[1]")
	@CacheLookup
	WebElement size;

	@FindBy(how = How.XPATH, using = "//*[@id=\"react-select-3--option-3\"]")
	@CacheLookup
	WebElement size355;

	public void size_type() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-3--value\"]/div[1]")));
		Assert.assertTrue(size.isDisplayed());
		size.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-3--option-3\"]")));
		size355.click();
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"react-select-10--value\"]")
	@CacheLookup
	WebElement color;

	@FindBy(how = How.XPATH, using = "//*[@id=\"react-select-10--option-2\"]")
	@CacheLookup
	WebElement colorblack;

	public void color_type() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-10--value\"]")));
		Assert.assertTrue(color.isDisplayed());
		color.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-10--option-2\"]")));
		colorblack.click();
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"react-select-11--value\"]")
	@CacheLookup
	WebElement shelflife;

	@FindBy(how = How.XPATH, using = "//*[@id=\"react-select-11--option-2\"]")
	@CacheLookup
	WebElement shelflifeX;

	public void shelflife_type() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-11--value\"]")));
		Assert.assertTrue(shelflife.isDisplayed());
		shelflife.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-11--option-2\"]")));
		shelflifeX.click();

	}

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"react-select-12--value\"]")
	@CacheLookup
	WebElement labelling;

	@FindBy(how = How.XPATH, using = "//*[@id=\"react-select-12--option-2\"]")
	@CacheLookup
	WebElement labellingX;

	public void labelling_type() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-12--value\"]")));
		Assert.assertTrue(labelling.isDisplayed());
		labelling.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-12--option-2\"]")));
		labellingX.click();
	}

	// ----------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"react-select-13--value\"]")
	@CacheLookup
	WebElement casetype;

	@FindBy(how = How.XPATH, using = "//*[@id=\"react-select-13--option-1\"]")
	@CacheLookup
	WebElement casetypex;

	public void case_type() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-13--value\"]")));
		Assert.assertTrue(casetype.isDisplayed());
		casetype.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-13--option-1\"]")));
		casetypex.click();
	}

	// -------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"react-select-14--value\"]")
	@CacheLookup
	WebElement casesize;

	@FindBy(how = How.XPATH, using = "//*[@id=\"react-select-14--option-2\"]")
	@CacheLookup
	WebElement casesizex;

	public void case_size() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-14--value\"]")));
		Assert.assertTrue(casesize.isDisplayed());
		casesize.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-14--option-2\"]")));
		casesizex.click();
	}

	// --------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"neck-label-0-0-neck-label-0-0\"]")
	@CacheLookup
	WebElement necklabel;

	public void Necklabel() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"neck-label-0-0-neck-label-0-0\"]")));
		Assert.assertTrue(necklabel.isEnabled());
		necklabel.click();
	}
<<<<<<< HEAD

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"tender_volume\"]/form/div[2]/button")
=======
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"tender_volume\"]/form/div[2]/button")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement continuethreestep;

	public void continue_step_three() {
<<<<<<< HEAD
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tender_volume\"]/form/div[2]/button")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tender_volume\"]/form/div[2]/button")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertTrue(continuethreestep.isDisplayed());
		continuethreestep.click();

	}
<<<<<<< HEAD

	/*
	 * =================================Step
	 * Four=========================================================================
	 */
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div")
=======
	
	/*=================================Step Four=========================================================================*/
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement duty;

	public void duty() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div")));
		Assert.assertTrue(duty.isDisplayed());
		duty.click();
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[3]/button")
	@CacheLookup
	WebElement continuefourstep;

	public void duty_continue() throws InterruptedException {
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[3]/button")));
		//Assert.assertTrue(continuefourstep.isEnabled());
		Thread.sleep(3000);continuefourstep.click();
	}

	/*
	 * =================================Step
	 * Five=========================================================================
	 */
	@FindBy(how = How.CSS, using = "#app > div > div > div.route-wrap > div > div.createTenderWrap > div.stepsWrap > div.whiteBox > div > div.servicesWrap > div:nth-child(1) > div > label > span")
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div")));
		Assert.assertTrue(duty.isDisplayed());
		duty.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[3]/button")
	@CacheLookup
	WebElement continuefourstep; 
	public void duty_continue() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[3]/button")));
		Assert.assertTrue(continuefourstep.isEnabled());
		continuefourstep.click();
	}
	
	/*=================================Step Five=========================================================================*/
	@FindBy(how=How.CSS,using="#app > div > div > div.route-wrap > div > div.createTenderWrap > div.stepsWrap > div.whiteBox > div > div.servicesWrap > div:nth-child(1) > div > label > span")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement arrangecollection;

	public void arrange_collection() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
				"#app > div > div > div.route-wrap > div > div.createTenderWrap > div.stepsWrap > div.whiteBox > div > div.servicesWrap > div:nth-child(1) > div > label > span")));
		Assert.assertTrue(arrangecollection.isDisplayed());
		arrangecollection.click();
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"storage1\"]")
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div > div > div.route-wrap > div > div.createTenderWrap > div.stepsWrap > div.whiteBox > div > div.servicesWrap > div:nth-child(1) > div > label > span")));
		Assert.assertTrue(arrangecollection.isDisplayed());
		arrangecollection.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"storage1\"]")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement storage;

	public void storage_click() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"storage1\"]")));
		Assert.assertTrue(storage.isEnabled());
<<<<<<< HEAD
		storage.click();
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[1]/div/label/span")
	@CacheLookup
	WebElement ambient;

	public void ambient_click() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[1]/div/label/span")));
		Assert.assertTrue(ambient.isDisplayed());
		ambient.click();
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[3]/input")
	@CacheLookup
	WebElement duration;

	public void duration_click() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[3]/input")));
=======
		storage.click();		
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[1]/div/label/span")
	@CacheLookup
	WebElement ambient;
	public void ambient_click() {	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[1]/div/label/span")));
		Assert.assertTrue(ambient.isDisplayed());
		ambient.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[3]/input")
	@CacheLookup
	WebElement duration; 
	public void duration_click() {	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[3]/input")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertTrue(duration.isDisplayed());
		duration.click();
		duration.sendKeys("10 days");
	}
<<<<<<< HEAD

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[3]/button")
=======
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[3]/button")
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
	@CacheLookup
	WebElement continuefivestep;

	public void stepfive_sontinue() {
<<<<<<< HEAD
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[3]/button")));
=======
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[3]/button")));
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		Assert.assertTrue(continuefivestep.isDisplayed());
		continuefivestep.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"standard1\"]")
	@CacheLookup
	WebElement standardone;

	@FindBy(how = How.XPATH, using = "//*[@id=\"standard2\"]")
	@CacheLookup
	WebElement standardtwo;

	@FindBy(how = How.XPATH, using = "//*[@id=\"standard3\"]")
	@CacheLookup
	WebElement standardthree;

	public void standards() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"standard1\"]")));
		standardone.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"standard2\"]")));
		standardtwo.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"standard3\"]")));
		standardthree.click();
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"qualification1\"]")
	@CacheLookup
	WebElement qualione;

	@FindBy(how = How.XPATH, using = "//*[@id=\"qualification2\"]")
	@CacheLookup
	WebElement qualitwo;

	@FindBy(how = How.XPATH, using = "//*[@id=\"qualification3\"]")
	@CacheLookup
<<<<<<< HEAD
	WebElement qualithree;

	public void qualifications() {
=======
	WebElement qualithree; 
	public void qualifications(){
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"qualification1\"]")));
		qualione.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"qualification2\"]")));
		qualitwo.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"qualification3\"]")));
		qualithree.click();
	}
<<<<<<< HEAD

	// ----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[4]/button")
	@CacheLookup
	WebElement continuesixstep;

	public void stepsix_continue() {
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[4]/button")));
		Assert.assertTrue(continuesixstep.isDisplayed());
		continuesixstep.click();
	}

	@FindBy(how = How.CSS, using = "#app > div > div > div.route-wrap > div > div.createTenderWrap.confirmSuppliersWrap > div > div.whiteBox.summary-whiteBox > div > div.selectSupplierCountPanel > div.btn-group > button")
	@CacheLookup
	WebElement continuesevenstep;

	public void continue_step_seven() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
				"#app > div > div > div.route-wrap > div > div.createTenderWrap.confirmSuppliersWrap > div > div.whiteBox.summary-whiteBox > div > div.selectSupplierCountPanel > div.btn-group > button")));
		Assert.assertTrue(continuesevenstep.isDisplayed());
		continuesevenstep.click();
	}

	// -----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/button")
	WebElement nextterms;

	public void TermsConditions() {
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/button")));
		Assert.assertTrue(nextterms.isDisplayed());
		nextterms.click();
	}
	
	// -----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id=\"breweryStepSeven\"]/div[2]/div[2]/a[2]")
	WebElement submit;

	public void submitTender() {
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//*[@id=\"breweryStepSeven\"]/div[2]/div[2]/a[2]")));
		Assert.assertTrue(submit.isDisplayed());
		submit.click();
	}

=======
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[4]/button")
	@CacheLookup
	WebElement continuesixstep;
	public void stepsix_continue() { 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div[4]/button")));
		Assert.assertTrue(continuesixstep.isDisplayed());
		continuesixstep.click();
	}
	
	@FindBy(how=How.CSS,using="#app > div > div > div.route-wrap > div > div.createTenderWrap.confirmSuppliersWrap > div > div.whiteBox.summary-whiteBox > div > div.selectSupplierCountPanel > div.btn-group > button")
	@CacheLookup
	WebElement continuesevenstep;
	public void continue_step_seven() {	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div > div > div.route-wrap > div > div.createTenderWrap.confirmSuppliersWrap > div > div.whiteBox.summary-whiteBox > div > div.selectSupplierCountPanel > div.btn-group > button")));
		Assert.assertTrue(continuesevenstep.isDisplayed());
		continuesevenstep.click();
	}
	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"breweryStepSeven\"]/div[2]/div[2]/button")
	WebElement submit;
	public void submitTender() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"breweryStepSeven\"]/div[2]/div[2]/button")));
		Assert.assertTrue(submit.isDisplayed());
		submit.click();
	}		
		
>>>>>>> a67b8f5397566c18f219b324a8e7421038d20ce1
}
