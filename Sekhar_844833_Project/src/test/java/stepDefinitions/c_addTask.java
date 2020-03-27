package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.addTask;

public class c_addTask {
	addTask enter= new addTask();	//Creating Object for Add task
			// Add Task Scenario Methods
	@Given("^open the Application$")
	public void open_the_Application() throws Throwable {
	    enter.open("chrome");	// Write code here that turns the phrase above into concrete actions
	}

	@When("^click on Administration(\\d+)$")
	public void click_on_Administration(int arg1) throws Throwable {
	    enter.clickAdministration();	// Write code here that turns the phrase above into concrete actions
	}

	@When("^login with valid credentials$")
	public void login_with_valid_credentials() throws Throwable {
	    enter.login();	// Write code here that turns the phrase above into concrete actions
	}

	@When("^click on add task$")
	public void click_on_add_task() throws Throwable {
	    enter.AddTask();	// Write code here that turns the phrase above into concrete actions
	}

	@When("^enter all fields$")
	public void enter_all_fields() throws Throwable {
	    enter.enterFields();	// Write code here that turns the phrase above into concrete actions
	}

	@When("^select Start Date$")
	public void select_Start_Date() throws Throwable {
	    enter.startDate();	// Write code here that turns the phrase above into concrete actions
	}

	@When("^select End Date$")
	public void select_End_Date() throws Throwable {
	    enter.endDate();	// Write code here that turns the phrase above into concrete actions
	}

	@When("^click on Add button$")
	public void click_on_Add_button() throws Throwable {
	    enter.addButton();	// Write code here that turns the phrase above into concrete actions
	}

	@Then("^assert if added task is shown in task list table$")
	public void assert_if_added_task_is_shown_in_task_list_table() throws Throwable {
	    enter.Assert();	// Write code here that turns the phrase above into concrete actions
	}
}
