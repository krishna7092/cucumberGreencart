package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobject.GreencartHome;

public class Greencart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		GreencartHome home=new GreencartHome(driver);
		driver.findElement(By.className("search-keyword")).sendKeys("potato");
		Thread.sleep(2000);
		List<WebElement> foundElement = driver.findElements(By.xpath("//*[@class=\"products\"]  //*[@class=\"product\"]"));
		for( WebElement eachproduct:foundElement) {
			String productname = eachproduct.findElement(By.xpath(".//h4")).getText().split(" ")[0];
			if(productname.equalsIgnoreCase("potato")) {
				Thread.sleep(1000);
				eachproduct.findElement(By.xpath("//*[@class=\"product-action\"]    //*[@type=\"button\"]")).click();
			}
			
			
		}
		for(int i=0;i<4;i++) {
			driver.findElement(By.className("increment")).click();
		}
		driver.findElement(By.className("cart-icon")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),\"PROCEED TO CHECKOUT\")]")).click();
		String placeodername= driver.findElements(By.xpath("//tr/td[2]")).get(1).getText().split(" ")[0];
		String placeoderquantity = driver.findElements(By.xpath("//tr/td[3]")).get(1).getText().split(" ")[0];
		
		
		
		
		
		
		
		
		
}
}
