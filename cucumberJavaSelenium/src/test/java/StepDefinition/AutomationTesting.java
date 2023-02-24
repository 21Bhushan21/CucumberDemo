package StepDefinition;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomationTesting {

	WebDriver driver = null;

	



	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("inside step - browser is open");

		//chromedriver :
		System.setProperty("webdriver.chrome.driver","C:/Users/bpatil10/eclipse-workspace/cucumberJavaSelenium/src/test/resources/Driver/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		driver = new ChromeDriver(opt);



		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("User is on Automation Seach Page")
	public void user_is_on_automation_seach_page() throws InterruptedException
	{
		System.out.println("inside step -user is  in automation Test page");

		//webPage:
		driver.navigate().to("https://practice.automationtesting.in/");  
		//driver.switchTo().defaultContent(); // Return to main window
		



		//		//home Button:
		//		//Advertisement:
		//		driver.findElement(By.xpath("//span[text()=\"Close\"]")).click();




		//Blocking Pop-up
//	ChromeOptions opt = new ChromeOptions();
//	opt.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));

		//		driver.switchTo().activeElement().click();

		//driver.getWindowHandles();

	}


//	@When("User able to click on Shop Menu")
//	public void user_able_to_click_on_shop_menu() throws InterruptedException 
//	{
//		System.out.println("inside step -user is  in Shop Menu ");
//
//		driver.findElement(By.xpath("//a[text()=\"Shop\"]")).click();
//
//		driver.switchTo().defaultContent(); // Return to main window
//	}
//
//
//
//
//	@And("Now click on Home menu button")
//	public void now_click_on_home_menu_button() 
//	{
//		System.out.println("inside step -user is  in automation Home page");
//
//		driver.findElement(By.xpath("//a[text()=\"Home\"]")).click();
//		
//
//		driver.switchTo().alert().sendKeys("Close");
//
//
//
//	}
//
//
//
//
//	@Then("Test whether the Home page has Three Sliders only")
//	public void test_whether_the_home_page_has_three_sliders_only()
//	{
//		System.out.println("inside step -user Check siliders:");
//	}
//
//
//
//
//	@And("The Home page must contains only three sliders")
//	public void the_home_page_must_contains_only_three_sliders()
//	{
//
//	}




}