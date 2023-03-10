package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class checkArrivals 
{

	WebDriver driver;
	public checkArrivals(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	


	@FindBy(xpath = "//img[@loading=\"lazy\"]")
	@CacheLookup
	List<WebElement> productCount3;
	
	

	@FindBy(xpath = "//h3[text()=\"Thinking in HTML\"]")
	@CacheLookup
	WebElement verify;
	
	
	public void quantityOfArrivals()
	{
		System.out.println("Number of Arrivals found:" + productCount3.size() ); 
	}
	
	
	
	public String confirm()
	{	 
		return verify.getText();
	}
}
