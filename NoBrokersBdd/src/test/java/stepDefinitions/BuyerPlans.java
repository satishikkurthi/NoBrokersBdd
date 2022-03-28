package stepDefinitions;

import Base.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuyerPlans extends Baseclass {
	@Given("^no broker Website$")
    public void no_broker_website() throws Throwable {
	
      hitdriver();
    }

    @When("^i click on buyer plans$")
    public void i_click_on_buyer_plans() throws Throwable {
        Buyerplans();
    }

    @Then("^it should display buyer plans$")
    public void it_should_display_buyer_plans() throws Throwable {
    	takeSCreenshot("buyerplans");
       close();
    }


}
