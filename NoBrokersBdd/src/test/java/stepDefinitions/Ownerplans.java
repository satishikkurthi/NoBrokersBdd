package stepDefinitions;

import org.junit.runner.RunWith;

import Base.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
public class Ownerplans extends Baseclass{
	
	  @Given("^no broker website with link$")
	    public void no_broker_website_with_link() throws Throwable {
		  hitdriver();

	    }

	    @When("^i click on owner plans$")
	    public void i_click_on_owner_plans() throws Throwable {
	    	ownerplans();

	    }

	    @Then("^it should display owner plans$")
	    public void it_should_display_owner_plans() throws Throwable {
	    	takeSCreenshot("ownerplans");
           close();
	    }

}
