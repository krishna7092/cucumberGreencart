package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseDriver {
		public WebDriver driver() throws FileNotFoundException, IOException {
			WebDriver driver;
			Properties pr=new Properties();
			pr.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\global.properties"));
					String property = pr.getProperty("Browser");
					if(property.equalsIgnoreCase("chrome"))
					{
						driver =new ChromeDriver(); 
						
					}
					else {
						driver =new EdgeDriver();
					}
		            driver.get(pr.getProperty("URL"));
		            return driver;
			
		}
}
