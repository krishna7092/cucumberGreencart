package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "C:\\Users\\krishna\\cucumberfullframework\\Rahulshetty\\src\\test\\java\\Featuresfile",
glue = "Stepdefinitions",
dryRun = false,monochrome = true ,
plugin = { "rerun:target\\failed scenario.txt" ,"pretty", "html:\\Reports\\result.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags="@greencart")

public class TestRunnerGreencart extends AbstractTestNGCucumberTests{
	
}
