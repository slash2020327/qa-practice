package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public class AccountPage extends BasePage{

	public AccountPage(WebDriver driver) {
		super(driver);
		setPageURL("?controller=my-account");
	}

}
