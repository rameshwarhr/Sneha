package Com.SauceDemo.TestClassess;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.SauceDemo.POMClassess.LoginPagePOMclass;
import Com.SauceDemo.POMClassess.homePagePOMclass;

public class TC09verifyAboutButton extends TestBaseClass
{
	
		// Verify whether we are able to check the "About"
		
		
			
		@Test
		public void aboutButton() throws InterruptedException
		{
		
	
			homePagePOMclass hp=new homePagePOMclass(driver);
			hp.clickMenuButton();
			System.out.println("click on menu button");
			hp.clickAboutButton();
			System.out.println("click on about button");
			
			
			Thread.sleep(3000);
			driver.navigate().back();
		}
		
		
	}


