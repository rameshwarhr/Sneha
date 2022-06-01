package Com.SauceDemo.POMClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class billingPagePOMclass
{
	
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement canclebutton;
	public void clickCancleButton()
	{
		canclebutton.click();
	}
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement finishbutton;
	public void clickFinishButton()
	{
		finishbutton.click();
	}
	
	public billingPagePOMclass(WebDriver driver)
			
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	

}
