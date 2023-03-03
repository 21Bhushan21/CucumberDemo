package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckDiscount {

	WebDriver driver;
	public CheckDiscount(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//button[text()=\"Add to basket\"]")
	@CacheLookup
	WebElement Add;
	
	
	@FindBy(xpath = "//span[@class=\"cartcontents\"]")
	@CacheLookup
	WebElement CartItem;
	
	
	@FindBy(xpath = "//span[@class=\"cartcontents\"]")
	WebElement checkOut;
	
	
	@FindBy(xpath = "//input[@id=\"coupon_code\"]")
	@CacheLookup
	WebElement code;
	
	
	@FindBy(xpath = "//input[@value=\"Apply Coupon\"]")
	@CacheLookup
	WebElement coupon;
	

	//Methods:
	public void addToBasket() 
	{
		Add.click();
	}
	
	
	public void checkoutPage() 
	{
		CartItem.isDisplayed();
	}
	
	
	
	public void checkMenuItem() 
	{
		checkOut.click();
	}
	
	
	
	public void  checkCoupon() 
	{
		code.sendKeys("krishnasakinala");
		coupon.click();
	}
	
}
