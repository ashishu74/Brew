	package UITesting;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class HomePageUI {
	WebDriver driver;
		public By have = By.xpath("//*[@id=\"app\"]/div/div[2]/section[1]/div[1]/div[3]");
		public By findsupplier = By.xpath("//*[@id=\"app\"]/div/div[2]/section[1]/div[1]/a");
		public By Contract = By.xpath("//*[@id=\"app\"]/div/div[2]/section[1]/div[1]/div[1]");

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

	@Test(priority=5)
	public void getCssValue_TextFontSize_haveyour(){
		WebElement var = driver.findElement(have);
		System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
	}

	@Test(priority=6)
	public void getCssValue__TextFontFamily_haveyour(){
		WebElement var = driver.findElement(have);
		System.out.println("Font family is : " + var.getCssValue("font-family"));		
	}

	@Test(priority=7)
	public void getCssValue_TextColor_haveyour() {
		WebElement var = driver.findElement(have);
		System.out.println("Font color is : "	+ var.getCssValue("color"));
		System.out.println("/*--------------------------------------------------------------------------------------------*/");
	}

	@Test(priority=8)
	public void getCssValue_TextFontSize_findsupplier(){
		WebElement var = driver.findElement(findsupplier);
		System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
	}

	@Test(priority=9)
	public void getCssValue__TextFontFamily_findsupplier(){
		WebElement var = driver.findElement(findsupplier);
		System.out.println("Font family is : " + var.getCssValue("font-family"));		
	}

	@Test(priority=10)
	public void getCssValue_TextColor_findsupplier() {
		WebElement var = driver.findElement(findsupplier);
		System.out.println("Font color is : "	+ var.getCssValue("color"));
		System.out.println("/*--------------------------------------------------------------------------------------------*/");
	}

	@Test(priority=11)
	public void getCssValue_TextFontSize_contract(){
		WebElement var = driver.findElement(Contract);
		System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
	}

	@Test(priority=12)
	public void getCssValue__TextFontFamily_contract(){
		WebElement var = driver.findElement(Contract);
		System.out.println("Font family is : " + var.getCssValue("font-family"));		
	}

	@Test(priority=13)
	public void getCssValue_TextColor_contract() {
		WebElement var = driver.findElement(Contract);
		System.out.println("Font color is : "	+ var.getCssValue("color"));
		System.out.println("/*--------------------------------------------------------------------------------------------*/");
	}

	}
