package Pageobject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstractuses {
	WebDriver driver;
	Actions actions;
	WebDriverWait wait;
	public Abstractuses(WebDriver driver) {
		this.driver=driver;
		actions=new Actions(driver);
		wait=new WebDriverWait(driver,Duration.ofSeconds(5) );
	}
	
	
	
}
