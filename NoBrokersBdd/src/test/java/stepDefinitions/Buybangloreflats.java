package stepDefinitions;

import org.junit.runner.RunWith;

import Base.Baseclass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
public class Buybangloreflats extends Baseclass{
	
	 @Given("^nobrokers   website   url$")
	    public void nobrokers_website_url() throws Throwable {
		 once();
	     hitdriver();
	    }

	    @When("^i select banglore location$")
	    public void i_select_banglore_location() throws Throwable {
             BangloreflatsBuy();
	        
	    }

	    @Then("^it should display flats of banglore$")
	    public void it_should_display_flats_of_banglore() throws Throwable {
	    	takeSCreenshot("bangloreflatbuy");
	    	 close();
	    }

	    @And("^flat type as 2bhk and 3bhk$")
	    public void flat_type_as_2bhk_and_3bhk() throws Throwable {
             Bangloreflats();	    	
	        
	    }

}
