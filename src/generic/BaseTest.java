package generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest 
{
	public WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	
	@BeforeMethod
	public void PreCondition()
	{
		driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		Reporter.log(driver.getTitle(),true);
	}
	
	@AfterMethod
	public void PostCondition(ITestResult res) 
	{
		int status = res.getStatus();
		
		if(status==2)
		{
			String name = res.getMethod().getMethodName();
			GenericUtils.getScreenShot(driver,name);	
		}
		driver.close();
	}
}
