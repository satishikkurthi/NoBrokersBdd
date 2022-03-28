package stepDefinitions;

import org.junit.runner.RunWith;


import Base.Baseclass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
public class InvalidLogin extends Baseclass {
	
	 @Given("^nobroker website with link$")
	    public void nobroker_website_with_link() throws Throwable {

		 hitdriver();
	    
	    }

	    @When("^i enter wrong user name and wrong password$")
	    public void i_enter_wrong_user_name_and_wrong_password() throws Throwable {
          EnterWrongcreds();
	    }

	    @Then("^it should display wrong username or password$")
	    public void it_should_display_wrong_username_or_password() throws Throwable {
	      invalidloginverify();
	     // flushing();
	      takeSCreenshot("Invalidlogin");
	      close();
	    }
}
