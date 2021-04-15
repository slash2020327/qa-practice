package com.qaprosoft.carina.demo.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.AccountPage;

public class LoginItem extends AbstractUIObject {
	@FindBy(xpath = "//input[@id='email']")
	private ExtendedWebElement inputEmail;
	
	@FindBy(xpath = "//input[@id='passwd']")
	private ExtendedWebElement inputPassword;
	
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private ExtendedWebElement loginButton;
	

	public LoginItem(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public void setEmail(String email) {
		inputEmail.type(email);
	}
	
	public void setPassword(String password) {
		inputPassword.type(password);
	}
	
	public AccountPage confirmLogin() {
		loginButton.click();
		return new AccountPage(driver);
	}
	

}
