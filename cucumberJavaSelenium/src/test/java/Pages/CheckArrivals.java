package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckArrivals 
{

	WebDriver driver;
	public CheckArrivals(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	


	@FindBy(xpath = "//img[@loading=\"lazy\"]")
	@CacheLookup
	List<WebElement> productCount3;
	
	

	@FindBy(xpath = "//img[@alt=\"Shop Selenium Books\"]")
	@CacheLookup
	WebElement verify;
	
	
	public void QuantityOfArrivals()
	{
		
		System.out.println("Number of Arrivals found:" + productCount3.size() ); 
	}
	
	
	public void confirm()
	{
		verify.isDisplayed();
	}
}
