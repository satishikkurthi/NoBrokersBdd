package stepDefinitions;

import org.junit.runner.RunWith;

import Base.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
public class RentalAgreement extends Baseclass{
	
	 @Given("^nobroker website link$")
	    public void nobroker_website_link() throws Throwable {
		 
	       hitdriver();
	    }

	    @When("^i click on rental agreement$")
	    public void i_click_on_rental_agreement() throws Throwable {
	    	rentalagreement();
	    
	    }

	    @Then("^it should display rental agreement$")
	    public void it_should_display_rental_agreement() throws Throwable {
	    	takeSCreenshot("Rentalagreement");
	    	flushing();
	       close();
	       
	    }

}
