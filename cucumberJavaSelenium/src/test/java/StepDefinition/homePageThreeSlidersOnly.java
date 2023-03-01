package StepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pages.Sliders;
import Pages.Update;
import Pages.clickingOnArrivals;
import Pages.descriptionBox;
import Pages.discontCheck;
import Pages.removeProduct;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homePageThreeSlidersOnly
{

	WebDriver driver = null;
	Sliders sli ;
	clickingOnArrivals arrivals;
	descriptionBox box;
	discontCheck check;
	removeProduct product ;
	Update update;
	

	@Given("browser is open")
	public void browser_is_open() 
	{
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
	
	
	//==========Tets Case 1 ==========//
	@And("User is on Automation Seach Page")
	public void user_is_on_automation_seach_page() throws InterruptedException
	{
		System.out.println("inside step -user is  in automation Test page");
		//webPage:
		driver.navigate().to("https://practice.automationtesting.in/");  
	}
	@When("User able to click on Shop Menu")
	public void user_able_to_click_on_shop_menu() throws InterruptedException 
	{
		 sli = new Sliders(driver); 
		System.out.println("inside step -user is  in Shop Menu ");
		//driver.findElement(By.xpath("//a[text()=\"Shop\"]")).click();
		//driver.switchTo().defaultContent(); // Return to main window
		sli.click_on_Shop_btn();	
	}
	@And("Now click on Home menu button")
	public void now_click_on_home_menu_button() 
	{
		System.out.println("inside step -user is  in automation Home page");
		//driver.findElement(By.xpath("//a[text()=\"Home\"]")).click();
		sli.Click_on_Home_btn();
	}
	@Then("Test whether the Home page has Three Sliders only")
	public void test_whether_the_home_page_has_three_sliders_only() throws InterruptedException
	{
		System.out.println("inside step -user Check siliders:");
		//List<WebElement> productCount3 = driver.findElements(By.xpath("//img[@style=\"opacity: 1; width: 100%; height: auto; margin-top: -5px; margin-left: 0px;\"]"));
		//System.out.println("Number of Sliders found S :"+productCount3.size());
		sli.Click_on_slider_btn();
	}
	@And("The Home page must contains only three sliders")
	public void the_home_page_must_contains_only_three_sliders()
	{
		System.out.println("The Home page  contains only three sliders");
	}



	//===========Test Cases 2 ===================//


	@Then("Test whether the Home page has Three Arrivsals only")
	public void test_whether_the_home_page_has_three_Arrivals_only()
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,800)", "");
		System.out.println("inside step -user Check Arrivals:");
		List<WebElement> productCount3 = driver.findElements(By.xpath("//img[@loading=\"lazy\"]"));
		System.out.println("Number of Arrivals found S :"+productCount3.size());

	}		
	@And("The Home page must contains only three Arrivals")
	public void the_home_page_must_contains_only_three_Arrivals()
	{
		System.out.println("The Home page contain only Three Arrivals:");
	}


	//===========Test Cases  3===================//


	@When("user click the image in the Arrivals")
	public void user_able_to_click_on_img() throws InterruptedException 
	{
		//arrivals = new clickingOnArrivals(driver);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,200)", "");
		System.out.println("inside step - User Can Click On The Arrivals:");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()=\"Mastering JavaScript\"]")).click();
		//arrivals.ClickOnJavaScript();
	}

	@Then("Test whether it is navigating to next page where the user can add that book into his basket")
	public void Test_Navigating_To_Next_Page()
	{
		System.out.println("inside step - Test Weather User Can Add this book in the Basket or Not :");
		driver.findElement(By.xpath("//button[text()=\"Add to basket\"]"));
		//arrivals.checkItVisibleOrNot();

	}


	//===========Test Cases4  ===================//



	@And("Image should be clickable and shoul navigate to next page where user can add that book to his basket")
	public void user_able_to__Descr_tab()
	{	
		box = new descriptionBox(driver);
		System.out.println("inside step - Image should be clickable And User Can Add this Book Successfully:");
	}
	
	@Then("user able to Click on Description tab for the Book")
	public void Description_tabs()
	{
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,600)", "");
		System.out.println("inside step - user clicked on Description Tab:");
		//driver.findElement(By.xpath("//li[@class=\"description_tab active\"]"));	
		box.Click_Dsrcptio_Box();
	}
	@And("There should be a description regarding that book the user clicked on")
	public void Click_On_Description()
	{
		//driver.findElement(By.xpath("//h2[text()=\"Product Description\"]")).isDisplayed();
		System.out.println("inside step - User can See the WHole Description regarding the book:");
		box.IsVisibleOrNot();
	}




	//===========Test Cases  5===================//


	@Then("Click on the Add To Basket button which adds that book to your basket")
	public void Add_To_Basket()
	{
		check = new  discontCheck(driver);
		//driver.findElement(By.xpath("//button[text()=\"Add to basket\"]")).click();
		check.addToBasket();
	}
	@And("User can view that Book in the Menu item with price")
	public void User_Can_See_Menu_Item() throws InterruptedException
	{
		//driver.findElement(By.xpath("//span[@class=\"cartcontents\"]")).isDisplayed();
		check.checkMenuItem();
		System.out.println("User can able view that  Menu item with price");
		Thread.sleep(2000);
	}
	@Then("user click on Item link which navigates to proceed to check out page.")
	public void Click_On_Item_Menu() 
	{
		check.checkoutPage();
		//driver.findElement(By.xpath("//span[@class=\"amount\"]")).click();
		check.checkMenuItem();
	}
	@Then("User leads to the check out page")
	public void User_Can_See_Check_Out_Page() throws InterruptedException
	{
		System.out.println("Now user can see the check out Page :");
		Thread.sleep(2000);
	}
	@When("Enter the Coupon code as krishnasakinala to get 50rps off on the total.")
	public void Enter_coupon_code()
	{
//		WebElement ele = driver.findElement(By.xpath("//input[@id=\"coupon_code\"]"));
//		ele.sendKeys("krishnasakinala");
		check.checkCoupon();
		
		//driver.findElement(By.xpath("//input[@value=\"Apply Coupon\"]")).click();
	}
	@But("User can not able to apply coupon because the coupon is applicable for the book price > 450 rps")
	public void User_not_able_to_Discount()
	{
		System.out.println("User can not able to apply coupon because The minimum spend for this coupon is RS-450 ");
	}


	//===========Test Cases 6 ===================//


	@Then("click on Remove this icon in Check out page")
	public void Remove_Book() throws InterruptedException
	{
		product= new removeProduct(driver);
		Thread.sleep(2000);
		System.out.println("Now user can Remove this Selected Item In checkOut Page Also:");
		//driver.findElement(By.xpath("//a[@title=\"Remove this item\"]")).click();	
		product.productRemove();
	}
	@And("User has the feasibility to remove the book at the time of check out also")
	public void Test_Weather_It_removed_Or_Not() throws InterruptedException
	{
		System.out.println("User Can See this Removed Item");

	}

	//===========Test Cases 7 ===================//

	@Then("Click on textbox value")
	public void Click_On_Text_Box()
	{
		update = new Update(driver);
		update.clickOntextBtn();
		System.out.println("Now user can Increase Or Decrease Items:");
		//driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("1");
		
		
	}
	@And("Now after the above change Update Basket button will turn into Clickable mode.")
	public void Incresing_() throws InterruptedException
	{
		
		System.out.println("User can See The Above Changes:");
	}

	@Then("click on Update Basket")
	public void Update_Basket()
	{
		update.clickOnUpdateBtn();
		System.out.println("User can update the basket After changes:");
		//driver.findElement(By.xpath("//input[@value=\"Update Basket\"]")).click();
		
		
	}
	@And("User has the feasibility to Update Basket at the time of check out.")
	public void Test_Weather_It_Update_Or_Not() throws InterruptedException
	{
		update.updateVisibleOrNot();
		//driver.findElement(By.xpath("//input[@name=\"update_cart\"]")).isDisplayed();
		System.out.println("User can Successfully Update the Baske");
	}


	//===========Test Cases 8 ===================//

	@And("User can find the Total price of the book in the Check out grid.")
	public void Fetch_Total_Price() throws InterruptedException
	{
		driver.findElement(By.xpath("//th[@class=\"product-subtotal\"]")).isDisplayed();
		System.out.println("User Can Fetch The total Price of That Book");
	}

	@Then("User has the feasibility to find the total price of the books at the time of check out")
	public void FetchAllBooksPrice()
	{
		driver.findElement(By.xpath("//tr[@class=\"order-total\"]"));
		System.out.println("User Can Fetch All Books Price In Check OUt Page:");
	}
	
	//===========Test Cases 9 ===================//
	
	

}
