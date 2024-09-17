package org.nadim.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Locator Objects
	@FindBy(id="input-email")
	WebElement weEmail;
	
	@FindBy(id="input-password")
	WebElement wePassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement warnningTextWebElement;
	
	// Action Methods
	public void enterEmail(String email) {
		weEmail.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		wePassword.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public String getWarningMsg() {
		return warnningTextWebElement.getText();
	}
}
