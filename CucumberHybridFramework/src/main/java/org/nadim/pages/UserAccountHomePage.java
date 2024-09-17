package org.nadim.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAccountHomePage {
	
	public UserAccountHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//locator object
	@FindBy(linkText="Edit your account information")
	WebElement loginSuccessText;
	
	//Actions Methods
	public String getLoginSuccessText() {
		return loginSuccessText.getText();
	}
}
