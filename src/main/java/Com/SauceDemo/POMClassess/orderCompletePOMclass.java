package Com.SauceDemo.POMClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderCompletePOMclass
{

	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement backbutton;
	 public void clickBackButton()
	 {
		 backbutton.click();
	 }
	 
	 public orderCompletePOMclass(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
}
