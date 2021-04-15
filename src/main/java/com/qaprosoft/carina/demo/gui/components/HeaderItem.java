package com.qaprosoft.carina.demo.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.LoginPage;

public class HeaderItem extends AbstractUIObject{
	@FindBy(xpath = "//a[@class='login']")
	private ExtendedWebElement loginButton;
	

	public HeaderItem(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public LoginPage openLoginPage() {
		loginButton.click();
		return new LoginPage(driver);
	}

}
