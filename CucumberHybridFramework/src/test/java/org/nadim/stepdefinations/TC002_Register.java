package org.nadim.stepdefinations;

import org.nadim.base.Base;
import org.nadim.pages.HomePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC002_Register extends Base {
	private HomePage hPage;
	
	@Given("User Should Navigate to register Page")
	public void user_should_navigate_to_register_page() {
		hPage = new HomePage(driver);
		hPage.navigateToRegister();
	}

	@When("User enter below fields data")
	public void user_enter_below_fields_data(DataTable dataTable) {

	}

	@When("click on subscribe no radio button")
	public void click_on_subscribe_no_radio_button() {

	}

	@When("click on Privacy Policy checkbox")
	public void click_on_privacy_policy_checkbox() {

	}

	@Then("navigate to account success page and show success message")
	public void navigate_to_account_success_page_and_show_success_message() {

	}

	@When("User enter below fields data with existing email")
	public void user_enter_below_fields_data_with_existing_email(io.cucumber.datatable.DataTable dataTable) {

	}

	@Then("User should get Wranning message")
	public void user_should_get_wranning_message() {

	}

	@When("User enter below fields data with wrong confirm password")
	public void user_enter_below_fields_data_with_wrong_confirm_password(DataTable dataTable) {

	}

	@Then("User should get Proper Warnning Messages")
	public void user_should_get_proper_warnning_messages() {

	}
	
	@Given("Click on Continue button")
	public void click_on_continue_button() {
	   
	}
}
