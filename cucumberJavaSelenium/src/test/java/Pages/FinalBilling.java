package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalBilling 
{

	WebDriver driver;
	public FinalBilling(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath ="//th[@class=\"product-subtotal\"]")
	@CacheLookup
	WebElement checkPrice;


	@FindBy(xpath ="//tr[@class=\"order-total\"]" )
	@CacheLookup
	WebElement TotalPrice;



	public void Check_Out_grid()
	{	
		checkPrice.isDisplayed();
	}


	public void TotalBill() 
	{
		TotalPrice.isDisplayed();
	}
}


