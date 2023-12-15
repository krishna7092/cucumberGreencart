package Stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Scenario;

import Utils.InjectUtils;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;

public class hooks {
	public WebDriver driver;
	public hooks(InjectUtils utils) {
		// TODO Auto-generated constructor stub
		driver=utils.driver;
	}
		@AfterStep
		public void scfailed(Scenario sr) throws IOException {
				if(sr.isFailed()) {
					File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    		byte[] readFileToByteArray = FileUtils.readFileToByteArray(sc);
		    		sr.attach(readFileToByteArray, "image/png", "image");
		    		File path = new File(System.getProperty("user.dir")+"//reports//"+ "error.png");
		    		FileUtils.copyFile(sc, path);
				}
			
		}
	    
	    @After
	    public void close() {
	    	driver.close();
	    	
	    }
}
