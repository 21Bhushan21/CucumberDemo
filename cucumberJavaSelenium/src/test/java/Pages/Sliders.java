package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sliders
{
	

	public Sliders(WebDriver driver){
		this.driver = driver;
	}
	
	
	WebDriver driver;

	By shop_btn = By.xpath("//a[text()=\"Shop\"]");
	By home_btn = By.xpath("//a[text()=\"Home\"]");
	By slide = By.xpath("//div[@data-ssright=\"0+15\"]");


	public void click_on_Shop_btn()
	{
		driver.findElement(shop_btn).click();

	}
	public void Click_on_Home_btn()
	{
		driver.findElement(home_btn).click();
	}
	public void Click_on_slider_btn()
	{
		for(int i=1;i<3;i++)
		{
			driver.findElement(slide).click();
		}
		
	}
	
	
}
