package Com.SauceDemo.TestClassess;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.SauceDemo.POMClassess.LoginPagePOMclass;
import Com.SauceDemo.UtilityClassess.ScreenshotClass;

@Listeners(Com.SauceDemo.UtilityClassess.Listners.class)

public class TC01LoginFunctionality extends TestBaseClass
{

	@Test
	public void loginFunctionality() throws IOException, InterruptedException 
	{
		
		
	String expectedtitle ="Swag Labs";
	String actualtitle=driver.getTitle();
	Assert.assertEquals(actualtitle, expectedtitle);
	
	String exp="https://www.saucedemo.com/inventory.html";
	String actu=driver.getCurrentUrl();
	 Assert.assertEquals(actu,  exp);

	
}
	
	
}
