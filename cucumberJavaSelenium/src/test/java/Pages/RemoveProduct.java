package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveProduct 
{

	WebDriver driver;
	public RemoveProduct(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//a[@title=\"Remove this item\"]")
	@CacheLookup
	WebElement removeBook;
	
	
	public void productRemove()
	{
		removeBook.click();
	}
}
