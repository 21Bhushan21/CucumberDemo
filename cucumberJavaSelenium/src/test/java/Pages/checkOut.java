package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkOut {

	WebDriver driver;
	public checkOut(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//a[@class=\"checkout-button button alt wc-forward\"]")
	@CacheLookup
	WebElement address;
	
	
	
	
	public void finalProcess()
	{
		address.click();
	}
}
