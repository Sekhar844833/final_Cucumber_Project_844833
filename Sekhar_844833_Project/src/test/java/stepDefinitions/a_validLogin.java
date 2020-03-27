package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.validLogin;

public class a_validLogin
{
	validLogin enter= new validLogin(); 	//Creating Object for login Page
					// Login scenario methods 	
	@Given("^launch the browser$")
	public void launch_the_browser(){
					// Write code here that turns the phrase above into concrete actions
		enter.launch("chrome");
	}

	@When("^open the application$")
	public void open_the_application() {
					// Write code here that turns the phrase above into concrete actions
	    enter.open();
	}

	@Then("^enter username as \"([^\"]*)\" & password \"([^\"]*)\" and click on login$")
	public void enter_username_as_password_and_click_on_login(String username, String password) {
					// Write code here that turns the phrase above into concrete actions
		enter.login(username, password);
	}
}