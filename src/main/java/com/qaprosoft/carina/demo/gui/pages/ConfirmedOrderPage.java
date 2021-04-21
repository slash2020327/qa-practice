package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class ConfirmedOrderPage extends BasePage {
	@FindBy(xpath="//strong[contains(text(),'Your order')]")
	private ExtendedWebElement infoMessage;
	

	public ConfirmedOrderPage(WebDriver driver) {
		super(driver);
		setPageURL("?controller=order-confirmation&$ignore");
	}
	
	public ExtendedWebElement getInfoMessage() {
		return infoMessage;
	}
	
}
