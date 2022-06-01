package Com.SauceDemo.TestClassess;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.SauceDemo.POMClassess.LoginPagePOMclass;
import Com.SauceDemo.POMClassess.homePagePOMclass;
import Com.SauceDemo.UtilityClassess.ScreenshotClass;

public class TC05verifyAbleToAddAllProductInCart extends TestBaseClass
{
	

		// Verify whether we are able to add to product to cart or not
		
	
	
		
	@Test
	public void addAllProduct() throws IOException, InterruptedException
		{
		 homePagePOMclass hp=new homePagePOMclass(driver);
		 hp.addAllProduct();
		log.info("able to add all product");
			ScreenshotClass.screenshot(driver);
			Thread.sleep(1000);
			
			
		 System.out.println("apply validation");
		String actual= hp.cartElement();
		String expected="6";
		
		Assert.assertEquals(actual, expected);
		
		
		
		}

		
	

}
