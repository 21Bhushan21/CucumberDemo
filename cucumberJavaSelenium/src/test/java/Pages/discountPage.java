package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class discountPage {

	WebDriver driver;
	WebDriverWait wait;
	
	public discountPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//button[text()=\"Add to basket\"]")
	@CacheLookup
	WebElement Add;
	
	
	@FindBy(xpath = "//span[@class=\"amount\"]")
	@CacheLookup
	WebElement CartItem;
	
	
	@FindBy(xpath = "//span[@class=\"amount\"]")
	WebElement checkOut;
	
	
	@FindBy(xpath = "//input[@name=\"coupon_code\"]")
	@CacheLookup
	WebElement code;
	
	
	@FindBy(xpath = "//input[@value=\"Apply Coupon\"]")
	@CacheLookup
	WebElement coupon;
	

	@FindBy(xpath = "//ul[@class=\"woocommerce-error\"]//li")
	@CacheLookup
	WebElement discount;
	

	//Methods:
	public void addToBasket() 
	{
		
		Add.click();
	}
	

	public void checkOutPage() 
	{
		try 
		{
			CartItem.isDisplayed();
			
		} 
		catch (Exception e)
		{
			CartItem.isDisplayed();
		}
		
	}
	
	
	public void checkMenuItem() 
	{
		
		checkOut.click();
	}
	
	
	
	public void  checkCoupon(String couponCode) 
	{
		code.sendKeys(couponCode);
		coupon.click();
	}
	
	public String  discountNotAvailable()
	{
		return discount.getText();
	}
	
	
}
