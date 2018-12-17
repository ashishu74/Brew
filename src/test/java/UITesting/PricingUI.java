package UITesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PricingUI {
WebDriver driver;
public By pricing = By.xpath("//a[contains(@href,'/pricing')]");
public By chooseaplan = By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/h3");
public By supplierplan = By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/button[1]/span");
public By buyerplan = By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/button[2]/span");
public By Early = By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/div[1]/div[1]/h3");
public By enterprise = By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/div[1]/div[1]/h3");
public By register = By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/div[1]/div[1]/a");
public By join = By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/div[2]/div[1]/div/button");
public By speeduptime = By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/div[1]/div[2]/p");
public By profilecreation = By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/div[1]/div[2]/ul/li[1]");

@BeforeClass
public void launchBrowser() throws Exception {
	System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("window-size=1400,800");
	options.addArguments("headless");
	driver = new ChromeDriver(options);Thread.sleep(5000);
	driver.manage().window().maximize(); Thread.sleep(2000);
	driver.get("https://brewbroker-react.herokuapp.com");
} 

@Test(priority=1)
public void getCssValue_TextFontSize_pricing(){
	System.out.println("/*--------------------------------------------------------------------------------------------*/");
	WebElement var = driver.findElement(pricing);
	System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
}

@Test(priority=2)
public void getCssValue__TextFontFamily_pricing(){
	WebElement var = driver.findElement(pricing);
	System.out.println("Font family is : " + var.getCssValue("font-family"));		
}

@Test(priority=3)
public void getCssValue_TextColor_pricing() {
	WebElement var = driver.findElement(pricing);
	System.out.println("Font color is : "	+ var.getCssValue("color"));
	driver.navigate().to("https://brewbroker-react.herokuapp.com/pricing");
	System.out.println("/*--------------------------------------------------------------------------------------------*/");
}
@Test(priority=4)
public void getCssValue_TextFontSize_chooseplan(){
	WebElement var = driver.findElement(chooseaplan);
	System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
}

@Test(priority=5)
public void getCssValue__TextFontFamily_chooseplan(){
	WebElement var = driver.findElement(chooseaplan);
	System.out.println("Font family is : " + var.getCssValue("font-family"));		
}

@Test(priority=6)
public void getCssValue_TextColor_chooseplan() {
	WebElement var = driver.findElement(chooseaplan);
	System.out.println("Font color is : "	+ var.getCssValue("color"));
	System.out.println("/*--------------------------------------------------------------------------------------------*/");

}

@Test(priority=7)
public void getCssValue_TextFontSize_supplierplan(){
	WebElement var = driver.findElement(supplierplan);
	System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
}

@Test(priority=8)
public void getCssValue__TextFontFamily_supplierplan(){
	WebElement var = driver.findElement(supplierplan);
	System.out.println("Font family is : " + var.getCssValue("font-family"));		
}

@Test(priority=9)
public void getCssValue_TextColor_supplierplan() {
	WebElement var = driver.findElement(supplierplan);
	System.out.println("Font color is : "	+ var.getCssValue("color"));
	System.out.println("/*--------------------------------------------------------------------------------------------*/");

}

@Test(priority=10)
public void getCssValue_TextFontSize_buyerplan(){
	WebElement var = driver.findElement(buyerplan);
	System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
}

@Test(priority=11)
public void getCssValue__TextFontFamily_buyerplan(){
	WebElement var = driver.findElement(buyerplan);
	System.out.println("Font family is : " + var.getCssValue("font-family"));	
}

@Test(priority=12)
public void getCssValue_TextColor_buyerplan() {
	WebElement var = driver.findElement(buyerplan);
	System.out.println("Font color is : "	+ var.getCssValue("color"));
	System.out.println("/*--------------------------------------------------------------------------------------------*/");

}

@Test(priority=13)
public void getCssValue_TextFontSize_early(){
	WebElement var = driver.findElement(Early);
	System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
}

@Test(priority=14)
public void getCssValue__TextFontFamily_early(){
	WebElement var = driver.findElement(Early);
	System.out.println("Font family is : " + var.getCssValue("font-family"));		
}

@Test(priority=15)
public void getCssValue_TextColor_early() {
	WebElement var = driver.findElement(Early);
	System.out.println("Font color is : "	+ var.getCssValue("color"));
	System.out.println("/*--------------------------------------------------------------------------------------------*/");

}

@Test(priority=16)
public void getCssValue_TextFontSize_enterprise(){
	WebElement var = driver.findElement(enterprise);
	System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
}

@Test(priority=17)
public void getCssValue__TextFontFamily_enterprise(){
	WebElement var = driver.findElement(enterprise);
	System.out.println("Font family is : " + var.getCssValue("font-family"));		
}

@Test(priority=18)
public void getCssValue_TextColor_enterprise() {
	WebElement var = driver.findElement(enterprise);
	System.out.println("Font color is : "	+ var.getCssValue("color"));
	System.out.println("/*--------------------------------------------------------------------------------------------*/");

}

@Test(priority=19)
public void getCssValue_TextFontSize_register(){
	WebElement var = driver.findElement(register);
	System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
}

@Test(priority=20)
public void getCssValue__TextFontFamily_register(){
	WebElement var = driver.findElement(register);
	System.out.println("Font family is : " + var.getCssValue("font-family"));		
}

@Test(priority=21)
public void getCssValue_TextColor_register() {
	WebElement var = driver.findElement(register);
	System.out.println("Font color is : "	+ var.getCssValue("color"));
	System.out.println("/*--------------------------------------------------------------------------------------------*/");

}
@Test(priority=22)
public void getCssValue_TextFontSize_join(){
	WebElement var = driver.findElement(join);
	System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
}

@Test(priority=23)
public void getCssValue__TextFontFamily_join(){
	WebElement var = driver.findElement(join);
	System.out.println("Font family is : " + var.getCssValue("font-family"));		
}

@Test(priority=24)
public void getCssValue_TextColor_join() {
	WebElement var = driver.findElement(join);
	System.out.println("Font color is : "	+ var.getCssValue("color"));
	System.out.println("/*--------------------------------------------------------------------------------------------*/");

}

@Test(priority=25)
public void getCssValue_TextFontSize_speeduptime(){
	WebElement var = driver.findElement(speeduptime);
	System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
}

@Test(priority=26)
public void getCssValue__TextFontFamily_speeduptime(){
	WebElement var = driver.findElement(speeduptime);
	System.out.println("Font family is : " + var.getCssValue("font-family"));		
}

@Test(priority=27)
public void getCssValue_TextColor_speeduptime() {
	WebElement var = driver.findElement(speeduptime);
	System.out.println("Font color is : "	+ var.getCssValue("color"));
	System.out.println("/*--------------------------------------------------------------------------------------------*/");

}

@Test(priority=28)
public void getCssValue_TextFontSize_profilecreation(){
	WebElement var = driver.findElement(profilecreation);
	System.out.println("Font Size is : "	+ var.getCssValue("font-size"));
}

@Test(priority=29)
public void getCssValue__TextFontFamily_profilecreation(){
	WebElement var = driver.findElement(profilecreation);
	System.out.println("Font family is : " + var.getCssValue("font-family"));		
}

@Test(priority=30)
public void getCssValue_TextColor_profilecreation() {
	WebElement var = driver.findElement(profilecreation);
	System.out.println("Font color is : "	+ var.getCssValue("color"));
	System.out.println("/*--------------------------------------------------------------------------------------------*/");

}
}
