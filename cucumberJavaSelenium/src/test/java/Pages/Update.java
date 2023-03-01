package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Update {

	WebDriver driver;
	public Update(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By txtBox = By.xpath("//input[@type=\"number\"]");
	By updateBtn = By.xpath("//input[@value=\"Update Basket\"]");
	By chkUpdate = By.xpath("//div[text()=\"Basket updated.\"]");
	
	
	public void clickOntextBtn() {
		driver.findElement(txtBox).sendKeys("1");
	}
	
	public void clickOnUpdateBtn() {
		driver.findElement(updateBtn).click();
	}
	public void updateVisibleOrNot() {
		driver.findElement(chkUpdate).isDisplayed();
	}
}
