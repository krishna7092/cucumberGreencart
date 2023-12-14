package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {
		public WebDriver driver() {
			return new ChromeDriver();
		}
}
