package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.LoginItem;

public class LoginPage extends BasePage { 	
	@FindBy(xpath = "//form[@id='login_form']")
	private LoginItem loginItem;

	public LoginPage(WebDriver driver) {
		super(driver);
		setPageURL("?controller=authentication&back=my-account");
	}
	
	public LoginItem getLoginItem() {
		return loginItem;
	}

}
