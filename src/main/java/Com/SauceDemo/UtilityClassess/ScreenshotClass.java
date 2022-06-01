package Com.SauceDemo.UtilityClassess;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class ScreenshotClass 
{
static WebDriver driver;

	public static void screenshot(WebDriver driver) throws IOException
	{
		Date d= new Date();
		DateFormat d1=new SimpleDateFormat("MM-dd-yy && HH-mm-ss");
		String date=d1.format(d);
		
		TakesScreenshot t=(TakesScreenshot)driver;
		File source =t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/SauceDemo"+date+".jpg");
		FileHandler.copy(source, dest);
		System.out.println("screenshot is taken");
	}
	
	
	public ScreenshotClass (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
			
	
	
}

