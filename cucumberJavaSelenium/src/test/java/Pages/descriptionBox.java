package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class descriptionBox {

	
	WebDriver driver;
	public descriptionBox(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By dscrption = By.xpath("//li[@class=\"description_tab active\"]");
	By visibility = By.xpath("//h2[text()=\"Product Description\"]");
	
	
	public void Click_Dsrcptio_Box() {
		driver.findElement(dscrption).click();
	}
	public void IsVisibleOrNot() {
		driver.findElement(visibility).isDisplayed();
	}
}
