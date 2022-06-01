package Com.SauceDemo.TestClassess;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.SauceDemo.POMClassess.LoginPagePOMclass;
import Com.SauceDemo.POMClassess.cartPagePOMclass;
import Com.SauceDemo.POMClassess.homePagePOMclass;
import Com.SauceDemo.UtilityClassess.ScreenshotClass;

public class TC06veryAbleToCheakProceed extends TestBaseClass
{
	


		//Verify whether we are able to proceed for checkout or not
	
	
	@Test
	public void ableToCheckProceed() throws IOException, InterruptedException
	{
		 homePagePOMclass hp=new homePagePOMclass(driver);
		 hp.addAllProduct();
		 System.out.println("add all product in cart");
			ScreenshotClass.screenshot(driver);
			Thread.sleep(1000);
		 
		 
		 
		 hp.ClickcartButton();
		 System.out.println("click on cart button");
			ScreenshotClass.screenshot(driver);
			Thread.sleep(1000);
		 
		 cartPagePOMclass cp=new cartPagePOMclass(driver); 
		cp.clickcheckoutButton();
		System.out.println("click on cheak out button");
		ScreenshotClass.screenshot(driver);
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().back();

	}
	

}
