package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target\\failed scenario.txt",
glue = "Stepdefinitions",
dryRun = false,monochrome = true ,
plugin = {"pretty", "html:\\Reports\\result.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class Rerunner extends AbstractTestNGCucumberTests {
	
  

}
