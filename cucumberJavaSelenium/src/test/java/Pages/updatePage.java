package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class updatePage {

	WebDriver driver;
	public updatePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}





	@FindBy(xpath = "//input[@type=\"number\"]")
	@CacheLookup
	WebElement txtBox;
	
	
	@FindBy(xpath = "//input[@value=\"Update Basket\"]")
	@CacheLookup
	WebElement btnVisibleOrNot;
	


	@FindBy(xpath = "//input[@value=\"Update Basket\"]")
	@CacheLookup
	WebElement updateBtn;


	@FindBy(xpath = "//div[text()=\"Basket updated.\"]")
	@CacheLookup
	WebElement chkUpdate;




	public void clickOntextBtn() 
	{
		txtBox.sendKeys("1");
	}
	
	public boolean updateBtnClickableMode()
	{
		return btnVisibleOrNot.isEnabled();
	}


	public void clickOnUpdateBtn() 
	{
		updateBtn.click();
	}


	public String updateVisibleOrNot() 
	{
		
		return chkUpdate.getText();
	}

}
