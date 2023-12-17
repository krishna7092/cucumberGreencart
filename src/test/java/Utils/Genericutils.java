package Utils;

import org.openqa.selenium.WebDriver;

public class Genericutils {
	WebDriver driver;
	
	
	public Genericutils(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void clearcache() {
		System.out.println("clearcache");
	}
	
	public void trimmer(String s) {
		System.out.println(s);
	}

}
