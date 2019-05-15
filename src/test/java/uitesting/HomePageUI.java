<<<<<<< HEAD
package uitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageUI {
	WebDriver driver;


	package uitesting;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	
	public class HomePageUI {
	WebDriver driver;
	

	public By yourdream = By.xpath("//*[@id=\"app\"]/div/div/div[2]/section[2]/div[2]/h2");
	public By submitabeer = By.xpath("//*[@id=\"app\"]/div/div/div[2]/section[2]/div[2]/h3");
	public By setupfor = By.xpath("//*[@id=\"app\"]/div/div/div[2]/section[3]/div[1]/h2");
	public By starttrading = By.xpath("//*[@id=\"app\"]/div/div/div[2]/section[3]/div[1]/h2");
	public By howdoes = By.xpath("//*[@id=\"app\"]/div/div/div[2]/section[4]/div[1]/h4");
	public By ourmarketplace = By.xpath("//*[@id=\"app\"]/div/div/div[2]/section[4]/div[1]/h5");
	public By latestfrom = By.xpath("//*[@id=\"app\"]/div/div/div[2]/section[5]/h2");
	public By howdoicreate = By.xpath("//*[@id=\"app\"]/div/div/div[2]/section[5]/div/div[2]/div[1]/a[1]/div[2]/h3");
	public By wematch = By.xpath("//*[@id=\"app\"]/div/div/div[2]/section[6]/h2");


	@BeforeClass
	public void launchBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/ucreate-66/eclipse-workspace/brew/Drivers/chromedriver");

	
	@BeforeClass
	public void launchBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://brewbroker-react.herokuapp.com");
	}

	@Test(priority = 5)
	public void getCssValue_TextFontSize_haveyour() {
		WebElement var = driver.findElement(yourdream);
		System.out.println("Font Size is : " + var.getCssValue("font-size"));
	}

	@Test(priority = 6)
	public void getCssValue__TextFontFamily_haveyour() {
		WebElement var = driver.findElement(yourdream);
		System.out.println("Font family is : " + var.getCssValue("font-family"));
	}

	@Test(priority = 7)
	public void getCssValue_TextColor_haveyour() {
		WebElement var = driver.findElement(yourdream);
		System.out.println("Font color is : " + var.getCssValue("color"));
		System.out.println(
				"/*--------------------------------------------------------------------------------------------*/");
	}

	@Test(priority = 8)
	public void getCssValue_TextFontSize_findsupplier() {
		WebElement var = driver.findElement(submitabeer);
		System.out.println("Font Size is : " + var.getCssValue("font-size"));
	}

	@Test(priority = 9)
	public void getCssValue__TextFontFamily_findsupplier() {
		WebElement var = driver.findElement(submitabeer);
		System.out.println("Font family is : " + var.getCssValue("font-family"));
	}

	@Test(priority = 10)
	public void getCssValue_TextColor_findsupplier() {
		WebElement var = driver.findElement(submitabeer);
		System.out.println("Font color is : " + var.getCssValue("color"));
		System.out.println(
				"/*--------------------------------------------------------------------------------------------*/");
	}

	@Test(priority = 11)
	public void getCssValue_TextFontSize_contract() {
		WebElement var = driver.findElement(setupfor);
		System.out.println("Font Size is : " + var.getCssValue("font-size"));
	}

	@Test(priority = 12)
	public void getCssValue__TextFontFamily_contract() {
		WebElement var = driver.findElement(setupfor);
		System.out.println("Font family is : " + var.getCssValue("font-family"));
	}

	@Test(priority = 13)
	public void getCssValue_TextColor_contract() {
		WebElement var = driver.findElement(setupfor);
		System.out.println("Font color is : " + var.getCssValue("color"));
		System.out.println(
				"/*--------------------------------------------------------------------------------------------*/");
	}

	@Test(priority = 14)
	public void getCssValue_TextFontSize_StartTrading() {
		WebElement var = driver.findElement(starttrading);
		System.out.println("Font Size is : " + var.getCssValue("font-size"));
	}

	@Test(priority = 15)
	public void getCssValue__TextFontFamily_startTrading() {
		WebElement var = driver.findElement(starttrading);
		System.out.println("Font family is : " + var.getCssValue("font-family"));
	}

	@Test(priority = 16)
	public void getCssValue_TextColor_startTrading() {
		WebElement var = driver.findElement(starttrading);
		System.out.println("Font color is : " + var.getCssValue("color"));
		System.out.println(
				"/*--------------------------------------------------------------------------------------------*/");
	}

	@Test(priority = 17)
	public void getCssValue_TextFontSize_HowDoes() {
		WebElement var = driver.findElement(howdoes);
		System.out.println("Font Size is : " + var.getCssValue("font-size"));
	}

	@Test(priority = 18)
	public void getCssValue__TextFontFamily_HowDoes() {
		WebElement var = driver.findElement(howdoes);
		System.out.println("Font family is : " + var.getCssValue("font-family"));
	}

	@Test(priority = 19)
	public void getCssValue_TextColor_HowDoes() {
		WebElement var = driver.findElement(howdoes);
		System.out.println("Font color is : " + var.getCssValue("color"));
		System.out.println(
				"/*--------------------------------------------------------------------------------------------*/");
	}

	@Test(priority = 20)
	public void getCssValue_TextFontSize_ourmarketplace() {
		WebElement var = driver.findElement(ourmarketplace);
		System.out.println("Font Size is : " + var.getCssValue("font-size"));
	}

	@Test(priority = 21)
	public void getCssValue__TextFontFamily_ourmarketplace() {
		WebElement var = driver.findElement(ourmarketplace);
		System.out.println("Font family is : " + var.getCssValue("font-family"));
	}

	@Test(priority = 22)
	public void getCssValue_TextColor_ourmarketplace() {
		WebElement var = driver.findElement(ourmarketplace);
		System.out.println("Font color is : " + var.getCssValue("color"));
		System.out.println(
				"/*--------------------------------------------------------------------------------------------*/");
	}

	@Test(priority = 23)
	public void getCssValue_TextFontSize_latestfrom() {
		WebElement var = driver.findElement(latestfrom);
		System.out.println("Font Size is : " + var.getCssValue("font-size"));
	}

	@Test(priority = 24)
	public void getCssValue__TextFontFamily_latestfrom() {
		WebElement var = driver.findElement(latestfrom);
		System.out.println("Font family is : " + var.getCssValue("font-family"));
	}

	@Test(priority = 25)
	public void getCssValue_TextColor_latestfrom() {
		WebElement var = driver.findElement(latestfrom);
		System.out.println("Font color is : " + var.getCssValue("color"));
		System.out.println(
				"/*--------------------------------------------------------------------------------------------*/");
	}

	@Test(priority = 26)
	public void getCssValue_TextFontSize_howdoicreate() {
		WebElement var = driver.findElement(howdoicreate);
		System.out.println("Font Size is : " + var.getCssValue("font-size"));
	}

	@Test(priority = 27)
	public void getCssValue__TextFontFamily_howdoicreate() {
		WebElement var = driver.findElement(howdoicreate);
		System.out.println("Font family is : " + var.getCssValue("font-family"));
	}

	@Test(priority = 28)
	public void getCssValue_TextColor_howdoicreate() {
		WebElement var = driver.findElement(howdoicreate);
		System.out.println("Font color is : " + var.getCssValue("color"));
		System.out.println(
				"/*--------------------------------------------------------------------------------------------*/");
	}

	@Test(priority = 29)
	public void getCssValue_TextFontSize_wematch() {
		WebElement var = driver.findElement(wematch);
		System.out.println("Font Size is : " + var.getCssValue("font-size"));
	}

	@Test(priority = 30)
	public void getCssValue__TextFontFamily_wematch() {
		WebElement var = driver.findElement(wematch);
		System.out.println("Font family is : " + var.getCssValue("font-family"));
	}

	@Test(priority = 31)
	public void getCssValue_TextColor_wematch() {
		WebElement var = driver.findElement(wematch);
		System.out.println("Font color is : " + var.getCssValue("color"));
		System.out.println(
				"/*--------------------------------------------------------------------------------------------*/");
	}

}

		driver.manage().window().maximize(); 
		driver.get("https://brewbroker-react.herokuapp.com");
	}
	
	@Test(priority=5)
	public void getCssValue_TextFontSize_haveyour(){
		WebElement var = driver.findElement(yourdream);
		System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
	}
	
	@Test(priority=6)
	public void getCssValue__TextFontFamily_haveyour(){
		WebElement var = driver.findElement(yourdream);
		System.out.println("Font family is : " + var.getCssValue("font-family"));		
	}
	
	@Test(priority=7)
	public void getCssValue_TextColor_haveyour() {
		WebElement var = driver.findElement(yourdream);
		System.out.println("Font color is : "	+ var.getCssValue("color"));
		System.out.println("/*--------------------------------------------------------------------------------------------*/");
	}
	
	@Test(priority=8)
	public void getCssValue_TextFontSize_findsupplier(){
		WebElement var = driver.findElement(submitabeer);
		System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
	}
	
	@Test(priority=9)
	public void getCssValue__TextFontFamily_findsupplier(){
		WebElement var = driver.findElement(submitabeer);
		System.out.println("Font family is : " + var.getCssValue("font-family"));		
	}
	
	@Test(priority=10)
	public void getCssValue_TextColor_findsupplier() {
		WebElement var = driver.findElement(submitabeer);
		System.out.println("Font color is : "	+ var.getCssValue("color"));
		System.out.println("/*--------------------------------------------------------------------------------------------*/");
	}
	
	@Test(priority=11)
	public void getCssValue_TextFontSize_contract(){
		WebElement var = driver.findElement(setupfor);
		System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
	}
	
	@Test(priority=12)
	public void getCssValue__TextFontFamily_contract(){
		WebElement var = driver.findElement(setupfor);
		System.out.println("Font family is : " + var.getCssValue("font-family"));		
	}
	
	@Test(priority=13)
	public void getCssValue_TextColor_contract() {
		WebElement var = driver.findElement(setupfor);
		System.out.println("Font color is : "	+ var.getCssValue("color"));
		System.out.println("/*--------------------------------------------------------------------------------------------*/");
	}
	
	@Test(priority=14)
	public void getCssValue_TextFontSize_StartTrading(){
		WebElement var = driver.findElement(starttrading);
		System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
	}
	
	@Test(priority=15)
	public void getCssValue__TextFontFamily_startTrading(){
		WebElement var = driver.findElement(starttrading);
		System.out.println("Font family is : " + var.getCssValue("font-family"));		
	}
	
	@Test(priority=16)
	public void getCssValue_TextColor_startTrading() {
		WebElement var = driver.findElement(starttrading);
		System.out.println("Font color is : "	+ var.getCssValue("color"));
		System.out.println("/*--------------------------------------------------------------------------------------------*/");
	}
	
	@Test(priority=17)
	public void getCssValue_TextFontSize_HowDoes(){
		WebElement var = driver.findElement(howdoes);
		System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
	}
	
	@Test(priority=18)
	public void getCssValue__TextFontFamily_HowDoes(){
		WebElement var = driver.findElement(howdoes);
		System.out.println("Font family is : " + var.getCssValue("font-family"));		
	}
	
	@Test(priority=19)
	public void getCssValue_TextColor_HowDoes() {
		WebElement var = driver.findElement(howdoes);
		System.out.println("Font color is : "	+ var.getCssValue("color"));
		System.out.println("/*--------------------------------------------------------------------------------------------*/");
	}
	
	@Test(priority=20)
	public void getCssValue_TextFontSize_ourmarketplace(){
		WebElement var = driver.findElement(ourmarketplace);
		System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
	}
	
	@Test(priority=21)
	public void getCssValue__TextFontFamily_ourmarketplace(){
		WebElement var = driver.findElement(ourmarketplace);
		System.out.println("Font family is : " + var.getCssValue("font-family"));		
	}
	
	@Test(priority=22)
	public void getCssValue_TextColor_ourmarketplace() {
		WebElement var = driver.findElement(ourmarketplace);
		System.out.println("Font color is : "	+ var.getCssValue("color"));
		System.out.println("/*--------------------------------------------------------------------------------------------*/");
	}
	
	@Test(priority=23)
	public void getCssValue_TextFontSize_latestfrom(){
		WebElement var = driver.findElement(latestfrom);
		System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
	}
	
	@Test(priority=24)
	public void getCssValue__TextFontFamily_latestfrom(){
		WebElement var = driver.findElement(latestfrom);
		System.out.println("Font family is : " + var.getCssValue("font-family"));		
	}
	
	@Test(priority=25)
	public void getCssValue_TextColor_latestfrom() {
		WebElement var = driver.findElement(latestfrom);
		System.out.println("Font color is : "	+ var.getCssValue("color"));
		System.out.println("/*--------------------------------------------------------------------------------------------*/");
	}
	
	@Test(priority=26)
	public void getCssValue_TextFontSize_howdoicreate(){
		WebElement var = driver.findElement(howdoicreate);
		System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
	}
	
	@Test(priority=27)
	public void getCssValue__TextFontFamily_howdoicreate(){
		WebElement var = driver.findElement(howdoicreate);
		System.out.println("Font family is : " + var.getCssValue("font-family"));		
	}
	
	@Test(priority=28)
	public void getCssValue_TextColor_howdoicreate() {
		WebElement var = driver.findElement(howdoicreate);
		System.out.println("Font color is : "	+ var.getCssValue("color"));
		System.out.println("/*--------------------------------------------------------------------------------------------*/");
	}
	
	@Test(priority=29)
	public void getCssValue_TextFontSize_wematch(){
		WebElement var = driver.findElement(wematch);
		System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
	}
	
	@Test(priority=30)
	public void getCssValue__TextFontFamily_wematch(){
		WebElement var = driver.findElement(wematch);
		System.out.println("Font family is : " + var.getCssValue("font-family"));		
	}
	
	@Test(priority=31)
	public void getCssValue_TextColor_wematch() {
		WebElement var = driver.findElement(wematch);
		System.out.println("Font color is : "	+ var.getCssValue("color"));
		System.out.println("/*--------------------------------------------------------------------------------------------*/");
	}
	
	}

