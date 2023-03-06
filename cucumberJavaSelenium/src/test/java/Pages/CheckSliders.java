package Pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckSliders
{
	
	
	public CheckSliders(WebDriver driver)
	{
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory, this);
	}
	
	
	WebDriver driver;

	
	//Elements:
	@FindBy(xpath = "//a[text()=\"Shop\"]")
	@CacheLookup
	WebElement shop_btn;
	
	
	@FindBy (xpath = "//a[text()=\"Home\"]")
	@CacheLookup
	WebElement home_btn;
	
	
	@FindBy(xpath = "//div[@data-ssright=\"0+15\"]")
	@CacheLookup
	List<WebElement> SliderCount3;
	
	@FindBy(xpath = "//img[@alt=\"Shop Selenium Books\"]")
	@CacheLookup
	WebElement verification;
	

	//Methods:
	public void click_on_Shop_btn()
	{
		shop_btn.click();

	}
	
	
	public void Click_on_Home_btn()
	{
		home_btn.click();
	}
	
	
	public void QuantityOfSliders()
	{
		
		System.out.println("Number of Arrivals found:" + SliderCount3.size() ); 
	}

	public void confirmation()
	{
		
		verification.isDisplayed();
	}
	
	
}
