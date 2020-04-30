package StepDefnitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefnitionClass {


@Given("^User enter into \"([^\"]*)\"$")
public void user_enter_into(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
System.out.println("The user Entered into"+arg1);
}

@When("^User enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_valid_and(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("The user Enter valid uname "+arg1 +"and password"+arg2);
}

@Then("^Verify Home Page is displayed$")
public void verify_Home_Page_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("Home page is displayed");
}
}
