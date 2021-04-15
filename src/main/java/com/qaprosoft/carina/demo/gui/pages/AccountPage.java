package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public class AccountPage extends AbstractPage{

	public AccountPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("http://automationpractice.com/index.php?controller=my-account");
	}

}
