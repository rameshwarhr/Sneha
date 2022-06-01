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

public class TC07verifyLogOutFunctionality extends TestBaseClass
{
	  @Test
		public void logoutFunctionality()
		{

		homePagePOMclass hp=new homePagePOMclass(driver);
		hp.clickMenuButton();
		System.out.println("click on menu button");
		
		hp.logoutButton();
		System.out.println("click on log out button");
		
		String exp="https://www.saucedemo.com/";
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(actual, exp);
	}
	  
	 
}
