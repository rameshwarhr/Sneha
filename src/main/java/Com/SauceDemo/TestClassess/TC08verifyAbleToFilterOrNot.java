package Com.SauceDemo.TestClassess;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.SauceDemo.POMClassess.LoginPagePOMclass;
import Com.SauceDemo.POMClassess.homePagePOMclass;

public class TC08verifyAbleToFilterOrNot extends TestBaseClass
{
	
	
		// Verify whether we are able to apply the filter
		
		@Test
		public void filterButton()
		{
		homePagePOMclass hp=new homePagePOMclass(driver);
		hp.filtterButton();
	    System.out.println("click on filter button");
		}
		

}
