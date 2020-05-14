package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import webGeneric.ReusableMethods;

public class Hooks extends ReusableMethods {
	
	@Before("@SmokeTest")
	public void openBrowser()
	{
		System.out.println("Before Test opening browser");
	}

	@After
	public void closeBrowser()
	{
		System.out.println("After Test closing browser");
		driver.quit();
		
	}
	
}
