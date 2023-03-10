package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class removePage 
{

	WebDriver driver;
	public removePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//a[@title=\"Remove this item\"]")
	@CacheLookup
	WebElement removeBook;
	
	@FindBy(xpath = "//div[text()=\"Mastering JavaScript removed. \"]")
	@CacheLookup
	WebElement removingMsg;
	
	
	public void productRemove()
	{
		removeBook.click();
	}
	
	public String removedMsg()
	{
		return removingMsg.getText();
	}
}
