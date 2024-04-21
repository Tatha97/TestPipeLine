package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPage {

	@Given("user on the log in page")
	public void user_on_the_log_in_page() {
	    
		System.out.println("In Given metthod");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    
		System.out.println("In When metthod");
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() {
	    
		System.out.println("In And metthod");
	}

	@Then("user navigated to Dashboard Page")
	public void user_navigated_to_dashboard_page() {
	    
		System.out.println("In Then metthod");
	}
}
