package Pageobject;

import org.openqa.selenium.WebDriver;

public class objectfactory {
	
	
	public GreencartHome greenhome;
	
	public Placeorder placeorder;
	
	public countryandconfirmation countryandconfirmation;
	
	public objectfactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		greenhome =new GreencartHome(driver);
		placeorder=new Placeorder(driver);
		countryandconfirmation=new countryandconfirmation(driver);
	}
		
	

	public GreencartHome getGreenhome() {
		return greenhome;
	}

	public void setGreenhome(GreencartHome greenhome) {
		this.greenhome = greenhome;
	}

	public Placeorder getPlaceorder() {
		return placeorder;
	}

	public void setPlaceorder(Placeorder placeorder) {
		this.placeorder = placeorder;
	}

	public countryandconfirmation getCountryandconfirmation() {
		return countryandconfirmation;
	}

	public void setCountryandconfirmation(countryandconfirmation countryandconfirmation) {
		this.countryandconfirmation = countryandconfirmation;
	}
	
	

	
	

}
