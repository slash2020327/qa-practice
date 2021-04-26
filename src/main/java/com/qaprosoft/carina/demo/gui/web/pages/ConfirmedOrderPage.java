package com.qaprosoft.carina.demo.gui.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.BasePage;

public class ConfirmedOrderPage extends HomeBasePage {
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
