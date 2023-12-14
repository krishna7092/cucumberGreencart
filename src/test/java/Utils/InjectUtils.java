package Utils;

import org.openqa.selenium.WebDriver;

import Pageobject.objectfactory;

public class InjectUtils {

	public WebDriver driver;
	public objectfactory factory;
	
	public InjectUtils() {
		driver=new BaseDriver().driver();
		factory=new objectfactory(driver);
		
	}
	

}
