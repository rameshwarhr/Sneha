package Com.SauceDemo.TestClassess;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Com.SauceDemo.POMClassess.LoginPagePOMclass;
import Com.SauceDemo.POMClassess.homePagePOMclass;
import Com.SauceDemo.UtilityClassess.ScreenshotClass;

public class TestBaseClass 
{
	
	WebDriver driver;
	Logger log;
	
    @Parameters("browserName")
	@BeforeClass
	public void openBrowser(String browserName) throws IOException
	{
    	
		log=Logger.getLogger("Ram");
		PropertyConfigurator.configure("log4j.properties");
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		 driver= new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			
			 driver= new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			 driver=new EdgeDriver();
		}
		
		log.info("browser is Opened");
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		log.info("url opned");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ScreenshotClass.screenshot(driver) ;
	
	}
	
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{
	
	
	LoginPagePOMclass lp=new LoginPagePOMclass(driver);
	lp.sendUsername();
	Thread.sleep(1000);
	
	log.info("enter username");
	ScreenshotClass.screenshot(driver) ;
	
	lp.sendPassword();
	Thread.sleep(1000);
	
	log.info("enter Password");
	ScreenshotClass.screenshot(driver) ;
	
	
	lp.clickLoginButton();
	
	log.info("click on login button");
	ScreenshotClass.screenshot(driver) ;
	
	
			
	}
	
	
	@AfterMethod
	public void tearDown()
	{

		homePagePOMclass hp=new homePagePOMclass(driver);
		hp.clickMenuButton();
		
		log.info("click on menu button");
		
		hp.logoutButton();
		
		log.info("click on log out button");
	}
	
	@AfterClass
	public void browserClosed()
	{
		driver.quit();
		log.info("end of program");
	}
}
