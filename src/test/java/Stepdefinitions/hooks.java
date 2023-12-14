package Stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	    @Before
		public void openchrome() {
	    	
		}
	    
	    @After
	    public void close() {
	    	
	    	System.out.println("close the browser");
	    }
}
