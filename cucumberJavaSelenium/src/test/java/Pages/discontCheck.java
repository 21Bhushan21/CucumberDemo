package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class discontCheck {

	WebDriver driver;
	public discontCheck(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By Add = By.xpath("//button[text()=\"Add to basket\"]");
	By menuItem = By.xpath("//span[@class=\"cartcontents\"]");
	By chkout = By.xpath("//span[@class=\"amount\"]");
	By code = By.xpath("//input[@id=\"coupon_code\"]");
	By coupon = By.xpath("//input[@value=\"Apply Coupon\"]");
	
	public void addToBasket() {
		driver.findElement(Add).click();
	}
	public void checkMenuItem() {
		driver.findElement(menuItem).click();
	}
	public void checkoutPage() {
		driver.findElement(chkout).isDisplayed();
	}
	public void  checkCoupon() {
		driver.findElement(code).sendKeys("krishnasakinala");
		driver.findElement(coupon).click();
	}
}
