package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import demoproject.*;


public class Login {
	
	@When("^user login to web application in chrome$")
	public void user_login_to_web_application_in_chrome() throws Throwable {
		String identifier = null;
		login LoginPage = new login(identifier);
		LoginPage.initialisedDriver();
		
	    System.out.println("Chrome is launched");
	    
	}
	
	@Then("^login page is displayed successfully with username \"([^\"]*)\"$")
	public void login_page_is_displayed_successfully_with_username(String name)  {
		
		
		System.out.println("Chrome is launched" + name);
	  
	}


}
