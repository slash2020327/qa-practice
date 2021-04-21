package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class AddressPage extends BasePage{
	@FindBy(xpath="//button[@name='processAddress']")
	private ExtendedWebElement proceedButton;

	public AddressPage(WebDriver driver) {
		super(driver);
		setPageURL("?controller=order&step=1&$ignore");
	}
	
	public ShippingPage clickProceedButton() {
		proceedButton.click();
		return new ShippingPage(driver);
	}

}
