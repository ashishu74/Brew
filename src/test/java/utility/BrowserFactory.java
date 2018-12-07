package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName,String url){
		if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver");
			driver=(WebDriver) new FirefoxDriver();
		}
		else if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/home/ucreate-73/Documents/eclipse/Drivers/chromedriver");
			driver=(WebDriver) new ChromeDriver();
		}		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	

}
