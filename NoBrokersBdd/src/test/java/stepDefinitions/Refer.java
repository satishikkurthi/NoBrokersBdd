package stepDefinitions;

import org.junit.runner.RunWith;

import Base.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
public class Refer extends Baseclass {
	
	@Given("^no brokers website along with that link$")
    public void no_brokers_website_along_with_that_link() throws Throwable {

		hitdriver();
		

    }

    @When("^i click on refer and Earn$")
    public void i_click_on_refer_and_earn() throws Throwable {
       referandearn();
    }

    @Then("^it should display details of it$")
    public void it_should_display_details_of_it() throws Throwable {
    	flushing();
    	takeSCreenshot("Refer and Earn");
      close();
    }


}
