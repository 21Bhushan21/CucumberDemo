package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Features\\CucumberDemo.feature", 
		glue = {"StepDefinition" },
		monochrome = true,
		tags = "@TestCase-9",
		plugin = { "pretty", "json:target/JSONReports/report.json",
				"junit:target/JUnitReports/report.xml", 
				"html:target/HtmlReports/index.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		)
public class TestRunner
{

}
