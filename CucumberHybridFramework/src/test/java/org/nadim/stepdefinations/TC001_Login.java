package org.nadim.stepdefinations;

import org.junit.Assert;
import org.nadim.base.Base;
import org.nadim.pages.HomePage;
import org.nadim.pages.LoginPage;
import org.nadim.pages.UserAccountHomePage;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_Login extends Base {
	
	private HomePage hPage;
	private LoginPage lpage = new LoginPage(driver);
	private UserAccountHomePage uapage;
	
	@Given("user should navigate to login page")
	public void user_should_navigate_to_login_page() {
		hPage = new HomePage(driver);
		hPage.navigateToLogin();
	}

	@When("user has to entered valid email-address {string}")
	public void user_has_to_entered_valid_email_address(String email) {
		lpage.enterEmail(email);
	}

	@When("entered valid password {string}")
	public void entered_valid_password(String pwd) {
		lpage.enterPassword(pwd);
	}

	@When("Click on login button")
	public void click_on_login_button() {
		lpage.clickLoginBtn();
	}

	@Then("Navigate to Account Page")
	public void navigate_to_account_page() {
		uapage = new UserAccountHomePage(driver);
		String expectedText = "Edit your account information";
		Assert.assertEquals(uapage.getLoginSuccessText(),expectedText);
	}

	@When("user has to entered invalid email-address {string}")
	public void user_has_to_entered_invalid_email_address(String inValiEmail) {
		lpage.enterEmail(inValiEmail);
	}

	@Then("user should get Wranning message")
	public void user_should_get_wranning_message() {
		String expectedText="Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(lpage.getWarningMsg(),expectedText);
	}

	@When("entered invalid password {string}")
	public void entered_invalid_password(String invalidPwd) {
		lpage.enterPassword(invalidPwd);
	}

}
