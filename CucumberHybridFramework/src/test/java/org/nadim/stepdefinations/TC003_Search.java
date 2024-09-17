package org.nadim.stepdefinations;

import org.junit.Assert;
import org.nadim.base.Base;
import org.nadim.pages.HomePage;
import org.nadim.pages.SearchPage;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC003_Search extends Base{
	
	private HomePage hpage;
	private SearchPage spage;
	
	@Given("open an Application")
	public void open_an_application() {
		System.out.println("Application Opend");
		hpage= new HomePage(driver);
		spage= new SearchPage(driver);
	}

	@When("user entered Valid Product Name {string} into search box")
	public void user_entered_valid_product_name_into_search_box(String productName) {
	   hpage.enterProductForSearch(productName);
	}

	@When("click on search button")
	public void click_on_search_button() {
		hpage.clickOnSearchBtn();
	}

	@Then("product display on search page")
	public void product_display_on_search_page() {
		Assert.assertTrue(spage.getTextForValidSearch());
	}

	@When("user entered invalid Product Name {string} into search box")
	public void user_entered_invalid_product_name_into_search_box(String string) {
		 hpage.enterProductForSearch(string);
	}

	@Then("Get warnning message on search page")
	public void get_warnning_message_on_search_page() {
		Assert.assertTrue(spage.getTextForInvalidSearch());
	}
}
