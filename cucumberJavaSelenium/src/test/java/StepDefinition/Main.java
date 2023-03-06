package StepDefinition;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.CheckArrivals;
import Pages.CheckDiscount;
import Pages.CheckSliders;
import Pages.ClickingOnArrivals;
import Pages.DescriptionBox;
import Pages.FinalBilling;
import Pages.RemoveProduct;
import Pages.UpdateProduct;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JacksonInject.Value;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.Assert.assertEquals;


public class Main
{

	WebDriver driver = null;
	CheckSliders sli ;
	CheckArrivals arrival;
	ClickingOnArrivals click;
	DescriptionBox box;
	CheckDiscount check;
	RemoveProduct product ;
	UpdateProduct update;
	FinalBilling billing;


	//@Before(Value="@TestCase-1", order = 1)
	@Before(order = 1)
	public void browser_is_open() 
	{
		System.out.println("inside step - browser is open");

		//chromedriver :
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		driver = new ChromeDriver(opt);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	

	//========================Tets Case 1- validate Quantity of Sliders========================================================//



	@And("User is on Automation Seach Page")
	public void user_is_on_automation_seach_page() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("inside step -user is  in automation Test page");
		driver.navigate().to("https://practice.automationtesting.in/");  
	}


	@When("User able to click on Shop Menu")
	public void Click_on_shop_menu() throws InterruptedException 
	{
		
		sli = new CheckSliders(driver); 	
		sli.click_on_Shop_btn();	
		System.out.println("inside step -user is  in Shop Menu ");
	}


	@And("Now click on Home menu button")
	public void Click_on_home_menu_button() 
	{
		sli.Click_on_Home_btn();
		System.out.println("inside step -user is  in automation Home page");

	}


	@Then("Test whether the Home page has Three Sliders only")
	public void Test_whether_the_home_page_has_three_sliders_Or_Not() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("inside step -user Check siliders:");
		sli.QuantityOfSliders();
	}


	@And("The Home page must contains only three sliders")
	public void Home_page_must_contains_only_three_sliders()
	{
		sli.confirmation();
		System.out.println("The Home page  contains only three sliders");
	}





	//===========Test Cases 2-validate Quantity of Arrivals  ===================//




	@Then("Test whether the Home page has Three Arrivsals only")
	public void Test_whether_the_home_page_has_three_Arrivals_Or_Not()
	{
		arrival = new CheckArrivals(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,800)", "");
		System.out.println("inside step -user Check Arrivals:");
		arrival.QuantityOfArrivals();

	}		


	@And("The Home page must contains only three Arrivals")
	public void Home_page_must_contains_only_three_Arrivals()
	{
		arrival.confirm();
		System.out.println("The Home page contain only Three Arrivals:");
	}




	//===========Test Cases  3 - As an existing user can adding Book===================//




	@When("user click the image in the Arrivals")
	public void Click_on_img() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		click = new ClickingOnArrivals(driver);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300)", "");

		click.ClickOnJavaScript();

	}


	@Then("Test whether it is navigating to next page where the user can add that book into his basket")
	public void Test_Navigating_To_Next_Page()
	{
		System.out.println("inside step - Test Weather User Can Add this book in the Basket or Not :");
		//driver.findElement(By.xpath("//button[text()=\"Add to basket\"]"));
		click.checkItVisibleOrNot();

	}





	//===========Test Cases4 -As an existing user can See Description of Book: ===================//




	@And("Image should be clickable and shoul navigate to next page where user can add that book to his basket")
	public void user_able_to__Descr_tab()
	{	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		box = new DescriptionBox(driver);
		System.out.println("inside step - Image should be clickable And User Can Add this Book Successfully:");
	}


	@Then("user able to Click on Description tab for the Book")
	public void Click_On_Description_tabs()
	{

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,600)", "");
		System.out.println("inside step - user clicked on Description Tab:");
		box.Click_Dsrcption_Box();
	}


	@And("There should be a description regarding that book the user clicked on")
	public void Check_Description()
	{
		box.IsVisibleOrNot();
		System.out.println("inside step - User can See the WHole Description regarding the book:");
	}




	//===========Test Cases  5 - As an existing User can Check the Discount :===================//




	@Then("Click on the Add To Basket button which adds that book to your basket")
	public void Click_On_Add_To_Basket()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		check = new  CheckDiscount(driver);
		check.addToBasket();
	}


	@And("User can view that Book in the Menu item with price")
	public void User_Can_See_Menu_Item() throws InterruptedException
	{
		check.checkMenuItem();
		System.out.println("User can able view that  Menu item with price");
		Thread.sleep(2000);
	}


	@Then("user click on Item link which navigates to proceed to check out page.")
	public void Click_On_Item_Menu() 
	{
		check.checkoutPage();
		check.checkMenuItem();
	}


	@Then("User leads to the check out page")
	public void User_Can_Fetch_Check_Out_Page() throws InterruptedException
	{
		System.out.println("Now user can see the check out Page :");
		Thread.sleep(2000);
	}


	@When("Enter the Coupon code as krishnasakinala to get 50rps off on the total.")
	public void Enter_coupon_code()
	{
		check.checkCoupon();
		
	}


	@But("User can not able to apply coupon because the coupon is applicable for the book price > 450 rps")
	public void User_not_able_to_Get_Discount()
	{
		System.out.println("User can not able to apply coupon because The minimum spend for this coupon is RS-450 ");
	}




	//===========Test Cases 6 - As an existing user can Remove the Product :===================//




	@Then("click on Remove this icon in Check out page")
	public void Click_On_Remove_Book() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		product= new RemoveProduct(driver);
		product.productRemove();
		System.out.println("Now user can Remove this Selected Item In checkOut Page Also:");

	}


	@And("User has the feasibility to remove the book at the time of check out also")
	public void Test_Weather_It_removed_Or_Not() throws InterruptedException
	{

		System.out.println("User has successfully Removed Item");

	}




	//===========Test Cases 7 - As an existing user Update the Items :===================//




	@Then("Click on textbox value")
	public void Click_On_Text_Box()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		update = new UpdateProduct(driver);
		//update.clear_previos_value();
		update.clickOntextBtn();
		System.out.println("Now user can Increase Or Decrease Items:");

	}


	@And("Now after the above change Update Basket button will turn into Clickable mode.")
	public void Incresing_() throws InterruptedException
	{

		System.out.println("User can See The Above Changes:");
	}


	@Then("click on Update Basket")
	public void Click_On_Update_Basket()
	{
		update.clickOnUpdateBtn();
		System.out.println("User can update the basket After changes:");
	}


	@And("User has the feasibility to Update Basket at the time of check out.")
	public void Test_Weather_It_Update_Or_Not() throws InterruptedException
	{
		update.updateVisibleOrNot();
		System.out.println("User can Successfully Update the Baske");
	}




	//===========Test Cases 8 -As an existing user can fetch Final Billing:	===================//



	@And("User can find the Total price of the book in the Check out grid.")
	public void Fetch_Total_Price() throws InterruptedException
	{
		billing = new FinalBilling(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		billing.Check_Out_grid();		
		System.out.println("User Can Fetch The total Price of That Book");
	}

	@Then("User has the feasibility to find the total price of the books at the time of check out")
	public void FetchAllBooksPrice()
	{
		billing.TotalBill();		
		System.out.println("User Can Fetch All Books Price In Check OUt Page:");
	}



	//===========Test Cases 9 - As an existing user can Check Out Updated Basket===================//



	@After
	public void tearDown()
	{
		
		System.out.println(" Your TestCases is Successfully Run :");
		driver.quit();
		
	}


}
