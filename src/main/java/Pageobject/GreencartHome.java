package Pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GreencartHome extends Abstractuses{
	WebDriver driver;
	public GreencartHome(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "search-keyword")
	WebElement searchbox;
	
	
	
	@FindBy(css = "//*[@class=\"products\"]  //*[@class=\"product\"]")
	WebElement allproducts;
	
	
	
	By productletter =By.xpath(".//h4");
	
	
	By productbutton=By.xpath("//*[@class=\"product-action\"]  //*[@type=\"button\"]");
	
	@FindBy(css = ".products .product")
	List<WebElement> products;
	
	//.no-results h2
	@FindBy(css = ".no-results h2")
	WebElement noproductmsg;
	
	@FindBy(className  = "increment")
	WebElement plus;
	
	@FindBy(className ="cart-icon")
	WebElement carticon;
	
	@FindBy(xpath ="//*[contains(text(),\"PROCEED TO CHECKOUT\")]")
	WebElement procedtocheckout;
	
	@FindBy(xpath="//tr/td[2]")
	WebElement tableofproductname;
	
	@FindBy(xpath="//tr/td[3]")
	WebElement tableofproductquanity;
	
	
	public void oneproduct(String Name,int Quantity) throws InterruptedException {
		searchinhome(Name);
		Thread.sleep(1000);
         waittoallelement(products);
		//List<WebElement> foundElement = driver.findElements(By.xpath("//*[@class=\"products\"]  //*[@class=\"product\"]"));
		for( WebElement eachproduct:products) {
			String productname = eachproduct.findElement(By.xpath(".//h4")).getText().split(" ")[0];
			//Thread.sleep(2000);
			if(productname.equalsIgnoreCase(Name)) {
				Thread.sleep(1000);
				for(int i=0;i<Quantity;i++) {
					plus.click();
				}
				eachproduct.findElement(productbutton).click();
			}
			
			
		}
		
	}
	
	public void addtocart() {
		carticon.click();
	}
	
	public void proceedtocheckout() {
		procedtocheckout.click();
	}
	
	
	public void searchinhome(String values) {
		System.out.println(values);
		actions.moveToElement(searchbox).click().sendKeys(values).build().perform();
		//wait.until(ExpectedConditions.visibilityOfAllElements(products));
         
		
		
	}
	
	public String noproductisdisplayed() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("no-results"))));
		
		if(noproductmsg.isDisplayed()) {
			return noproductmsg.getText();
		}
		return " ";
	}
	
	

}
