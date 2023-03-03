package Hooks;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	   public WebDriver driver;
		@Before
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
		@After
		public void Closethedriver()
		{
			driver.quit();
		}
		
		
		
		
	}