package Utils;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pageobject.objectfactory;

public class InjectUtils {

	public WebDriver driver;
	public objectfactory factory;
	
	public InjectUtils() throws FileNotFoundException, IOException {
		driver=new BaseDriver().driver();
		factory=new objectfactory(driver);
		
	}
	

}
