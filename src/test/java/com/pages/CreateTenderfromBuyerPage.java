/**
 * 
 */
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
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/a")
	@CacheLookup
	WebElement newtender;
	
	public void newTender() {
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/a"))));
		Assert.assertTrue(newtender.isDisplayed());
		newtender.click();
	}
	
	/*===============================================Step One =====================================================*/
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//input[@id='title']")
	@CacheLookup
	WebElement nametender; 
	public void nameOfTender() {
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@id='title']"))));
		Assert.assertTrue(nametender.isDisplayed());
		String uuid = UUID.randomUUID().toString();	
		nametender.sendKeys(uuid);
	}	
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//textarea[@id='desc']")
	@CacheLookup
	WebElement description;
	public void descriptionTender() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@id='desc']")));
		Assert.assertTrue(description.isDisplayed());
		description.sendKeys("Testing tender description. Testing tender description.");	
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[2]/div[2]/label")
	@CacheLookup
	WebElement tellus;
	public void tellUsMore() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[2]/div[2]/label")));
		tellus.click();
	}
	//-------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"communication1\"]")
	@CacheLookup
	WebElement suppcomm;
	public void supplierCommunication() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"communication1\"]")));
		suppcomm.click();
	}
	//------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[4]/div/div[3]/label")
	@CacheLookup
	WebElement quarterly;
	public void contractTypeQuarterly() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[4]/div/div[3]/label")));
		quarterly.click();
	}
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.CSS,using="div.half-width:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")
	@CacheLookup
	WebElement dateto; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"date-picker\"]/div/div[2]/div/div[2]/div[2]/div[5]/div[6]")
	@CacheLookup
	WebElement date1;
	public void submitQuoteBy() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.half-width:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")));
		Assert.assertTrue(dateto.isDisplayed());
		dateto.click();	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"date-picker\"]/div/div[2]/div/div[2]/div[2]/div[5]/div[6]")));
		Assert.assertTrue(date1.isDisplayed());
		date1.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.CSS,using="div.half-width:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")
	@CacheLookup
	WebElement datefrom;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"date-picker\"]/div/div[2]/div/div[2]/div[2]/div[5]/div[7]")
	@CacheLookup
	WebElement date2;
	
	public void deliverContractBy() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.half-width:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")));
		Assert.assertTrue(datefrom.isDisplayed());
		datefrom.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"date-picker\"]/div/div[2]/div/div[2]/div[2]/div[5]/div[7]")));
		Assert.assertTrue(date2.isDisplayed());
		date2.click();	 
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[6]/div/input[2]")
	@CacheLookup
	WebElement next;
	
	public void nextForm() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[6]/div/input[2]")));
		Assert.assertTrue(next.isDisplayed());
		next.click();
	}
	   
	/*==============================================================Step Two =================================================================*/
	@FindBy(how=How.XPATH,using="//*[@id=\"tender_volume\"]/form/div[1]/div/div[2]/div[1]/div[2]/div[1]/label/span")
	@CacheLookup
	WebElement beertype;
	public void Ales() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tender_volume\"]/form/div[1]/div/div[2]/div[1]/div[2]/div[1]/label/span")));
		Assert.assertTrue(beertype.isDisplayed());
		beertype.click();
	}
	//----------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"beer-style-0\"]")
	@CacheLookup
	WebElement beerstyle;	
	public void beerStyle() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"beer-style-0\"]")));
		beerstyle.sendKeys("QA Beer");
	}
	//-----------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"brand-name-0\"]")
	@CacheLookup
	WebElement brandname;
	public void Brandname() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"beer-style-0\"]")));
		brandname.sendKeys("Beer QA ");
	}
	//---------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"description-0\"]")
	@CacheLookup
	WebElement descriptin;
	public void descripTion() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"description-0\"]")));
		descriptin.sendKeys("Lorem ipsum lorem ipsum doloer sit amet loripsum lorem dolor sit lorem amet");
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"abv-value-0\"]")
	@CacheLookup
	WebElement abv;
	public void ABV() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"abv-value-0\"]")));
		abv.sendKeys("10");
	}
	//----------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"special-requirements-0-1\"]")
	@CacheLookup
	WebElement vegan;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"special-requirements-0-2\"]")
	@CacheLookup
	WebElement gluten;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"special-requirements-0-3\"]")
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
	//--------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"finish-0-1\"]")
	@CacheLookup
	WebElement unfiltered;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"finish-0-2\"]")
	@CacheLookup
	WebElement finned;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"finish-0-3\"]")
	@CacheLookup
	WebElement unpasterised;
	
	public void finish() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"finish-0-1\"]")));
		unfiltered.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"finish-0-2\"]")));
		finned.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"finish-0-3\"]")));
		unpasterised.click();
	}
	//--------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH,using="//input[@id='Brewingservices1']")
	@CacheLookup
	WebElement contractBrewing;
	public void brewingServices() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='Brewingservices1']")));
		contractBrewing.click();
		Assert.assertTrue(contractBrewing.isEnabled()); Thread.sleep(4000);
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[1]/label/span")
	@CacheLookup
	WebElement ales;
	public void style_Ales() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[1]/label/span")));
		Assert.assertTrue(ales.isDisplayed()); Thread.sleep(4000);
		ales.click();	
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"1\"]")
	@CacheLookup
	WebElement alesABP; 
	public void ales_ABP() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"1\"]")));
		Assert.assertTrue(alesABP.isDisplayed()); Thread.sleep(4000);
		alesABP.sendKeys("40");
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[1]/div/div/label/span")
	@CacheLookup
	WebElement alesicanprovide;
	public void ales_icanprovide() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[1]/div/div/label/span")));
		Assert.assertTrue(alesicanprovide.isDisplayed()); Thread.sleep(4000);
		alesicanprovide.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/label/span")
	@CacheLookup
	WebElement lager;
	public void style_lager() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/label/span")));
		Assert.assertTrue(lager.isDisplayed());
		lager.click();	
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"2\"]")
	@CacheLookup
	WebElement lagerABP; 
	public void lager_ABP() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"2\"]")));
		Assert.assertTrue(lagerABP.isDisplayed());
		lagerABP.sendKeys("40");
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div/label/span")
	@CacheLookup
	WebElement lagericanprovide; 
	public void lager_icanprovide() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div/label/span")));
		Assert.assertTrue(lagericanprovide.isDisplayed());
		lagericanprovide.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[4]/input[2]")
	@CacheLookup
	WebElement formtwocontinue; 
	public void next_Form_two() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[4]/input[2]")));
		Assert.assertTrue(formtwocontinue.isDisplayed());
		formtwocontinue.click();
	}
	
	/*=================================================================Step Three ==================================================================*/
	@FindBy(how=How.XPATH,using="//input[@id='contract1']")
	@CacheLookup
	WebElement oneoff;
	public void contract_type() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='contract1']")));
		oneoff.click();
		Assert.assertTrue(oneoff.isEnabled());
	}
	
	//--------------------------------------Entering Ales--------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"tender_volume\"]/form/div[1]/div/div[2]/div[8]/section/div[1]/div/div[1]/div/div/input")
	@CacheLookup
	WebElement volume;
	public void volume_ales() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tender_volume\"]/form/div[1]/div/div[2]/div[8]/section/div[1]/div/div[1]/div/div/input")));
		 Assert.assertTrue(volume.isDisplayed());
		 volume.sendKeys("2500");
	 }
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-2--value\"]")
	@CacheLookup
	WebElement container; 
	
	@FindBy(how=How.XPATH,using="//*[@id='react-select-2--option-1']")
	@CacheLookup
	WebElement containerbottle; 
	public void container_type() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-2--value\"]")));
		Assert.assertTrue(container.isDisplayed());
		container.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='react-select-2--option-1']")));
		containerbottle.click();	
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-3--value\"]/div[1]")
	@CacheLookup
	WebElement size; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-3--option-3\"]")
	@CacheLookup
	WebElement size355; 
	public void size_type() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-3--value\"]/div[1]")));
		Assert.assertTrue(size.isDisplayed());
		size.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-3--option-3\"]")));
		size355.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------

	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-10--value\"]")
	@CacheLookup
	WebElement color; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-10--option-2\"]")
	@CacheLookup
	WebElement colorblack; 
	public void color_type() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-10--value\"]")));
		Assert.assertTrue(color.isDisplayed());
		color.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-10--option-2\"]")));
		colorblack.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-11--value\"]")
	@CacheLookup
	WebElement shelflife;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-11--option-2\"]")
	@CacheLookup
	WebElement shelflifeX;
	public void shelflife_type() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-11--value\"]")));
		Assert.assertTrue(shelflife.isDisplayed());
		shelflife.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-11--option-2\"]")));
		shelflifeX.click();
		
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-12--value\"]")
	@CacheLookup
	WebElement labelling;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-12--option-2\"]")
	@CacheLookup
	WebElement labellingX;
	public void labelling_type() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-12--value\"]")));
		Assert.assertTrue(labelling.isDisplayed());
		labelling.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-12--option-2\"]")));
		labellingX.click();
	}
	//----------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-13--value\"]")
	@CacheLookup
	WebElement casetype;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-13--option-1\"]")
	@CacheLookup
	WebElement casetypex;
	public void case_type() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-13--value\"]")));
		Assert.assertTrue(casetype.isDisplayed());
		casetype.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-13--option-1\"]")));
		casetypex.click();
	}
	
	//-------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-14--value\"]")
	@CacheLookup
	WebElement casesize;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"react-select-14--option-2\"]")
	@CacheLookup
	WebElement casesizex;
	public void case_size() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-14--value\"]")));
		Assert.assertTrue(casesize.isDisplayed());
		casesize.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-14--option-2\"]")));
		casesizex.click();
	}
	//--------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"neck-label-0-0-neck-label-0-0\"]")
	@CacheLookup
	WebElement necklabel;
	public void Necklabel() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"neck-label-0-0-neck-label-0-0\"]")));
		Assert.assertTrue(necklabel.isEnabled());
		necklabel.click();
	}
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"tender_volume\"]/form/div[2]/input[2]")
	@CacheLookup
	WebElement continuethreestep; 
	public void continue_step_three() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tender_volume\"]/form/div[2]/input[2]")));
		Assert.assertTrue(continuethreestep.isDisplayed());
		continuethreestep.click();
		
	}
	
	/*=================================Step Four=========================================================================*/
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/label/span")
	@CacheLookup
	WebElement duty; 
	public void duty() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/label/span")));
		Assert.assertTrue(duty.isDisplayed());
		duty.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[3]/input[2]")
	@CacheLookup
	WebElement continuefourstep; 
	public void duty_continue() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[3]/input[2]")));
		Assert.assertTrue(continuefourstep.isEnabled());
		continuefourstep.click();
	}
	
	/*=================================Step Five=========================================================================*/
	@FindBy(how=How.CSS,using="#app > div > div.route-wrap > div > div.createTenderWrap > div.stepsWrap > div.whiteBox > div > div.servicesWrap > div:nth-child(1) > div > label > span")
	@CacheLookup
	WebElement arrangecollection;
	public void arrange_collection() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div > div.route-wrap > div > div.createTenderWrap > div.stepsWrap > div.whiteBox > div > div.servicesWrap > div:nth-child(1) > div > label > span")));
		Assert.assertTrue(arrangecollection.isDisplayed());
		arrangecollection.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"storage1\"]")
	@CacheLookup
	WebElement storage;
	public void storage_click() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"storage1\"]")));
		Assert.assertTrue(storage.isEnabled());
		storage.click();		
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[1]/div/label")
	@CacheLookup
	WebElement ambient;
	public void ambient_click() {	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[1]/div/label")));
		Assert.assertTrue(ambient.isDisplayed());
		ambient.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[3]/input")
	@CacheLookup
	WebElement duration; 
	public void duration_click() {	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[3]/input")));
		Assert.assertTrue(duration.isDisplayed());
		duration.click();
		duration.sendKeys("10 days");
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[3]/input[2]")
	@CacheLookup
	WebElement continuefivestep; 
	public void stepfive_sontinue() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[3]/input[2]")));
		Assert.assertTrue(continuefivestep.isDisplayed());
		continuefivestep.click();
	}
	
	/*=================================Step Six=========================================================================*/
	@FindBy(how=How.XPATH,using="//*[@id=\"standard1\"]")
	@CacheLookup
	WebElement standardone; 
		
	@FindBy(how=How.XPATH,using="//*[@id=\"standard2\"]")
	@CacheLookup
	WebElement standardtwo; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"standard3\"]")
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
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"qualification1\"]")
	@CacheLookup
	WebElement qualione; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"qualification2\"]")
	@CacheLookup
	WebElement qualitwo; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"qualification3\"]")
	@CacheLookup
	WebElement qualithree; 
	public void qualifications(){
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"qualification1\"]")));
		qualione.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"qualification2\"]")));
		qualitwo.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"qualification3\"]")));
		qualithree.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[4]/input[2]")
	@CacheLookup
	WebElement continuesixstep;
	public void stepsix_continue() { 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[4]/input[2]")));
		Assert.assertTrue(continuesixstep.isDisplayed());
		continuesixstep.click();
	}
	
	/*=================================Step Seven=========================================================================*/
	@FindBy(how=How.CSS,using="#app > div > div.route-wrap > div > div.createTenderWrap.confirmSuppliersWrap > div > div.whiteBox.summary-whiteBox > div > div.selectSupplierCountPanel > div.btn-group > input")
	@CacheLookup
	WebElement continuesevenstep;
	public void continue_step_seven() {	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div > div.route-wrap > div > div.createTenderWrap.confirmSuppliersWrap > div > div.whiteBox.summary-whiteBox > div > div.selectSupplierCountPanel > div.btn-group > input")));
		Assert.assertTrue(continuesevenstep.isDisplayed());
		continuesevenstep.click();
	}
	
	/*=================================Step Eight=========================================================================*/
	@FindBy(how=How.CLASS_NAME,using="suuplierstext")
	WebElement text;
	public void clicktext() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("suuplierstext")));
		Assert.assertTrue(text.isDisplayed());
		text.click();
	}
	
	
	@FindBy(how=How.NAME,using="supplier")
	WebElement MoorhouseBrewery;
	public void selectMoorhouseBrewery() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("supplier")));
		MoorhouseBrewery.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.ID,using="46")
	WebElement Bhopstuff;
	public void selectBhopstuff() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("46")));
		Bhopstuff.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"selectAll\"]")
	WebElement selectall;
	public void Select_all() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"selectAll\"]")));
		Assert.assertTrue(selectall.isEnabled());
		selectall.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"breweryStepSeven\"]/div[2]/div[2]/input")
	WebElement submit;
	public void submitTender() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"breweryStepSeven\"]/div[2]/div[2]/input")));
		Assert.assertTrue(submit.isDisplayed());
		submit.click();
	}	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div/input")
	WebElement viewdashboard;
	public void viewDashboard() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/input")));
		Assert.assertTrue(viewdashboard.isDisplayed());
		viewdashboard.click();
	}	
		
}
