package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import msn.*;
import webGeneric.LocationStrategy;
import webGeneric.ReusableMethods;

public class msnSteps extends LocationStrategy {
	
	public WebDriver driver;

	@Given("^browser and link is launched successfully in chrome$")
	public void browser_and_link_is_launched_successfully_in_chrome() {
	   //ReusableMethods reuseMethods = new ReusableMethods();
		driver = initialiseDriver();
	   driver.get("https://www.msn.com/en-in");
	
	   driver.manage().window().maximize();
	   
	}

	
	@Given("^user click on footer link$")
	public void user_click_on_footer_link() throws InterruptedException  {
		
		homePage homePageFooter = new homePage();
		homePageFooter.footerLinkClick(driver);
	    
	}

	@When("^user click on Travel option$")
	public void user_click_on_Travel_option()  {
		homePage homePagelink = new homePage();
		homePagelink.clickTravel(driver);

	}

	@And("^user click on Lifestyle drop down$")
	public void user_click_on_Lifestyle_drop_down() throws InterruptedException  {
		homePage homePagelink1 = new homePage();
		Thread.sleep(3000);
		homePagelink1.clickLifestyle(driver);

	}

	@And("^user select \"([^\"]*)\" link$")
	public void user_select_link(String identifier) throws InterruptedException  {
			Thread.sleep(3000);
		locateLink(identifier, driver).click();
		driver.getTitle();
	}

	@And("^user capture todays weather for Bangalore$")
	public void user_capture_todays_weather_for_Bangalore()  {
		WeatherPage weather = new WeatherPage();
	    weather.getTempXXXX(driver);
	    
	}
		
	@And("^user captures \"([^\"]*)\" weather for \"([^\"]*)\"$")
	public void user_captures_weather_for(String day, String location) throws Throwable {
		WeatherPage weather = new WeatherPage();
		weather.getTempParameterised(driver, day, location);
	    
	}
	
	@And("^user closes the browser$")
	public void user_closes_the_browser()  {
	    driver.quit();
	    
	}
	
}
