package Com.SauceDemo.TestClassess;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.SauceDemo.POMClassess.LoginPagePOMclass;
import Com.SauceDemo.POMClassess.billingPagePOMclass;
import Com.SauceDemo.POMClassess.cartPagePOMclass;
import Com.SauceDemo.POMClassess.homePagePOMclass;
import Com.SauceDemo.POMClassess.informationPagePOMclass;
import Com.SauceDemo.POMClassess.orderCompletePOMclass;

public class TC10verifyAbleToSendInformation extends TestBaseClass
{      
	

		
	@Test
	public void sendInformation()
	{
		 homePagePOMclass hp=new homePagePOMclass(driver);
		 hp.addAllProduct();
		 System.out.println("add all product in cart");
		 
		 hp.ClickcartButton();
		 System.out.println("click on cart button");
		 
		 
		 cartPagePOMclass cp=new cartPagePOMclass(driver); 
		cp.clickcheckoutButton();
		System.out.println("click on cheak out button");
		
		informationPagePOMclass ip=new informationPagePOMclass (driver);
        ip.sendfirstName();
        System.out.println("insert First Name");
        ip.sendlastName();
        System.out.println("insert Last Name");
        ip.sendpostalCode();
        System.out.println("insert Postal code");
        
        
        ip.clickContinueButton();
       System.out.println("click on continue button");
        
        billingPagePOMclass bp=new billingPagePOMclass(driver);
        bp.clickFinishButton();
       System.out.println("click on finish Button");
        
        
        orderCompletePOMclass of = new orderCompletePOMclass(driver);
        of.clickBackButton();
        System.out.println("click on finish Button");
        		
	}
	

}
