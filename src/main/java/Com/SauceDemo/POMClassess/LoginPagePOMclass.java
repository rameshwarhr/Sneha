package Com.SauceDemo.POMClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

      public class LoginPagePOMclass 
      {
      private WebDriver driver;


     @FindBy(xpath="//input[@id='user-name']")
      private WebElement username;
     
     public void sendUsername()
     {
    	 username.sendKeys("standard_user");
     }
    
     
     @FindBy(xpath="//input[@id='password']")
     private WebElement password;
     
     public void sendPassword()
     {
    	 password.sendKeys("secret_sauce");
     }
     
     @FindBy(xpath="//input[@id='login-button']")
     private  WebElement loginButton;
     
     public void clickLoginButton()
     {
    	 loginButton.click();
     }
     
     public LoginPagePOMclass(WebDriver driver)
     {
    	this. driver=driver;
    	
    	PageFactory.initElements( driver,this);
     }
     
}
