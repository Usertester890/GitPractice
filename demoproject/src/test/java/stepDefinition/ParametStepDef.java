package stepDefinition;

import java.util.List;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ParametStepDef {
		
	@Given("^user login to home page of \"([^\"]*)\"$")
	public void user_login_to_home_page_of(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user login to home page "+ arg1);
	    
	}

	@Given("^browser launched successfully in chrome$")
	public void browser_launched_successfully_in_chrome()  {
	    System.out.println("browser launched successfully");
	    
	}
	
	@When ("^user clicks on button \"([^\"]*)\" and \"([^\"]*)\"$")
		public void user_clicks_on_button_arg1_and_arg2 (String arg1, String arg2) {
		System.out.println("user clicks on "+ arg1);
		System.out.println("user clicks on "+ arg2);
	}
	
	//@And ("^user clicks on buttons \"([^\"]*)\" and \"([^\"]*)\"$") # This line also works

	@And ("^user clicks on buttons (.+) and (.+)$")
	public void user_clicks_on_buttons_arg1_and_arg21 (String arg1, String arg2) {
	System.out.println("user clicks on "+ arg1);
	System.out.println("user clicks on "+ arg2);
}
	
	@And("^user enters details on table$")
	public void user_enters_details_on_table(DataTable data)  {
		String actualName = null;
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> obj = data.raw();
		String name = obj.get(0).get(0);
		
		
			if (name.equals("Name"))
	
			actualName = obj.get(1).get(0);
		else 
			System.out.println("Please enter Name under the heading 'Name' in the first column" );
			
		
		String surname = obj.get(1).get(1);
		System.out.println("Name is " + actualName + " and surname is "+ surname);

	}

}
