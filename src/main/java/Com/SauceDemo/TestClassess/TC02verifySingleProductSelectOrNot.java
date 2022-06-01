package Com.SauceDemo.TestClassess;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.SauceDemo.POMClassess.LoginPagePOMclass;
import Com.SauceDemo.POMClassess.homePagePOMclass;
import Com.SauceDemo.UtilityClassess.ScreenshotClass;

public class TC02verifySingleProductSelectOrNot extends TestBaseClass
{
	
	@Test
	public void singleProduct() throws IOException 
	{
		homePagePOMclass hp=new homePagePOMclass(driver);
		hp.bagElement();
		
		log.info("select bag product");
		ScreenshotClass.screenshot(driver) ;
		driver.navigate().back();
		
		hp.bikeLightElement();
		log.info("bike light element is select");
		ScreenshotClass.screenshot(driver) ;
		driver.navigate().back();
		
		hp.jacketElement();
		log.info("jacket is select");
		ScreenshotClass.screenshot(driver) ;
		driver.navigate().back();
		
		hp.redTshirt();
		log.info("red t shirt is select");
		ScreenshotClass.screenshot(driver) ;
		driver.navigate().back();
		
		hp.tShirtElement();
		log.info("T shirt is selected");
		ScreenshotClass.screenshot(driver) ;
		driver.navigate().back();
		
		hp.onesieElement();
		log.info("onesie selected");
		ScreenshotClass.screenshot(driver) ;
		driver.navigate().back();
		
		System.out.println("test case is passed becoz user is able to select particular product");
	}

}
