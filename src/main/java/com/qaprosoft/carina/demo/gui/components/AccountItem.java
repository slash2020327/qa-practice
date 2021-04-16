package com.qaprosoft.carina.demo.gui.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class AccountItem extends AbstractUIObject {
	@FindBy(xpath = "//h1[@class='page-heading']")
	private ExtendedWebElement accountItem;

	public AccountItem(WebDriver driver) {
		super(driver);
	}

}
