package generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenericUtils 
{
	public static void getScreenShot(WebDriver driver,String name)
	{
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./screenshots/"+name+".png");
			FileUtils.copyFile(src, dest);
		}
		catch(Exception e)
		{
			
		}
	
	
}
}