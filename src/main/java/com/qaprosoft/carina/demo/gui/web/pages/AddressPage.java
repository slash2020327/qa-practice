package com.qaprosoft.carina.demo.gui.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.BasePage;

public class AddressPage extends HomeBasePage {
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
