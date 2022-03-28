package stepDefinitions;

import org.junit.runner.RunWith;

import Base.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
public class Paintings extends Baseclass {
	 @Given("^no broker website link$")
	    public void no_broker_website_link() throws Throwable {
	     hitdriver();
	    }

	    @When("^i click on paintings&cleaning$")
	    public void i_click_on_paintingscleaning() throws Throwable {
	    	paintings();

	    }

	    @Then("^it should display details of painting$")
	    public void it_should_display_details_of_painting() throws Throwable {
	    	takeSCreenshot("paintings");
      close();
	    }

}
