package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.searchTask;

public class d_searchTask {
	searchTask enter= new searchTask();		//Creating Object for Search Task
	// Search Scenario Methods
	@Given("^open the application(\\d+)$")
	public void open_the_application(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		enter.open("chrome");
	}

	@When("^select task in Type$")
	public void select_task_in_Type() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	    enter.typeTask();
	}

	@When("^click on Search$")
	public void click_on_Search() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	    enter.search();
	}

	@Then("^Assert if previously added task is in the table or not$")
	public void assert_if_previously_added_task_is_in_the_table_or_not() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	    enter.Assert();
	}
}
