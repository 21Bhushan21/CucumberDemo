package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\AutomationTesting.feature", glue = {
		"StepDefinition" }, monochrome = true,tags = "@TestCase-7",plugin = { "pretty", "json:target/JSONReports/report.json",
				"junit:target/JUnitReports/report.xml", "html:target/HtmlReports/index.html" }
				)
public class TestRunner
{
	
}
