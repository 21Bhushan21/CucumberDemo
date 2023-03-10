package Pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class checkSliders
{
	
	
	public checkSliders(WebDriver driver)
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
	WebElement homeBtn;
	
	
	@FindBy(xpath = "//img[@class=\"n2-ss-slide-background-image n2-ss-slide-fill n2-ow\"]")
	@CacheLookup
	List<WebElement> SliderCount3;
	
	@FindBy(xpath = "//img[@alt=\"Shop Selenium Books\"]")
	@CacheLookup
	WebElement verification;
	

	//Methods:
	public void clickOnShopBtn()
	{
		shop_btn.click();

	}
	
	
	public void clickOnHomeBtn()
	{
		homeBtn.click();
	}
	
	
	public void quantityOfSliders()
	{
		
		System.out.println("Number of Sliders found:" + SliderCount3.size() ); 
	}

	public boolean confirmation()
	{
		return verification.isDisplayed();
	}
	
	
}
