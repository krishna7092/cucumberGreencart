package Pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Placeorder extends Abstractuses {
	WebDriver driver;
	public Placeorder(WebDriver driver) {
		super(driver);
		this.driver=driver;
	    PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//tr/td[2]")
	List<WebElement> tableofproductname;
	
	@FindBy(xpath="//tr/td[3]")
	List<WebElement> tableofproductquanity;
	
	public boolean checkingbeforeplace(String Name,int Quantity) {
		if(tableofproductname.get(1).getText().split(" ")[0].equalsIgnoreCase(Name) && tableofproductquanity.get(1).getText().equalsIgnoreCase(Integer.toString(Quantity))) {
			return true;
		}
		return false;
	}
}
