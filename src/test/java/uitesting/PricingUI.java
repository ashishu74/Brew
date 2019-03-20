	package uitesting;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	
	public class PricingUI {
	WebDriver driver;
	
	public By chooseaplan = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/h1");
	public By freemiumplan = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[3]/div/div[1]/div[1]/h2");
	public By signuptoday = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[3]/div/div[1]/div[1]/h3");
	public By basictraderprofile = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[3]/div/div[1]/div[2]/ul/li[1]");
	
	@BeforeClass
	public void launchBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver","/home/ucreate-66/eclipse-workspace/brew/Drivers/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize(); 
		driver.get("https://brewbroker-react.herokuapp.com/pricing");
	} 
	
	@Test(priority=1)
	public void getCssValue_TextFontSize_chooseaplan(){
		System.out.println("/*--------------------------------------------------------------------------------------------*/");
		WebElement var = driver.findElement(chooseaplan);
		System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
	}
	
	@Test(priority=2)
	public void getCssValue__TextFontFamily_chooseaplan(){
		WebElement var = driver.findElement(chooseaplan);
		System.out.println("Font family is : " + var.getCssValue("font-family"));		
	}
	
	@Test(priority=3)
	public void getCssValue_TextColor_chooseaplan() {
		WebElement var = driver.findElement(chooseaplan);
		System.out.println("Font color is : "	+ var.getCssValue("color"));
		driver.navigate().to("https://brewbroker-react.herokuapp.com/pricing");
		System.out.println("/*--------------------------------------------------------------------------------------------*/");
	}
	@Test(priority=4)
	public void getCssValue_TextFontSize_freemiumplan(){
		WebElement var = driver.findElement(freemiumplan);
		System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
	}
	
	@Test(priority=5)
	public void getCssValue__TextFontFamily_freemiumplan(){
		WebElement var = driver.findElement(freemiumplan);
		System.out.println("Font family is : " + var.getCssValue("font-family"));		
	}
	
	@Test(priority=6)
	public void getCssValue_TextColor_freemiumplan() {
		WebElement var = driver.findElement(freemiumplan);
		System.out.println("Font color is : "	+ var.getCssValue("color"));
		System.out.println("/*--------------------------------------------------------------------------------------------*/");
	
	}
	
	@Test(priority=7)
	public void getCssValue_TextFontSize_signuptoday(){
		WebElement var = driver.findElement(signuptoday);
		System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
	}
	
	@Test(priority=8)
	public void getCssValue__TextFontFamily_signuptoday(){
		WebElement var = driver.findElement(signuptoday);
		System.out.println("Font family is : " + var.getCssValue("font-family"));		
	}
	
	@Test(priority=9)
	public void getCssValue_TextColor_signuptoday() {
		WebElement var = driver.findElement(signuptoday);
		System.out.println("Font color is : "	+ var.getCssValue("color"));
		System.out.println("/*--------------------------------------------------------------------------------------------*/");
	
	}
	
	@Test(priority=10)
	public void getCssValue_TextFontSize_basictraderprofile(){
		WebElement var = driver.findElement(basictraderprofile);
		System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
	}
	
	@Test(priority=11)
	public void getCssValue__TextFontFamily_basictraderprofile(){
		WebElement var = driver.findElement(basictraderprofile);
		System.out.println("Font family is : " + var.getCssValue("font-family"));	
	}
	
	@Test(priority=12)
	public void getCssValue_TextColor_basictraderprofile() {
		WebElement var = driver.findElement(basictraderprofile);
		System.out.println("Font color is : "	+ var.getCssValue("color"));
		System.out.println("/*--------------------------------------------------------------------------------------------*/");
	
	}

	}
