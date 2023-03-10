package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addBook
{

	WebDriver driver;
	public addBook(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//h3[text()=\"Mastering JavaScript\"]")
	WebElement Image;
	
	
	
	@FindBy(xpath = "//button[text()=\"Add to basket\"]")
	WebElement PageCheck;
	
	
	
	
	public void clickOnJavaScript() 
	{
		
		Image.click();
	}
	
	public String checkItVisibleOrNot()
	{
		return PageCheck.getText();
	}
	
	
}
