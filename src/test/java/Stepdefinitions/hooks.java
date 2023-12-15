package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Utils.InjectUtils;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class hooks {
	public WebDriver driver;
	public hooks(InjectUtils utils) {
		// TODO Auto-generated constructor stub
		driver=utils.driver;
	}
	
	    
	    @After
	    public void close() {
	    	driver.close();
	    	
	    }
}
