package Com.SauceDemo.POMClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPagePOMclass 
{
	
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement continuebutton;
	public void clickcontinueButton()
	{
		continuebutton.click();
	}
	
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;
	public void clickcheckoutButton()
	{
		checkout.click();
	}
	
	

	@FindBy(xpath="//button[text()='Remove']")
	private WebElement remove;
	public void clickRemoveButton()
	{
		remove.click();
	}
	
	
	
	public cartPagePOMclass (WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	

}
