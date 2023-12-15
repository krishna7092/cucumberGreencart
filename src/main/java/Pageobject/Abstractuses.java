package Pageobject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	
	
	public void Waittoelement(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public void Waittoelement(WebElement element) {
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	public void waittoallelement(List<WebElement> webElements) {
		wait.until(ExpectedConditions.visibilityOfAllElements(webElements));
	}
	
	
	
}
