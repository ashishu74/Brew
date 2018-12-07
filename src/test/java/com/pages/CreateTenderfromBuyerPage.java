/**
 * 
 */
package com.pages;

import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class CreateTenderfromBuyerPage {
	WebDriver driver;
	
	public CreateTenderfromBuyerPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//div[@id='app']/div/div/div[2]/div/div[2]/div[2]/div/div/button") 
	@CacheLookup
	WebElement login;
	public void login_link() {
		Assert.assertTrue(login.isDisplayed());
		login.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/div/div[4]/input")
	@CacheLookup
	WebElement loginbutton;
		public void login_button() {
			Assert.assertTrue(login.isDisplayed());
			loginbutton.click();
		}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/a")
	@CacheLookup
	WebElement newtender;
	public void newTender() {
		Assert.assertTrue(newtender.isDisplayed());
		newtender.click();
	}
	
	/*===============================================Step One =====================================================*/
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//input[@id='title']")
	@CacheLookup
	WebElement nametender; 
	public void nameOfTender() {
		Assert.assertTrue(nametender.isDisplayed());
		String uuid = UUID.randomUUID().toString();	
		nametender.sendKeys(uuid);
	}	
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//textarea[@id='desc']")
	@CacheLookup
	WebElement description;
	public void descriptionTender() {
		Assert.assertTrue(description.isDisplayed());
		description.sendKeys("Testing tender description. Testing tender description.");	
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[2]/div[2]/label")
	@CacheLookup
	WebElement tellus;
	public void tellUsMore() {
		tellus.click();
	}
	//-------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"communication1\"]")
	@CacheLookup
	WebElement suppcomm;
	public void supplierCommunication() {
		suppcomm.click();
	}
	//------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[4]/div/div[3]/label")
	@CacheLookup
	WebElement quarterly;
	public void contractTypeQuarterly() {
		quarterly.click();
	}
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.CSS,using="div.half-width:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")
	@CacheLookup
	WebElement dateto; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"date-picker\"]/div/div[2]/div/div[2]/div[2]/div[5]/div[4]")
	@CacheLookup
	WebElement date1;
	public void submitQuoteBy() {
		Assert.assertTrue(dateto.isDisplayed());
		dateto.click();	
		Assert.assertTrue(date1.isDisplayed());
		date1.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.CSS,using="div.half-width:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")
	@CacheLookup
	WebElement datefrom;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"date-picker\"]/div/div[2]/div/div[2]/div[2]/div[5]/div[6]")
	@CacheLookup
	WebElement date2;
	
	public void deliverContractBy() {
		Assert.assertTrue(datefrom.isDisplayed());
		datefrom.click();
		Assert.assertTrue(date2.isDisplayed());
		date2.click();	 
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/form/div[6]/div/input[2]")
	@CacheLookup
	WebElement next;
	
	public void nextForm() {
		Assert.assertTrue(next.isDisplayed());
		next.click();
	}
	   
	/*==============================================================Step Two =================================================================*/
	@FindBy(how=How.XPATH,using="//*[@id=\"tender_volume\"]/form/div[1]/div/div[2]/div[1]/div[2]/div[1]/label/span")
	@CacheLookup
	WebElement beertype;
	public void Ales() {
		beertype.click();
	}
	//----------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"beer-style-0\"]")
	@CacheLookup
	WebElement beerstyle;	
	public void beerStyle() {
		beerstyle.sendKeys("QA Beer");
	}
	//-----------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"brand-name-0\"]")
	@CacheLookup
	WebElement brandname;
	public void Brandname() {
		brandname.sendKeys("Beer QA ");
	}
	//---------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"description-0\"]")
	@CacheLookup
	WebElement descriptin;
	public void descripTion() {
		descriptin.sendKeys("Lorem ipsum lorem ipsum doloer sit amet loripsum lorem dolor sit lorem amet");
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"abv-value-0\"]")
	@CacheLookup
	WebElement abv;
	public void ABV() {
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
		vegan.click();
		gluten.click();
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
		unfiltered.click();
		finned.click();
		unpasterised.click();
	}
	//--------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how=How.XPATH,using="//input[@id='Brewingservices1']")
	@CacheLookup
	WebElement contractBrewing;
	public void brewingServices() throws Exception {
		contractBrewing.click();
		Assert.assertTrue(contractBrewing.isEnabled()); Thread.sleep(4000);
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[1]/label/span")
	@CacheLookup
	WebElement ales;
	public void style_Ales() throws Exception {
		Assert.assertTrue(ales.isDisplayed()); Thread.sleep(4000);
		ales.click();	
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"1\"]")
	@CacheLookup
	WebElement alesABP; 
	public void ales_ABP() throws Exception {
		Assert.assertTrue(alesABP.isDisplayed()); Thread.sleep(4000);
		alesABP.sendKeys("40");
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[1]/div/div/label/span")
	@CacheLookup
	WebElement alesicanprovide;
	public void ales_icanprovide() throws Exception {
		Assert.assertTrue(alesicanprovide.isDisplayed()); Thread.sleep(4000);
		alesicanprovide.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/label/span")
	@CacheLookup
	WebElement lager;
	public void style_lager() {
		Assert.assertTrue(lager.isDisplayed());
		lager.click();	
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"2\"]")
	@CacheLookup
	WebElement lagerABP; 
	public void lager_ABP() {
		Assert.assertTrue(lagerABP.isDisplayed());
		lagerABP.sendKeys("40");
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div/label/span")
	@CacheLookup
	WebElement lagericanprovide; 
	public void lager_icanprovide() {
		Assert.assertTrue(lagericanprovide.isDisplayed());
		lagericanprovide.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[4]/input[2]")
	@CacheLookup
	WebElement formtwocontinue; 
	public void next_Form_two() {
		Assert.assertTrue(formtwocontinue.isDisplayed());
		formtwocontinue.click();
	}
	
	/*=================================================================Step Three ==================================================================*/
	@FindBy(how=How.XPATH,using="//input[@id='contract1']")
	@CacheLookup
	WebElement oneoff;
	public void contract_type() {
		oneoff.click();
		Assert.assertTrue(oneoff.isEnabled());
	}
	
	//--------------------------------------Entering Ales--------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"tender_volume\"]/form/div[1]/div/div[2]/div[8]/section/div[1]/div/div[1]/div/div/input")
	@CacheLookup
	WebElement volume;
	public void volume_ales() {
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
		Assert.assertTrue(container.isDisplayed());
		container.click();
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
		Assert.assertTrue(size.isDisplayed());
		size.click();
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
		Assert.assertTrue(color.isDisplayed());
		color.click();
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
		Assert.assertTrue(shelflife.isDisplayed());
		shelflife.click();
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
		Assert.assertTrue(labelling.isDisplayed());
		labelling.click();
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
		Assert.assertTrue(casetype.isDisplayed());
		casetype.click();
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
		Assert.assertTrue(casesize.isDisplayed());
		casesize.click();
		casesizex.click();
	}
	//--------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"neck-label-0-0-neck-label-0-0\"]")
	@CacheLookup
	WebElement necklabel;
	public void Necklabel() {
		necklabel.click();
	}
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"tender_volume\"]/form/div[2]/input[2]")
	@CacheLookup
	WebElement continuethreestep; 
	public void continue_step_three() {
		continuethreestep.click();
		
	}
	
	/*=================================Step Four=========================================================================*/
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/label/span")
	@CacheLookup
	WebElement duty; 
	public void duty() {
		duty.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[3]/input[2]")
	@CacheLookup
	WebElement continuefourstep; 
	public void duty_continue() {
		continuefourstep.click();
	}
	
	/*=================================Step Five=========================================================================*/
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/label")
	@CacheLookup
	WebElement arrangecollection;
	public void arrange_collection() {
		arrangecollection.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"PlacesAutocomplete__root\"]/input")
	@CacheLookup
	WebElement town; 
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"storage1\"]")
	@CacheLookup
	WebElement storage;
	public void storage_click() {
		storage.click();		
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[1]/div/label")
	@CacheLookup
	WebElement ambient;
	public void ambient_click() {	
		ambient.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[3]/input")
	@CacheLookup
	WebElement duration; 
	public void duration_click() {	
		duration.click();
		duration.sendKeys("10 days");
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[3]/input[2]")
	@CacheLookup
	WebElement continuefivestep; 
	public void stepfive_sontinue() {
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
		standardone.click();
		standardtwo.click();
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
		qualione.click();
		qualitwo.click();
		qualithree.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div[1]/div[2]/div/div[4]/input[2]")
	@CacheLookup
	WebElement continuesixstep;
	public void stepsix_continue() { 
		continuesixstep.click();
	}
	
	/*=================================Step Seven=========================================================================*/
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/input")
	@CacheLookup
	WebElement continuesevenstep;
	public void continue_step_seven() {	
		continuesevenstep.click();
	}
	
	/*=================================Step Eight=========================================================================*/
	@FindBy(how=How.CLASS_NAME,using="suuplierstext")
	WebElement text;
	public void clicktext()
	{
		text.click();
	}
	
	
	@FindBy(how=How.NAME,using="supplier")
	WebElement MoorhouseBrewery;
	public void selectMoorhouseBrewery()
	{
		MoorhouseBrewery.click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.ID,using="46")
	WebElement Bhopstuff;
	public void selectBhopstuff()
	{
		Bhopstuff.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"selectAll\"]")
	WebElement selectall;
	public void Select_all()
	{
		selectall.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------
	@FindBy(how=How.XPATH,using="//*[@id=\"breweryStepSeven\"]/div[2]/div[2]/input")
	WebElement submit;
	public void submitTender()
	{
		submit.click();
	}	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div/input")
	WebElement viewdashboard;
	public void viewDashboard()
	{
		viewdashboard.click();
	}	
		
}
