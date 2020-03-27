package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.screenshot;

public class f_screenshot {
	screenshot enter=new screenshot();		//Creating Object for Sort Task
	// Take screeshot of TasksTable Scenario Methods
	@Given("^Open the web application$")
	public void open_the_web_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	    enter.open("chrome");
	}

	@When("^select task in Type and search$")
	public void select_task_in_Type_and_search() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	    enter.typeTask();
	}

	@When("^take screenshot the Displayed tasks$")
	public void take_screenshot_the_Displayed_tasks() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	    enter.Screenshot();
	}

	@Then("^assert the tasks$")
	public void assert_the_tasks() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	    enter.Assert();
	}
}
