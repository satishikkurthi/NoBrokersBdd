package stepDefinitions;

import org.junit.runner.RunWith;

import Base.Baseclass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
public class ValidLogin extends Baseclass{
	
	
	@Given("^nobroker website$")
    public void nobroker_website() throws Throwable {
		System.out.println("no broker");
		
		hitdriver();
        
    }

    @When("^i enter correct username and correct password$")
    public void i_enter_correct_username_and_correct_password() throws Throwable {
      System.out.println("username and password");
      Entercreds();
    }

    @Then("^i should login successfully$")
    public void i_should_login_successfully() throws Throwable {
      verifyLogin();
      takeSCreenshot("validlogin");
      close();
      flushing();
    }
}
