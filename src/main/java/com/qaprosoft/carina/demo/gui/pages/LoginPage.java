package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.LoginItem;

public class LoginPage extends AbstractPage { 	
	@FindBy(xpath = "//div[@class='col-xs-12 col-sm-6'][2] ")
	private LoginItem loginItem;

	public LoginPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	
	public LoginItem getLoginItem() {
		return loginItem;
	}

}
