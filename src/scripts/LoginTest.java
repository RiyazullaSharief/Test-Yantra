package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.urbanladder;

public class LoginTest extends BaseTest
{
	@Test
	public void login()
	{
	urbanladder ul =new urbanladder(driver);
	
	ul.closePopUp();
	ul.clickOnSale();
	}

}
