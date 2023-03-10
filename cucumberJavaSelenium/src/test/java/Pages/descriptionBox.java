package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class descriptionBox 
{

	
	WebDriver driver;
	public descriptionBox(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath ="//li[@class=\"description_tab active\"]")
	@CacheLookup
	WebElement dscrption;
	
	
	@FindBy(xpath = "//h2[text()=\"Product Description\"]")
	@CacheLookup
	WebElement visibility;

	
	
	//Methods:
	public void clickDsrcptionBox()
	{
		dscrption.click();
	}
	
	
	public String isVisibleOrNot()
	{
		return visibility.getText();
	}


	
}
