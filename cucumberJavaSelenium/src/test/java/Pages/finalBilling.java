package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class finalBilling 
{

	WebDriver driver;
	public finalBilling(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath ="//th[@class=\"product-subtotal\"]")
	@CacheLookup
	WebElement checkPrice;


	@FindBy(xpath ="//tr[@class=\"order-total\"]" )
	@CacheLookup
	WebElement totalPrice;



	public String checkOutGrid()
	{	
		return checkPrice.getText();
		
	}


	public String totalBill() 
	{
		return totalPrice.getText();
	}
}


