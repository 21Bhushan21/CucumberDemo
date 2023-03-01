package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class removeProduct {

	WebDriver driver;
	public removeProduct(WebDriver driver) {
		this.driver = driver;
	}
	
	By removeIcon = By.xpath("//a[@title=\"Remove this item\"]");
	
	public void productRemove() {
		driver.findElement(removeIcon).click();
	}
}
