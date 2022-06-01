package Com.SauceDemo.TestClassess;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.SauceDemo.POMClassess.LoginPagePOMclass;
import Com.SauceDemo.POMClassess.homePagePOMclass;

public class TC04verifySingleProductIsAddToCartOrNot extends TestBaseClass
{

		
		
		// Verify whether we are able to add Single product to cart or not

		
		@Test
		public void singleProductAddCart()
		{
		 homePagePOMclass hp=new homePagePOMclass(driver);
		 hp.clickselectSingleProduct();
		 log.info("able to select single product");
		
		 
		log.info("apply validation");
		String actualtext= hp.cartElement();
		String expected ="1";
		Assert.assertEquals(actualtext, expected);
		}
		
		

}
