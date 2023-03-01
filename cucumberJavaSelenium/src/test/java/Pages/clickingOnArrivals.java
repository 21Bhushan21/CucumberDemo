package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class clickingOnArrivals
{

	WebDriver driver;
	public clickingOnArrivals(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	By Image = By.xpath("//h3[text()=\"Mastering JavaScript\"]");
	By PageCheck = By.xpath("//button[text()=\"Add to basket\"]");
	
	public void ClickOnJavaScript() {
		driver.findElement(Image).click();
	}
	
	public void checkItVisibleOrNot() {
		driver.findElement(PageCheck).isDisplayed();
	}
	
}
