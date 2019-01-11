package utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName,String url)throws InterruptedException{
		if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/home/ucreate-66/eclipse-workspace/brew/Drivers/geckodriver");
			driver=(WebDriver) new FirefoxDriver();
		}
		else if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/home/ucreate-66/eclipse-workspace/brew/Drivers/chromedriver");
			/*
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			options.addArguments("window-size=1400,800");
		
			driver = (WebDriver) new ChromeDriver(options);Thread.sleep(5000);*/
			driver=(WebDriver) new ChromeDriver();
		}		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	

}
