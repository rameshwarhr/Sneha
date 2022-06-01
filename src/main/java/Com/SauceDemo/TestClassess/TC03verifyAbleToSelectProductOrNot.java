package Com.SauceDemo.TestClassess;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.SauceDemo.POMClassess.LoginPagePOMclass;
import Com.SauceDemo.POMClassess.homePagePOMclass;
import Com.SauceDemo.UtilityClassess.ScreenshotClass;

public class TC03verifyAbleToSelectProductOrNot extends TestBaseClass
{
	
		
		@Test(enabled=false)
		public void selectProduct() throws InterruptedException
		{
		 homePagePOMclass hp=new homePagePOMclass(driver);
		 hp.bagElement();
		
		 log.info("click on bag element ");
		 Thread.sleep(2000);
		 driver.navigate().back();
		 
		 hp.bikeLightElement();
		 
		 log.info("click on bike light");
		 Thread.sleep(2000);
		 driver.navigate().back();
		
		hp.jacketElement();
		System.out.println("click on jacket element ");
		 Thread.sleep(2000);
		 driver.navigate().back();
		 
		 hp.tShirtElement();
		 System.out.println("click on t shirt");
		 Thread.sleep(2000);
		 driver.navigate().back();
		 
		 hp.redTshirt();
		 System.out.println("clik on red t-shirt");
		 Thread.sleep(2000);
		 driver.navigate().back();
		 
		 hp.onesieElement();
		 System.out.println("is selected");
		 driver.navigate().back();
		}
	

	

}
