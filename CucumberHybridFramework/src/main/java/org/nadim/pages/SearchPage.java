package org.nadim.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Locator Objects
	@FindBy(linkText="HP LP3065")
	WebElement actualTextForValidSearch;
	
	@FindBy(xpath="//div//p[contains(text(),'There is no product')]")
	WebElement actualTextForInvalidSearch;
	
	// Action Methods
	
	public boolean getTextForValidSearch() {
		return actualTextForValidSearch.isDisplayed();
	}
	
	public boolean getTextForInvalidSearch() {
		return actualTextForInvalidSearch.isDisplayed();
	}
}
