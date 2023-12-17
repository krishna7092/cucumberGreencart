package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "C:\\Users\\krishna\\cucumberfullframework\\Rahulshetty\\src\\test\\java\\Featuresfile",
glue = "Stepdefinitions",
dryRun = false,monochrome = true ,
plugin = { "rerun:target\\failed scenario.txt" ,"pretty", "html:\\Reports\\result.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags="@greencart")

public class TestRunnerGreencart extends AbstractTestNGCucumberTests{
	
	@Override
	  @DataProvider(parallel = true)
	  public Object[][] scenarios() {
		// TODO Auto-generated method stub
		return super.scenarios();
	}
	
}
