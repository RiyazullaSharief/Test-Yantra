package pages;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class urbanladder
{
	public WebDriver driver;
	@FindBy(xpath="//a[@data-gaaction='popup.auth.close']")
	private WebElement closeBTN;
	
	@FindBy(xpath="(//span[@class='topnav_itemname'])[1]")
	private WebElement saleLnk;
	
	@FindBy(xpath="//a[@class='inverted']")
	private List<WebElement> subSaleLink;	
	
	public urbanladder( WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void closePopUp()
	{
		closeBTN.click();
	}
	public void clickOnSale()
	{
		Actions act=new Actions(driver);
		act.moveToElement(saleLnk).perform();
		for(WebElement names: subSaleLink)
		{
			String text = names.getText();
			Reporter.log(text,true);
		}
	}
}
