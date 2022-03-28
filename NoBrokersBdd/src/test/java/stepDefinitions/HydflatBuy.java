package stepDefinitions;

import org.junit.runner.RunWith;

import Base.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
public class HydflatBuy extends Baseclass{
	
	  @Given("^no brokers websites url$")
	    public void no_brokers_websites_url() throws Throwable {
	      hitdriver();
	    }

	    @When("^i click hyderabad and select my requirements$")
	    public void i_click_hyderabad_and_select_my_requirements() throws Throwable {
	       HyderabadflatsBuy();
	    }

	    @Then("^it should display hyderabadflats of my requirments$")
	    public void it_should_display_hyderabadflats_of_my_requirments() throws Throwable {
	       close();
	    }

}
