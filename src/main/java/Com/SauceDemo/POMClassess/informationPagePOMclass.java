 package Com.SauceDemo.POMClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class informationPagePOMclass 
{
	private WebDriver driver;
	
   @FindBy(xpath="//input[@id='first-name']")
   private WebElement fname;
   public void sendfirstName()
   {
	   fname.sendKeys("Ram");
   }
	
   @FindBy(xpath="//input[@id='last-name']")
   private WebElement lname;
   public void sendlastName()
   {
	   lname.sendKeys("Ram");
   }
	
   
   @FindBy(xpath="//input[@id='postal-code']")
   private WebElement postal;
   public void sendpostalCode()
   {
	   postal.sendKeys("123465");
   }
	
	
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement cancle;
	public void cancleButton()
	{
		cancle.click();
	}
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebutton;
	public void clickContinueButton()
	{
		continuebutton.click();
	}
	
	public informationPagePOMclass (WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	
	
	
	
	
	
	
}
