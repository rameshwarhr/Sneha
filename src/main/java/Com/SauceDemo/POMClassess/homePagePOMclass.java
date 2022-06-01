package Com.SauceDemo.POMClassess;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class homePagePOMclass
{

	private WebDriver driver;
	private Select s;
	private Actions act;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menubutton;
	
	public void clickMenuButton()
	{
		menubutton.click();
	}
	
	
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	private WebElement aboutbutton;
	
	public void clickAboutButton()
	{
		aboutbutton.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logoutbutton;
	
	public void logoutButton()
	{
		logoutbutton.click();
	}
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filtterbutton;
	
	public void filtterButton()
	{
		filtterbutton.click();
		
	//	s.selectByIndex(0);
//		s.selectByIndex(1);
//		s.selectByIndex(2);
		s.selectByIndex(3);
		
	}
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement bagpack;
	
	public void bagElement()
	{
		bagpack.click();
	}
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[2]")
	private WebElement bikelight;
	public void bikeLightElement()
	{
		bikelight.click();
	}
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[3]")
	private WebElement tshirt;
	public void tShirtElement()
	{ 
		tshirt.click();
		
	}
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[4]")
	private WebElement jacket;
	public void jacketElement()
	{
		jacket.click();
	}
	
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[5]")
	private WebElement onesie;
	public void onesieElement()
	{
		onesie.click();
	}
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[6]")
	private WebElement redtshirt;
	public void redTshirt()
	{
		redtshirt.click();
	}
	
	
    @FindBy(xpath="//a[@class='shopping_cart_link']")
    private WebElement cartbutton;
    public void ClickcartButton()
    {
    	cartbutton.click();
    	
    }
    
    @FindBy(xpath="(//button[text()='Add to cart'])[2]")
    private WebElement singleproduct;
    public void clickselectSingleProduct()
    {
    	//singleproduct.click();
    	act.click(singleproduct).perform();
    }
    
    
    
    @FindBy(xpath="//button[text()='Add to cart']")
    private List< WebElement> allProductCart;
    
    public void addAllProduct()
    {
    	for(WebElement WebElement:allProductCart)
    	{
    		allProductCart.get(0).click();
    	}
    }
    
	
    @FindBy(xpath="//a[@class='shopping_cart_link']")
    private WebElement cart;
    public String cartElement()
    {
    String addProduct=cart.getText();
    	return addProduct ;
    	
    }
	
	public homePagePOMclass(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
		s=new Select(filtterbutton);
		act=new Actions(driver);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
