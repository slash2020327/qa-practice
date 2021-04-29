package com.qaprosoft.carina.demo.gui.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.BasePage;

public abstract class ConfirmedOrderPageBase extends BasePage {
	public ConfirmedOrderPageBase(WebDriver driver) {
		super(driver);
		setPageURL("?controller=order-confirmation&$ignore");
	}
	
	public abstract ExtendedWebElement getInfoMessage();
}
