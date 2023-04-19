package parallel;


import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.addBook;
import Pages.arrivalsPage;
import Pages.discountPage;
import Pages.checkOutPage;
import Pages.slidersPage;
import Pages.descriptionPage;
import Pages.billingPage;
import Pages.removePage;
import Pages.updatePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.excelReader;


public class basePage
{

	WebDriver driver = null;
	WebDriverWait wait;
	slidersPage sli ;
	arrivalsPage arrival;
	addBook click;
	descriptionPage box;
	discountPage check;
	removePage product ;
	updatePage update;
	billingPage billing;
	checkOutPage out;
	
	//@Before(Value="@TestCase-1", order = 1)
	@SuppressWarnings("deprecation")
	@Before(order = 1)
	public void browser_is_open() 
	{
		System.out.println("inside step - browser is open");

		//chromedriver :
		//WebDriverManager.chromedriver().setup();
		String projectpath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Driver/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	

	//========================Tets Case 1- validate Quantity of Sliders========================================================//



	@SuppressWarnings("deprecation")
	@And("User is on Automation Seach Page")
	public void userIsOnAutomationSeachPage() throws InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("inside step -user is  in automation Test page");
		driver.navigate().to("https://practice.automationtesting.in/");  
	}


	@When("User able to click on Shop Menu")
	public void clickOnShopMenu() throws InterruptedException 
	{
		
		sli = new slidersPage(driver); 	
		sli.clickOnShopBtn();	
	}


	@And("Now click on Home menu button")
	public void clickOnHomeMenuButton() 
	{
		sli.clickOnHomeBtn();
		System.out.println("inside step -user is  in automation Home page");

	}


	@Then("Test whether the Home page has Three Sliders only")
	public void testWhetherTheHomePageHasThreeSlidersOrNot() throws InterruptedException
	{
		
		System.out.println("inside step -user Check siliders:");
		sli.quantityOfSliders();
	}


		
	@And("The Home page must contains only three sliders")
	public void homePageMustContainsOnlyThreeSliders()
	{
	
		 Boolean Actual =  sli.confirmation();
		 assertTrue(Actual);
	}





	//===========Test Cases 2-validate Quantity of Arrivals  ===================//




	@SuppressWarnings("deprecation")
	@Then("Test whether the Home page has Three Arrivsals only")
	public void TestWhetherTheHomePageHasThreeArrivalsOrNot()
	{
		arrival = new arrivalsPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,800)", "");
		arrival.quantityOfArrivals();

	}		

	@And("The Home page must contains only three Arrivals")
	public void homePageMustContainsOnlyThreeArrivals()
	{
		String Actual = arrival.confirm();
		String Expected = "Thinking in HTML";
		assertEquals(Expected, Actual);
	}




	//===========Test Cases  3 - As an existing user can adding Book===================//




	@SuppressWarnings("deprecation")
	@When("user click the image in the Arrivals")
	public void clickOnImg() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click = new addBook(driver);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300)", "");
		click.clickOnJavaScript();
	}


	@Then("Test whether it is navigating to next page where the user can add that book into his basket")
	public void testNavigatingToNextPage()
	{
		String Actual =  click.checkItVisibleOrNot();
		String Expected = "ADD TO BASKET";
		assertEquals(Expected, Actual);
		
	}



	//===========Test Cases4 -As an existing user can See Description of Book: ===================//




	@SuppressWarnings("deprecation")
	@And("Image should be clickable and shoul navigate to next page where user can add that book to his basket")
	public void userAbleToDescrTab()
	{	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		box = new descriptionPage(driver);
		click.checkItVisibleOrNot();

	}


	@Then("user able to Click on Description tab for the Book")
	public void clickOnDescriptionTabs()
	{

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,600)", "");
		box.clickDsrcptionBox();
		System.out.println("inside step - user clicked on Description Tab:");

	}


	@And("There should be a description regarding that book the user clicked on")
	public void checkDescription()
	{
		String Actual = box.isVisibleOrNot();
		String Expected = "Product Description";
		assertEquals(Expected, Actual);
		System.out.println("inside step - User can See the Whole Description regarding the book:");
	}




	//===========Test Cases  5 - As an existing User can Check the Discount :===================//




	@Then("Click on the Add To Basket button which adds that book to your basket")
	public void clickOnAddToBasket()
	{
		check = new  discountPage(driver);
		check.addToBasket();
	}


	@And("User can view that Book in the Menu item with price")
	public void userCanSeeMenuItem() throws InterruptedException
	{
		check.checkMenuItem();
	}


	@Then("user click on Item link which navigates to proceed to check out page.")
	public void clickOnItemMenu() 
	{
		check.checkOutPage();
		check.checkMenuItem();
	}


	
	@Then("User leads to the check out page")
	public void userCanFetchCheckOutPage() throws InterruptedException
	{
		String webUrl = driver.getCurrentUrl();
		String expectedUrl = "https://practice.automationtesting.in/basket/";
		assertEquals(expectedUrl,webUrl);
	}
	
	
	
	@When("fill the form as {string}  and {int}")
	public void fill_the_form_as_and(String SheetName, Integer RowNumber)  throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		excelReader reader = new excelReader();
		
		
		List<Map<String, String>> testdata = reader.getData("C:/Users/bpatil10/OneDrive - Capgemini/Documents/CucumberJavaSelenium.xlsx", SheetName);
		String couponCode =testdata.get(RowNumber).get("CouponCode");
		check.checkCoupon(couponCode);
	}


	@But("User can not able to apply coupon because the coupon is applicable for the book price > 450 rps")
	public void userNotAbleToGetDiscount()
	{
		String Actual = check.discountNotAvailable();
		String Expected = "Please enter a coupon code.";
		assertEquals(Expected,Actual);
	}




	//===========Test Cases 6 - As an existing user can Remove the Product :===================//




	@Then("click on Remove this icon in Check out page")
	public void clickOnRemoveBook() throws InterruptedException
	{
		product= new removePage(driver);
		product.productRemove();

	}


	@And("User has the feasibility to remove the book at the time of check out also")
	public void testWeatherItremovedOrNot() throws InterruptedException
	{
		String Actual = product.removedMsg();
		String Expected = "Mastering JavaScript removed. Undo?";
		assertEquals(Expected,Actual);
		

	}




	//===========Test Cases 7 - As an existing user Update the Items :===================//


	
	@Then("Enter the value has as {string}  and {int}")
	public void enter_the_value_has_as_and(String SheetName,Integer RowNumber ) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		update = new updatePage(driver);
		//update.clickOntextBtn();
		
		excelReader reader = new excelReader();		
		
		List<Map<String, String>> testdata = reader.getData("C:/Users/bpatil10/OneDrive - Capgemini/Documents/CucumberJavaSelenium.xlsx", SheetName);
		String couponCode =testdata.get(RowNumber).get("value");
		update.clickOntextBtn(couponCode);
	}


	@And("Now after the above change Update Basket button will turn into Clickable mode.")
	public void incresing() throws InterruptedException
	{
		boolean Actual = update.updateBtnClickableMode();
		assertTrue(Actual);
	}


	@Then("click on Update Basket")
	public void clickOnUpdateBasket()
	{
		update.clickOnUpdateBtn();
	}


	@And("User has the feasibility to Update Basket at the time of check out.")
	public void testWeatherItUpdateOrNot() throws InterruptedException
	{
		String Actual = update.updateVisibleOrNot();
		String Expected = "Basket updated.";
		assertEquals(Expected,Actual);

	}




	//===========Test Cases 8 -As an existing user can fetch Final Billing:	===================//



	@And("User can find the Total price of the book in the Check out grid.")
	public void fetchTotalPrice() throws InterruptedException
	{
		billing = new billingPage(driver);
		String Actual = billing.checkOutGrid();
		String Expected = "Total";
		assertEquals(Expected,Actual);
				
	}

	@Then("User has the feasibility to find the total price of the books at the time of check out")
	public void FetchAllBooksPrice()
	{
		String Actual = billing.totalBill();
		String Expected = "Total ₹357.00";
		assertEquals(Expected,Actual);
				
	}



	//===========Test Cases 9 - As an existing user can Check Out Updated Basket===================//

	@Then("Click on textbox value")
	public void click_on_textbox_value()
	{
		updatePage page = new updatePage(driver);
		
	    System.out.println("i");
	}

	@Then("User Clicking on Proceed to Checkout button leads to payment gateway page")
	public void checkOutPage()
	{
		out = new checkOutPage(driver);
		out.finalProcess();
	}
	
	
	
	@After(order = 1)
	public void takeScreenshotOnFailure(io.cucumber.java.Scenario scenario)
	{
		if(scenario.isFailed())
		{
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/img", "screenshot");
			
			
		}
		
	}
	
	

	
	@After(order = 0)
	public void tearDown()
	{
		
		System.out.println(" Your TestCases is Successfully Run :");
		driver.quit();
		
	}


}
