package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateProduct {

	WebDriver driver;
	public UpdateProduct(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	@FindBy
	WebElement clear;


	@FindBy(xpath = "//input[@type=\"number\"]")
	@CacheLookup
	WebElement txtBox;


	@FindBy(xpath = "//input[@value=\"Update Basket\"]")
	@CacheLookup
	WebElement updateBtn;


	@FindBy(xpath = "//div[text()=\"Basket updated.\"]")
	@CacheLookup
	WebElement chkUpdate;


	public void clear_previos_value()
	{
		clear.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	}


	public void clickOntextBtn() 
	{
		txtBox.sendKeys("1");
	}


	public void clickOnUpdateBtn() 
	{
		updateBtn.click();
	}


	public void updateVisibleOrNot() 
	{
		chkUpdate.isDisplayed();
	}

}
