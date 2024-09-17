package org.nadim.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Locator Objects
	@FindBy(xpath="//span[text()='My Account']")
	WebElement myAccountButton;
	
	@FindBy(linkText="Register")
	WebElement registerAccount;
	
	@FindBy(linkText="Login")
	WebElement loginAccount;
	
	@FindBy(name="search")
	WebElement searchProduct;
	
	@FindBy(xpath="//span//button[@type='button']")
	WebElement clickSearchBtn;
	
	// Action Methods
	public void clickAccountButton() {
		myAccountButton.click();
	}
	
	public void clickRegister() {
		registerAccount.click();
	}
	
	public void clickLoginButton() {
		loginAccount.click();
	}
	
	public void enterProductForSearch(String product) {
		searchProduct.sendKeys(product);
	}
	
	public void clickOnSearchBtn() {
		clickSearchBtn.click();
	}
	
	public void navigateToLogin() {
		clickAccountButton();
		clickLoginButton();
	}
	
	public void navigateToRegister() {
		clickRegister();
		clickAccountButton();
		
	}
}
